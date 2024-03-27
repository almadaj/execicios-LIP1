package aula03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Aula01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        JFrame frame = new JFrame("Grid Layout");
        JLabel labelI = new JLabel("Idade: ");
        JTextField txtI = new JTextField(20);
        JButton btn = new JButton("Enviar");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel res = new JLabel("Resultado");


        p1.setLayout(new GridLayout(1,2));
        p1.add(labelI);
        p1.add(txtI);

        p2.setLayout(new GridLayout(2,1));
        p2.add(btn);
        p2.add(res);

        frame.add(p1);
        frame.add(p2);
        p1.setSize(400, 100);
        p2.setSize(400, 100);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                res.setText(txtI.getText() + ", sua idade é " + (c.get(Calendar.YEAR) - Integer.parseInt(txtI.getText())));
            }
        });

        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
