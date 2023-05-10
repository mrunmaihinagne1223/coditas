package MultiThreadingBankApp;

public class AccountHolder implements Runnable{
    private Account account;

    public AccountHolder(Account account ){
        this.account=account;
    }
    private void makeWithdrawal(int withdrawAmount) {
        synchronized (this) {
            if (account.getBalance() >= withdrawAmount) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + withdrawAmount);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                }
                account.withdraw(withdrawAmount);
                System.out.println(Thread.currentThread().getName() + " completes the withdrawal of $" + withdrawAmount);
            } else {
                System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
                        + account.getBalance());
            }
        }
    }


    @Override
    public void run() {

    }
}
