import java.util.*;

public class ATM_Interface {

    public boolean transferMoney(Account account1, Account account2, int amount) {

        if (account1.sendMoney(amount, account2.getName())) {
            account2.receiveMoney(amount, account1.getName());
            return true;
        }
        else return false;
    }

    public boolean login(HashMap<String, Integer> accounts, String userID, int pin) {

        return accounts.get(userID) == pin;
    }
}


