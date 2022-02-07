## Java流程控制

### 1、用户交互Scanner

```java
package com.kuang.scanner;

import java.util.Scanner;
public class Demo3 {
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

```



### 2、顺序结构

```java
package com.kuang.struct;

public class ShunXuDemo {
    public static void main(String[] args) {
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        System.out.println("hello5");
    }
}

```



### 3、选择结构

- if 单选择
- if ....else ...
- if ....else if...
- ![image-20220207220717255](Java%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6.assets/image-20220207220717255.png)

### 4、循环结构

### 5、break & continue

### 6、练习