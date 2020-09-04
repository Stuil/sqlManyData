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
    public class Operator extends Model<Operator> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    private Integer opn;

    private Integer change;

    private Integer dele;

    private Integer meter;

    private Integer card;

    private Integer edit;

    private Integer supply;

    private Integer sale;

    private Integer rtn;

    private Integer operator;

    private Integer sys;

    private Integer updated;

    private Integer gas;

    private Integer givegas;

    private Integer gas1;

    private Integer transfercard;

    private Integer onestere;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
