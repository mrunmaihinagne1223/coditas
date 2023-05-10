package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lpname;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lpname='" + lpname + '\'' +
                '}';
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLpname() {
        return lpname;
    }

    public void setLpname(String lpname) {
        this.lpname = lpname;
    }
}
