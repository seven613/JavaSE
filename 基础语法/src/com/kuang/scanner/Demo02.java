package com.kuang.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入内容：");

        if(sc.hasNextLine()){
            String str=sc.nextLine();
            System.out.println("你输入的内容是："+str);
        }

        sc.close();
    }
}
