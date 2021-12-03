import java.util.*;
import java.util.ArrayList;
import java.util.List;

// class bookException extends Exception{

// }
class Book {
    int IdNo;
    String bookName;
    String auther;
    int copies;
    protected Object bookId;

    Book(int IdNo, String bookName, String auther,int copies) {
        this.IdNo = IdNo;
        this.bookName = bookName;
        this.auther = auther;
        this.copies=copies;

    }

    public Object bookId() {
        return null;
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

        Book b1 = new Book(1, "Harry Potter", "J.K. Rowling",5);
        Book b2 = new Book(2, "The alchemist", " Paulo Coelho",5);
        Book b3 = new Book(3, "Wings Of Fire", "Dr.A.P.J.kalam",5);
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(b1);
        al.add(b2);
        al.add(b3);

        // ArrayList<Issue_Book> al2 = new ArrayList<Issue_Book>();
        ArrayList<issueBook> st1 = new ArrayList<issueBook>();
        ArrayList<issueBook> st2 = new ArrayList<issueBook>();
        ArrayList<issueBook> st3 = new ArrayList<issueBook>();



        Boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running) {
            System.out.println("\nEnter 1 for add book in library" + "\nEnter 2 for issue book from library" + "\nEnter 3 for list all books in library" + "\nEnter 4 for return book to library");
            int answer = sc.nextInt();
            switch (answer) {
                case 1: {
                    System.out.println("Enter the ID: ");
                    int IdNo = sc.nextInt();
                    System.out.println("Enter the name of book: ");
                    String bookName = sc.next();
                    System.out.println("Enter the auther of book: ");
                    String auther = sc.next();

                    System.out.println("Enter the No. of copies: ");
                    int copies = sc.nextInt();
                    Book b = new Book(IdNo, bookName, auther,copies);
                    al.add(b);
                    
                    break;
                }
                case 2:{
                    for (Book b: al) {
                        System.out.println(b.IdNo+" "+b.bookName +" " + b.auther+""+b.copies);
                    }
                    System.out.println("__________________Issue book________________________ ");
                    System.out.println("Enter the Student ID: ");
                    int tempStId = sc.nextInt();
                    System.out.println("Enter the ID: ");
                    int tempBookId = sc.nextInt();
                    System.out.println("Enter the name of book: ");
                    String bookName = sc.next();
                    issueBook i1= new issueBook(tempStId, tempBookId, bookName);

                    // String stId = "st"+tempStId;
                   
                    // System.out.println(stId);
                    // // (String(stId)).add(i1);
                    
                    switch (tempStId) {
                        case 1:
                        {
                            st1.add(i1);
                            
                            // for (issueBook i1: st1) {
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


                    switch(tempBookId){
                    case(1):{
                        b1.copies=b1.copies-1;
                        System.out.println("copies left = "+b1.copies);
                        break;
                    }
                    case(2):{
                        b2.copies=b2.copies-1;
                        System.out.println("copies left = "+b1.copies);
                        break;
                    }
                    case(3):{
                        b3.copies=b3.copies-1;
                        System.out.println("copies left = "+b1.copies);
                        break;
                    }
                    // case(4):{
                    //     try {
                    //     b.copies=b.copies-1;
                    //     System.out.println("copies left ="+b.copies);
                    //     } catch (Exception e) {
                    //         //TODO: handle exception

                    //     }
                        
                    // }
                }
            

                    




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
                    for (Book b:al ) {
                        System.out.println(b.IdNo+" "+b.bookName +" " + b.auther+""+b.copies);
                    }
                }
                case 4:{
                    System.out.println("__________________Issue book________________________ ");
                    System.out.println("Enter the Student ID: ");
                    int tempStId = sc.nextInt();
                    System.out.println("Enter the ID: ");
                    int tempBookId = sc.nextInt();
                    System.out.println("Enter the name of book: ");
                    String bookName = sc.next();





                    switch(tempBookId){
                        case(1):{
                            b1.copies=b1.copies+1;
                            System.out.println("copies left = "+b1.copies);
                            break;
                        }
                        case(2):{
                            b2.copies=b2.copies+1;
                            System.out.println("copies left = "+b1.copies);
                            break;
                        }
                        case(3):{
                            b3.copies=b3.copies+1;
                            System.out.println("copies left = "+b1.copies);
                            break;
                        }


                }
            }
        }
    }
}
}
