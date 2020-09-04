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
    public class Change extends Model<Change> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String oldName;

    private String newName;

    private LocalDateTime changeDate;

    private Double changeCost;

    private String operator;

    private Integer usertype;

    private Integer updated;

    private Integer unitNo;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
