package com.niit.java23.bt;

public class Square {
    private float edgeWidth;

    public float getEdgeWidth() {
        return edgeWidth;
    }

    public void setEdgeWidth(float edgeWidth) {
        this.edgeWidth = edgeWidth;
    }

    public  float getArea() {
        return this.edgeWidth * this.edgeWidth;
    }
}
