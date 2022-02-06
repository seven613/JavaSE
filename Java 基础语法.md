## Java 基础语法

### 1、注释、标识符、关键字

> 注释

- 书写注释是一个非常好的习惯

- 注释分三种：

  - 单行注释  //

  - 多行注释  /*  */

  - 文档注释 /** */

    ![image-20220206094635094](Java%20%E5%9F%BA%E7%A1%80%E8%AF%AD%E6%B3%95.assets/image-20220206094635094.png)

> 标识符

- 关键字

| abstract   | assert       | boolean   | break      | byte   |
| ---------- | ------------ | --------- | ---------- | ------ |
| case       | catch        | char      | class      | const  |
| continue   | default      | do        | double     | else   |
| enum       | extends      | final     | finally    | float  |
| for        | goto         | if        | implements | import |
| instanceof | int          | interface | long       | native |
| new        | package      | private   | protected  | public |
| return     | strictfp     | short     | static     | super  |
| switch     | synchronized | this      | throw      | throws |
| transient  | try          | void      | volatile   | while  |

- 标识符注意点
  - **所有的标识符都应该以字母(A-Z或a-z)，美元符号$、或下划线(_)开始**、
  - **首字符之后可以是字母(A-Z或者a-z)，美元符号$、下划线(_)或数字的任何字符组合**
  - ==**不能使用关键字作为变量名或方法名**==
  - **标识符是==大小写敏感==的**
  - 合法标识符举例：age、$salary、_value、__1_value
  - 非法标识符举例：123abc、-salary、#abc
  - **==可以使用中文命名，但是一般不建议使用==**

### 2、数据类型

> 强类型语言

- 要求变量的使用要严格符合规定，所有变量都必须先定义后才能使用

> 弱类型语言

> Java的数据类型分为两大类

- 基本类型 primitive type
- 引用类型 reference type

### 3、类型转换

### 4、变量、常量

### 5、运算符

- Java运算符：
  - 算术运算符 +、-、*、/、%、++、--
  - 赋值运算符 =
  - 关系运算符 ＞、＜、≥、≤、==、!=、instanceof
  - 逻辑运算符 &&、||、!
  - 位运算符 &、|、^、~、>>、<<、>>>
  - 条件运算符 ? :
  - 扩展赋值运算符 +=、-=、*=、/=

### 6、包机制、JavaDoc