package sun.market.controller.admin.entity.admin;

import javax.persistence.*;

/**
 * 后台操作日志记录
 */

//删改类及属性后需删除数据库中的表后重新运行项目

@Entity
@Table(name="operator_log")
//基础数据继承自BaseEntity
public class OperatorLog extends BaseEntity{

    @Column(name = "operator",nullable = false,length = 18)
    private String operator;//操作者

    @Column(name = "content",nullable = false,length = 128)
    private String content;//操作内容

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
