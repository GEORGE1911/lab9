package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class labForm extends JFrame {
    private JTextField nameTextField;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JTextArea textArea;

    public labForm() {
        setLayout(new BorderLayout());

        nameTextField = new JTextField();
        checkBox = new JCheckBox("Checkbox : ");
        radioButton = new JRadioButton("Radio Button : ");
        textArea = new JTextArea();

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                boolean isChecked = checkBox.isSelected();
                boolean isRadioButton = radioButton.isSelected();
                String textAreaContent = textArea.getText();

                System.out.println("Name : " + name);
                System.out.println("Checkbox selected : " + isChecked);
                System.out.println("Radio Button selected : " + isRadioButton);
                System.out.println("Text area : " + textAreaContent);

            }
        });

        JPanel topPanel = new JPanel(new GridLayout(4, 2));
        topPanel.add(new JLabel("Name : "));
        topPanel.add(nameTextField);
        topPanel.add(new JLabel("Checkbox : "));
        topPanel.add(checkBox);
        topPanel.add(new JLabel("Radio Button : "));
        topPanel.add(radioButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        setTitle("Random Form");
        setSize(400, 300);
        topPanel.setOpaque(true);
        topPanel.setBackground(Color.GRAY);
        topPanel.setForeground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new labForm();
            }
        });
    }
}