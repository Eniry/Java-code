package Android_2.Android2_1;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int ruaCount;
    private LocalDate arriveTime;

    public String getName() {
        return name;
    }

    public int getRuaCount() {
        return ruaCount;
    }

    public LocalDate getArriveTime() {
        return arriveTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRuaCount(int ruaCount) {
        this.ruaCount = ruaCount;
    }

    public void setArriveTime(LocalDate arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Customer(String name, int ruaCount, LocalDate arriveTime) {
        this.name = name;
        this.ruaCount = ruaCount;
        this.arriveTime = arriveTime;
    }

    @Override
    public String toString() {
        return "Customer:" +
                "姓名是" + name +
                ",想要rua猫" + ruaCount +
                "次, 到店时间为" + arriveTime +
                "。";
    }
}
