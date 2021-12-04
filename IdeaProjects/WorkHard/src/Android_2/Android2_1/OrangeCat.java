package Android_2.Android2_1;

public class OrangeCat extends Cat {
    boolean isFat;
    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }

    public OrangeCat(String name, int age, boolean isFat) {
        this.name = name;
        this.age = age;
        this.isFat = isFat;
        this.price = 200;
    }
}
