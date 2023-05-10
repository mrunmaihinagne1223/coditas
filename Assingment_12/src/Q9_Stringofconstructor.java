class ReinitilizeString{
    String name="Defult";
    ReinitilizeString(){
        name="Mrunmai";
        System.out.println(name);
    }
    ReinitilizeString(String name){
        this.name=name;
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "ReinitilizeString{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Q9_Stringofconstructor {
    public static void main(String[] args) {
        ReinitilizeString reinitilizeString = new ReinitilizeString();
        reinitilizeString = new ReinitilizeString("Aniket");

    }
}
