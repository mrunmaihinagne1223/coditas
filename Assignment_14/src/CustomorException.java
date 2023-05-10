public class CustomorException {
    public static void main(String[] args) {
        CheckTransction checkTransction = new CheckTransction();
        checkTransction.deposite(-5);

        checkTransction.withdraw(7000);

        checkTransction.deposite(0);

        System.out.println("********************CorrectInput*********************************");

        checkTransction.deposite(8);

        checkTransction.withdraw(50);
    }



}
