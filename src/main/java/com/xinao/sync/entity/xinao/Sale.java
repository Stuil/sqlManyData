package com.xinao.sync.entity.xinao;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.time.LocalDateTime;
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
    public class Sale extends Model<Sale> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private BigDecimal price;

    private Integer amount;

    private BigDecimal cost;

    private LocalDateTime buyDate;

    private String operator;

    private Integer usertype;

    private Integer updated;

    private Integer unitNo;

    private String name;

    private String address;

    private String clientId;

    private String flowid;

    private BigDecimal mprice;

    private Integer mamount;

    private BigDecimal mcost;

    private BigDecimal hprice;

    private Integer hamount;

    private BigDecimal hcost;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
