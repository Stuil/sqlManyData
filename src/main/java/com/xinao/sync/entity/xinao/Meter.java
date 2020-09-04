package com.xinao.sync.entity.xinao;

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
    public class Meter extends Model<Meter> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private LocalDateTime meterDate;

    private Double meterCost;

    private Double cost;

    private Integer oldType;

    private Integer newType;

    private String operator;

    private Integer usertype;

    private Integer updated;

    private String memo;

    private Integer unitNo;

    private String msNumber;

    private String oldNumber;

    private String oldMeterno;

    private String newMeterno;

    private String clientId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
