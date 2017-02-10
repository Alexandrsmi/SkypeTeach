package skype.teach.task.tictactoe.iu;


import skype.teach.task.tictactoe.listeners.OnGameButtonClickListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class GUI {
   private JButton[] buttons = new JButton[9];

    public void start() {
        JFrame mainFrame = new JFrame("TicTacToe");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 100, 300, 300);
        mainFrame.setMinimumSize(new Dimension(300, 300));


        //JMenuBar, JMenu, JMenuItem
        JMenuBar bar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenu settingsMenu = new JMenu("Settings");
        JMenuItem newGameMenuItem = new JMenuItem("New game");
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        JMenuItem viewSettingsMenuItem = new JMenuItem("View settings");
        JMenuItem rulesSettingsMenuItem = new JMenuItem("Rules");

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuHelp = new JMenuItem("About");
//        settingsMenu.setIcon(new ImageIcon("icons/ic_settings.jpg"));

        quitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit(0);
            }
        });
        helpMenu.add(aboutMenuHelp);
        settingsMenu.add(viewSettingsMenuItem);
        settingsMenu.add(rulesSettingsMenuItem);
        helpMenu.add(helpMenu);
        gameMenu.add(newGameMenuItem);
        gameMenu.add(settingsMenu);
        gameMenu.add(quitMenuItem);
        bar.add(gameMenu);
        bar.add(helpMenu);
        mainFrame.setJMenuBar(bar);

        JPanel playgroundPanel = new JPanel();
        playgroundPanel.setLayout(new GridLayout(3, 3));


        OnGameButtonClickListener gameListener = new OnGameButtonClickListener();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            playgroundPanel.add(buttons[i]);
            buttons[i].addActionListener(gameListener);
        }

        JPanel footer = new JPanel();
        JButton newGameBtn = new JButton("New Game");
        JButton quitButton = new JButton("Quit");
        footer.add(newGameBtn);
        footer.add(quitButton);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit(0);
            }
        });

        mainFrame.add(BorderLayout.CENTER, playgroundPanel);
        mainFrame.add(BorderLayout.SOUTH, footer);
        mainFrame.setVisible(true);
    }

    public void setDarkTheme() {

    }

    public void setLightTheme() {

    }
}