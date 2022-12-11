package randomPrac;

import java.util.Random;
import java.util.Scanner;

public class RandomPractice {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber=random.nextInt(200)+1;
        Scanner sc=new Scanner(System.in);
        int guess=0;
        while (true){
            System.out.println("请输入您想猜的数字：");
            guess=sc.nextInt();
            if (guess==randomNumber){
                System.out.println("恭喜您，猜对了！这个数字就是"+randomNumber);
                break;
            }else if (guess>randomNumber){
                System.out.println("猜大了，在猜猜。");
            }else if (guess<randomNumber){
                System.out.println("猜小了，再猜猜。");
            }
        }
    }
}
