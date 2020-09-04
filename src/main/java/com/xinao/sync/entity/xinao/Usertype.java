package com.xinao.sync.entity.xinao;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
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
    public class Usertype extends Model<Usertype> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer gasId;

    private BigDecimal price;

    private Integer updated;

    private Integer mingas;

    private Integer maxgas;

    private Integer daygas;

    private Integer monthgas;

    private BigDecimal mprice;

    private BigDecimal hprice;

    private Integer quota;

    private Integer mquota;

    private String priceclass;

    private BigDecimal heatingprice;

        @TableField("heatingMprice")
    private BigDecimal heatingMprice;

        @TableField("heatingHprice")
    private BigDecimal heatingHprice;

    private Integer heatingquota;

        @TableField("heatingMquota")
    private Integer heatingMquota;

    private BigDecimal openfee;

    private BigDecimal upkeepfee;

    private BigDecimal heaterfee;

    private BigDecimal boilerfee;

    private BigDecimal certificatefee;

        @TableField("FinalPrice")
    private BigDecimal FinalPrice;

        @TableField("FinalMprice")
    private BigDecimal FinalMprice;

        @TableField("FinalHprice")
    private BigDecimal FinalHprice;

        @TableField("FinalQuota")
    private Integer FinalQuota;

        @TableField("FinalMquota")
    private Integer FinalMquota;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
