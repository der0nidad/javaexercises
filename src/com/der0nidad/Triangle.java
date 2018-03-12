package com.der0nidad;

public class Triangle extends  Figure {
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    Triangle (double x, double y, double x2, double y2, double x3, double y3){
        setX(x);
        setY(y);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    @Override
    public void printFigure() {
        System.out.println("Triangle with coordinates: (" + getX() +"," +
            getY() + ") (" + x2 + "," + y2 + ") (" + x3 + "," + y3+")");
    }

    @Override
    public void moveFigure(double xToAdd, double yToAdd) {
        setX(getX() + xToAdd);
        setY(getY() + yToAdd);
        x2 += xToAdd;
        y2 += yToAdd;
        x3 += xToAdd;
        y3 += yToAdd;
    }

    @Override
    public void scaleFigure(double coeff) {
        if (coeff > 0 || coeff < 0){
            x2 =(x2 - getX()) * coeff + getX();
            y2 =(y2 -getY()) * coeff + getY();
            x3 =(x3 - getX()) * coeff + getX();
            y3 =(y3 -getY()) * coeff + getY();
        }
        else {
            x2 = 0;
            y2 = 0;
            x3 = 0;
            y3 = 0;
        }
    }

    @Override
    public double calcSquare() {
        double square;
//        S=0,5*[(x1-x3)(y2-y3)-(x2-x3)(y1-y3)].
        square = Math.abs(0.5 * ((getX() - x3) * (y2 - y3) - (x2 - x3)*(getY() - y3)));
        return square;
    }
}
