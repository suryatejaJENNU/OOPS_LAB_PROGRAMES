import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleFrame {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Simple Swing Frame");

        // Create a JLabel with text
        JLabel label = new JLabel("Hello, World!");

        // Add the label to the frame
        frame.add(label);

        // Set the default close operation to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 100);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}

