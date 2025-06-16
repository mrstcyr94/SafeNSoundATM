//Class belonging to the Images package.
package Images;

//Imports are added.
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/*The BackgroundImage class is created as a JPanel by extending the JPanel class.
This will create a new JPanel with an image as the background.*/

public class BackgroundImage extends JPanel {

    // Instance variable of type BufferedImage is stated.
    public BufferedImage backgroundImage;

    // Constructor is created that passes a String in its parameters.
    // The String variable will be the path file of an image.
    public BackgroundImage(String image) {

        /*
         * The backgroundImage variable is assigned with the ImageIO class.
         * The ImageIO class calls the read method to access the image path file
         * as a string. The program will throw an IOException if there are any errors.
         */
        try {
            backgroundImage = ImageIO.read(new File(image));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Overriding the paintComponent method. This method uses the backgroundImage
     * variable to draw the actual image by accessing its width and height.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
