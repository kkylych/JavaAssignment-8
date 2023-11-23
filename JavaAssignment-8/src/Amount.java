public class Amount {
    double amount;
    String transactionType;
    Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public String toString(){
        return transactionType + ": " + amount;
    }
}
