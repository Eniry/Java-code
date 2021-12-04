package Android_2.Android2_1;

import java.util.ArrayList;

public interface CatCafe {
    void buyCat(Cat cat,ArrayList<Cat> cats);

    void serveCustomer(ArrayList<Cat> cats, ArrayList<Customer> customers, Customer customer);

    void close(ArrayList<Customer> customers);
}
