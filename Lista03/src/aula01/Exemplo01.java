package aula01;

import javax.swing.*;
import java.awt.*;

public class Exemplo01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sample BorderLayout");
        JPanel panel = new JPanel();
        JButton bNorth = new JButton("North");
        JButton bSouth = new JButton("South");
        JButton bWest = new JButton("West");
        JButton bEast = new JButton("East");
        JButton bCenter = new JButton("Center");

        panel.setLayout(new BorderLayout());
        panel.add(bNorth, BorderLayout.NORTH);
        panel.add(bSouth, BorderLayout.SOUTH);
        panel.add(bWest, BorderLayout.WEST);
        panel.add(bEast, BorderLayout.EAST);
        panel.add(bCenter, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
