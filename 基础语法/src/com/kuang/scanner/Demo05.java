package com.kuang.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //和
        double sum =0;
        //输入的数字
        int m=0;

        while(scan.hasNextDouble()){
            double x = scan.nextDouble();
            m++;
            sum=sum+x;
            System.out.println("你输入了"+m+"个数字，当前结果sum="+sum);
        }
        System.out.println(m+"个数的和sum:"+sum);
        System.out.println(m+"个数的平均数avg是："+sum/m);
        scan.close();
    }
}
