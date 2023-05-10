package model;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

public class Account {

    private int Account_id;

    private String Account_Type;

    private String Status;

    private Date account_date;

    @ManyToOne()
    private User user;

    @ManyToMany(mappedBy = "bankList")
    private List<Bank>bankList;


}
