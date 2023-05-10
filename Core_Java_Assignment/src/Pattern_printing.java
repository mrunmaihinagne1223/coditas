class Patterns {
    public void displayTriangle(int row, int colum){
        System.out.println("Rightangle triangle");
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void pyramid(int row){
        System.out.println("Pyramid");
        for (int i=1; i<=row; i++){
            for (int j=1; j<=row-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void invertedPyramid (int row){
        System.out.println("Inverted Pyramid");
        for (int i=row; i>=1; i--){
            for (int j=1; j<=row-i; j++ ){
                System.out.print("  ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void rotatedsquare(int row){
        System.out.println(" The rotatedSquare ");
        for (int i=1; i<=row; i++){
            for (int j=1; j<=row-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i; j++){

                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i=row; i>=1; i--){
            for (int j=1; j<=row-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }

            System.out.println();

        }

    }
    public void newpattern (int row){
        System.out.println("Newpatterns");

        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
               System.out.print("* ");
            }
            for (int j=1; j<=2*(row-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }
    public void 




public class Pattern_printing {
    public static void main(String args[]){
        Patterns triangle = new Patterns();
        triangle.displayTriangle(5,5);
        triangle.pyramid(4);
        triangle.invertedPyramid(4);
        triangle.rotatedsquare(4);
        triangle.newpattern(5);


    }

}
