package com.xinao.sync.entity.xinao;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
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
    public class System extends Model<System> {

    private static final long serialVersionUID = 1L;

    private String group;

    private Integer id;

    private String name;

    private String value;

    private Integer updated;


    @Override
    protected Serializable pkVal() {
        return this.group;
    }

}
