
import javax.swing.*;
import java.awt.*;
public class issuegui {
    public static void main(String[] args) {
        JFrame f3 = new JFrame();
        JLabel lm3;
        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);

        lm3 = new JLabel("Issue Book");


        JLabel stId=new JLabel("Student Id :");
        JTextField tstId=new JTextField();
        JLabel bookId =new JLabel("Book Id :");
        JTextField tbookId=new JTextField();
        JLabel date =new JLabel("Date to return :");
        JTextField tdate=new JTextField();
        JButton submit=new JButton("Issue Book");
        





        lm3.setBounds(250, 0, 400, 100);
        stId.setBounds(250, 150, 100, 50);
        bookId.setBounds(250, 200, 100, 50);
        date.setBounds(250, 250, 100, 50);
 
        tstId.setBounds(350, 155, 200, 30);
        tbookId.setBounds(350, 205, 200, 30);
        tdate.setBounds(350, 255, 200, 30);
        
        submit.setBounds(300, 350, 150, 50);






        Font font = new Font("serif", Font.BOLD, 30);
        lm3.setFont(font);

        f3.add(lm3);
        f3.add(stId);
        f3.add(tstId);        
        f3.add(bookId);
        f3.add(tbookId);
        f3.add(date);
        f3.add(tdate);
        f3.add(submit);



        f3.add(label);



       

        f3.pack();
        f3.setSize(650, 500);
        f3.setLayout(null);
        f3.setVisible(true);


      

    }
    
}
