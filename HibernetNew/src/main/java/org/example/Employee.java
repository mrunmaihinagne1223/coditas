package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Eid;
    private String Ename;
    @OneToMany
    private List<Laptop>laptop;


    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", name='" + Ename + '\'' +
                '}';
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEName() {
        return Ename;
    }

    public void setEName(String name) {
        this.Ename = name;
    }
}
