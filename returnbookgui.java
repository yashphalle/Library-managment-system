
import javax.swing.*;
import java.awt.*;
public class returnbookgui {
    public static void main(String[] args) {
        JFrame f4 = new JFrame();
        JLabel lm3;
        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);

        lm3 = new JLabel("Return Book");


        JLabel stId=new JLabel("Student Id :");
        JTextField tstId=new JTextField();
        JLabel bookId =new JLabel("Book Id :");
        JTextField tbookId=new JTextField();
        JLabel date =new JLabel("Date Of Return :");
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

        f4.add(lm3);
        f4.add(stId);
        f4.add(tstId);        
        f4.add(bookId);
        f4.add(tbookId);
        f4.add(date);
        f4.add(tdate);
        f4.add(submit);



        f4.add(label);



       

        f4.pack();
        f4.setSize(650, 500);
        f4.setLayout(null);
        f4.setVisible(true);


      

    }
    
}