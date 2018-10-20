package com.company;


public abstract class Rect extends Shape
{
    private int height;
    private int length;

    public Rect(int height, int length)
    {
        super("Rect");
        this.height = height;
        this.length = length;
    }

    public double getHeight()
    {
        return (height*length);
    }

    public double getPerimeter()
    {
        return((height*2)+(length*2));
    }
}

//Math.cos(60) * (side/2)