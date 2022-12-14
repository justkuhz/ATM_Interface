public class Transaction {

    private String type;
    private String time;
    private String name;
    private double amount;
    private int identifier;

    Date_and_Time dt = new Date_and_Time();

    public Transaction(String type, double amount) {
        this.type = type;
        dt.setCurrentTime();
        this.time = dt.getDatetime();
        this.amount = amount;
        this.name = "";
        this.identifier = -1;
    }

    public Transaction(String type, String name, double amount) {
        this.type = type;
        dt.setCurrentTime();
        this.time = dt.getDatetime();
        this.amount = amount;
        this.name = name;
        this.identifier = -1;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getIdentifier() { return identifier; }

    public void setIdentifier(int identifier) { this.identifier = identifier; }
}
