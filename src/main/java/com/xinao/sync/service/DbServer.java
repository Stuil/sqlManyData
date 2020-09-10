package com.xinao.sync.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.*;
import com.xinao.sync.service.gas.*;
import com.xinao.sync.utils.SpringUtil;
import com.xinao.sync.utils.SyncUtil;
import lombok.extern.slf4j.Slf4j;
import org.nutz.lang.Lang;
import org.nutz.lang.Times;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @title: DbServer
 * @description:
 * @date: 2020/9/9
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */
@Service
@DataSource(DataSourceEnum.DB2)
@Slf4j
public class DbServer {
    @Autowired
    GasAreaCommunityService areaCommunityService;

    @Autowired
    GasBookNoService bookNoService;

    @Autowired
    GasUserService gasUserService;

    @Autowired
    GasMeterService meterService;

    @Autowired
    GasMendGasService mendGasService;

    @Autowired
    GasUserChargeRecordService recordService;

    @Autowired
    GasUserChargeRecord2018Service record2018Service;

    @Autowired
    GasUserChargeRecord2019Service record2019Service;

    @Autowired
    GasUserChargeRecord2020Service record2020Service;

    @Autowired
    GasRefundGasService refundGasService;

    // 代理模式调用事物方法

    public String getM1(List<GasUserChargeRecordEntity> chargeRecordList, List<GasMendGasEntity> mendGasList,
                      List<GasRefundGasEntity> refundGasList, List<GasAreaCommunityEntity> areaCommunityEntities,
                      List<GasBookNoEntity> bookNoEntities, List<GasUserEntity> userEntityList,
                      List<GasMeterEntity> meterEntities) {
        return getService().getM2(chargeRecordList, mendGasList, refundGasList, areaCommunityEntities, bookNoEntities, userEntityList , meterEntities);
    }

    /**
     * @description:  业务方法
     * @date: 2020/9/10
     * @author: zwh
     */
    @Transactional(rollbackFor = Exception.class)
    public String getM2(List<GasUserChargeRecordEntity> chargeRecordList, List<GasMendGasEntity> mendGasList,
                      List<GasRefundGasEntity> refundGasList, List<GasAreaCommunityEntity> areaCommunityEntities,
                      List<GasBookNoEntity> bookNoEntities, List<GasUserEntity> userEntityList,
                      List<GasMeterEntity> meterEntities) {
        try {
            AtomicInteger areaCount = new AtomicInteger();
            AtomicInteger bookCount = new AtomicInteger();
            AtomicInteger count = new AtomicInteger();
            AtomicInteger meterCount = new AtomicInteger();
            AtomicInteger buyGasCount = new AtomicInteger();
            AtomicInteger mendGasCount = new AtomicInteger();
            AtomicInteger refundGasCount = new AtomicInteger();
            areaCommunityEntities.forEach(area->{
                // 是否存在小区
                GasAreaCommunityEntity commNames = areaCommunityService.getOnes(area.getName());
                if (Lang.isEmpty(commNames)) {
                    boolean areaComm = areaCommunityService.saves(area);
                    if (!areaComm) {
                        log.error("新增失败:{}", area.getId());
                    } else {
                        areaCount.getAndIncrement();
                    }
                } else {
                    area.setId(commNames.getId());
                    boolean areaComm = areaCommunityService.updates(area);
                    if (!areaComm) {
                        log.error("更新失败:{}", area.getId());
                    } else {
                        areaCount.getAndIncrement();
                    }
                }
            });
            // bookNoService.saveBatch(bookNoEntities);
            bookNoEntities.forEach(book->{
                // 查询户号 按地址查 适合 金凤、新奥
                GasBookNoEntity bookOne = bookNoService.getOnes(new QueryWrapper<GasBookNoEntity>()
                        .eq("address", book.getAddress()));
                if (Lang.isEmpty(bookOne)) {
                    // 户号
                    boolean books = bookNoService.save(book);
                    if (!books) {
                        log.error("失败:{}", book.getId());
                    } else {
                        bookCount.getAndIncrement();
                    }
                } else {
                    SyncUtil.copyProperties(bookOne, book);
                    book.setCommunityId(bookOne.getCommunityId());
                    book.setUserCount(bookOne.getUserCount());
                    // 户号
                    boolean books = bookNoService.updateById(book);
                    if (!books) {
                        log.error("失败:{}", book.getId());
                    } else {
                        bookCount.getAndIncrement();
                    }
                }

            });

          //  gasUserService.saveBatch(userEntityList);
            userEntityList.forEach(users->{
                GasUserEntity gasUserEntity = gasUserService.getByAcc(users.getAccountNumber());
                if (Lang.isEmpty(gasUserEntity)) {
                    //  用户入库
                    boolean user = gasUserService.insetUser(users);
                    if (!user) {
                        log.error("失败:{}", users.getAccountNumber());
                    } else {
                        count.getAndIncrement();
                    }
                } else {
                    //  用户更新
                    gasUserEntity.setMeterId(users.getMeterId());
                    boolean user = gasUserService.updateUser(gasUserEntity);
                    if (!user) {
                        log.error("失败:{}", users.getAccountNumber());
                    } else {
                        count.getAndIncrement();
                    }
                }
            });

             meterEntities.forEach(meters->{
                 GasMeterEntity meterOne = meterService.getOne(new QueryWrapper<GasMeterEntity>().eq("supplier", "XINAO")
                         .eq("cardNo", meters.getCardNo()));
                 if(Lang.isEmpty(meterOne)){
                     boolean meter = meterService.save(meters);
                     if (!meter) {
                         log.error("表具：{}", meters.getId());
                     } else {
                         meterCount.getAndIncrement();
                     }
                 }else {
                     boolean meter = meterService.update(meters,new QueryWrapper<GasMeterEntity>().eq("supplier", "XINAO")
                             .eq("cardNo", meters.getCardNo()));
                     if (!meter) {
                         log.error("表具：{}", meters.getId());
                     } else {
                         meterCount.getAndIncrement();
                     }
                 }

             });
            chargeRecordList.forEach(i->{
                if(longToString(i.getPayTime()).equals("2018")){
                    GasUserChargeRecord2018Entity record2018Entity=new GasUserChargeRecord2018Entity();
                    SyncUtil.copyProperties(i,record2018Entity);
                    record2018Service.saveOrUpdate(record2018Entity);
                }else if(longToString(i.getPayTime()).equals("2019")){
                    GasUserChargeRecord2019Entity record2019Entity=new GasUserChargeRecord2019Entity();
                    SyncUtil.copyProperties(i,record2019Entity);
                    record2019Service.saveOrUpdate(record2019Entity);
                }else if(longToString(i.getPayTime()).equals("2020")){
                    GasUserChargeRecord2020Entity record2020Entity=new GasUserChargeRecord2020Entity();
                    SyncUtil.copyProperties(i,record2020Entity);
                    record2020Service.saveOrUpdate(record2020Entity);
                }
                buyGasCount.getAndIncrement();
            });
           // mendGasService.saveBatch(mendGasList);
            mendGasList.forEach(mends->{
                boolean insertMendGas = mendGasService.saveOrUpdates(mends);
                if (!insertMendGas) {
                    log.error("表具：{}", JSONObject.toJSONString(mends));
                } else {
                    mendGasCount.getAndIncrement();
                }
            });
            // refundGasService.saveBatch(refundGasList);
            refundGasList.forEach(refunds->{
                // 退气入库
                boolean refund1 = refundGasService.saveOrUpdates(refunds);
                if (!refund1) {
                    log.error("表具：{}", JSONObject.toJSONString(refunds));
                } else {
                    refundGasCount.getAndIncrement();
                }
            });
            String res = "小区成功:" + areaCount + "本号成功:" + bookCount;
            String countArea = "小区总数:" + areaCommunityEntities.size() + "本号总数:" + bookNoEntities.size();
            log.info(res);
            log.info(countArea);
            log.info("用户成功{}条,水表成功{}条,购气成功{}条,补气成功{}条，退气成功{}条",
                    count, meterCount, buyGasCount, mendGasCount, refundGasCount);
            log.info("用户总数{}条,水表总数{}条,购气总数{}条,补气总数{}条，退气数总{}条",
                    userEntityList.size(), meterEntities.size(), chargeRecordList.size(),
                    mendGasList.size(), refundGasList.size());
            String result = String.format("小区总数:%s,本号总数:%s" + "<br/>" + "小区成功:%s,本号成功:%s",
                    areaCommunityEntities.size(), bookNoEntities.size(),
                    areaCount,  bookCount);
            String userResult = String.format("用户成功%s条,水表成功%s条,购气成功%s条,补气成功%s条,退气成功%s条",
                    count, meterCount, buyGasCount, mendGasCount, refundGasCount);
            String userCountResult = String.format("用户总数%s条,水表总数%s条,购气总数%s条,补气总数%s条,退气总数%s条",
                    userEntityList.size(), meterEntities.size(), chargeRecordList.size(),
                    mendGasList.size(), refundGasList.size());
            return result + "<hr/>" + userCountResult + "<br/>" + userResult;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("异常{}",e.getMessage());
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return e.getMessage();
        }
    }

    //解决事务失效  代理模式失效

    private DbServer getService(){
        return SpringUtil.getBean(this.getClass());
    }

    // 获取年份

    public String longToString(long timestamp){
        timestamp=timestamp*1000;
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString=format.format(timestamp);
        return dateString.substring(0,4);
    }
}
