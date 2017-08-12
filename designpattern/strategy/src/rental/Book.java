package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public class Book {
    private String title;
    private String publishedYear;
    private int price;

    public Book(String title, String publishedYear, int price){
        this.title = title;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
