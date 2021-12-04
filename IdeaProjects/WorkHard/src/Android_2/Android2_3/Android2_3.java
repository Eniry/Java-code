package Android_2.Android2_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Android2_3 {
    //用两个线程交替输出两个数组
    public static void multiThread() {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数组：");
        System.out.println("请输入第一个数组的大小：");
        int num1 = scan.nextInt();
        System.out.println("请输入第一个数组：");
        int[] a = new int[num1];

        for (int i = 0; i < num1; i++) a[i] = scan.nextInt();
        System.out.println("请输入第二个数组的大小：");
        int num2 = scan.nextInt();
        System.out.println("请输入第二个数组：");
        int[] b = new int[num2];
        for (int i = 0; i < num2; i++) b[i] = scan.nextInt();
        final Object o = new Object();
        //线程1
        new Thread(() -> {
            synchronized (o) {
                for (int j : a) {
                    System.out.print(j + " ");
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }).start();
        //线程2
        new Thread(() -> {
            synchronized (o) {
                for (int j : b) {
                    System.out.print(j + " ");
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }).start();
    }

    public static boolean regularExpression(String s) {
        //根据正则表达式判断邮箱格式（不含中文的邮箱格式）
        Pattern p = Pattern.compile("^[a-zA-Z0-9-_]+@[a-zA-Z0-9-_]+(\\.[a-zA-Z0-9-_]+)+$");
        Matcher m = p.matcher(s);
        return m.matches();

    }

    public static void main(String[] args) {
        //测试双线程输出
        multiThread();

        //使用正则表达式
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要检测的邮箱：");
        String s = scan.nextLine();
        System.out.println(regularExpression(s));
    }
}
