package aula01;

import javax.swing.*;

public class Aula01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greetings");
//        JPanel panel = new JPanel();
        JLabel greeting = new JLabel("Hello World");
        JLabel subtitle = new JLabel("Welcome to my application!");

        frame.setLayout(null);
//        panel.setLayout(null);

        frame.add(greeting);
        frame.add(subtitle);
//        frame.add(panel);

        greeting.setBounds(20, 20,200, 20);
        subtitle.setBounds(20, 50, 200, 20);

        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
