package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int u_id;
    private String u_name;
    private String u_email;
    private String u_password;
    private int u_phone;
    private String u_address;

    @ManyToOne
    private CRM crm;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Issues> issues;


    public User(String u_name, String u_email, String u_password, int u_phone, String u_address, CRM crm) {
        this.u_name = u_name;
        this.u_email = u_email;
        this.u_password = u_password;
        this.u_phone = u_phone;
        this.u_address = u_address;
        this.crm = crm;

    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public int getU_phone() {
        return u_phone;
    }

    public void setU_phone(int u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public CRM getCrm() {
        return crm;
    }

    public void setCrm(CRM crm) {
        this.crm = crm;
    }

    public List<Issues> getIssues() {
        return issues;
    }

    public void setIssues(List<Issues> issues) {
        this.issues = issues;
    }

    public User() {
    }
}
