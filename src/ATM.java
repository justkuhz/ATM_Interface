import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * ATM Interface Java Application ---
 * Simulates a real-world ATM experience where you can create an account id, pin password, and a starting balance for a
 * general checking account. You will have to enter both a valid account id and the correct 4 digit pin password
 * associated with the account to log in. Once logged in, you can see transaction history, withdraw, deposit, transfer,
 * and quit.
 * Written by Ken Zhu
 */

public class ATM {

    private JTextArea eventLog;
    private JButton newAccountButton;
    private JButton logInButton;

    public static HashMap<String, Integer> accountList = new HashMap<>();

    public ATM() {

        ATM_Interface atmInterface = new ATM_Interface();

        newAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewAccount newAcc = new NewAccount();
            }
        });
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {


    }

}
