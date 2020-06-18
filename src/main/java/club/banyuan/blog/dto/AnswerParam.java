package club.banyuan.blog.dto;

/**
 * @author HanChao
 * @date 2020-06-17 20:40
 * 描述信息：
 */
public class AnswerParam {
    private Integer questionId;
    private String content;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
