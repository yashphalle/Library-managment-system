//import section

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.util.ArrayList;



    class Book {
        int bookId;
        String bookName;
        String author;
        int price;
        int copies;

        Book(int bookId, String bookName, String author, int price, int copies) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.author = author;
            this.price = price;
            this.copies = copies;

        }

    }
    class issueBook {
        int tempStId;
        int tempBookId;
        String tempdate;

        issueBook(int tempStId, int tempBookId, String tempdate) {
            this.tempStId = tempStId;
            this.tempBookId = tempBookId;
            this.tempdate = tempdate;

        }
    }
    public class gui {

    public static void main(String[] args) {
        
        Book book1 = new Book(1, "Harry Potter", "J.K. Rowling", 550, 5);
        Book book2 = new Book(2, "The alchemist", " Paulo Coelho", 1000, 5);
        Book book3 = new Book(3, "Wings Of Fire", "Dr.A.P.J.kalam", 700, 5);
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
                int bookId = parseInt(tbookid.getText());

                name = new JLabel("Book Name :");
                JTextField tname = new JTextField();
                String bookName = tname.getText();

                aname = new JLabel("Author Name :");
                JTextField taname = new JTextField();
                String author = taname.getText();

                mrp = new JLabel("Price :");
                JTextField tprice = new JTextField();
                int price =parseInt(tprice.getText());

                stock = new JLabel("No. Of Copies :");
                JTextField tcopies = new JTextField();
                int copies = parseInt(tcopies.getText());

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
                        Book b = new Book(bookId, bookName, author, price, copies);
                        al.add(b);
                        System.out.println("added succesfully");

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

            public void actionPerformed(ActionEvent e) {
                
                    JFrame f3 = new JFrame();
                    JLabel lm3;
                    ImageIcon icon = new ImageIcon("left.png");
                    JLabel label = new JLabel(icon);
            
                    lm3 = new JLabel("Issue Book");
                   
            
                    JLabel stId=new JLabel("Student Id :");
                    JTextField tstId=new JTextField();
                    int tempStId = parseInt(tstId.getText());

                    JLabel bookId =new JLabel("Book Id :");
                    JTextField tbookId=new JTextField();
                    int tempBookId = parseInt(tbookId.getText());

                    JLabel date =new JLabel("Date to return :");
                    JTextField tdate=new JTextField();
                    String tempdate = tdate.getText();


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
                            issueBook i1= new issueBook(tempStId, tempBookId, tempdate);

                    // String stId = "st"+tempStId;
                   
                    // System.out.println(stId);
                    // // (String(stId)).add(i1);
                    
                    switch (tempStId) {
                        case 1:
                        {
                            st1.add(i1);
                            // for (issueBook i1: st2) {
                            //     System.out.println(i1.tempStId+" "+i1.tempBookId +" " + i1.bookName);
                            // }

                            break;
                        }

                        case 2:
                        {
                            st2.add(i1);
                                
                            
                            // for (issueBook i1: st2) {
                            //     System.out.println(i1.tempStId+" "+i1.tempBookId +" " + i1.bookName);
                            // }
                            break;
                        }
                            
                        case 3:{
                            st3.add(i1);
                            // for (issueBook i1: st) {
                            //     System.out.println(i1.tempStId+" "+i1.tempBookId +" " + i1.bookName);
                            // }      
                            break;
                        }
                               
                    
                        default:
                            break;
                    }


                //     switch(tempBookId){
                //     case(1):{
                //         b1.copies=b1.copies-1;
                //         System.out.println("copies left = "+b1.copies);
                //         break;
                //     }
                //     case(2):{
                //         b2.copies=b2.copies-1;
                //         System.out.println("copies left = "+b1.copies);
                //         break;
                //     }
                //     case(3):{
                //         b3.copies=b3.copies-1;
                //         System.out.println("copies left = "+b1.copies);
                //         break;
                //     }
            
            
                  
            
                // }
                System.out.println("Issued Succesfully");

            }
            });
        }

            private int parseInt(String text) {
                return 0;
            }
                
        });

        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                

        JFrame f5 = new JFrame();
        JLabel lm;
        ImageIcon icon = new ImageIcon("left.png");
        JLabel label = new JLabel(icon);

         lm = new JLabel("Library Register");
        // for (Book b:al) {
        //     AbstractButton jt;
        //     jt.setModel(new DefaultTableModel(
        //     String data[][]= {b.bookId, b.bookName,b.price,b.copies}
       

        //     String column[]={"Book ID","Book Name","Price","Copies"};
        //     JTable jt=new JTable(data,column);
        //     ));
            
        
        
            
                
            
        // Window jt;
        // jt.setBounds(250,100,300,200);          
        // JScrollPane sp=new JScrollPane(jt); 

        // bookId, bookName, author, price, copies


        for (Book b: al) {
            System.out.println(b.bookId+" | "+b.bookName +" | " + b.author+" | "+b.price+" | "+b.copies);
        }

        JTextArea r= new JTextArea(50,10);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
        




        r.setText(for (Book b: al) {
            System.out.println(b.bookId+" | "+b.bookName +" | " + b.author+" | "+b.price+" | "+b.copies);
        });




        lm.setBounds(150, 0, 450, 100);










        Font font = new Font("serif", Font.BOLD, 30);
        lm.setFont(font);
        f5.add(lm);
        // f5.add(sp);       
        // f5.add(jt);
        f5.add(label);
        f5.add(r);

        f5.pack();
       
        f5.setSize(650, 500);
        f5.setLayout(null);
        f5.setVisible(true);
    }
    });

    }}