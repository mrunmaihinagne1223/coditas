package model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Account_id;

    private String Account_Type;

    private String Status;

    private int Account_balance;

    private Date account_date;

    public Account() {
    }


    @ManyToOne()
    private User user;

    @ManyToMany(mappedBy = "accountList")
    private List<Bank>bankList;

    public Account(String account_Type, String status, int account_balance, Date account_date, User user) {
        Account_Type = account_Type;
        Status = status;
        Account_balance = account_balance;
        this.account_date = account_date;
        this.user = user;
    }
}
