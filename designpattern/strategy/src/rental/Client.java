package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public class Client {

    public static void main(String[] args){
        Member member1 = new Member("Alex");
        Member member2 = new Member("James");

        Book book = new Book("book1", "2001", 2000);
        Book book2 = new Book("book2", "2011", 5000);
        Book book3 = new Book("book3", "2017", 6000);
        Rental rental1 = new Rental(new Ordinary(),
                1, book3, member1);
        Rental rental2 = new Rental(new BookDiscount(),
                1, book, member1);
        Rental rental3 = new Rental(new MemberDiscount(), 3,  book2, member1);
        System.out.println(rental1.getPrice());
        System.out.println(rental2.getPrice());
        System.out.println(rental3.getPrice());

    }
}
