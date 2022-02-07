package com.kuang.scanner;

import java.util.Scanner;
public class Demo03 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接受键盘数据
        Scanner scanner =new Scanner(System.in);

        System.out.println("请输入内容：");//输入 hello world
        //判断用户有没有输入字符串
        //if(scanner.hasNext()){ // 不用判断了
            //使用next方式接受
        //String str=scanner.next(); //按空格截断，输入字符中含有空格时，空格后面的字符不显示
        String str=scanner.nextLine(); //按回车截断，输入字符中含有空格时，空格后面的字符不显示
        System.out.println("你输入的内容是："+str);
        //}
        //凡是属于IO流的类必须关闭
        scanner.close();
    }
    }

