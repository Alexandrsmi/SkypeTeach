package skype.teach.task.tictactoe.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnGameButtonClickListener implements ActionListener {
    private boolean isX = true;


    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source.getText().isEmpty()) {
            if (isX) {
                source.setText("X");
            } else {
                source.setText("O");
            }
            isX = !isX;
        }
    }
    public static void win (String[] buttons){
        if (buttons[3]=="X"){
            System.out.println("WIN");
        }

    }

    {

    }

}

