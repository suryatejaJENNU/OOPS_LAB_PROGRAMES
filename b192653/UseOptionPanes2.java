import javax.swing.*;

public class UseOptionPanes2 {
    public static void main(String[] args) {
        // Prompt the user for their age
        String ageText = JOptionPane.showInputDialog(null, "How old are you?");
        int age = Integer.parseInt(ageText);

        // Prompt the user for the amount of money they have
        String moneyText = JOptionPane.showInputDialog(null, "How much money do you have?");
        double money = Double.parseDouble(moneyText);

        // Calculate and display the estimated future amount
        JOptionPane.showMessageDialog(null,
                "If you can double your money each year,\n" +
                "You'll have " + (money * 32) + " dollars at age " + (age + 5) + "!");
    }
}

