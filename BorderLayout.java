import javax.swing.*;
import java.awt.*;

public class BorderLayout {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("BorderLayout");

        // Set the layout manager of the frame to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create some buttons to put into each region
        JButton buttonNorth = new JButton("North");
        JButton buttonSouth = new JButton("South");
        JButton buttonEast = new JButton("East");
        JButton buttonWest = new JButton("West");
        JButton buttonCenter = new JButton("Center");

        // Add the buttons to the frame, placing each one in the appropriate region
        frame.add(buttonNorth, BorderLayout.NORTH);  // North
        frame.add(buttonSouth, BorderLayout.SOUTH);  // South
        frame.add(buttonEast, BorderLayout.EAST);    // East
        frame.add(buttonWest, BorderLayout.WEST);    // West
        frame.add(buttonCenter, BorderLayout.CENTER); // Center

        // Set the frame size
        frame.setSize(400, 300);

        // Set the frame to exit the program when closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}