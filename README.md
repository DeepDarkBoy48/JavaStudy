# JavaStudy

##  Vscode

###  ![](assets\截屏2023-12-20 22.03.50.png)





## 类与方法

### 1.Math

#### 1.1 random()

在Java中，`Math.random()` 是一个方法，用于生成一个大于等于 0.0 且小于 1.0 的伪随机浮点数。这意味着每次调用 `Math.random()` 时，它会返回一个在 0.0（包括0.0）到 1.0（不包括1.0）之间的双精度浮点数。这个数字是浮点数，可以有很多小数位。

由于 `Math.random()` 只生成 0.0 到 1.0 之间的数字，如果你需要一个不同范围内的随机数，比如一个在 1 到 10 之间的整数，你可以通过适当的数学运算来调整 `Math.random()` 生成的结果。例如，要生成一个 1 到 10 之间的随机整数，可以这样写：

```java
int randomNumber = (int)(Math.random() * 10) + 1;
```

这里 `Math.random()` 生成 0.0 到 1.0 之间的数，然后乘以 10（得到一个 0.0 到 10.0 之间的数），通过强制类型转换 `(int)` 将其转换为整数，得到一个 0 到 9 之间的整数，并通过加 1 转换成 1 到 10 之间的整数。



### 2.util.Scanner

#### 2.1 next()

```java
import java.util.Scanner;
Scanner myScanner  = new Scanner(System.in);
name = myScanner.next();
```

### 3.string

#### 3.1 equals()

```java
String a = new String("test");
boolean isEqual = "test".equals(name)//返回true
```







## 难点

### 4.运算符

#### 4.1 进制转换



#### 4.2 原码反码补码

详情见计算机组成原理

#### 4.2.1 原理

原码、反码和补码是计算机系统中用于表示整数的三种不同方式，特别是在二进制数字系统中。它们的设计主要是为了简化计算机中的加减运算。

1. **原码 (Sign-and-magnitude representation)**: 
   - 原理：在原码表示法中，数字的最高位用于表示符号（0代表正数，1代表负数），其余位表示数值。
   - 例子：如果我们考虑一个 8 位的表示，+3 的原码是 `00000011`，而 -3 的原码是 `10000011`。

2. **反码 (Ones' complement)**:
   - 原理：正数的反码与其原码相同。负数的反码是将其原码中的所有位数取反（0变1，1变0），但符号位除外。
   - 例子：使用上面的例子，+3 的反码仍然是 `00000011`，而 -3 的反码是 `11111100`（-3 的原码 `10000011` 中除了最高位外，其余位取反）。

3. **补码 (Two's complement)**:
   - 原理：正数的补码与其原码相同。负数的补码是其反码加1。
   - 例子：+3 的补码是 `00000011`，而 -3 的补码是 `11111101`（-3 的反码 `11111100` 加1）。

补码是最常用的表示法，因为它简化了加法和减法运算。在补码系统中，可以直接将两个数相加，不需要考虑它们的符号。例如，如果我们加 `00000011` (+3) 和 `11111101` (-3)，结果是 `00000000`，这正是我们期望的结果。此外，补码也解决了原码和反码表示法中的“零”的问题（即存在+0和-0两种表示的问题）。在补码系统中，零只有一种表示。

#### 4.3 位运算符

按位运算是一种在二进制数上进行的操作，包括按位与（AND）、按位或（OR）、按位异或（XOR）和按位取反（NOT）。这些运算符通常用于底层编程，如硬件编程和系统开发。

1. **按位与 (AND)**:
   - 符号：`&`
   - 原理：两个位同时为1时，结果为1；否则为0。
   - 例子：`1101 & 1011 = 1001`。只有第一和第四位两个操作数都是1，所以结果的第一和第四位是1，其余位是0。

2. **按位或 (OR)**:
   - 符号：`|`
   - 原理：两个位中只要有一个为1时，结果为1；两个都为0时，结果为0。
   - 例子：`1101 | 1011 = 1111`。每一位至少有一个操作数是1，所以结果的所有位都是1。

3. **按位异或 (XOR)**:
   - 符号：`^`
   - 原理：两个位不相同时，结果为1；相同时，结果为0。
   - 例子：`1101 ^ 1011 = 0110`。第一和第四位相同，所以结果的这两位是0；第二和第三位不同，所以结果的这两位是1。

4. **按位取反 (NOT)**:
   - 符号：`~`
   - 原理：将每个位的值反转；1变为0，0变为1。
   - 例子：`~1101 = 0010`（假设我们只考虑4位）。每个位都反转了。

这些运算符在多种编程语言中都有实现，常用于位掩码、权限控制、数据压缩和加密等领域。在实际应用中，它们可以用来操作和检查数据的特定位。
