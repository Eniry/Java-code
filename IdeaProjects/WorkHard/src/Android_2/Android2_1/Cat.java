package Android_2.Android2_1;

public abstract class Cat {
    protected String name;
    protected int age;
    protected double price;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "名字：" + name +
                "，年龄：" + age +
                "岁，价格：" + price + "元。";
    }
}
