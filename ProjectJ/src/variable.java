class variable {
    int instanceVariable ;
    static int staticVariable;

    public void demoMethod(){
        int localVariable = 5 ;
        System.out.println("Inside local variable");
        System.out.println("localVariable: " + localVariable);
        System.out.println("staticVariable : " + staticVariable);
        System.out.println("instanceVariable: " + instanceVariable);

    }
    public static void main (String[] args ){
        variable obj1 = new variable();
        obj1.instanceVariable = 1;
        variable.staticVariable = 2;
        obj1.demoMethod();


    }
}



