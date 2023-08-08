import javax.swing.*;

public class Operations {
    private static double num1 = 0;
    private static char operator;

    public static void decimalNumber(JTextField textField) {
        if(textField.getText().contains("."))
            return;
        textField.setText(textField.getText().concat("."));
    }

    public static void addingSign(JTextField textField) {
        num1 = Double.parseDouble(textField.getText());
        operator = '+';
        textField.setText("");
    }

    public static void subtractingSign(JTextField textField) {
        num1 = Double.parseDouble(textField.getText());
        operator = '-';
        textField.setText("");
    }

    public static void multiplyingSign(JTextField textField) {
        num1 = Double.parseDouble(textField.getText());
        operator = '*';
        textField.setText("");
    }

    public static void divisionSign(JTextField textField) {
        num1 = Double.parseDouble(textField.getText());
        operator = '/';
        textField.setText("");
    }

    public static void equalSign(JTextField textField) {
        if(num1 == 0)
            return;
        double num2 = Double.parseDouble(textField.getText());
        double result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        textField.setText(String.valueOf(result));
        num1 = 0;
    }

    public static void clearButton(JTextField textField) {
        textField.setText("");
        num1 = 0;
    }

    public static void deleteButton(JTextField textField) {
        String str = textField.getText();
        textField.setText("");
        for(int i = 0; i < str.length() - 1; ++i) {
            textField.setText(textField.getText() + str.charAt(i));
        }
    }

    public static void negativeButton(JTextField textField) {
        if(textField.getText().isEmpty()) {
            textField.setText("-");
            return;
        }
        if(textField.getText().contains("-") && textField.getText().length() < 2) {
            textField.setText("");
            return;
        }

        double temp = Double.parseDouble(textField.getText());
        temp *= -1;
        textField.setText(String.valueOf(temp));
    }
}
