import javax.swing.*;
import java.awt.*;

public class ComponentsExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("A frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        // Create the first button
        JButton button1 = createButton("I'm a button.", Color.BLUE);

        // Create the second button
        JButton button2 = createButton("Click me!", Color.RED);
        
        
        JButton button3 = createButton("Click me!", Color.WHITE);

        // Add buttons to the frame
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Make the frame visible
        frame.setVisible(true);
    }

    private static JButton createButton(String text, Color backgroundColor) {
        JButton button = new JButton(text);
        button.setBackground(backgroundColor);
        return button;
    }
}

