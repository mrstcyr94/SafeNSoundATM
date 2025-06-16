//Class belonging to the Checkings package.
package Checkings;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Importing classes from different packages of the program.
import Savings.SavingsDeposit;
import Images.BackgroundImage;

/*The MoreCheckingsWithdrawlBalanceChoices class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class MoreCheckingsBalanceChoices extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel checkingsChoices;
    JButton savings;
    JButton leave;
    BackgroundImage panel;
    Color originalColor;

    // The constructor is created where instance variables are assigned values.
    public MoreCheckingsBalanceChoices() {

        // Instantiating the checkingsChoices variable as a new JLabel.
        checkingsChoices = new JLabel();
        checkingsChoices.setText("What else would you like to do?");
        checkingsChoices.setFont(new Font("Engebrechtre", Font.BOLD, 27));
        checkingsChoices.setBounds(90, 40, 314, 28);
        checkingsChoices.setForeground(new Color(253, 252, 202));

        // Instantiating savings variable as a new JButton that will open a new window
        // when the user clicks on it.
        savings = new JButton("Go to savings account");
        savings.setBounds(70, 90, 170, 40);
        savings.setFont(new Font("Helvetica", Font.PLAIN, 14));
        savings.addActionListener(this);
        savings.addMouseListener(this);

        // Instantiating leave variable as a new JButton that will open a new window
        // when the user clicks on it.
        leave = new JButton("Leave");
        leave.setBounds(270, 90, 170, 40);
        leave.setFont(new Font("Helvetica", Font.PLAIN, 14));
        leave.addActionListener(this);
        leave.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = savings.getBackground();

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
        this.add(savings);
        this.add(leave);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == savings) {
            new SavingsDeposit();
        }

        else if (e.getSource() == leave) {
            new CheckingsBalanceLeave();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == savings) {
            savings.setBackground(new Color(247, 225, 148));
            savings.setOpaque(true);
            savings.setBorderPainted(false);
        }

        else if (e.getSource() == leave) {
            leave.setBackground(new Color(247, 225, 148));
            leave.setOpaque(true);
            leave.setBorderPainted(false);
        }
    }

    // Overriding the mousePressed method. Buttons will change colors when being
    // pressed.
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == savings) {
            savings.setBackground(new Color(247, 225, 148));
            savings.setOpaque(true);
            savings.setBorderPainted(false);
        }

        else if (e.getSource() == leave) {
            leave.setBackground(new Color(247, 225, 148));
            leave.setOpaque(true);
            leave.setBorderPainted(false);
        }
    }

    // Overriding the mouseReleased method. Buttons will change back to their
    // original colors when mouse stops pressing them.
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == savings) {
            savings.setBackground(originalColor);
            savings.setOpaque(true);
            savings.setBorderPainted(false);
        }

        else if (e.getSource() == leave) {
            leave.setBackground(originalColor);
            leave.setOpaque(true);
            leave.setBorderPainted(false);
        }
    }

    // Overriding the mouseEntered method. Buttons will change colors when mouse
    // hovers over them.
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == savings) {
            savings.setBackground(new Color(253, 252, 208));
            savings.setOpaque(true);
            savings.setBorderPainted(false);
        }

        else if (e.getSource() == leave) {
            leave.setBackground(new Color(253, 252, 208));
            leave.setOpaque(true);
            leave.setBorderPainted(false);
        }
    }

    // Overriding the mouseExited method. Buttons will change back to their original
    // colors when mouse stops hovering over them.
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == savings) {
            savings.setBackground(originalColor);
            savings.setOpaque(true);
            savings.setBorderPainted(false);
        }

        else if (e.getSource() == leave) {
            leave.setBackground(originalColor);
            leave.setOpaque(true);
            leave.setBorderPainted(false);
        }
    }
}