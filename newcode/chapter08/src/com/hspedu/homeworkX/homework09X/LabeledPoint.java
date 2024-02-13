package com.hspedu.homeworkX.homework09X;

import com.hspedu.homework.Point;

public class LabeledPoint extends Point {
    private String label;
    public LabeledPoint(double x, double y,String lavel) {
        super(x, y);
        this.label=label;
    }
}
