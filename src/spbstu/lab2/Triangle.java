package spbstu.lab2;

import spbstu.lab1.Existing;

public class Triangle implements Figure {

    private double lengthA;
    private double lengthB;
    private double lengthC;


    // constructor
    public Triangle(double lengthA, double lengthB, double lengthC) {
        if (Existing.isExistingTriangle(lengthA, lengthB, lengthC) != 0) {
            throw new IllegalArgumentException("Треугольника с такими длиннами сторон не существует");
        }
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }


    // getters and setters
    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        if (Existing.isExistingTriangle(lengthA, this.lengthB, this.lengthC) != 0) {
            throw new IllegalArgumentException("Треугольника с такими длиннами сторон не существует");
        }
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        if (Existing.isExistingTriangle(this.lengthA, lengthB, this.lengthC) != 0) {
            throw new IllegalArgumentException("Треугольника с такими длиннами сторон не существует");
        }
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        if (Existing.isExistingTriangle(this.lengthA, this.lengthB, lengthC) != 0) {
            throw new IllegalArgumentException("Треугольника с такими длиннами сторон не существует");
        }
        this.lengthC = lengthC;
    }


    // implementation of the Figure interface
    @Override
    public double computeArea() {
        double halfP = (this.lengthA + this.lengthB + this.lengthC) / 2;
        return Math.sqrt(halfP * (halfP - lengthA) * (halfP - lengthB) * (halfP - lengthC));
    }

    @Override
    public double computePerimeter() {
        return this.lengthA + this.lengthB + this.lengthC;
    }
}
