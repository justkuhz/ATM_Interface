import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class NewAccount extends JDialog {
    private JPanel contentPane;
    private JButton buttonEnter;
    private JButton buttonCancel;
    private JTextField nameField;
    private JTextField userIDField;
    private JTextField pinField;
    private JTextField balanceField;
    private JTextArea instructionTextArea;

    public NewAccount() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonEnter);

        buttonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        /*
        attempt to create account, if true then notification saying the account has been created
        if false then notification saying why it failed
        reasons to fail: userID is shorter than 6 characters, userID contains symbols that are not alphanumeric, userID
        is taken
         */
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public boolean createAccount(HashMap<String, Integer> accounts, String userID, int pin, String name) {

        if(accounts.containsKey(userID)) return false; //userID already exists in system
        else {
            Account newAccount = new Account(name, userID, pin);
            return true;
        }
    }

    public boolean createAccount(HashMap<String, Integer> accounts, String userID, int pin, String name, int balance) {

        if(accounts.containsKey(userID)) return false; //userID already exists in system
        else {
            Account newAccount = new Account(name, userID, pin, balance);
            return true;
        }
    }
}
