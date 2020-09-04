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
    public class Delete extends Model<Delete> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private LocalDateTime delDate;

    private Double returnCost;

    private Double delCost;

    private Double total;

    private String operator;

    private Integer usertype;

    private Integer updated;

    private Integer unitNo;

    private String address;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
