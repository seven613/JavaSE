package com.kuang.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习：1000以内被5整除的数，每行输出3个

        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if(i%15==0){
                System.out.println();
            }
        }
    }
}
