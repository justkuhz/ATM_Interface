public class Account {
    private String userID;
    private String pin;
    private String name;
    private double balance;
    private final Transaction_History transactionHistory;

    // Constructors
public Account(String name, String userID, String pin) {

    this.name = name;
    this.userID = userID;
    this.pin = pin;
    this.setBalance(0);
    this.transactionHistory = new Transaction_History();

    Transaction creation = new Transaction("Account Creation", name, 0);
    transactionHistory.addTransaction(creation);
}
public Account(String name, String userID, String pin, int balance) {

    this.name = name;
    this.userID = userID;
    this.pin = pin;
    this.balance = balance;
    this.transactionHistory = new Transaction_History();

    Transaction creation = new Transaction("Account Creation", name, balance);
    transactionHistory.addTransaction(creation);
}

    public boolean depositMoney(double amount) {

    if (amount >= 0.01) {

        setBalance(this.balance + amount);

        Transaction depositTransaction = new Transaction("Deposit", name, amount);
        transactionHistory.addTransaction(depositTransaction);

        return true; //deposit amount is valid and successful
    }
    else return false; //if the deposit amount is invalid (negative)
}

public boolean withdrawMoney(double amount) {

    if (amount <= this.balance) {
        setBalance(this.balance - amount);

        Transaction withdrawTransaction = new Transaction("Withdrawal", name, amount);
        transactionHistory.addTransaction(withdrawTransaction);

        return true; //withdraw amount was valid and successful
    }
    else return false; //withdraw amount was invalid
}

public boolean sendMoney(double amount, String sentTo) {

    if (amount <= this.balance) {
        setBalance(this.balance - amount);

        Transaction sendTransaction = new Transaction("Money Sent To: ", sentTo, amount);
        transactionHistory.addTransaction(sendTransaction);

        return true; //successful money send
    }
    else return false; //unsuccessful money send
}

public void receiveMoney(double amount, String sentFrom) {

    setBalance(this.balance + amount);

    Transaction receiveTransaction = new Transaction("Money Sent From: ", sentFrom, amount);
    transactionHistory.addTransaction(receiveTransaction);
}

// Setters and Getters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
