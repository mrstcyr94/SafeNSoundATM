//Class belonging to the Checkings package.
package Checkings;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

//Importing classes from different packages of the program.
import Images.BackgroundImage;

/*The CheckingsWithdrawl class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class CheckingsWithdrawl extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    public static JLabel currentBalance;
    public static JLabel checkingsWithdrawLabel;
    public static JTextField checkingsWithdrawlText;
    JButton nextButton;
    JButton backButton;
    public static String text;
    public static double withdrawMoney;
    BackgroundImage panel;
    Color originalColor;
    DecimalFormat format = new DecimalFormat("#.##");

    // The constructor is created where instance variables are assigned values.
    public CheckingsWithdrawl() {

        // Instantiating withdrawMoney with 0.
        withdrawMoney = 0;

        // Instantiating the currentBalance variable as a new JLabel. The text is set to
        // the return value of the addCheckingsDeposit method from the CheckingsDeposit
        // class.
        currentBalance = new JLabel(
                "Your current balance is $" + format.format(Checkings.CheckingsDeposit.addCheckingsDeposit())
                        + ".",
                SwingConstants.CENTER);
        currentBalance.setBounds(110, 12, 278, 23);
        currentBalance.setFont(new Font("Engebrechtre", Font.BOLD, 22));
        currentBalance.setForeground(new Color(253, 252, 202));

        // Instantiating the checkingsWithdrawLabel variable as a new JLabel.
        checkingsWithdrawLabel = new JLabel();
        checkingsWithdrawLabel.setText("Please enter how much you would like to withdraw.");
        checkingsWithdrawLabel.setBounds(60, 46, 410, 23);
        checkingsWithdrawLabel.setFont(new Font("Engebrechtre", Font.BOLD, 22));
        checkingsWithdrawLabel.setForeground(new Color(253, 252, 202));

        // Instantiating checkingsWithdrawText as a new JTextField that will allow user
        // to type in a value.
        checkingsWithdrawlText = new JTextField();
        checkingsWithdrawlText.setBounds(190, 80, 115, 35);
        checkingsWithdrawlText.setText(format.format(withdrawMoney));

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
        panel = new BackgroundImage("/Users/andrismac/Documents/SafeNSoundATM/src/SafeNSound Background (2).png");
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
        this.setTitle("SafeNSound Bank - Checkings Account");
        this.add(currentBalance, BorderLayout.CENTER);
        this.add(checkingsWithdrawLabel);
        this.add(checkingsWithdrawlText);
        this.add(nextButton);
        this.add(backButton);
        this.add(panel);
        this.setVisible(true);
    }

    /*
     * Overriding the actionPerfomerd method. A message will
     * appear informing the user to enter a valid amount if
     * any conditions follow: the text box is empty; the return
     * value of the addCheckingsWithdrawl method is less than 1;
     * the return value of the addCheckingsWithdrawl method is
     * greater than the return value of the addCheckingsDeposit
     * method. Otherwise, a new class instance is created and a
     * new window opens after the user clicks the "Next" button.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            if (checkingsWithdrawlText.getText().isEmpty()
                    || addCheckingsWithdrawl() > Checkings.CheckingsDeposit.addCheckingsDeposit()
                    || addCheckingsWithdrawl() <= 0) {
                CheckingsWithdrawl.ErrorPage error = new CheckingsWithdrawl.ErrorPage();
                error.displayMessage();
            } else {
                new MoreCheckingsWithdrawlChoices();
            }
        }

        else if (e.getSource() == backButton) {
            new MoreCheckingsDepositChoices();
        }
    }

    /*
     * After the user types a value in the text field, the value is assigned to the
     * text variable by implementing the getText method. It is then converted to a
     * double and assigned to the withdrawMoney variable. The method returns
     * withdrawMoney as a double value.
     */
    public static double addCheckingsWithdrawl() {
        text = checkingsWithdrawlText.getText();
        withdrawMoney = Double.parseDouble(text);

        return withdrawMoney;
    }

    /*
     * The totalBalance is assigned with the addCheckingsWithdrawl return
     * value subtracted from the addCheckingsDeposit return value. The method
     * returns totalBalance as a double.
     */
    public static double completeWithdrawlBalance() {
        Checkings.CheckingsDepositBalance.totalBalance = Checkings.CheckingsDeposit.addCheckingsDeposit()
                - addCheckingsWithdrawl();

        return Checkings.CheckingsDepositBalance.totalBalance;

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
     * enter a valid amount.
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

        // Method will display the JOption message that informs the user
        // to enter a valid amount.
        public void displayMessage() {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.",
                    "Error: Wrong deposit", JOptionPane.ERROR_MESSAGE, moneySymbol);

            this.dispose();
        }
    }

}
