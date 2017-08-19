import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 16..
 */
public class Client {

    public static void  main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer<Customer>("kim", 150));
        customers.add(new Customer<Customer>("park", 250));

        customers.add(new Customer<Customer>("choi", 350));
        customers.add(new Customer<Customer>("mun", 450));
        customers.add(new Customer<Customer>("lee", 550));

        ReportGenerator simple = new SimpleReportGenerator();
        System.out.println(simple.generator(customers));
        ReportGenerator complex = new ComplexReportGenerator();
        System.out.println(complex.generator(customers));
    }
}
