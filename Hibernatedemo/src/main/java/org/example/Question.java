package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int QId;
    private String question;

    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<Answer> answer;

    public Question() {
    }

    public Question(int QId, String question) {
        this.QId = QId;
        this.question = question;
    }

    public Question(int QId, String question, List<Answer> answer) {
        this.QId = QId;
        this.question = question;
        this.answer = answer;
    }

    public int getQId() {
        return QId;
    }

    public void setQId(int QId) {
        this.QId = QId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "QId=" + QId +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
