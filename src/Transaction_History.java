import java.util.HashMap;

import java.util.HashSet;
import java.util.Random;

public class Transaction_History {

    private HashMap<Integer, Transaction> history;
    private HashSet<Integer> IDs;

    public Transaction_History() {
    }

    public void addTransaction(Transaction transaction) {
        if (generateID(transaction)) {
            history.put(transaction.getIdentifier(), transaction);
        }
    }

    public boolean generateID(Transaction transaction) {
        int newID;
        Random rand = new Random(System.currentTimeMillis());
        do {
            newID = rand.nextInt(100000, 999999);
        } while (IDs.contains(newID));
        transaction.setIdentifier(newID);
        IDs.add(newID);

        return transaction.getIdentifier() == newID;
    }

    // Getters
    public HashMap<Integer, Transaction> getHistory() {
        return history;
    }

    public HashSet<Integer> getIDs() {
        return IDs;
    }

}
