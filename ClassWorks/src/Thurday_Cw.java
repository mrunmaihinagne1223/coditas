class Parent{
    int Did;
    public void show(){
        System.out.println("Drivinglins"+ Did);
    }
}
class Child extends Parent {
    int Sid;
    public void show(){
        System.out.println("DVSchild" + Sid);
    }
}




public class Thurday_Cw {
    public static void main(String args[]){
      Parent p = new Parent(); // specific obj
      Parent per= new Child();//polymarphic obj
      per.show();
      p.show();




      // Child child =  new Parent(); //===>   //compilarion error

       // child child = (child) new Parent();   //==>TypeCasting-down casting compilar error resolve error
                                              // CLass Cast expection

        System.out.println(per instanceof Parent );
        System.out.println(p instanceof Child);


    }
}
