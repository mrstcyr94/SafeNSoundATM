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
import Goodbye.Goodbye;
import Images.BackgroundImage;

/*The SavingsDepositLeave class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class SavingsDepositLeave extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel leave;
    JButton yesButton;
    JButton noButton;
    BackgroundImage panel;
    Color originalColor;

    // The constructor is created where instance variables are assigned values.
    public SavingsDepositLeave() {

        // Instantiating leave as a new JLabel.
        leave = new JLabel();
        leave.setText("Are you sure you want to leave?");
        leave.setFont(new Font("Engebrechtre", Font.BOLD, 29));
        leave.setBounds(86, 45, 335, 30);
        leave.setForeground(new Color(253, 252, 202));

        // Instantiating the yesButton as a new JButton that will open a new window
        // when the user clicks on it.
        yesButton = new JButton("Yes");
        yesButton.setBounds(134, 100, 80, 40);
        yesButton.setFont(new Font("Helvetica", Font.PLAIN, 15));
        yesButton.addActionListener(this);
        yesButton.addMouseListener(this);

        // Instantiating the noButton as a new JButton that will open a new window
        // when the user clicks on it.
        noButton = new JButton("No");
        noButton.setBounds(280, 100, 80, 40);
        noButton.setFont(new Font("Helvetica", Font.PLAIN, 15));
        noButton.addActionListener(this);
        noButton.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = yesButton.getBackground();

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
        this.setTitle("SafeNSound Bank - Checkings");
        this.add(leave);
        this.add(yesButton);
        this.add(noButton);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesButton) {
            new Goodbye();
        } else if (e.getSource() == noButton) {
            new MoreSavingsDepositChoices();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == yesButton) {
            yesButton.setBackground(new Color(247, 225, 148));
            yesButton.setOpaque(true);
            yesButton.setBorderPainted(false);
        }

        else if (e.getSource() == noButton) {
            noButton.setBackground(new Color(247, 225, 148));
            noButton.setOpaque(true);
            noButton.setBorderPainted(false);
        }
    }

    // Overriding the mousePressed method. Buttons will change colors when being
    // pressed.
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == yesButton) {
            yesButton.setBackground(new Color(247, 225, 148));
            yesButton.setOpaque(true);
            yesButton.setBorderPainted(false);
        }

        else if (e.getSource() == noButton) {
            noButton.setBackground(new Color(247, 225, 148));
            noButton.setOpaque(true);
            noButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseReleased method. Buttons will change back to their
    // original colors when mouse stops pressing them.
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == yesButton) {
            yesButton.setBackground(originalColor);
            yesButton.setOpaque(true);
            yesButton.setBorderPainted(false);
        }

        else if (e.getSource() == noButton) {
            noButton.setBackground(originalColor);
            noButton.setOpaque(true);
            noButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseEntered method. Buttons will change colors when mouse
    // hovers over them.
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == yesButton) {
            yesButton.setBackground(new Color(253, 252, 208));
            yesButton.setOpaque(true);
            yesButton.setBorderPainted(false);
        }

        else if (e.getSource() == noButton) {
            noButton.setBackground(new Color(253, 252, 208));
            noButton.setOpaque(true);
            noButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseExited method. Buttons will change back to their original
    // colors when mouse stops hovering over them.
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == yesButton) {
            yesButton.setBackground(originalColor);
            yesButton.setOpaque(true);
            yesButton.setBorderPainted(false);
        }

        else if (e.getSource() == noButton) {
            noButton.setBackground(originalColor);
            noButton.setOpaque(true);
            noButton.setBorderPainted(false);
        }
    }
}
