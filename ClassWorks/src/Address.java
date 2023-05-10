public class Address {
    //Constructor No return types because it class only
    int pno,fno,pincode;
    String name;

    public Address(int pno, int fno, int pincode, String name) {
        this.pno = pno;
        this.fno = fno;
        this.pincode = pincode;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pno=" + pno +
                ", fno=" + fno +
                ", pincode=" + pincode +
                ", name='" + name ;
    }


}
