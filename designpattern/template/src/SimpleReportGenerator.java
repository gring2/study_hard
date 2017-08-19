import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 16..
 */
public class SimpleReportGenerator <U> extends ReportGenerator<U> {


    @Override
    protected boolean customerReportCondition(Customer c) {
        
        return true;
    }

    @Override
    protected <T extends Customer> String getReportFooter(List <T> customers) {
        
        return String.format("the number of Customer: %d\n", customers.size());
    }

    @Override
    protected <T extends Customer> String getReportForCustomer(T customer) {
        return String.format("%s: %d\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected <T extends Customer> String getReportHeader(List<T> customers) {
        return "";
    }
}
