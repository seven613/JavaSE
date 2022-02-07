package com.kuang.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int i=0;
        float f=0.0f;
        System.out.println("请输入整数：");

        if(sc.hasNextInt()){
            i=sc.nextInt();
            System.out.println("输入的整数是："+i);
        } else {
            System.out.println("输入的不是整数");
        }

        if(sc.hasNextFloat()){
            f=sc.nextFloat();
            System.out.println("输入的小数是："+f);
        } else {
            System.out.println("输入的不是小数");
        }
        sc.close();
    }
}
