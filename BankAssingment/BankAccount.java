
public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfAccounts = 0;

    //This has the same name as the class
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        BankAccount.numberOfAccounts +=1;
    }

    public void setCheckingBalance(double cBalance){
        this.checkingBalance = cBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }
    
    public void setSavingsBalance(double sBalance){
        this.savingsBalance = sBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void DepositToChecking(double checkingDeposit){
        this.checkingBalance = checkingBalance + checkingDeposit;
    }

    public void depositToSavings(double savingsDeposit){
        this.savingsBalance = savingsBalance + savingsDeposit;
    }

    public void withdrawFromChecking(double checkingWithdraw){
        if (this.checkingBalance - checkingWithdraw > 0){
            this.checkingBalance = checkingBalance - checkingWithdraw;

        } else {
            System.out.println("Insufficient Funds");
        }
    }
    

}