package model;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

public class User {

    private int userId;

    private String user_name;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Account> accountList;


    public User(){

    }


}
