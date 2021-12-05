
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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

    } public int getcopies(){
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

public class table {
    public static void main(String[] args) {
        Book book1 = new Book("1", "Harry Potter", "J.K. Rowling", "550", 5);
        Book book2 = new Book("2", "The alchemist", " Paulo Coelho", "1000", 5);
        Book book3 = new Book("3", "Wings Of Fire", "Dr.A.P.J.kalam", "700", 5);
        
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(book1);
        
   
        
    
    JFrame f5 = new JFrame();
                JLabel lm;
                ImageIcon icon = new ImageIcon("left.png");
                JLabel label = new JLabel(icon);
                lm = new JLabel("List Of Available Books");       
                // JTextField tc1= new JTextField();
                // JTextField tc2= new JTextField();
                // JTextField tc3= new JTextField();
                // JTextField tc4= new JTextField();
                // Book b = new Book(bookId, bookName, author, price, copies);
                // for (int i = 0; i < args.length; i++) {
                //     tc.setText(book.get[i].getbookName());
               

                // // }
                // tc1.setText(book1.getbookId()+"  |  "+book1.getbookName()+" |  "+book1.getauthor()+"  | "+book1.getprice()+"  |  "+book1.getcopies());
                // tc2.setText(book2.getbookId()+"  |  "+book2.getbookName()+" |  "+book2.getauthor()+"  | "+book2.getprice()+"  |  "+book2.getcopies());
                // tc3.setText(book3.getbookId()+"  |  "+book3.getbookName()+" |  "+book3.getauthor()+"  | "+book3.getprice()+"  |  "+book3.getcopies());
                // // tc1.setText(book1.getbookId()+"  |  "+book1.getbookName()+" |  "+book1.getauthor()+"  | "+book1.getprice());
                    
                // int li=al.size();               
                // System.out.println(li);
                // if (li>3) {
                //     for(Book b:al){
                //         tc4.setText(b.getbookId()+"  |  "+b.getbookName()+" |  "+b.getauthor()+"  | "+b.getprice()+"  |  "+b.getcopies());
                //     }
                    

                // }


                String header[]=new String[]{"Book Id","Book Name","Author","Price","copies"}
                DefaultTableModel bt;
                int row,col;

                bt= new DefaultTableModel(header,0);
                // Jtable2.setModel(bt);
                bt.setRowCount(0);
                for (int i = 0; i < al.size(); i++) {
                    Object[] obj ={ al.get(i).getbookId(),al.get(i).getbookName(),al.get(i).getauthor(),al.get(i).getprice(),al.get(i).getprice()};
                    bt.addRow(obj);
                    
                }

                
                
                    

                


                





                

                // tc1.setBounds(200,200,350,50);
                // tc2.setBounds(200,250,350,50);
                // tc3.setBounds(200,300,350,50);
                // tc4.setBounds(200,350,350,50);
                Font font = new Font("serif", Font.BOLD, 30);
                lm.setBounds(250,50,400,100);
                // f5.add(tc1);
                // f5.add(tc2);
                // f5.add(tc3);
                // if (li>3) {
                // f5.add(tc4);}
                f5.add(bt);
                lm.setFont(font);
                f5.add(lm);              
                f5.add(label);
                f5.pack();  

                f5.setSize(650, 500);
                f5.setLayout(null);
                f5.setVisible(true);

                  
    
}}
