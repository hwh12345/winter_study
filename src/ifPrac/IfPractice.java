package ifPrac;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num2=sc.nextInt();
        if (num1>num2){
            System.out.println(num1+"较大");
        }else{
            System.out.println(num2+"较大");
        }
    }
}
