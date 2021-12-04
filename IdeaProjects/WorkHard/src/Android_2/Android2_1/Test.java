package Android_2.Android2_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyCatCafe myCatCafe = new MyCatCafe();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        OrangeCat orangeCat1 = new OrangeCat("PangPang",2,true);
        OrangeCat orangeCat2 = new OrangeCat("DuDu",3,true);
        cats.add(orangeCat1);
        cats.add(orangeCat2);
        myCatCafe.setBalance(0);
        BlackCat blackCat = new BlackCat("Jack",1);
        try {
            myCatCafe.buyCat(blackCat,cats);
        }catch (Exception e) {
            System.out.println("捕获的异常信息为："+e.getMessage());
        }
        finally {
            Customer customer1 = new Customer("XiaoMing",10, LocalDate.now());
            Customer customer2 = new Customer("XiaoHong",15,LocalDate.now());
            try {
                myCatCafe.serveCustomer(cats,customers,customer1);
                myCatCafe.serveCustomer(cats,customers,customer2);
            }catch(Exception e) {
                System.out.println("捕获的异常信息为："+e.getMessage());
            }
            finally {
                myCatCafe.close(customers);
            }
        }
    }
}
