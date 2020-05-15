package com.bridgelabz.openClosePrinciple;

public class Compute {
    public static void main(String[] args){
       Rectangle rectangle=new Rectangle();
        Square square=new Square();
        AreaCalculator areaCalculator=new AreaCalculator();
        System.out.println("area of a rectangle : "+areaCalculator.calculateShapeArea(rectangle));
       System.out.println("area of a square : "+ areaCalculator.calculateShapeArea(square));
    }
}
