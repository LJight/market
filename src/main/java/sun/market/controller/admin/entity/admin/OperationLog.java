package sun.market.controller.admin.entity.admin;

/**
 * 后台操作日志记录
 */
public class OperationLog {

    private String operator;//操作者

    private String content;//操作内容

    private String createTime;//操作时间

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
