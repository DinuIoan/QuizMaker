package appsyouneed.idinu.quizmaker.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

@IgnoreExtraProperties
public class Question {
    private Long id;
    private String questionText;
    private Date date;
    private Long userQuizId;

    public Question() {
    }

    public Question(Long id, String questionText, Date date, Long userQuizId) {
        this.id = id;
        this.questionText = questionText;
        this.date = date;
        this.userQuizId = userQuizId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getUserQuizId() {
        return userQuizId;
    }

    public void setUserQuizId(Long userQuizId) {
        this.userQuizId = userQuizId;
    }
}
