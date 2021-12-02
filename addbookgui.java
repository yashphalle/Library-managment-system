import javax.swing.*;
public class addbookgui {
    public static void main(String[] args) {
        JFrame f2 = new JFrame();
        JLabel lm2;
        ImageIcon icon = new ImageIcon("logo.png");
        JLabel label = new JLabel(icon);
        lm2 = new JLabel("Library Managment System");
        lm2.setBounds(150, 0, 450, 100);


        











        f2.add(label);
        f2.add(lm2);
        f2.pack();

        f2.setSize(650, 500);
        f2.setLayout(null);
        f2.setVisible(true);
    }
    

}
