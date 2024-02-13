package com.hspedu.abstract_.X;

public class BB {
    public void job2() {
        //得到开始的时间
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 1; i <= 200000; i++) {
            num *= i;
        }
        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("AA 执行时间 " + (end - start));
    }
}
