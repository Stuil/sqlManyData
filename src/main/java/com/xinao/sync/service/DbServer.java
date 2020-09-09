package com.xinao.sync.service;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.*;
import com.xinao.sync.service.gas.*;
import com.xinao.sync.utils.SpringUtil;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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



    public void getM1(List<GasUserChargeRecordEntity> chargeRecordList, List<GasMendGasEntity> mendGasList,
                      List<GasRefundGasEntity> refundGasList, List<GasAreaCommunityEntity> areaCommunityEntities,
                      List<GasBookNoEntity> bookNoEntities, List<GasUserEntity> userEntityList,
                      List<GasMeterEntity> meterEntities) {
        int a=8/2;
        getService().getM2(chargeRecordList, mendGasList, refundGasList, areaCommunityEntities, bookNoEntities, userEntityList , meterEntities);
    }

    @Transactional(rollbackFor = Exception.class)
    public void getM2(List<GasUserChargeRecordEntity> chargeRecordList, List<GasMendGasEntity> mendGasList,
                      List<GasRefundGasEntity> refundGasList, List<GasAreaCommunityEntity> areaCommunityEntities,
                      List<GasBookNoEntity> bookNoEntities, List<GasUserEntity> userEntityList,
                      List<GasMeterEntity> meterEntities) {
        areaCommunityService.saves(areaCommunityEntities.get(0));
       // bookNoService.saves(bookNoEntities.get(0));
       gasUserService.save(userEntityList.get(0));
        System.out.println(1);
    }

    //解决事务失效  代理模式失效
    private DbServer getService(){
        return SpringUtil.getBean(this.getClass());   //SpringUtil工具类见下面代码
    }
}
