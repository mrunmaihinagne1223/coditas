package model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String user_name;



    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Account> accountList;


    public User(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", user_name='" + user_name + '\'' +
                ", accountList=" + accountList +
                '}';
    }

    public User(){

    }


}
