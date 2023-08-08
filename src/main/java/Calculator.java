import java.awt.event.*;

public class Calculator implements ActionListener {

    Calculator() {
        new UI(this);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; ++i)
            if(e.getSource() == UI.numberButtons[i])
                UI.textField.setText(UI.textField.getText().concat(String.valueOf(i)));

        if(e.getSource() == UI.decButton) Operations.decimalNumber(UI.textField);
        if(e.getSource() == UI.addButton) Operations.addingSign(UI.textField);
        if(e.getSource() == UI.subButton) Operations.subtractingSign(UI.textField);
        if(e.getSource() == UI.mulButton) Operations.multiplyingSign(UI.textField);
        if(e.getSource() == UI.divButton) Operations.divisionSign(UI.textField);
        if(e.getSource() == UI.equButton) Operations.equalSign(UI.textField);
        if(e.getSource() == UI.clrButton) Operations.clearButton(UI.textField);
        if(e.getSource() == UI.delButton) Operations.deleteButton(UI.textField);
        if(e.getSource() == UI.negButton) Operations.negativeButton(UI.textField);
    }
}
