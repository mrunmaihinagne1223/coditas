package org.example;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnsId;
    private String answer;

    @ManyToOne
    private Question question;

    public Answer(int ansId, String answer, Question question) {
        AnsId = ansId;
        this.answer = answer;
        this.question = question;
    }

    public Answer(int ansId, String answer) {
        AnsId = ansId;
        this.answer = answer;
    }

    public int getAnsId() {
        return AnsId;
    }

    public void setAnsId(int ansId) {
        AnsId = ansId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
