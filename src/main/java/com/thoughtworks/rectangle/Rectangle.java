package com.thoughtworks.rectangle;

public class Rectangle {
    private final int length;
    private final int breadth;


    public Rectangle(int  l, int  b) {
        this.length = l;
        this.breadth = b;
    }

    public int  area() {
        return length*breadth;
    }

}