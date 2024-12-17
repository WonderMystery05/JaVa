import javax.swing.*;
import java.awt.*;

public class Form {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(1000, 800);
        f.setTitle(" JOB PORTAL REGISTRATION FORM");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(147,210,225));
        f.setLayout(new GridLayout(2, 1, 0, 30));
        f.add(panel1());
        f.add(panel2());
        f.setVisible(true);
    }
    public static JPanel panel1() {
        JLabel l, l1, l2, l3, l4;
        JTextField t1, t2;
        l = new JLabel("Name:");
        l.setFont(new Font("Segoe Print", Font.BOLD, 16));
        l.setForeground(new Color(0, 0, 0));
        t1 = new JTextField();
        JPanel header = new JPanel();
        header.setBackground(new Color(147,210,225));
        JLabel h = new JLabel  ("REGISTRATION FORM FOR JOB PORTAL");
        h.setForeground(new Color(0,0,0));
        h.setFont(new Font("Segoe Print", Font.BOLD, 22));
        header.add(h);
        l1 = new JLabel("Email:");
        l1.setFont(new Font("Segoe Print", Font.BOLD, 16));
        l1.setForeground(new Color(0, 0, 0));
        t2 = new JTextField();

        l2 = new JLabel("Gender:");
        l2.setFont(new Font("Segoe Print", Font.BOLD, 16));
        l2.setForeground(new Color(0, 0, 0));
        ButtonGroup bg = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("Female");
        JRadioButton r2 = new JRadioButton("Male");
        JPanel radio = new JPanel();
        radio.setBackground(new Color(147,210,225));
        bg.add(r1);
        bg.add(r2);
        radio.add(r1);
        radio.add(r2);
        l3 = new JLabel("Languages Known");
        l3.setFont(new Font("Segoe Print", Font.BOLD, 16));
        l3.setForeground(new Color(0, 0, 0));
        JCheckBox c1 = new JCheckBox("C");
        JCheckBox c2 = new JCheckBox("C++");
        JCheckBox c3 = new JCheckBox("Python");
        JCheckBox c4 = new JCheckBox("Java");
        JCheckBox c5 = new JCheckBox("HTML");
        JCheckBox c6 = new JCheckBox("Other");
        JPanel check1 = new JPanel();
        check1.setLayout(new GridLayout(2, 3, 3, 3));
        check1.setBackground(new Color(147,210,225));
        check1.add(c1);
        check1.add(c2);
        check1.add(c3);
        check1.add(c4);
        check1.add(c5);
        check1.add(c6);
        l4 = new JLabel("Postion you are looking for:");
        l4.setFont(new Font("Segoe Print", Font.BOLD, 16));
        l4.setForeground(new Color(0, 0, 0));
        String[] options = {"Please select", "Software Engineer", "Data Analyst", "Web Developer", "App Developer", "Other"};
        JComboBox<String> cb = new JComboBox<>(options);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6, 3, 0, 30));
        p.setBackground(new Color(147,210,225));

        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(l);
        p.add(t1);

        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(l1);
        p.add(t2);
        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(l2);
        p.add(radio);
        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(l3);
        p.add(check1);
        p.add(new JLabel(" "));
        p.add(new JLabel(" "));
        p.add(l4);
        p.add(cb);
        p.add(new JLabel(" "));

        return p;
    }
    public static JPanel panel2() {
        JTextField ft1, ft3;
        JLabel fl, fl1, fl2, fl3;
        fl = new JLabel("If Other Kindly Specify ");
        fl.setFont(new Font("Segoe Print", Font.BOLD, 16));
        fl.setForeground(Color.BLACK);
        ft1 = new JTextField();
        fl1 = new JLabel("Preferred working mode:");
        fl1.setFont(new Font("Segoe Print", Font.BOLD, 16));
        fl1.setForeground(new Color(0, 0, 0));
        String[] options = {"Please select", "Full time", "Part time"};
        JComboBox<String> cb = new JComboBox<>(options);
        fl2 = new JLabel("Expected Salary: ");
        fl2.setFont(new Font("Segoe Print", Font.BOLD, 16));
        fl2.setForeground(Color.BLACK);
        ft3 = new JTextField();

        fl3 = new JLabel("About:");
        fl3.setFont(new Font("Segoe Print", Font.BOLD, 16));
        fl3.setForeground(Color.BLACK);
        JTextArea a = new JTextArea(30, 30);
        JScrollPane scrollPane = new JScrollPane(a);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //frame.add(scrollPane, BorderLayout.CENTER);

        JButton b = new JButton("Submit");
        b.setBackground(new Color(242,237,247));

        JPanel fieldsPanel = new JPanel(new GridLayout(5, 3, 0, 25));
        fieldsPanel.setBackground(new Color(222,225,107));
        //fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(fl);
        fieldsPanel.add(ft1);
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(fl1);
        fieldsPanel.add(cb);
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(fl2);
        fieldsPanel.add(ft3);
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(new JLabel(" "));
        fieldsPanel.add(fl3);
        //fieldsPanel.add(a);
        fieldsPanel.add(scrollPane, BorderLayout.CENTER);
        //fieldsPanel.add(new JLabel(" "));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(205,247,183));
        buttonPanel.add(b);
        fieldsPanel.add(new JLabel(" "));
        JPanel fp = new JPanel(new BorderLayout());
        fp.add(fieldsPanel, BorderLayout.CENTER);
        fp.add(buttonPanel, BorderLayout.SOUTH);
        return fp;
    }
}
