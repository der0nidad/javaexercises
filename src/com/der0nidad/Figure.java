package com.der0nidad;

public abstract class Figure implements Methods{
    private double x;
    private double y;


    public double getX() {
        return x;
    }

    protected void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    protected void setY(double y) {
        this.y = y;
    }


}
