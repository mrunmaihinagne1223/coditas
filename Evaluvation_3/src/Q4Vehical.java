class Vehical{
    int price;
    String company;
    public void display() {
        this.price=price;
        this.company=company;

    }

    @Override
    public String toString() {
        return "Vehical{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
class LightMotorVehical extends Vehical{
    int mileage;
    LightMotorVehical(int price, String company, int mileage){

        this.mileage=mileage;
    }

    @Override
    public String toString() {
        return "LightMotorVehical{" +
                "mileage=" + mileage +
                '}';
    }
}
class  HevyMororVehical extends  Vehical{
    int capacityInTom;
    HevyMororVehical(int price, String company, int capacityInTom){

        this.capacityInTom=capacityInTom;
    }

    @Override
    public String toString() {
        return "HevyMororVehical{" +
                "capacityInTom=" + capacityInTom +
                '}';
    }
}



public class Q4Vehical {
    public static void main(String[] args) {
         Vehical vehical []=new Vehical[7];

         vehical[1]=new LightMotorVehical(2,"Pune", 7);
         vehical[2]=new HevyMororVehical(6,"Ola", 8);

        System.out.println(vehical[1]);
        System.out.println(vehical[2]);
    }
}
//LightMotorVehical{mileage=7}
//HevyMororVehical{capacityInTom=8}
//
//Process finished with exit code 0