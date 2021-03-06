package club.banyuan.blog.dto;

import java.util.List;

/**
 * @author HanChao
 * @date 2020-06-17 17:01
 * 描述信息：
 */
public class QuestionCreateParam {

    private String title;
    private String content;
    private List<Integer> tagIds;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }
}
