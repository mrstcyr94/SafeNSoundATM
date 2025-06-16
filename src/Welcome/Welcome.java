//Class belonging to the Welcome package.
package Welcome;

//Imports are added.
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

//Importing classes from different packages of the program.
import Checkings.CheckingsDeposit;
import Images.BackgroundImage;
import Savings.SavingsDeposit;

/*The Welcome class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class Welcome extends JFrame implements ActionListener, MouseListener {
    // Instance variables are stated.
    JLabel welcomeLabel;
    JLabel welcomeLabel2;
    JLabel welcomeLabel3;
    JButton checkingsButton;
    JButton savingsButton;
    ImageIcon logo;
    ImageIcon logo2;
    BackgroundImage panel;
    Color originalColor;

    // The constructor is created where instance variables are assigned values.
    public Welcome() {
        // Instantiating welcomeLabel as a new JLabel.
        welcomeLabel = new JLabel();
        welcomeLabel.setText("Welcome to");
        welcomeLabel.setBounds(210, 10, 260, 20);
        welcomeLabel.setFont(new Font("Engebrechtre", Font.BOLD, 19));
        welcomeLabel.setForeground(new Color(253, 252, 202));

        // Instantiating the logo variable as a new ImageIcon that contains the path to
        // the image file.
        logo = new ImageIcon("/Users/andrismac/Documents/SafeNSoundATM/src/safensound logo.png");

        // Instatiating welcomeLabel2 as a new JLabel and setting the logo variable as
        // its image icon.
        welcomeLabel2 = new JLabel();
        welcomeLabel2.setIcon(logo);
        welcomeLabel2.setBounds(115, 36, 264, 76);

        // Instantiating welcomeLabel3 as a new JLabel.
        welcomeLabel3 = new JLabel();
        welcomeLabel3.setText("What would you like to do today?");
        welcomeLabel3.setBounds(144, 120, 240, 20);
        welcomeLabel3.setFont(new Font("Engebrechtre", Font.ITALIC, 17));
        welcomeLabel3.setForeground(new Color(253, 252, 202));

        // Instantiating the checkingsButton as a new JButton that will open a new
        // window when the user
        // clicks on it.
        checkingsButton = new JButton("Open checkings account");
        checkingsButton.setBounds(50, 150, 190, 40);
        checkingsButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        checkingsButton.addActionListener(this);
        checkingsButton.addMouseListener(this);

        // Instantiating the savingsButton as a new JButton that will open a new window
        // when the user
        // clicks on it.
        savingsButton = new JButton("Open savings account");
        savingsButton.setBounds(260, 150, 190, 40);
        savingsButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        savingsButton.addActionListener(this);
        savingsButton.addMouseListener(this);

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = checkingsButton.getBackground();

        // Instantiating the panel variable as an instance of the BackgroundImage class.
        // The instance has the path of an image file in the parameters.
        panel = new BackgroundImage("/Users/andrismac/Documents/SafeNSoundATM/src/SafeNSound Background.png");
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
        this.setTitle("SafeNSound Bank - Welcome");
        this.add(welcomeLabel);
        this.add(welcomeLabel2);
        this.add(welcomeLabel3);
        this.add(checkingsButton);
        this.add(savingsButton);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkingsButton) {
            new CheckingsDeposit();
        }

        else if (e.getSource() == savingsButton) {
            new SavingsDeposit();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(new Color(247, 225, 148));
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(new Color(247, 225, 148));
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }
    }

    // Overriding the mousePressed method. Buttons will change colors when being
    // pressed.
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(new Color(247, 225, 148));
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(new Color(247, 225, 148));
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseReleased method. Buttons will change back to their
    // original
    // colors when mouse stops pressing them.
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(originalColor);
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(originalColor);
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseEntered method. Buttons will change colors when mouse
    // hovers over them.
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(new Color(253, 252, 208));
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(new Color(253, 252, 208));
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }
    }

    // Overriding the mouseExited method. Buttons will change back to their original
    // colors when mouse stops hovering over them.
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == checkingsButton) {
            checkingsButton.setBackground(originalColor);
            checkingsButton.setOpaque(true);
            checkingsButton.setBorderPainted(false);
        }

        else if (e.getSource() == savingsButton) {
            savingsButton.setBackground(originalColor);
            savingsButton.setOpaque(true);
            savingsButton.setBorderPainted(false);
        }
    }

}
