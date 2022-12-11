package scannerPrac;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("这两个数的和为：" + add(a, b));
        System.out.println("请输入两个数：");
        double aa = sc.nextDouble();
        double bb = sc.nextDouble();
        System.out.println("The tow numbers are " + isEquals(aa, bb));
        System.out.println("请输入三个数：");
        int aaa = sc.nextInt();
        int bbb = sc.nextInt();
        int ccc = sc.nextInt();
        System.out.println("这三个数中最大的是：" + getMax(aaa, bbb, ccc));
    }

    public static int add(int a, int b) {
        return (a + b);
    }

    public static String isEquals(double a, double b) {
        if (a == b)
            return "equal!";
        else
            return "not equal!";
    }

    public static int getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
