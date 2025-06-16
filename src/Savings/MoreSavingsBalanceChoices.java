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

//Importing classes from different packages of the program.
import Checkings.CheckingsDeposit;
import Images.BackgroundImage;

/*The MoreSavingsBalanceChoices class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class MoreSavingsBalanceChoices extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel savings;
    JButton goToCheckings;
    JButton leave;
    BackgroundImage panel;
    Color originalColor;

    // The constructor is created where instance variables are assigned values.
    public MoreSavingsBalanceChoices() {

        // Instantiating the savings variable as a new JLabel.
        savings = new JLabel();
        savings.setText("What else would you like to do?");
        savings.setFont(new Font("Engebrechtre", Font.BOLD, 27));
        savings.setBounds(90, 40, 314, 28);
        savings.setForeground(new Color(253, 252, 202));

        // Instantiating goToCheckings variable as a new JButton that will open a new
        // window
        // when the user clicks on it.
        goToCheckings = new JButton("Go to checkings account");
        goToCheckings.setBounds(70, 90, 170, 40);
        goToCheckings.setFont(new Font("Helvetica", Font.PLAIN, 14));
        goToCheckings.addActionListener(this);
        goToCheckings.addMouseListener(this);

        // Instantiating leave variable as a new JButton that will open a new window
        // when the user clicks on it.
        leave = new JButton("Leave");
        leave.setBounds(270, 90, 170, 40);
        leave.setFont(new Font("Helvetica", Font.PLAIN, 14));
        leave.addActionListener(this);
        leave.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = leave.getBackground();

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
        this.add(savings);
        this.add(goToCheckings);
        this.add(leave);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goToCheckings) {
            new CheckingsDeposit();
        } else if (e.getSource() == leave) {
            new SavingsBalanceLeave();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == goToCheckings) {
            goToCheckings.setBackground(new Color(247, 225, 148));
            goToCheckings.setOpaque(true);
            goToCheckings.setBorderPainted(false);
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
        if (e.getSource() == goToCheckings) {
            goToCheckings.setBackground(new Color(247, 225, 148));
            goToCheckings.setOpaque(true);
            goToCheckings.setBorderPainted(false);
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
        if (e.getSource() == goToCheckings) {
            goToCheckings.setBackground(originalColor);
            goToCheckings.setOpaque(true);
            goToCheckings.setBorderPainted(false);
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
        if (e.getSource() == goToCheckings) {
            goToCheckings.setBackground(new Color(253, 252, 208));
            goToCheckings.setOpaque(true);
            goToCheckings.setBorderPainted(false);
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
        if (e.getSource() == goToCheckings) {
            goToCheckings.setBackground(originalColor);
            goToCheckings.setOpaque(true);
            goToCheckings.setBorderPainted(false);
        }

        else if (e.getSource() == leave) {
            leave.setBackground(originalColor);
            leave.setOpaque(true);
            leave.setBorderPainted(false);
        }
    }

}
