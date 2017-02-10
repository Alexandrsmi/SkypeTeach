package skype.teach.task.calculator;

/**
 *
 */

import java.util.Stack;

public class CalculatorModel {
    private View view;
    private String operation;
    private Stack<Double> operands;
    private String op2;

    public CalculatorModel() {
        operands = new Stack<>();
    }

    public void operate(String operand1, String operation) {
        double op1 = Double.parseDouble(operand1);
        operands.push(op1);

        if (operation.equals("=")) {

            view.setResult(operands.pop() + operands.pop());

        } else {
            this.operation = operation;
            view.setResult(0);
        }
    }

    public void Trig(String operand1) {
        double op2 = Double.parseDouble(operand1);
        operands.push(op2);
        if (operation.equals("x^2")) ;
        {
            view.setResult(operands.pop() * operands.pop());
        }
    }

    public void setView(View view) {
        this.view = view;
    }
}

