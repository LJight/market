package sun.market.controller.admin.entity.admin;

import javax.persistence.*;

/**
 * 基础公共属性
 */
@MappedSuperclass
public class BaseEntity {

    @Column(name = "id",nullable = false,length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//数据库ID自增方式，主键由数据库自动生成并递增。
    @Id
    private Long id;//唯一id

    @Column(name = "create_time",nullable = false)
    private String createTime;//创建时间

    @Column(name = "update_time",nullable = false)
    private String UpdateTime;//更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(String updateTime) {
        UpdateTime = updateTime;
    }
}
