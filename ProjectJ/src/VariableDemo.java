class VariableDemo {
    int instanceVariable; // instance variable
    static int staticVariable; // static variable

    public void demoMethod(int localVariable) {
        System.out.println("Inside demoMethod:");
        System.out.println("Local variable: " + localVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        obj1.instanceVariable = 1;
        VariableDemo.staticVariable = 2;

        obj1.demoMethod(3);
        System.out.println("\nOutside demoMethod:");
        System.out.println("Instance variable: " + obj1.instanceVariable);
        System.out.println("Static variable: " + VariableDemo.staticVariable);

        VariableDemo obj2 = new VariableDemo();
        obj2.instanceVariable = 4;
        VariableDemo.staticVariable = 5;

        obj2.demoMethod(6);
        System.out.println("\nOutside demoMethod:");
        System.out.println("Instance variable: " + obj2.instanceVariable);
        System.out.println("Static variable: " + VariableDemo.staticVariable);
    }
}