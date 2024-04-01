package aula04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Básico");
        JLabel labelN = new JLabel("Nome: ");
        JTextField txtN = new JTextField(20);
        JLabel labelI = new JLabel("Sobrenome: ");
        JTextField txtI = new JTextField(20);
        JLabel labelC = new JLabel("CPF: ");
        JTextField txtC = new JTextField(20);
        JButton btn = new JButton("Enviar Dados");
        JLabel res = new JLabel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        frame.setLayout(new FlowLayout());
        p1.setLayout(new BorderLayout());

        p1.add(labelN, BorderLayout.WEST);
        p1.add(txtN, BorderLayout.CENTER);

        p2.add(labelI, BorderLayout.WEST);
        p2.add(txtI, BorderLayout.CENTER);

        p3.add(labelC, BorderLayout.WEST);
        p3.add(txtC, BorderLayout.CENTER);

        p4.add(btn, BorderLayout.CENTER);
        p4.add(res, BorderLayout.SOUTH);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(txtN.getText().isEmpty()){
                   String nome = JOptionPane.showInputDialog(null,"Campo NOME em branco", "Erro ao Cadastrar",1);
                   txtN.setText(nome);
                }
                if(txtI.getText().isEmpty()){
                    String sobrenome = JOptionPane.showInputDialog(null,"Campo SOBRENOME em branco", "Erro ao Cadastrar",1);
                    txtI.setText(sobrenome);
                }
                if (txtC.getText().isEmpty()){
                    String cpf = JOptionPane.showInputDialog(null,"Campo CPF em branco", "Erro ao Cadastrar",1);
                    txtC.setText(cpf);
                }else {
                    JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!", "Cadastro Realizado",1);
                    txtC.setText("");
                    txtI.setText("");
                    txtN.setText("");
                }
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
