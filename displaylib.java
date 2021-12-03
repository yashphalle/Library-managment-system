import javax.swing.*;
import java.awt.*;
public class displaylib {
    public static void main(String[] args) {
        JFrame f5 = new JFrame();
        JLabel lm;
        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);

        lm = new JLabel("Library Register");
        for (int index = 0; index < 4; index++) {
            {al.get(index).IdNo(), al.get(index).bookName(),al.get(index).author(),al.get(index).copies()}
            
        } 
        String data[][]={ };    
        String column[]={"Book ID","Book Name","Price","Copies"};         
        JTable jt=new JTable(data,column);    
        jt.setBounds(250,100,300,200);          
        JScrollPane sp=new JScrollPane(jt); 






        lm.setBounds(150, 0, 450, 100);










        Font font = new Font("serif", Font.BOLD, 30);
        lm.setFont(font);
        f5.add(lm);
        f5.add(sp);       
        f5.add(jt);
        f5.add(label);

        f5.pack();
       
        f5.setSize(650, 500);
        f5.setLayout(null);
        f5.setVisible(true);

    }}




        

