import javax.persistence.*;

@Entity
public class Product1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;
    private String qty;

    public String getPrice() {
        return price;
    }

    public String getQty() {
        return qty;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @ManyToOne
    private Customer1 customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Customer1 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer1 customer) {
        this.customer = customer;
    }

    public Product1(String name, String price, String qty, Customer1 customer) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.customer = customer;
    }

    public Product1(String name, String price, String qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product1(){

    }
}
