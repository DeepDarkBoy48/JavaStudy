package com.hspedu.interface_.interface01;

import com.hspedu.interface_.interface01.UsbInterface;

public class Camera implements UsbInterface {//实现接口,就是把接口方法实现

    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作....");
    }
}
