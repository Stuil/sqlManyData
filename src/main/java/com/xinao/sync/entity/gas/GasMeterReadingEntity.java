package com.xinao.sync.entity.gas;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author stuil
* @since 2020-09-10
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("gas_meter_reading_")
    public class GasMeterReadingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 编号
            */
    private String id;

            /**
            * 用户账号
            */
        @TableField("accountNumber")
    private String accountNumber;

            /**
            * 表具ID
            */
        @TableField("meterId")
    private String meterId;

            /**
            * 用气类型
            */
        @TableField("useType")
    private String useType;

            /**
            * 本次指针
            */
        @TableField("currentPointer")
    private BigDecimal currentPointer;

            /**
            * 抄表时间
            */
        @TableField("readingTime")
    private Long readingTime;

            /**
            * 上次指针
            */
        @TableField("lastPointer")
    private BigDecimal lastPointer;

            /**
            * 上次抄表时间
            */
        @TableField("lastReadingTime")
    private Long lastReadingTime;

            /**
            * 上次用量
            */
        @TableField("lastUse")
    private Integer lastUse;

            /**
            * 用气量
            */
    private BigDecimal dosage;

            /**
            * 抄表员id
            */
        @TableField("readerId")
    private String readerId;

            /**
            * 抄表员名
            */
        @TableField("readerName")
    private String readerName;

            /**
            * 抄表图片
            */
        @TableField("imageUrl")
    private String imageUrl;

            /**
            * 抄表类型
            */
        @TableField("readingType")
    private Integer readingType;

            /**
            * 状态
            */
    private Integer status;

            /**
            * 是否可撤销
            */
        @TableField("canRevoke")
    private Boolean canRevoke;

            /**
            * 撤销原因
            */
        @TableField("revokeReason")
    private String revokeReason;

            /**
            * 撤销人
            */
        @TableField("revokeBy")
    private String revokeBy;

            /**
            * 营业厅
            */
        @TableField("businessHall")
    private String businessHall;

            /**
            * 撤销人名
            */
        @TableField("revokeByName")
    private String revokeByName;

            /**
            * 撤销时间
            */
        @TableField("revokeTime")
    private Long revokeTime;

            /**
            * 审核原因
            */
    private String auditeason;

            /**
            * 审核人id,sysUserId
            */
        @TableField("auditBy")
    private String auditBy;

            /**
            * 审核结果,1:通过,2:不通过
            */
        @TableField("auditStatus")
    private Integer auditStatus;

            /**
            * 审核时间
            */
        @TableField("auditTime")
    private Integer auditTime;

            /**
            * 操作人
            */
        @TableField("opBy")
    private String opBy;

            /**
            * 操作时间
            */
        @TableField("opAt")
    private Long opAt;

            /**
            * 删除标记
            */
        @TableField("delFlag")
    private Boolean delFlag;

            /**
            * POS设备编号
            */
        @TableField("devCode")
    private String devCode;

            /**
            * 分配抄表员id
            */
        @TableField("allotReaderId")
    private String allotReaderId;

            /**
            * 分配抄表员名
            */
        @TableField("allotReaderName")
    private String allotReaderName;

            /**
            * 微信自报表用户openid
            */
        @TableField("openId")
    private String openId;

            /**
            * 调整指数原因
            */
        @TableField("changePointReason")
    private String changePointReason;


}
