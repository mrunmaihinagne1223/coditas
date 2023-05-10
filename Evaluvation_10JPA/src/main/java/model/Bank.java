package model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

public class Bank {

    private int bank_id;

    private String Bank_name;

    @ManyToOne
    private List<Account> bankList;




}
