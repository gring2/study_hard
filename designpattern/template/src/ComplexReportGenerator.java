import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 16..
 */
public class ComplexReportGenerator<U> extends ReportGenerator<U>{

    @Override
    protected boolean customerReportCondition(Customer c) {
        return c.getPoint()>100;
    }

    @Override
    protected <T extends Customer> String getReportHeader(List<T> customers) {
        return String.format("number of Customer: %s", customers.size());
    }

    @Override
    protected <T extends Customer> String getReportForCustomer(T customer) {
        return String.format("%d, %s\n", customer.getPoint(), customer.getName());
    }

    @Override
    protected <T extends Customer> String getReportFooter(List<T> customers) {
        int totalPoint = 0;

        for (Customer c : customers){
            totalPoint += c.getPoint();
        }
        return String.format("%d", totalPoint);
    }
}
