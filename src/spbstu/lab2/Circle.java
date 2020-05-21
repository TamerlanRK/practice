package spbstu.lab2;

public class Circle implements Figure {

    private double radius;

    // constructor
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус окружности должен быть больше 0");
        }
        this.radius = radius;
    }


    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }


    // implementation of the Figure interface
    @Override
    public double computeArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * this.radius;
    }

}

