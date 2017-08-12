package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public class Rental {
    private DiscountStrategy discountStrategy;
    private int quantity;
    private Book book;
    private Member member;
    public Rental(DiscountStrategy discountStrategy, int quantity, Book book, Member member){
        this.discountStrategy = discountStrategy;
        this.quantity = quantity;
        this.book = book;
        this.member = member;
    }

    public int getPrice(){
        return discountStrategy.discount(book.getPrice(), quantity);
    }
}
