public class CheckTransction {

    int balance = 5000;
    public void deposite(int amount1){
        try {
            if(amount1 < 0 || amount1 == 0){
                throw new InvalidAmountException();
            }
        }
        catch (InvalidAmountException i){
            System.out.println();
        }
    }
    public void withdraw(int amount){
        try {
            if(amount > balance){
                throw new InsufficientBalanceException();
            }
        }
        catch (InsufficientBalanceException t){
            System.out.println();
        }
    }


}
