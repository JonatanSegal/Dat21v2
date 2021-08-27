public class Book {
    private int ISBN;
    private String title;
    private int releaseYear;


    public Book(){}

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public int getISBN() {
        return ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString(){
        return "ISBN: " + getISBN() + "\nTitle: " + getTitle() + "\nRelease year: " + getReleaseYear();
    }

}
