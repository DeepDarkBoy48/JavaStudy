package com.hspedu.abstract_.X;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.job2();//AA 执行时间 0
        BB bb = new BB();
        bb.job2();//BB 执行时间 0
    }
}
