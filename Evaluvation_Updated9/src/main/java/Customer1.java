import javax.persistence.*;
import java.util.List;
@Entity
public class Customer1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custid;
    private String custname;
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product1> productList;

    public Customer1(String custname, String username, String password) {
        this.custname = custname;
        this.username = username;
        this.password = password;
    }
// getters and setters


    public Customer1(int custid, String custname, String username, String password) {
        this.custid = custid;
        this.custname = custname;
        this.username = username;
        this.password = password;
    }

    public Customer1() {
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product1> getProductList() {
        return productList;
    }

    public void setProductList(List<Product1> productList) {
        this.productList = productList;
    }
}
