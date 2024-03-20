package aula02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Exemplo02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        JFrame frame = new JFrame("Input Básico");
        JLabel labelN = new JLabel("Nome: ");
        JTextField txtN = new JTextField(20);
        JLabel labelI = new JLabel("Nascimento: ");
        JTextField txtI = new JTextField(20);
        JButton btn = new JButton("Enviar Dados");
        JLabel res = new JLabel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        frame.setLayout(new FlowLayout());
        p1.setLayout(new BorderLayout());

        p1.add(labelN, BorderLayout.WEST);
        p1.add(txtN, BorderLayout.CENTER);

        p2.add(labelI, BorderLayout.WEST);
        p2.add(txtI, BorderLayout.CENTER);

        p3.add(btn, BorderLayout.CENTER);
        p3.add(res, BorderLayout.SOUTH);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                res.setText(txtN.getText() + ", sua idade é " + (c.get(Calendar.YEAR) - Integer.parseInt(txtI.getText())));
            }
        });

        p1.setSize(400, 100);
        p2.setSize(400, 100);
        p3.setSize(400, 200);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
