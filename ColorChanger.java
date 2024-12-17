import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangingTextField extends JFrame implements ActionListener {
    private JTextField textField;

    public ColorChangingTextField() {
        setTitle("Color Changer Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(400, 50));
        add(textField, BorderLayout.NORTH);
        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3, 5, 5)); // Grid layout with gaps

        String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange", "Magenta"};
        Color[] colorValues = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.MAGENTA};

        for (int i = 0; i < colors.length; i++) {
            JButton button = new JButton(colors[i]);
            button.setBackground(colorValues[i]);
            button.setForeground(Color.WHITE);
            button.setOpaque(true);
            button.setBorderPainted(false);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setSize(500, 300); // Enhance the frame size
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Red":
                textField.setForeground(Color.RED);
                break;
            case "Green":
                textField.setForeground(Color.GREEN);
                break;
            case "Blue":
                textField.setForeground(Color.BLUE);
                break;
            case "Yellow":
                textField.setForeground(Color.YELLOW);
                break;
            case "Orange":
                textField.setForeground(Color.ORANGE);
                break;
            case "Magenta":
                textField.setForeground(Color.MAGENTA);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorChangingTextField::new);
    }
}
