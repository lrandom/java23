package com.niit.java23.bt;

public class Rectangle {
    private float edgeOne, edgeTwo;

    public float getEdgeOne() {
        return edgeOne;
    }

    public void setEdgeOne(float edgeOne) {
        this.edgeOne = edgeOne;
    }

    public float getEdgeTwo() {
        return edgeTwo;
    }

    public void setEdgeTwo(float edgeTwo) {
        this.edgeTwo = edgeTwo;
    }

    public float getArea() {
        return this.edgeOne * this.edgeTwo;
    }
}
