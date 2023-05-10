import javax.persistence.*;

@Entity

@DiscriminatorColumn(name="Part_Time")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})
public class PartTimeEmp extends Employee{

    private int hrs_sal, no_of_hrs;

    public PartTimeEmp(int id, String name) {
        super(id, name);
    }

    public PartTimeEmp(int id, String name, int hrs_sal, int no_of_hrs) {
        super(id, name);
        this.hrs_sal = hrs_sal;
        this.no_of_hrs = no_of_hrs;
    }
}
