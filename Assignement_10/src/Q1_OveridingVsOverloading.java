 class Shape{
    public void calculate_Area(int length, int breath) {
        System.out.println("ITss shape");
    }
    public int calculate_Area(int length, int breath,double a){
        return(int) a*length*breath;
    }




}



public class Q1_OveridingVsOverloading {
    public static void main(String[] args) {
        Shape triangle = new Shape();
        triangle.calculate_Area(2,3);


    }
}
