package Entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Issues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issue_id;
    private String issue_type;

    private String description;

    private String status;
    private LocalDate today;

    private LocalDate deadline;

    @ManyToOne
    private User user;

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getIssue_type() {
        return issue_type;
    }

    public void setIssue_type(String issue_type) {
        this.issue_type = issue_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Issues(String issue_type, String description, String status, LocalDate today, LocalDate deadline, User user) {
        this.issue_type = issue_type;
        this.description = description;
        this.status = status;
        this.today = today;
        this.deadline = deadline;
        this.user = user;
    }

    public Issues() {
    }
}
