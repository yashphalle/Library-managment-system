import javax.swing.*;

import java.awt.*;

public class addbookgui {
    public static void main(String[] args) {
        JFrame f2 = new JFrame();
        JLabel lm2;
        JLabel name;
        JLabel author;
        JLabel price;
        JLabel copies;
       



        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);

        lm2 = new JLabel("Add new Book ");
        
        name=new JLabel("Book Name :");
        JTextField tname=new JTextField();
        author=new JLabel("Author Name :");
        JTextField tauthor=new JTextField();
        price=new JLabel("Price :");
        JTextField tprice=new JTextField();
        copies=new JLabel("No. Of Copies :");
        JTextField tcopies=new JTextField();
        JButton submit=new JButton("Add New Book");




        lm2.setBounds(250, 0, 400, 100);
        name.setBounds(250, 150, 100, 50);
        author.setBounds(250, 200, 100, 50);
        price.setBounds(250, 250, 100, 50);
        copies.setBounds(250, 300, 100, 50);
        submit.setBounds(300, 400, 150, 50);

        tname.setBounds(350, 155, 200, 30);
        tauthor.setBounds(350, 205, 200, 30);
        tprice.setBounds(350, 255, 200, 30);
        tcopies.setBounds(350, 305, 200, 30);

        
        
        Font font = new Font("serif", Font.BOLD, 30);
        lm2.setFont(font);


        






        f2.add(tname);
        f2.add(tauthor);
        f2.add(tprice);
        f2.add(tcopies);
        f2.add(submit);
        f2.add(lm2);
        f2.add(name);
        f2.add(author);
        f2.add(price);
        f2.add(copies);
        f2.add(label);
        
        
        
        

        f2.pack();

        f2.setSize(650, 500);
        f2.setLayout(null);
        f2.setVisible(true);
    }
    

}
