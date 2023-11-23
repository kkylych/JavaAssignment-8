import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PersonalAccount myAccount = new PersonalAccount(999, "Kylychbek Parpiev");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the option: \n 1 - Deposit \n 2 - Withdraw \n 3 - Transaction History \n 4 - Get Balance \n 5 - Account Number \n 6 - Account Holder \n");
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> {
                System.out.print("Your balance: ");
                myAccount.showBalance();
                System.out.println("Type the amount: ");
                double depositAmount = scanner.nextDouble();
                myAccount.deposit(depositAmount);
            }
            case 2 -> {
                System.out.print("Your balance: ");
                myAccount.showBalance();
                System.out.println("Type the amount: ");
                double withdrawAmount = scanner.nextDouble();
                myAccount.withdraw(withdrawAmount);
            }
            case 3 -> myAccount.printTransactionHistory();
            case 4 -> myAccount.showBalance();
            case 5 -> myAccount.showAccountNumber();
            case 6 -> myAccount.showAccountHolder();
            default -> System.out.println("Incorrect Input!");
        }
    }
}