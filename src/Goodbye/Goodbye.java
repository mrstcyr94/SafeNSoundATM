//Class belonging to the Goodbye package.
package Goodbye;

//Imports are added.
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

//Importing classes from different packages of the program.
import Images.BackgroundImage;

/*The Goodbye class is created as a JFrame by extending the JFrame class.
The class also implements the ActionListner and MouseListender interfaces
in order for each button to use the interfaces.*/

public class Goodbye extends JFrame {

    // Instance variables are stated.
    JLabel goodbyeLabel;
    JLabel goodbyeLabel2;
    BackgroundImage panel;

    // The constructor is created where instance variables are assigned values.
    public Goodbye() {

        // Instantiating the goodbyeLabel variable as a new JLabel.
        goodbyeLabel = new JLabel();
        goodbyeLabel.setText("Thank you for choosing SafeNSound Bank!");
        goodbyeLabel.setFont(new Font("Engebrechtre", Font.BOLD, 28));
        goodbyeLabel.setBounds(40, 20, 427, 29);
        goodbyeLabel.setForeground(new Color(253, 252, 202));

        // Instantiating the goodbyeLabel2 variable as a new JLabel.
        goodbyeLabel2 = new JLabel();
        goodbyeLabel2.setText("See you next time!");
        goodbyeLabel2.setFont(new Font("Engebrechtre", Font.BOLD, 28));
        goodbyeLabel2.setBounds(169, 60, 190, 29);
        goodbyeLabel2.setForeground(new Color(253, 252, 202));

        // Instantiating the panel variable as an instance of the BackgroundImage class.
        // The instance has the path of an image file in the parameters.
        panel = new BackgroundImage("/Users/andrismac/Documents/SafeNSoundATM/src/SafeNSound Background (3).png");
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
        this.setTitle("SafeNSound Bank - Goodbye!");
        this.add(goodbyeLabel);
        this.add(goodbyeLabel2);
        this.add(panel);
        this.setVisible(true);
    }

}
