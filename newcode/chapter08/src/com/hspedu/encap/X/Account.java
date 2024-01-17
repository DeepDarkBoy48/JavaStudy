package com.hspedu.encap.X;

/**
 * 创建程序,在其中定义两个类：Account和AccountTest类体会Java的封装性。
 * Account类要求具有属性：姓名（长度为2位3位或4位）、余额(必须>20)、
 * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
 * 通过setXxx的方法给Account 的属性赋值。
 * 在AccountTest中测试
 */
public class Account {
    private String name;
    private double balance;
    private String pwd;

    //构造器
    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度不对，应该是2-4位");
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不对，应该大于20");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码不对，应该是6位");
            this.pwd = "000000";
        }
    }

    //显示信息
    public void showInfo() {
        System.out.println("账户名=" + name + "\t余额=" + balance + "\t密码=" + pwd);
    }
}
