package Android_2.Android2_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void buyCat(Cat cat,ArrayList<Cat> cats)throws InsufficientBalanceException{
        if (balance < cat.getPrice()) {
            throw new InsufficientBalanceException("余额不足！");
        }
        balance -= cat.getPrice();
        cats.add(cat);
        System.out.println("购买成功！");
        System.out.printf("余额：%.2f\n", balance);
    }

    @Override
    public void serveCustomer(ArrayList<Cat> cats, ArrayList<Customer> customers, Customer customer) throws CatNotFoundException{
        if (cats.size() <= 0) throw new CatNotFoundException("店内没有猫咪。");
        Random random = new Random();
        System.out.println("顾客"+customer.getName()+"的rua猫情况：");
        for (int i = 1; i <= customer.getRuaCount(); i++) {
            System.out.println("第" + i + "次rua的猫咪：" + cats.get(random.nextInt(cats.size())).toString());
            balance += 15;
        }
        customers.add(customer);
    }

    @Override
    public void close(ArrayList<Customer> customers) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = now.toLocalDate();
        double profit = 0;
        for (Customer cus : customers) {
            if (cus.getArriveTime().isEqual(today)) {
                System.out.println(cus.toString());
                profit += cus.getRuaCount() * 15;
            }
        }
        System.out.printf("今天的利润：%.2f", profit);
    }
}
