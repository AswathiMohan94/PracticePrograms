package com.bridgelabz.liskovSubstitution;

public class Square extends Rectangle {

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
}