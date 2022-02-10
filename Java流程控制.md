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

- if 单选择结构

  - 语法：

    ```java
    if(布尔表达式){
      //如果布尔表达式为true将执行的语句
    }
    ```

- if 双选择结构

  - 语法

  ```java
  if(布尔表达式){
      //如果布尔表达式的值为true
  } else {
      //如果布尔表达式的值为false
  }
  ```

- if 多选择结构

  - 语法

  ```java
  if(布尔表达式1){
     //如果布尔表达式 1 的值为true 执行代码 
  }else if(布尔表达式2){
      //如果布尔表达式 2的值为true 执行代码
  }else if(布尔表达式3){
      //如果布尔表达式 3的值为true 执行代码
  }else{
      //如果以上布尔表达式都不为ture执行代码
  }
  ```

- 嵌套的if结构

  - 语法

  ```java
  if(布尔表达式 1){
      //如果布尔表达式1 的值为true执行代码
      if(布尔表达式2){
          //如果布尔表达式2 的值为true执行代码
      }
  }
  ```

  

- switch多选择结构

  - switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支
  - switch语句中的变量类型可以是：
    - byte、short、int或char
    - String(从Java7开始)
    - case标签必须为字符串常量或字面量
  - 语法

  ```java
  switch(expression){
      case value :
          //语句
          break;
      case value :
          //语句
          break;
      ...
      default : //可选
         //语句
  }
  ```

### 4、循环结构

- while循环

  - 语法

  ```java
  while(布尔表达式){
      //循环内容
  }
  ```

  - 只要布尔表达式为true,循环就会一直执行下去 。
  - **==大多数情况下，需要一个表达式失效的方式来结束循环==**
  - 少数情况下需要一直循环，如：服务器的请求监听等。
  - 循环条件一直为true会造成无限循环，正常业务编程中尽量避免死循环

- do ... while 循环

  - 语法

  ```java
  do {
      //代码语句
  } while (布尔表达式)
  ```

  - do while 循环至少会执行一次；while 先判断为真后才能判断

- for 循环

  - 语法

  ```java
  for(初始化;布尔表达式;更新){
      //代码语句
  }
  ```

  - 最先执行的初始化步骤，可以只声明一种类型，但 可初始化一个或多个循环控制变量，也可以是空语句。然后，检查布尔表达式的值，如果为true,循环体被执行；如果为false，循环终止，开始执行循环体后面的语句。

  ```java
  # 
  for(;;){
      System.out.println("=")
  }
  ```

  

### 5、break & continue

### 6、练习