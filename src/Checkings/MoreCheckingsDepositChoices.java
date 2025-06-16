//Class belonging to the Checkings package.
package Checkings;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Importing classes from different packages of the program.
import Images.BackgroundImage;
import Savings.SavingsDeposit;

/*The MoreCheckingsDepositChoices class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class MoreCheckingsDepositChoices extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel checkingsChoices;
    JButton withdrawlButton;
    JButton savingsButton;
    JButton balanceButton;
    JButton leaveButton;
    BackgroundImage panel;
    Color originalColor;

    // The constructor is created where instance variables are assigned values.
    public MoreCheckingsDepositChoices() {

        // Instantiating the checkingsChoices variable as a new JLabel.
        checkingsChoices = new JLabel();
        checkingsChoices.setText("What else would you like to do?");
        checkingsChoices.setFont(new Font("Engebrechtre", Font.BOLD, 27));
        checkingsChoices.setBounds(90, 20, 314, 28);
        checkingsChoices.setForeground(new Color(253, 252, 202));

        // Instantiating withdrawlButton as a new JButton that will open a new window
        // when the user clicks on it.
        withdrawlButton = new JButton("Make a withdrawl");
        withdrawlButton.setBounds(70, 70, 170, 40);
        withdrawlButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        withdrawlButton.addActionListener(this);
        withdrawlButton.addMouseListener(this);

        // Instantiating balanceButton as a new JButton that will open a new window
        // when the user clicks on it.
        balanceButton = new JButton("Check balance");
        balanceButton.setBounds(270, 70, 170, 40);
        balanceButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        balanceButton.addActionListener(this);
        balanceButton.addMouseListener(this);

        // Instantiating savingsButton as a new JButton that will open a new window
        // when the user clicks on it.
        savingsButton = new JButton("Go to savings account");
        savingsButton.setBounds(70, 120, 170, 40);
        savingsButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        savingsButton.addActionListener(this);
        savingsButton.addMouseListener(this);

        // Instantiating leaveButton as a new JButton that will open a new window
        // when the user clicks on it.
        leaveButton = new JButton("Leave");
        leaveButton.setBounds(270, 120, 170, 40);
        leaveButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        leaveButton.addActionListener(this);
        leaveButton.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = withdrawlButton.getBackground();

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
        this.setTitle("SafeNSound Bank - Checkings Account");
        this.setResizable(false);
        this.add(checkingsChoices);
        this.add(withdrawlButton);
        this.add(balanceButton);
        this.add(savingsButton);
        this.add(leaveButton);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == withdrawlButton) {
            new CheckingsWithdrawl();
        }

        else if (e.getSource() == balanceButton) {
            new CheckingsDepositBalance();
        }

        else if (e.getSource() == savingsButton) {
            new SavingsDeposit();
        }

        else if (e.getSource() == leaveButton) {
            new CheckingsDepositLeave();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == withdrawlButton) {
            withdrawlButton.setBackground(new Color(247, 225, 148));
            withdrawlButton.setOpaque(true);
            withdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == balanceButton) {
            balanceButton.setBackground(new Color(247, 225, 148));
            balanceButton.setOpaque(true);
            balanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(new Color(247, 225, 148));
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == leaveButton) {
            leaveButton.setBackground(new Color(247, 225, 148));
            leaveButton.setOpaque(true);
            leaveButton.setBorderPainted(false);
        }
    }

    // Overriding the mousePressed method. Buttons will change colors when being
    // pressed.
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == withdrawlButton) {
            withdrawlButton.setBackground(new Color(247, 225, 148));
            withdrawlButton.setOpaque(true);
            withdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == balanceButton) {
            balanceButton.setBackground(new Color(247, 225, 148));
            balanceButton.setOpaque(true);
            balanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(new Color(247, 225, 148));
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == leaveButton) {
            leaveButton.setBackground(new Color(247, 225, 148));
            leaveButton.setOpaque(true);
            leaveButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseReleased method. Buttons will change back to their
    // original colors when mouse stops pressing them.
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == withdrawlButton) {
            withdrawlButton.setBackground(originalColor);
            withdrawlButton.setOpaque(true);
            withdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == balanceButton) {
            balanceButton.setBackground(originalColor);
            balanceButton.setOpaque(true);
            balanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(originalColor);
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == leaveButton) {
            leaveButton.setBackground(originalColor);
            leaveButton.setOpaque(true);
            leaveButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseEntered method. Buttons will change colors when mouse
    // hovers over them.
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == withdrawlButton) {
            withdrawlButton.setBackground(new Color(253, 252, 208));
            withdrawlButton.setOpaque(true);
            withdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == balanceButton) {
            balanceButton.setBackground(new Color(253, 252, 208));
            balanceButton.setOpaque(true);
            balanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(new Color(253, 252, 208));
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == leaveButton) {
            leaveButton.setBackground(new Color(253, 252, 208));
            leaveButton.setOpaque(true);
            leaveButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseExited method. Buttons will change back to their original
    // colors when mouse stops hovering over them.
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == withdrawlButton) {
            withdrawlButton.setBackground(originalColor);
            withdrawlButton.setOpaque(true);
            withdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == balanceButton) {
            balanceButton.setBackground(originalColor);
            balanceButton.setOpaque(true);
            balanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(originalColor);
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == leaveButton) {
            leaveButton.setBackground(originalColor);
            leaveButton.setOpaque(true);
            leaveButton.setBorderPainted(false);
        }
    }

}
