//Class belonging to the Savings package.
package Savings;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

//Importing classes from different packages of the program.
import Images.BackgroundImage;

/*The SavingsWithdrawlBalance class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class SavingsWithdrawlBalance extends JFrame implements ActionListener, MouseListener {

    // Instance variables are stated.
    JLabel yourSavingsWithdrawl;
    JLabel withdrawlSavings;
    JButton next;
    BackgroundImage panel;
    Color originalColor;
    DecimalFormat format = new DecimalFormat("#.##");

    // The constructor is created where instance variables are assigned values.
    public SavingsWithdrawlBalance() {

        // Instantiating the yourSavingsWithdrawl variable as a new JLabel.
        yourSavingsWithdrawl = new JLabel();
        yourSavingsWithdrawl.setText("Your total balance in your savings account is:");
        yourSavingsWithdrawl.setFont(new Font("Engebrechtre", Font.BOLD, 23));
        yourSavingsWithdrawl.setBounds(45, 30, 400, 20);
        yourSavingsWithdrawl.setForeground(new Color(253, 252, 202));

        // Instantiating the withdrawlSavings variable as a new JLabel. The text is
        // set to the return value of the savingsWithdrawlBalance method from the
        // SavingsWithdrawl class.
        withdrawlSavings = new JLabel("$" + format.format(Savings.SavingsWithdrawl.savingsWithdrawlBalance()),
                SwingConstants.CENTER);
        withdrawlSavings.setFont(new Font("Engebrechtre", Font.BOLD, 40));
        withdrawlSavings.setBounds(170, 70, 151, 41);
        withdrawlSavings.setForeground(new Color(253, 252, 202));

        // Instantiating the nextButton as a new JButton that will open a new window
        // when the user clicks on it.
        next = new JButton("Next");
        next.addActionListener(this);
        next.addMouseListener(this);
        next.setBounds(200, 125, 90, 40);
        next.setFont(new Font("Helvetica", Font.PLAIN, 15));

        // Instantiating originalColor with the button's background color as its color
        // value.
        originalColor = next.getBackground();

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
        this.add(yourSavingsWithdrawl);
        this.add(withdrawlSavings, BorderLayout.CENTER);
        this.add(next);
        this.add(panel);
        this.setVisible(true);
    }

    // Overriding the actionPerfomerd method, where a new instance of
    // a class is created when a button is pressed. User is directed
    // to a new window after clicking on one of the buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            new MoreSavingsBalanceChoices();
        }
    }

    // Overriding the mouseClicked method. Buttons will change colors when being
    // clicked.
    @Override
    public void mouseClicked(MouseEvent e) {
        next.setBackground(new Color(247, 225, 148));
        next.setOpaque(true);
        next.setBorderPainted(false);
    }

    // Overriding the mousePressed method. Buttons will change colors when being
    // pressed.
    @Override
    public void mousePressed(MouseEvent e) {
        next.setBackground(new Color(247, 225, 148));
        next.setOpaque(true);
        next.setBorderPainted(false);
    }

    // Overriding the mouseReleased method. Buttons will change back to their
    // original colors when mouse stops pressing them.
    @Override
    public void mouseReleased(MouseEvent e) {
        next.setBackground(originalColor);
        next.setOpaque(true);
        next.setBorderPainted(false);
    }

    // Overriding the mouseEntered method. Buttons will change colors when mouse
    // hovers over them.
    @Override
    public void mouseEntered(MouseEvent e) {
        next.setBackground(new Color(253, 252, 208));
        next.setOpaque(true);
        next.setBorderPainted(false);
    }

    // Overriding the mouseExited method. Buttons will change back to their original
    // colors when mouse stops hovering over them.
    @Override
    public void mouseExited(MouseEvent e) {
        next.setBackground(originalColor);
        next.setOpaque(true);
        next.setBorderPainted(false);

    }

}
