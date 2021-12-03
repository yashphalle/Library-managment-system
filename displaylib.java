import javax.swing.*;
import java.awt.*;
public class displaylib {
    public static void main(String[] args) {
        JFrame f5 = new JFrame();
        JLabel lm;
        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);

        lm = new JLabel("Library Register");
        String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(250,100,200,300);          
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




        

