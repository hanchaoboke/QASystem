package club.banyuan.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.views
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private Integer views;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.user_id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.selected_answer_id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private Integer selectedAnswerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.created_at
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.updated_at
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.content
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.views
     *
     * @return the value of question.views
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public Integer getViews() {
        return views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.views
     *
     * @param views the value for question.views
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.user_id
     *
     * @return the value of question.user_id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.user_id
     *
     * @param userId the value for question.user_id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.selected_answer_id
     *
     * @return the value of question.selected_answer_id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public Integer getSelectedAnswerId() {
        return selectedAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.selected_answer_id
     *
     * @param selectedAnswerId the value for question.selected_answer_id
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setSelectedAnswerId(Integer selectedAnswerId) {
        this.selectedAnswerId = selectedAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.created_at
     *
     * @return the value of question.created_at
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.created_at
     *
     * @param createdAt the value for question.created_at
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.updated_at
     *
     * @return the value of question.updated_at
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.updated_at
     *
     * @param updatedAt the value for question.updated_at
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.content
     *
     * @return the value of question.content
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.content
     *
     * @param content the value for question.content
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Wed Jun 17 20:02:58 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", views=").append(views);
        sb.append(", userId=").append(userId);
        sb.append(", selectedAnswerId=").append(selectedAnswerId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}