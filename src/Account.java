public class Account {
    private String userID;
    private String pin;
    private String name;
    private double balance;
    private Transaction_History history;

public Account(String name, String userID, String pin) {
    this.name = name;
    this.userID = userID;
    this.pin = pin;
    this.setBalance(0);
    this.history = new Transaction_History();
    // TODO:Log Transaction_History Account Creation Date and Time
}

public Account(String name, String userID, String pin, int balance) {
    this.name = name;
    this.userID = userID;
    this.pin = pin;
    this.balance = balance;
    this.history = new Transaction_History();
    // TODO:Log Transaction_History Account Creation Date and Time
}

public boolean depositMoney(double deposit) {
    if (deposit >= 1) {
        setBalance(this.balance + deposit);
        return true; //deposit amount is valid and successful
        // TODO:Log Transaction_History Deposit amount, date and time
    }
    else return false; //if the deposit amount is invalid (negative)
}

public boolean withdrawMoney(double amount) {
    if (amount <= this.balance) {
        setBalance(this.balance - amount);
        return true; //withdraw amount was valid and successful
        // TODO:Log Transaction_History withdrawal amount, date and time
    }
    else return false; //withdraw amount was invalid
}

public boolean sendMoney(double amount) {
    if (amount <= this.balance) {
        setBalance(this.balance - amount);
        return true; //successful money send
        // TODO:Log Transaction_History transferred amount, date, time, and receiving userID and name
    }
    else return false; //unsuccessful money send
}

public void receiveMoney(double amount) {
    setBalance(this.balance + amount);
    // TODO:Log Transaction_History received amount, date, time, and from userID and name
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
}
