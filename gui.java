import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;

public class gui {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel lm;
        ImageIcon icon = new ImageIcon("logo.png");
        JLabel label = new JLabel(icon);

        lm = new JLabel("Library Managment System");
        JButton b1 = new JButton("Add New Book");
        JButton b2 = new JButton("Issue Book");
        JButton b3 = new JButton("Display Library");
        JButton b4 = new JButton("Return Book");

        lm.setBounds(150, 0, 450, 100);

        b1.setBounds(300, 150, 150, 80);// x axis, y axis, width, height
        b2.setBounds(470, 150, 150, 80);
        b3.setBounds(300, 300, 150, 80);
        b4.setBounds(470, 300, 150, 80);

        // label.setIcon(new ImageIcon(new
        // ImageIcon("logo.png").getImage().getScaledInstance(200, 200,
        // Image.SCALE_DEFAULT)));
        label.setSize(200, 400);
        label.setLocation(100, 150);

        Font font = new Font("serif", Font.BOLD, 30);
        lm.setFont(font);
        f.add(lm);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(label);
        // f.add(label);
        f.pack();
        // f.getContentPane().add(new gui("logo.png"))

        f.setSize(650, 500);
        f.setLayout(null);
        f.setVisible(true);


      

    }
}

