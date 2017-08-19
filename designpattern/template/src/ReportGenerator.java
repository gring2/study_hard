import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 16..
 */
public abstract class ReportGenerator<U> {

    public  <T extends Customer> String generator(List<T> customers){
        List<T> selectedCustomer = select(customers);
        String report = getReportHeader(selectedCustomer);
        StringBuilder b = new StringBuilder(report);

        for (int i = 0; i < selectedCustomer.size(); i++){
            T customer = selectedCustomer.get(i);
            b.append(getReportForCustomer(customer));

        }

        b.append(getReportFooter(selectedCustomer));
        return b.toString();
    };

    protected <T extends Customer> List<T> select(List<T> customers){
        List<T> selected = new ArrayList<>();

        for(T c : customers){
            if(customerReportCondition(c)){
                selected.add(c);
            }
        }
        return selected;
    }

    protected abstract <T extends Customer>boolean customerReportCondition(T c);
    protected abstract <T extends Customer> String getReportHeader(List<T> customers);
    protected abstract <T extends Customer> String getReportForCustomer(T customer);
    protected abstract <T extends Customer> String getReportFooter(List<T> customers);

}
