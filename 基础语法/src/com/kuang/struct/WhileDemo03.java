package com.kuang.struct;

public class WhileDemo03 {
    public static void main(String[] args) {

        //输入1~100的和
        int i =0;
        int sum = 0;
        while(i<=100){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
