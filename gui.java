import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;
import D:\projects\Library java\Library-managment-system\addbookgui.java;

public class gui {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel lm;
        ImageIcon icon = new ImageIcon("left.png");
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
        // label.setSize(200, 400);
        // label.setLocation(100, 150);

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
        showFrame();

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg){
                f.setVisible(false);
                JFrame f2=new JFrame();
                f2.showFrame();
            }


        });

      

    }

    private static void showFrame() {
    }

    private static void showWindow() {
    }
}

