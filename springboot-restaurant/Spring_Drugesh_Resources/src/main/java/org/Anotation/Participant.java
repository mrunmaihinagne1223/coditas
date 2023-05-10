package org.Anotation;

public class Participant {
    private  String name,address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public Participant() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Participant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
