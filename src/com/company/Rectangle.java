package com.company;

public class Rectangle {
    double width,hieght;

    public Rectangle(double width, double hieght) {
        this.width = width;
        this.hieght = hieght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }
    public double getArea()
    {
        return hieght*width;
    }
    public double getPerimeter()
    {
        return 2*(hieght+width);
    }

}
