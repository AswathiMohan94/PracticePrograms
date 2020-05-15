package com.bridgelabz.liskovSubstitution;

public class Square extends Rectangle {

    public void numOfSide(){
        System.out.println("4 sides");
    }
    public void setBreadth(int breadth)
    {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }

    public void setLength(int length)
    {
        super.setLength(length);
        super.setBreadth(length);
    }
    public static void main(String[] args){
        Square square=new Square();
        square.numOfSide();

    }
}
