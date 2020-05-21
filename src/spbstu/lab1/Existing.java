package spbstu.lab1;

public class Existing {

    public static final int NEGATIVE_SIDE = -1;
    public static final int EXIST = 0;
    public static final int NOT_APPROPRIATE_LENGTHS = 1;

    public static int isExistingTriangle(double lengthA, double lengthB, double lengthC) {

        if ((lengthA <= 0) || (lengthB <= 0) || (lengthC <= 0)) {
            return NEGATIVE_SIDE;
        } else if ((lengthA < lengthB + lengthC) && (lengthB < lengthA + lengthC) && (lengthC < lengthA + lengthB)) {
            return EXIST;
        }

        return NOT_APPROPRIATE_LENGTHS;
    }
}
