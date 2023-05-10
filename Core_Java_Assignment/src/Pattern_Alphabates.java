class Pattern_alpha{
    public void displayapl(int row){
        for(int i=1; i<=row; i++){
            for (int j=1; j<=2*i-1; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    public void displayapl2(int row){
        for(int i=1; i<=row; i++){
            for (int j=1; j<=2*i-2; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

}


public class Pattern_Alphabates {

    public static void main(String args[]){
         Pattern_alpha alpha = new Pattern_alpha();
         alpha.displayapl(5);

    }
}
