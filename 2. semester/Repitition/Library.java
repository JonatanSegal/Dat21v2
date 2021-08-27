import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public Library(){
        addThreeBooks();
    }

    public ArrayList<Book> addBookToLibraryList(Book b){
        bookList.add(b);
        return bookList;
    }

    public boolean isBookInLibrary(Book b){
        Iterator<Book> libraryIterator = bookList.iterator();

        while(libraryIterator.hasNext()){
            Book currentBog = libraryIterator.next();
            if(currentBog.getISBN() == b.getISBN()){
                System.out.println("Book found in library");
                return true;
            }
        }
        System.out.println("Book not found");
        return false;
    }

    private ArrayList<Book> addThreeBooks(){
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.setISBN(1234);
        b2.setISBN(4321);
        b3.setISBN(1369);

        addBookToLibraryList(b1);
        addBookToLibraryList(b2);
        addBookToLibraryList(b3);
        return bookList;
    }

}
