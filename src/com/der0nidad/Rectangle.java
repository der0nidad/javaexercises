package com.der0nidad;

public class Rectangle extends Figure {
    private double x2;
    private double y2;

    Rectangle (double x, double y, double x2, double y2){
        if (x2 > x){
            setX(x);
            this.x2 = x2;
        }else {
            setX(x2);
            this.x2 = x;
        }
        if(y2 > y){
            this.y2 = y2;
            setY(y);
        }else {
            setY(y2);
            this.y2 = y;
        }
    }
    @Override
    public void moveFigure(double xToAdd, double yToAdd) {
        setY(getY() + yToAdd);
        setX(getX() + xToAdd);
        x2 += xToAdd;
        y2 += yToAdd;
    }
/*If coeff == 0, figure becomes a point at (super.x,super.y)*/
    @Override
    public void scaleFigure(double coeff) {
        if (coeff > 0 || coeff < 0){
            x2 =(x2 - getX()) * coeff + getX();
            y2 =(y2 -getY()) * coeff + getY();
        }
        else {
            x2 = 0;
            y2 = 0;
        }
    }

    @Override
    public void printFigure() {
        System.out.println("Rectangle with coordinates: " + "("+getX()+ "," + getY()+") " +
                "("+getX()+ "," + y2+") " + "("+x2+ "," + y2+") " +
                "("+x2+ "," + getY()+")"  );

    }

    @Override
    public double calcSquare() {
        return Math.abs((x2 - getX()) * (y2 - getY()));;
    }
}
