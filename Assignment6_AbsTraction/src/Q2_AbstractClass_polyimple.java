import javax.sound.midi.Instrument;

abstract class Insturements{
    // abstract method
    public abstract void paly();

}
class Piano extends Insturements{

    @Override
    public void paly() {
     System.out.println("Piano is playing tan tan");
    }
}

class flute extends Insturements{

    @Override
    public void paly() {
        System.out.println("Flute is playing toot toot");
    }
}
class Guitar extends Insturements{

    @Override
    public void paly() {
        System.out.println("Guitar is playing tin tin");
    }
}
public class Q2_AbstractClass_polyimple {

    public static void main(String args[]){
        //Insturements insturements = new Insturements(); error ==>'Insturements' is abstract; cannot be instantiated

        Insturements  arrInstruments [] = new Insturements[9] ;

        arrInstruments[0]= new Guitar() ;
        arrInstruments[1]= new Guitar() ;
        arrInstruments[2]= new Guitar() ;

        arrInstruments[3]= new Piano() ;
        arrInstruments[4]= new Piano() ;
        arrInstruments[5]= new Piano() ;

        arrInstruments[6] = new flute();
        arrInstruments[7] = new flute();
        arrInstruments[8] = new flute();
        for (int i=0;i<9;i++){
            arrInstruments[i].paly();
        }










    }
}
