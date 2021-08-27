public class Main {
    public static void main(String[] args) {
       /*
        Lists ls = new Lists();

        ls.addToList("Abekat");
        ls.addToList("Peko");

        ls.doesArraylistContain("kat");
        ls.doesArraylistContain("Peko");

        Library schoolLibrary = new Library();
        Book myBook = new Book();
        myBook.setISBN(1234);

        schoolLibrary.isBookInLibrary(myBook);
        */
        Lawn lw = new Lawn();

        System.out.println("Mow the lawn in: "+lw.whenToCut(1,10)+ " days");

        Quarter square = new Quarter();

        square.printSquare(5,"a");

    }
}
