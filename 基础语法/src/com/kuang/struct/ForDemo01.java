package com.kuang.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a=1;
        while(a<=100){
            System.out.println(a);
            a+=2;
        }
        System.out.println("while 循环结束");
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("for循环结束");
    }
}
