public class CustomerAccount {
    private String Cus_name;
    private String Acc_No;
    private double Balance;

    public CustomerAccount(String cus_name, String acc_No, double balance) {
        Cus_name = cus_name;
        Acc_No = acc_No;
        Balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0.0) {
            return false;
        }
        Balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws WithdrawAmoutExceedException {
        if (amount > Balance) {
            throw new WithdrawAmoutExceedException("Withdraw amount exceed the balance");
        }
        Balance -= amount;
        return true;
    }

    public double getBalance() throws BalanceReachedBelow100Exception {
        if (Balance < 100.0) {
            throw new BalanceReachedBelow100Exception("Balance reach below 100$.");
        }
        return Balance;
    }

    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount("Kash", "123456", 100);
        ca.deposit(20);
        try {
            ca.withdraw(130);
            try {
                ca.getBalance();
            } catch (BalanceReachedBelow100Exception be) {
                System.out.println(be.getMessage());
            }
        } catch (WithdrawAmoutExceedException we) {
            System.out.println(we.getMessage());
        }

    }
}
