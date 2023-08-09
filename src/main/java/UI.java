import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UI {
    static JFrame frame;
    static JTextField textField;
    static JButton[] numberButtons = new JButton[10];
    static JButton[] functionButtons = new JButton[9];
    static JButton addButton, subButton, mulButton, divButton,
            decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;
    Font myFont = new Font(Font.SERIF, Font.PLAIN, 30);

    UI(ActionListener actionListener) {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        textField = new JTextField();
        textField.setBounds(60, 25, 280, 50);
        textField.setFont(myFont);
        textField.setEditable(false);
        textField.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        textField.setCaretColor(Color.LIGHT_GRAY);

        addButton = new JButton();
        addButton.setContentAreaFilled(false);
        addButton.setBorderPainted(false);
        addButton.setIcon(new ImageIcon("src/main/images/icons8-plus-math-40.png"));

        subButton = new JButton();
        subButton.setContentAreaFilled(false);
        subButton.setBorderPainted(false);
        subButton.setIcon(new ImageIcon("src/main/images/icons8-subtract-40.png"));

        mulButton = new JButton();
        mulButton.setContentAreaFilled(false);
        mulButton.setBorderPainted(false);
        mulButton.setIcon(new ImageIcon("src/main/images/icons8-multiply-40.png"));

        divButton = new JButton();
        divButton.setContentAreaFilled(false);
        divButton.setBorderPainted(false);
        divButton.setIcon(new ImageIcon("src/main/images/icons8-divide-40.png"));

        decButton = new JButton();
        decButton.setContentAreaFilled(false);
        decButton.setBorderPainted(false);
        decButton.setIcon(new ImageIcon("src/main/images/icons8-dot-10.png"));

        equButton = new JButton();
        equButton.setContentAreaFilled(false);
        equButton.setBorderPainted(false);
        equButton.setIcon(new ImageIcon("src/main/images/icons8-equal-sign-40.png"));

        delButton = new JButton();
        delButton.setContentAreaFilled(false);
        delButton.setBorderPainted(false);
        delButton.setIcon(new ImageIcon("src/main/images/icons8-clear-40.png"));

        clrButton = new JButton();
        clrButton.setContentAreaFilled(false);
        clrButton.setBorderPainted(false);
        clrButton.setIcon(new ImageIcon("src/main/images/icons8-delete-40.png"));

        negButton = new JButton();
        negButton.setContentAreaFilled(false);
        negButton.setBorderPainted(false);
        negButton.setIcon(new ImageIcon("src/main/images/icons8-plus-slash-minus-40.png"));


        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for(int i = 0; i < 9; ++i) {
            functionButtons[i].addActionListener(actionListener);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for(int i = 0; i < 10; ++i) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(actionListener);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setContentAreaFilled(false);
            numberButtons[i].setBorderPainted(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50,100,300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        textField.setCaretColor(panel.getBackground());

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(negButton);
        frame.add(textField);
        frame.setVisible(true);
    }
}
