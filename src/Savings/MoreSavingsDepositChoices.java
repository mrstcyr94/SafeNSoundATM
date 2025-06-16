//Class belonging to the Savings package.
package Savings;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Importing classes from different packages of the program.
import Checkings.CheckingsDeposit;
import Images.BackgroundImage;

/*The MoreSavingsDepositChoices class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class MoreSavingsDepositChoices extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel savingsChoices;
    JButton savingsWithdrawlButton;
    JButton checkingsButton;
    JButton savingsBalanceButton;
    JButton leaveButton;
    BackgroundImage panel;
    Color originalColor;

    // The constructor is created where instance variables are assigned values.
    public MoreSavingsDepositChoices() {

        // Instantiating the savingsChoices variable as a new JLabel.
        savingsChoices = new JLabel();
        savingsChoices.setText("What else would you like to do?");
        savingsChoices.setFont(new Font("Engebrechtre", Font.BOLD, 27));
        savingsChoices.setBounds(90, 20, 314, 28);
        savingsChoices.setForeground(new Color(253, 252, 202));

        // Instantiating savingsWithdrawlButton as a new JButton that will open a new
        // window
        // when the user clicks on it.
        savingsWithdrawlButton = new JButton("Make a withdrawl");
        savingsWithdrawlButton.setBounds(70, 70, 170, 40);
        savingsWithdrawlButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        savingsWithdrawlButton.addActionListener(this);
        savingsWithdrawlButton.addMouseListener(this);

        // Instantiating savingsBalanceButton as a new JButton that will open a new
        // window
        // when the user clicks on it.
        savingsBalanceButton = new JButton("Check balance");
        savingsBalanceButton.setBounds(270, 70, 170, 40);
        savingsBalanceButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        savingsBalanceButton.addActionListener(this);
        savingsBalanceButton.addMouseListener(this);

        // Instantiating checkingsButton as a new JButton that will open a new window
        // when the user clicks on it.
        checkingsButton = new JButton("Go to checkings account");
        checkingsButton.setBounds(70, 120, 170, 40);
        checkingsButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        checkingsButton.addActionListener(this);
        checkingsButton.addMouseListener(this);

        // Instantiating leaveButton as a new JButton that will open a new window
        // when the user clicks on it.
        leaveButton = new JButton("Leave");
        leaveButton.setBounds(270, 120, 170, 40);
        leaveButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        leaveButton.addActionListener(this);
        leaveButton.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = savingsWithdrawlButton.getBackground();

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
        this.setTitle("SafeNSound Bank - Savings Account");
        this.setResizable(false);
        this.add(savingsChoices);
        this.add(savingsWithdrawlButton);
        this.add(savingsBalanceButton);
        this.add(checkingsButton);
        this.add(leaveButton);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == savingsWithdrawlButton) {
            new SavingsWithdrawl();
        } else if (e.getSource() == savingsBalanceButton) {
            new SavingsDepositBalance();
        } else if (e.getSource() == checkingsButton) {
            new CheckingsDeposit();
        } else if (e.getSource() == leaveButton) {
            new SavingsDepositLeave();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == savingsWithdrawlButton) {
            savingsWithdrawlButton.setBackground(new Color(247, 225, 148));
            savingsWithdrawlButton.setOpaque(true);
            savingsWithdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsBalanceButton) {
            savingsBalanceButton.setBackground(new Color(247, 225, 148));
            savingsBalanceButton.setOpaque(true);
            savingsBalanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(new Color(247, 225, 148));
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
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
        if (e.getSource() == savingsWithdrawlButton) {
            savingsWithdrawlButton.setBackground(new Color(247, 225, 148));
            savingsWithdrawlButton.setOpaque(true);
            savingsWithdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsBalanceButton) {
            savingsBalanceButton.setBackground(new Color(247, 225, 148));
            savingsBalanceButton.setOpaque(true);
            savingsBalanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(new Color(247, 225, 148));
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
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
        if (e.getSource() == savingsWithdrawlButton) {
            savingsWithdrawlButton.setBackground(originalColor);
            savingsWithdrawlButton.setOpaque(true);
            savingsWithdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsBalanceButton) {
            savingsBalanceButton.setBackground(originalColor);
            savingsBalanceButton.setOpaque(true);
            savingsBalanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(originalColor);
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
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
        if (e.getSource() == savingsWithdrawlButton) {
            savingsWithdrawlButton.setBackground(new Color(253, 252, 208));
            savingsWithdrawlButton.setOpaque(true);
            savingsWithdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsBalanceButton) {
            savingsBalanceButton.setBackground(new Color(253, 252, 208));
            savingsBalanceButton.setOpaque(true);
            savingsBalanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(new Color(253, 252, 208));
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
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
        if (e.getSource() == savingsWithdrawlButton) {
            savingsWithdrawlButton.setBackground(originalColor);
            savingsWithdrawlButton.setOpaque(true);
            savingsWithdrawlButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsBalanceButton) {
            savingsBalanceButton.setBackground(originalColor);
            savingsBalanceButton.setOpaque(true);
            savingsBalanceButton.setBorderPainted(false);
        }

        else if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(originalColor);
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == leaveButton) {
            leaveButton.setBackground(originalColor);
            leaveButton.setOpaque(true);
            leaveButton.setBorderPainted(false);
        }
    }
}
