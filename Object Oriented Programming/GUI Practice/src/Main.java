import javax.swing.*;
import java.awt.*;

class CreateLoginForm extends JFrame {
    JButton b1, b2, b3;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JPanel newPanel;

    CreateLoginForm() {
        // Creating buttons
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");

        // Creating labels
        l1 = new JLabel("Label 1");
        l2 = new JLabel("Label 2");
        l3 = new JLabel("Label 3");

        // Creating text fields
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);

        newPanel = new JPanel(new GridLayout(3, 3)); // change the grid layout to 3 rows and 3 columns
        newPanel.add(l1);
        newPanel.add(t1);
        newPanel.add(b1);
        newPanel.add(l2);
        newPanel.add(t2);
        newPanel.add(b2);
        newPanel.add(l3);
        newPanel.add(t3);
        newPanel.add(b3);

        add(newPanel, BorderLayout.CENTER);
        setTitle("Button Panel");
    }
}

public class Main {
    public static void main(String arg[]) {
        try {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(300,400);
            form.setVisible(true);
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}  
