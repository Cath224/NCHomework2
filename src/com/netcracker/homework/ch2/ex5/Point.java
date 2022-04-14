package com.netcracker.homework.ch2.ex5;

public class Point {
    private double x ;
    private double y ;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y)
    {
        this.x+=x;
        this.y+=y;
        return this;
    }

    public Point scale(double scale)
    {
        this.x*=scale;
        this.y*=scale;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
