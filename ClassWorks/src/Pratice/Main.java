package Pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

class Parent{
    Parent(int a){
        System.out.println(a);
    }
}
class Chid extends Parent{


    Chid(int a) {
        super(a);
    }
}

public class Main {
    public static void main(String[] args) {
       Parent ps = new Parent(8);
       Chid chid = new Chid(6);
       try {
           Chid chid1=(Chid) ps;
       }
       catch (ClassCastException e){
           System.out.println(e);
       }



    }
}
