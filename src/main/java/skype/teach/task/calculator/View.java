package skype.teach.task.calculator;

/**
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JLabel display;
    private CalculatorModel model;

    private ActionListener arithmeticBtnListener =
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    model.operate(display.getText(), button.getText());
                }
            };

    public View(CalculatorModel model) {
        this.model = model;
        init();
        model.setView(this);
    }

    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setTitle("Calculator");

        display = new JLabel("");

//        add(display, BorderLayout.NORTH);

        JPanel content = new JPanel(new GridBagLayout());
        JPanel trigonometryPanel = new JPanel(new GridLayout(4,2));
        JPanel numPanel = new JPanel(new GridLayout(4, 3));
        JPanel eastPanel = new JPanel(new GridLayout(2, 1));
        JPanel arithmeticPanel = new JPanel(new GridLayout(2, 2));
        JPanel supportPanel = new JPanel(new GridLayout(2, 2));

        JButton[] numBtns = new JButton[10];
        for (int i = 0; i < numBtns.length; i++) {
            numBtns[i] = new JButton(String.valueOf(i));
            numBtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    display.setText(display.getText() + button.getText());
                }
            });
        }
        for (int i = 7; i < 10; i++) {
            numPanel.add(numBtns[i]);
        }
        for (int i = 4; i < 7; i++) {
            numPanel.add(numBtns[i]);
        }
        for (int i = 1; i < 4; i++) {
            numPanel.add(numBtns[i]);
        }
        numPanel.add(numBtns[0]);

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");
        JButton resultBtn = new JButton("=");

        JButton  repBtn = new JButton(",");
        JButton  characterBtn = new JButton("+/-");

        JButton sinBtn = new JButton("sin");
        JButton tanBtn = new JButton("tan");
        JButton cosBtn = new JButton("cos");
        JButton cubBtn = new JButton("x^2");
        JButton absoluteBtn = new JButton("x^y");
        JButton square_rootBtn = new JButton("sQ");
        JButton ten_absBtn = new JButton("10^x");
        JButton logBtn = new JButton("log");



        addBtn.addActionListener(arithmeticBtnListener);
        resultBtn.addActionListener(arithmeticBtnListener);


        numPanel.add(repBtn);
        numPanel.add(characterBtn);
        arithmeticPanel.add(addBtn);
        arithmeticPanel.add(subBtn);
        arithmeticPanel.add(mulBtn);
        arithmeticPanel.add(divBtn);
        eastPanel.add(arithmeticPanel);
        eastPanel.add(resultBtn);

        trigonometryPanel.add(sinBtn);
        trigonometryPanel.add(tanBtn);
        trigonometryPanel.add(cosBtn);
        trigonometryPanel.add(cubBtn);
        trigonometryPanel.add(absoluteBtn);
        trigonometryPanel.add(square_rootBtn);
        trigonometryPanel.add(ten_absBtn);
        trigonometryPanel.add(logBtn);


        add(BorderLayout.WEST, trigonometryPanel);
        add(BorderLayout.CENTER, numPanel);
        add(BorderLayout.EAST, eastPanel);
        add(BorderLayout.NORTH, display);


    }

    public void setResult(double result) {
        display.setText(String.valueOf(result));
    }


}