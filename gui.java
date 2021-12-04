//import section

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.util.ArrayList;

class Book {
    String bookId;
    String bookName;
    String author;
    String price;
    int copies;

    Book(String bookId, String bookName, String author, String price, int copies) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.copies = copies;

    }
    
        

    public int getcopies(){
        return copies;
    }
    public String getbookId(){
        return bookId;
    }
    public String getbookName(){
        return bookName;
    }
    public String getauthor(){
        return author;
    }
    public String getprice(){
        return price;
    }



}

class issueBook {
    int tempStId2;
    int tempBookId2;
    String tempdate;

    issueBook(int tempStId2, int tempBookId2, String tempdate) {
        this.tempStId2 = tempStId2;
        this.tempBookId2 = tempBookId2;
        this.tempdate = tempdate;

    }
}

public class gui{

    public static void main(String[] args) {
        
        Book book1 = new Book("1", "Harry Potter", "J.K. Rowling", "550", 5);
        Book book2 = new Book("2", "The alchemist", " Paulo Coelho", "1000", 5);
        Book book3 = new Book("3", "Wings Of Fire", "Dr.A.P.J.kalam", "700", 5);
        
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(book1);
        al.add(book2);
        al.add(book3);

        // ArrayList<Issue_Book> al2 = new ArrayList<Issue_Book>();
        ArrayList<issueBook> st1 = new ArrayList<issueBook>();
        ArrayList<issueBook> st2 = new ArrayList<issueBook>();
        ArrayList<issueBook> st3 = new ArrayList<issueBook>();

        //////////////////////////////////////// gui
        //////////////////////////////////////// section///////////////////////////////////////////////////////////////

        // Main frame
        JFrame f = new JFrame();
        JLabel lm;
        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);
        // main title
        lm = new JLabel("Library Managment System");
        // main buttons
        JButton b1 = new JButton("Add New Book");
        JButton b2 = new JButton("Issue Book");
        JButton b3 = new JButton("Display Library");
        JButton b4 = new JButton("Return Book");

        // main button setting
        lm.setBounds(150, 0, 450, 100);// x axis, y axis, width, height
        b1.setBounds(300, 150, 150, 80);
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

        /////////////////// Add new book frame//////////////////////////////////////
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame f2 = new JFrame();
                JLabel lm2;
                JLabel bookid;
                JLabel name;
                JLabel aname;
                JLabel mrp;
                JLabel stock;

                ImageIcon icon = new ImageIcon("left.png");
                JLabel label = new JLabel(icon);

                lm2 = new JLabel("Add new Book ");

                bookid = new JLabel("Book Id :");
                JTextField tbookid = new JTextField();


                name = new JLabel("Book Name :");
                JTextField tname = new JTextField();
                

                aname = new JLabel("Author Name :");
                JTextField taname = new JTextField();
                
                mrp = new JLabel("Price :");
                JTextField tprice = new JTextField();
                

                stock = new JLabel("No. Of Copies :");
                JTextField tcopies = new JTextField();
                

                JButton submit = new JButton("Add New Book");

                lm2.setBounds(250, 0, 400, 100);
                bookid.setBounds(250, 100, 100, 50);
                name.setBounds(250, 150, 100, 50);
                aname.setBounds(250, 200, 100, 50);
                mrp.setBounds(250, 250, 100, 50);
                stock.setBounds(250, 300, 100, 50);
                submit.setBounds(300, 400, 150, 50);

                tbookid.setBounds(350, 105, 200, 30);
                tname.setBounds(350, 155, 200, 30);
                taname.setBounds(350, 205, 200, 30);
                tprice.setBounds(350, 255, 200, 30);
                tcopies.setBounds(350, 305, 200, 30);

                Font font = new Font("serif", Font.BOLD, 30);
                lm2.setFont(font);

                f2.add(tbookid);
                f2.add(tname);
                f2.add(taname);
                f2.add(tprice);
                f2.add(tcopies);
                f2.add(submit);
                f2.add(bookid);
                f2.add(lm2);
                f2.add(name);
                f2.add(aname);
                f2.add(mrp);
                f2.add(stock);
                f2.add(label);

                submit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String bookId = tbookid.getText();
                        
                        
                        String bookName = tname.getText();
                        
                        String author = taname.getText();
                        String price =tprice.getText();
                        String copies2 = tcopies.getText();
                        int copies= Integer.parseInt(copies2);


                        Book b4 = new Book(bookId, bookName, author, price, copies);
                        al.add(b4);
                        System.out.println("added succesfully");
                        System.out.println(b4.getbookId()+"  "+b4.getbookName()+"  "+b4.getauthor()+"  "+b4.getprice()+"  "+b4.getcopies());

                        //JOptionPane.showMessageDialog(gui.this,"Book added Succesfully!!");

                    }
                });

                f2.pack();

                f2.setSize(650, 500);
                f2.setLayout(null);
                f2.setVisible(true);
            }

            private int parseInt(String text) {
                return 0;
            }

        });


        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                
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

                    submit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            String tempStId = tstId.getText();
                            int tempStId2=Integer.parseInt(tempStId);
                            String tempBookId = tbookId.getText();
                            int tempBookId2=Integer.parseInt(tempBookId);
                            String tempdate = tdate.getText();
                            issueBook i1= new issueBook(tempStId2, tempBookId2, tempdate);
                            System.out.println(tempStId2);
                            System.out.println(tempBookId2);

                                
                    
                    switch (tempStId2) {
                        case 1:
                        {
                            st1.add(i1);
                            for (issueBook i: st2) {
                                System.out.println(i.tempStId2+" "+i.tempBookId2 +" " + i.tempdate);
                            }

                            break;
                        }

                        case 2:
                        {
                            st2.add(i1);
                                
                            
                            for (issueBook i: st2) {
                                System.out.println(i.tempStId2+" "+i.tempBookId2 +" " + i.tempdate);
                            }
                            break;
                        }
                            
                        case 3:{
                            st3.add(i1);
                            for (issueBook i: st2) {
                                System.out.println(i.tempStId2+" "+i.tempBookId2 +" " + i.tempdate);
                            }      
                            break;
                        }
                               
                    
                        default:{
                            break;
                        }
                            
                    }

                    int li=al.size(); 
                    switch(tempBookId2){
                    case(1):{
                        book1.copies=book1.copies-1;
                        System.out.println("copies left = "+book1.copies);
                        break;
                    }
                    case(2):{
                        book2.copies=book2.copies-1;
                        System.out.println("copies left = "+book2.copies);
                        break;
                    }
                    case(3):{
                        book3.copies=book3.copies-1;
                        System.out.println("copies left = "+book3.copies);
                        break;
                    }
                    case(4):{
                        if (li>3){
                            book3.copies=book3.copies-1;
                            System.out.println("copies left = "+book3.copies);
                            

                        }
                        break;
                       
                    }                              
                }
                System.out.println("Issued Succesfully");

            }
            });
        }

            private int parseInt(String text) {
                return 0;
            }
    });
            

            // private int parseInt(String text) {
            //     return 0;
            // }
                
        

    b3.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
                    

                JFrame f5 = new JFrame();
                JLabel lm;
                ImageIcon icon = new ImageIcon("left.png");
                JLabel label = new JLabel(icon);
                lm = new JLabel("List Of Available Books");       
                JTextField tc1= new JTextField();
                JTextField tc2= new JTextField();
                JTextField tc3= new JTextField();
                JTextField tc4= new JTextField();
                // Book b = new Book(bookId, bookName, author, price, copies);
                // for (int i = 0; i < args.length; i++) {
                //     tc.setText(book.get[i].getbookName());
               

                // }
                tc1.setText(book1.getbookId()+"  |  "+book1.getbookName()+" |  "+book1.getauthor()+"  | "+book1.getprice()+"  |  "+book1.getcopies());
                tc2.setText(book2.getbookId()+"  |  "+book2.getbookName()+" |  "+book2.getauthor()+"  | "+book2.getprice()+"  |  "+book2.getcopies());
                tc3.setText(book3.getbookId()+"  |  "+book3.getbookName()+" |  "+book3.getauthor()+"  | "+book3.getprice()+"  |  "+book3.getcopies());
                // tc1.setText(book1.getbookId()+"  |  "+book1.getbookName()+" |  "+book1.getauthor()+"  | "+book1.getprice());
                    
                int li=al.size();               
                System.out.println(li);
                if (li>3) {
                    for(Book b:al){
                        tc4.setText(b.getbookId()+"  |  "+b.getbookName()+" |  "+b.getauthor()+"  | "+b.getprice()+"  |  "+b.getcopies());
                    }
                    
                }

                
                
                    

                


                





                

                tc1.setBounds(200,200,350,50);
                tc2.setBounds(200,250,350,50);
                tc3.setBounds(200,300,350,50);
                tc4.setBounds(200,350,350,50);
                Font font = new Font("serif", Font.BOLD, 30);
                lm.setBounds(250,50,400,100);
                f5.add(tc1);
                f5.add(tc2);
                f5.add(tc3);
                if (li>3) {
                f5.add(tc4);}
                lm.setFont(font);
                f5.add(lm);              
                f5.add(label);
                f5.pack();                    
                f5.setSize(650, 500);
                f5.setLayout(null);
                f5.setVisible(true);

                  
        }

        private int lastIndexOf(ArrayList<Book> al) {
            return 0;
        }  
        });
    
    
b4.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
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
        JButton submit=new JButton("Return Book");
        





        lm3.setBounds(250, 0, 400, 100);
        stId.setBounds(250, 150, 100, 50);
        bookId.setBounds(250, 200, 100, 50);
        date.setBounds(250, 250, 100, 50);
 
        tstId.setBounds(350, 155, 200, 30);
        tbookId.setBounds(350, 205, 200, 30);
        tdate.setBounds(350, 255, 200, 30);
        
        submit.setBounds(300, 350, 150, 50);


        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                            String tempStId = tstId.getText();
                            int tempStId2=Integer.parseInt(tempStId);
                            String tempBookId = tbookId.getText();
                            int tempBookId2=Integer.parseInt(tempBookId);
                            String tempdate = tdate.getText();
                switch(tempBookId2){
                    case(1):{
                        book1.copies=book1.copies+1;
                        System.out.println("copies left = "+book1.copies);
                        break;
                    }
                    case(2):{
                        book2.copies=book2.copies+1;
                        System.out.println("copies left = "+book2.copies);
                        break;
                    }
                    case(3):{
                        book3.copies=book3.copies+1;
                        System.out.println("copies left = "+book3.copies);
                        break;
                    }
                }
            }
            });



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

    });


}
}       