package com.der0nidad;

public class Circle extends Figure {
    private double radius;

    Circle (double x, double y, double radius){
        setX(x);
        setY(y);
        this.radius = radius;
    }
    @Override
    public void printFigure() {
        System.out.println("Circle with center at " + getX()
                + ", " + getY() + " and radius " + radius);
    }

    @Override
    public void moveFigure(double xToAdd, double yToAdd) {
        setX(getX() + xToAdd);
        setY(getY() + yToAdd);
    }

    @Override
    public void scaleFigure(double coeff) {
        radius *= coeff;
    }

    @Override
    public double calcSquare() {
        return Math.PI * radius * radius;
    }

    public boolean isPointInside(double x2, double y2){
        boolean res = false;
        if(euclidianDistance(x2, y2, 0) < radius)
            res = true;
        return res;

    }
    public double getRadius(){
        return radius;
    }

    public boolean isCircleInside(Circle anotherCircle){
        boolean res = false;
        if(euclidianDistance(anotherCircle.getX(), anotherCircle.getY(),
                anotherCircle.getRadius() ) < radius)
            res = true;
        return res;
    }
    private double euclidianDistance(double x2, double y2, double rad){
        double xdist = Math.abs(x2 + rad - getX());
        double ydist = Math.abs(y2 + rad - getY());
        double dist = Math.sqrt(xdist * xdist + ydist * ydist);
        return dist;
    }

}
