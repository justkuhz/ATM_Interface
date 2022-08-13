/**
 * ATM Interface Java Application
 * Simulates a real-world ATM experience where you can create an account id, pin password, and a starting balance for a
 * general checking account. You will have to enter both a valid account id and the correct 4 digit pin password
 * associated with the account to log in. Once logged in, you can see transaction history, withdraw, deposit, transfer,
 * and quit.
 */
import java.util.*;

// TODO: Don't forget to javadocs your public methods :)

public class ATM_Interface {
    public static void main(String[] args) {

    }

    public boolean transferMoney(Account account1, Account account2, int amount) {
        if (account1.sendMoney(amount)) {
            account2.receiveMoney(amount);
            return true;
        }
        else return false;
    }
}


