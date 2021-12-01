import java.util.*;
import java.util.ArrayList;
import java.util.List;


class Book {
    int IdNo;
    String bookName;
    String auther;

    Book(int IdNo, String bookName, String auther) {
        this.IdNo = IdNo;
        this.bookName = bookName;
        this.auther = auther;

    }

}
class issueBook{
    int tempStId;
    int tempBookId;
    String bookName;


    issueBook(int tempStId,int tempBookId,String bookName){
        this.tempStId = tempStId;
        this.tempBookId=tempBookId;
        this.bookName = bookName; 

    }
}

public class Library2 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Harry Potter", "Raksha");
        Book b2 = new Book(2, "The alchemist", "Rushi");
        Book b3 = new Book(3, "Wings Of Fire", "Dr.A.P.J.kalam");
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(b1);
        al.add(b2);
        al.add(b3);
        // ArrayList<Issue_Book> al2 = new ArrayList<Issue_Book>();
        ArrayList<issueBook> st1 = new ArrayList<issueBook>();
        ArrayList<issueBook> st2 = new ArrayList<issueBook>();
        ArrayList<issueBook> st3 = new ArrayList<issueBook>();
        ArrayList<issueBook> st4 = new ArrayList<issueBook>();
        ArrayList<issueBook> st5 = new ArrayList<issueBook>();


        Boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running) {
            System.out.println("\nEnter 1 for add book in library" + "\nEnter 2 for issue book from library" + "\nEnter 3 for list all books in library" + "\nEnter 4 for return book to library");
            int answer = sc.nextInt();
            switch (answer) {
                case 1: {
                    System.out.println("Enter the name of book: ");
                    String bookName = sc.next();
                    System.out.println("Enter the auther of book: ");
                    String auther = sc.next();
                    System.out.println("Enter the ID: ");
                    int IdNo = sc.nextInt();
                    Book b = new Book(IdNo, bookName, auther);
                    al.add(b);
                    break;
                }
                case 2:{
                    for (Book b: al) {
                        System.out.println(b.IdNo+" "+b.bookName +" " + b.auther);
                    }
                    System.out.println("__________________Issue book________________________ ");
                    System.out.println("Enter the Student ID: ");
                    int tempStId = sc.nextInt();
                    System.out.println("Enter the ID: ");
                    int tempBookId = sc.nextInt();
                    System.out.println("Enter the name of book: ");
                    String bookName = sc.next();
                    issueBook i1= new issueBook(tempStId, tempBookId, bookName);
                    String stId = "st"+tempStId;
                   
                    System.out.println(stId);
                    // (String(stId)).add(i1);
                    stId.add(i1);




                    // if(index>=0){
                    //     System.out.println(al.get(IdNo));
                    //     // System.out.println(index);

                    //     // Issue_Book i= Book()
                    //     // System.out.println(b.IdNo+" "+b.bookName +" " + b.auther);

                    // }
                    // else{
                    //     System.out.println("Invalid Book ID !!");
                    // }


                   
                
                }
                break;
                case 3: {
                    for (Book b: al) {
                        System.out.println(b.IdNo+" "+b.bookName +" " + b.auther);
                    }
                }
            }
        }
    }
}
