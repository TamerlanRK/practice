package spbstu.lab2;

public class Rectangle implements Figure {

    private double lengthA;
    private double lengthB;


    // constructor
    public Rectangle(double lengthA, double lengthB) {
        if (lengthA <= 0 || lengthB <= 0) {
            throw new IllegalArgumentException("Длинна стороны прямоугольника должна быть больше 0");
        }
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }


    // getters and setters
    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        if (lengthA > 0) {
            this.lengthA = lengthA;
        }
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        if (lengthB > 0) {
            this.lengthB = lengthB;
        }
    }


    // implementation of the Figure interface
    @Override
    public double computeArea() {
        return this.lengthA * this.lengthB;
    }

    @Override
    public double computePerimeter() {
        return 2 * (this.lengthA + this.lengthB);
    }
}

