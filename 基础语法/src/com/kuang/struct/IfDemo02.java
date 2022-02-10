package com.kuang.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
//        考试分数大于60输出及格，否则就是不及格
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入分数：");
        int score =scanner.nextInt();
        if(score >60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
        scanner.close();
    }
}
