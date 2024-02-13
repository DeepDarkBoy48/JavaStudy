package com.hspedu.smallchange.smallchangeX;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2. 完成零钱通明细
        //老韩思路, (1) 可以把收益入账和消费，保存到数组 (2) 可以使用对象 (3) 简单的话可以使用String拼接
        String details = "-----------------零钱通明细------------------";

        //3收益入账，定义新的变量
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        //4. 消费
        //定义新变量，保存消费的原因
        String note = "";

        do {
            System.out.println("\n================Menu===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("Choose 1~4");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2 收益入账金额:");
                    money = scanner.nextDouble();
                    if (money<=0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    Date date1 = new Date();
                    //拼接收益入账信息到details
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date1) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();
                    if(money<=0||money>balance){
                        System.out.println("消费金额应该在0-"+balance);
                        break;
                    }
                    System.out.print("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    //拼接消费信息到 details
                    date = new Date(); //获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true) {
                        System.out.println("确定退出吗？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
    }
}
