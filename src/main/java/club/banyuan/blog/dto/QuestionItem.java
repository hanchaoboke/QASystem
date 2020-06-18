package club.banyuan.blog.dto;

import club.banyuan.blog.model.Question;
import club.banyuan.blog.model.User;

/**
 * @author HanChao
 * @date 2020-06-17 16:59
 * 描述信息：
 */
public class QuestionItem extends Question {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
