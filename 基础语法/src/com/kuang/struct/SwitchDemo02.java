package com.kuang.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name="秦疆";

        switch(name){
            case "秦疆":
                System.out.println("秦疆");
                break;
            case "狂神":
                System.out.println("狂神");
                break;
            default:
                System.out.println("未知输入");
        }
    }
}
