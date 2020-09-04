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
    public class Userremarks extends Model<Userremarks> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String remark;

    private LocalDateTime operdate;

    private String operator;

    private String clientId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
