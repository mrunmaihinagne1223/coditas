interface test{
    void square();
}
class arithmatic implements test{

    @Override
    public void square() {
        System.out.println("its arithmatic ");
    }
}
class ToIntTest2 extends arithmatic{
    public static void main(String[] args) {
        arithmatic obj = new arithmatic();
        obj.square();
    }


}
//its arithmatic
//
//Process finished with exit code 0

public class Q3_Interfaces {

}
