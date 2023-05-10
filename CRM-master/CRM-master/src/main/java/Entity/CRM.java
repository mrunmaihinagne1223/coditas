package Entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class CRM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;
    private String c_name;
    private String c_email;
    private String c_password;
    private int phoneNo;


    @OneToMany(mappedBy = "crm")
    private List<User> users;


    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public String getC_password() {
        return c_password;
    }

    public void setC_password(String c_password) {
        this.c_password = c_password;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public CRM(String c_name, String c_email, String c_password, int phoneNo, List<User> users) {
        this.c_name = c_name;
        this.c_email = c_email;
        this.c_password = c_password;
        this.phoneNo = phoneNo;
        this.users = users;
    }

    public CRM(String c_name, String c_email, String c_password, int phoneNo) {
        this.c_name = c_name;
        this.c_email = c_email;
        this.c_password = c_password;
        this.phoneNo = phoneNo;
    }

    public CRM() {
    }
}
