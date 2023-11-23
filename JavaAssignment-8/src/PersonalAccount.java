import java.util.ArrayList;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<Amount>();

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 100;
    }

    void deposit(double amount){
        Amount temp = new Amount(amount, "Deposit");
        balance += amount;
        transactions.add(temp);
    }
    void withdraw(double amount){
        Amount temp = new Amount(amount, "Withdrawal");
        try {
            if(balance < amount){
                throw new InsufficientBalanceException("Your input is more than your balance!\n");
            }
            else{
                balance -= amount;
            }
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

        transactions.add(temp);
    }
    void printTransactionHistory(){
        for(Amount i : transactions){
            System.out.println(i);
        }
    }
    void showBalance(){
        System.out.println(getBalance());
    }
    void showAccountNumber(){
        System.out.println(getAccountNumber());
    }
    void showAccountHolder(){
        System.out.println(getAccountHolder());
    }
}