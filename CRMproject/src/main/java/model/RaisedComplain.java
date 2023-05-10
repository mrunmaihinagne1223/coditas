package model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class RaisedComplain implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int complainId;

    private String complain;

    @ManyToOne()
    private User user;


    public int getCompleteId() {
        return complainId;
    }

    public void setComplainId(int completeId) {
        this.complainId = completeId;
    }

    public String getComplainId() {
        return complain;
    }

    public void setComplain(String complete) {
        this.complain = complete;
    }

    public String getComplain() {
        return complain;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
