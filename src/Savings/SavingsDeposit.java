//Class belonging to the Savings package.
package Savings;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

//Importing classes from different packages of the program.
import Images.BackgroundImage;
import Welcome.Welcome;

/*The SavingsDeposit class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class SavingsDeposit extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel savingsDepositLabel;
    JLabel savingsDepositLabel2;
    public static JTextField savingsDepositText;
    JButton nextButton;
    JButton backButton;
    BackgroundImage panel;
    public static String text;
    public static double savingsDeposit;
    Color originalColor;
    DecimalFormat format = new DecimalFormat("#.##");

    // The constructor is created where instance variables are assigned values.
    public SavingsDeposit() {

        // Instantiating savingsDeposit with 0.
        savingsDeposit = 0;

        // Instantiating the savingsDepositLabel variable as a new JLabel.
        savingsDepositLabel = new JLabel();
        savingsDepositLabel.setText("Welcome to your savings account!");
        savingsDepositLabel.setFont(new Font("Engebrechtre", Font.BOLD, 25));
        savingsDepositLabel.setBounds(95, 16, 307, 27);
        savingsDepositLabel.setForeground(new Color(253, 252, 202));

        // Instantiating the savingsDepositLabel2 variable as a new JLabel.
        savingsDepositLabel2 = new JLabel();
        savingsDepositLabel2.setText("Please enter how much you would like to deposit.");
        savingsDepositLabel2.setFont(new Font("Engebrechtre", Font.BOLD, 20));
        savingsDepositLabel2.setBounds(72, 50, 360, 21);
        savingsDepositLabel2.setForeground(new Color(253, 252, 202));

        // Instantiating savingsDepositText as a new JTextField that will allow user
        // to type in a value.
        savingsDepositText = new JTextField();
        savingsDepositText.setBounds(190, 80, 115, 35);
        savingsDepositText.setText(format.format(savingsDeposit));

        // Instantiating the backButton as a new JButton that will open a new window
        // when the user clicks on it.
        backButton = new JButton("Back");
        backButton.setBounds(140, 130, 90, 35);
        backButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        backButton.addActionListener(this);
        backButton.addMouseListener(this);

        // Instantiating the nextButton as a new JButton that will open a new window
        // when the user clicks on it.
        nextButton = new JButton("Next");
        nextButton.setBounds(260, 130, 90, 35);
        nextButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        nextButton.addActionListener(this);
        nextButton.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = backButton.getBackground();

        // Instantiating the panel variable as an instance of the BackgroundImage class.
        // The instance has the path of an image file in the parameters.
        panel = new BackgroundImage("/Users/andrismac/Documents/SafeNSoundATM/src/SafeNSound Background (4).png");
        panel.setBounds(0, 0, 500, 240);

        /*
         * Setting the JFrame's size, layout, and title. The JFrame will close when the
         * user clicks on the exit symbol, and it cannot be resized. All the labels,
         * buttons, and panels are added to the JFrame.
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 240);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("SafeNSound Bank - Savings Account");
        this.add(savingsDepositLabel);
        this.add(savingsDepositLabel2);
        this.add(savingsDepositText);
        this.add(nextButton);
        this.add(backButton);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons. If the
    // user clicks "Next" when the text box is empty or the deposit
    // money is less then 1, a new instance of the nested class is
    // created. A message will appear informing the user to enter a valid amount.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {

            if (savingsDepositText.getText().isEmpty() || addSavingsDeposit() <= 0) {
                SavingsDeposit.ErrorPage error = new SavingsDeposit.ErrorPage();
                error.displayMessage();
            } else {
                new MoreSavingsDepositChoices();
            }

        } else if (e.getSource() == backButton) {
            new Welcome();
        }
    }

    /*
     * After the user types a value in the text field, the value is assigned to the
     * text variable by implementing the getText method. It is then converted to a
     * double and assigned to the savingsDeposit variable. The method returns
     * savingsDeposit as a double value.
     */
    public static double addSavingsDeposit() {
        text = savingsDepositText.getText();
        savingsDeposit = Double.parseDouble(text);

        return savingsDeposit;
    }

    /*
     * The totalSavingsBalance is assigned with the sum of the addSavingsDeposit
     * return
     * value and totalSavingsBalance. The method returns totalSavingsBalance.
     */
    public static double savingsDepositBalance() {
        Savings.SavingsDepositBalance.totalSavingsBalance = addSavingsDeposit()
                + Savings.SavingsDepositBalance.totalSavingsBalance;

        return Savings.SavingsDepositBalance.totalSavingsBalance;
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == nextButton) {
            nextButton.setBackground(new Color(247, 225, 148));
            nextButton.setOpaque(true);
            nextButton.setBorderPainted(false);
        }

        else if (e.getSource() == backButton) {
            backButton.setBackground(new Color(247, 225, 148));
            backButton.setOpaque(true);
            backButton.setBorderPainted(false);
        }
    }

    // Overriding the mousePressed method. Buttons will change colors when being
    // pressed.
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == nextButton) {
            nextButton.setBackground(new Color(247, 225, 148));
            nextButton.setOpaque(true);
            nextButton.setBorderPainted(false);
        }

        else if (e.getSource() == backButton) {
            backButton.setBackground(new Color(247, 225, 148));
            backButton.setOpaque(true);
            backButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseReleased method. Buttons will change back to their
    // original colors when mouse stops pressing them.
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == nextButton) {
            nextButton.setBackground(originalColor);
            nextButton.setOpaque(true);
            nextButton.setBorderPainted(false);
        }

        else if (e.getSource() == backButton) {
            backButton.setBackground(originalColor);
            backButton.setOpaque(true);
            backButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseEntered method. Buttons will change colors when mouse
    // hovers over them.
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == nextButton) {
            nextButton.setBackground(new Color(253, 252, 208));
            nextButton.setOpaque(true);
            nextButton.setBorderPainted(false);
        }

        else if (e.getSource() == backButton) {
            backButton.setBackground(new Color(253, 252, 208));
            backButton.setOpaque(true);
            backButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseExited method. Buttons will change back to their original
    // colors when mouse stops hovering over them.
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == nextButton) {
            nextButton.setBackground(originalColor);
            nextButton.setOpaque(true);
            nextButton.setBorderPainted(false);
        }

        else if (e.getSource() == backButton) {
            backButton.setBackground(originalColor);
            backButton.setOpaque(true);
            backButton.setBorderPainted(false);
        }
    }

    /*
     * Creating a nested class that extends JFrame. This class
     * will display a JOption message that informs the user to
     * enter a valid input.
     */
    static class ErrorPage extends JFrame {

        // The instance variable of type ImageIcon is declared.
        ImageIcon moneySymbol;

        public ErrorPage() {
            // Instantiating the moneySymbol varialbe as a new ImageIcon with the image
            // path.
            moneySymbol = new ImageIcon("/Users/andrismac/Documents/SafeNSoundATM/src/money symbol.png");

            /*
             * Setting the JFrame's location, layout, and visibility.
             * The frame will be positioned on top and within the
             * java program to prevent it from apearring outside the
             * program.
             */
            this.setAlwaysOnTop(true);
            this.setLocation(200, 150);
            this.setVisible(true);
        }

        // Method will display the JOption message that informs the user to enter a
        // valid ammount.
        public void displayMessage() {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.",
                    "Error: No deposit", JOptionPane.ERROR_MESSAGE, moneySymbol);

            this.dispose();
        }

    }
}
