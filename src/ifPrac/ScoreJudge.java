package ifPrac;

import java.util.Scanner;

public class ScoreJudge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入英语成绩：");
        Double engScore=sc.nextDouble();
        if (engScore>=90&&engScore<=100){
            System.out.println("该成绩属于优秀。");
        }else if (engScore>=80&&engScore<90){
            System.out.println("该成绩属于好。");
        }else if (engScore>=70&&engScore<80){
            System.out.println("该成绩属于良。");
        }else if (engScore>=60&&engScore<70){
            System.out.println("该成绩属于及格。");
        }else if(engScore>=0&&engScore<60){
            System.out.println("该成绩属于不及格。");
        }else{
            System.out.println("该成绩有误。");
        }
    }
}
