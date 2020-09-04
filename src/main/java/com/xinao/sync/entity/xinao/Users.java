package com.xinao.sync.entity.xinao;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.time.LocalDateTime;
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
* @since 2020-09-04
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String address;

    private String workUnit;

    private String phone;

    private LocalDateTime openDate;

    private LocalDateTime workDate;

    private LocalDateTime payDate;

    private Integer userType;

    private Integer meterType;

    private String meterNo;

    private Integer meterDir;

    private Integer unitNo;

    private Integer updated;

    private String manageNu1;

    private String msNumber;

    private String manageNu;

    private String remark;

    private String manageTemp;

    private String idCard;

    private String special;

    private String kitchen;

    private String waterHeater;

    private String boiler;

    private String familyDetail;

    private String familyEarning;

    private String useId;

    private String houseId;

    private Integer familyNo;

    private String installPosition;

    private String sex;

    private Integer stopuser;

    private String operator;

    private String clientId;

    private String cardtype;

        @TableField("TotalUsed")
    private Double TotalUsed;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
