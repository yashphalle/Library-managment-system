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

    public class extra {
    public void main(String[] args) {
        
        Book book1 = new Book(1, "Harry Potter", "J.K. Rowling", 550, 5);
        Book book2 = new Book(2, "The alchemist", " Paulo Coelho", 1000, 5);
        Book book3 = new Book(3, "Wings Of Fire", "Dr.A.P.J.kalam", 700, 5);
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(book1);
        al.add(book2);
        al.add(book3);


        for (Book b: al) {
            tc.append((b.bookId+" | "+b.bookName +" | " + b.author+" | "+b.price+" | "+b.copies));
           tc.append('\n');
       }
       System.out.println(tc);


    private void displayDetails(Book book)
    {
        itemNumberField.setText(book.getItemNumber());
        itemNameField.setText(book.getItemName());
        priceEachField.setText(String.valueOf(book.getPriceEach()));
        inStockField.setText(String.valueOf(book.getInStock()));
        valueStockField.setText(String.valueOf(book.InStock * book.PriceEach));
    }
    }
}
