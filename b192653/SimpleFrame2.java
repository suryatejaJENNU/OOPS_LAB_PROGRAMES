import javax.swing.JFrame;

public class SimpleFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("A frame");

        // Set the default close operation to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 120);

        // Set the location of the frame
        frame.setLocation(10, 50);

        // Make the frame visible
        frame.setVisible(true);
    }
}

