package com.company;

public class ETriangle extends Shape{
    private int s;
    public ETriangle(int s){
        super("ETriangle");
        this.s=s;
    }
    public double getArea(){
        return .5*Math.sqrt(s*s-((s*s)/4))*(s/2);
    }
    public double getPerimeter(){
        return s*3;
    }
}