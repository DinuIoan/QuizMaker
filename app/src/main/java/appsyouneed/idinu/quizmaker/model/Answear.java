package appsyouneed.idinu.quizmaker.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

@IgnoreExtraProperties
public class Answear {
    private Long id;
    private String answearText;
    private Date date;
    private Long questionId;
    private Long userId;

    public Answear() {
    }

    public Answear(Long id, String answearText, Date date, Long questionId, Long userId) {
        this.id = id;
        this.answearText = answearText;
        this.date = date;
        this.questionId = questionId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswearText() {
        return answearText;
    }

    public void setAnswearText(String answearText) {
        this.answearText = answearText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
