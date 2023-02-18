public class Bank{
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.setCheckingBalance(100);
        user1.setSavingsBalance(2000);


        user1.DepositToChecking(5);
        user1.depositToSavings(200);
        user1.withdrawFromChecking(120);


        
        
        System.out.printf("user1 has %s in checking and %s in savings", user1.getCheckingBalance(), user1.getSavingsBalance());
        // System.out.printf("There are %s accounts", BankAccount.numberOfAccounts);
    }
}