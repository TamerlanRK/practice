package spbstu.lab1;

import java.util.Scanner;

/**
 * Создать приложение с 3 параметрами. Необходимо определить  могут ли быть
 * введенные параметры сторонами треугольника и вывести сообщение  в случае,
 * если это невозможно  , о причине.
 * Вывести на дисплей введенные числа и полученный результат.Обработайте ошибки
 * при введении параметров.
 */
public class RunLab1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a;
        double lengthA, lengthB, lengthC;

        while (true) {
            try {
                System.out.println("Введите длины трех сторон треугольника (A, B, C):");
                lengthA = Double.parseDouble(scanner.next());
                lengthB = Double.parseDouble(scanner.next());
                lengthC = Double.parseDouble(scanner.next());
                break;
            } catch (Exception x) {
                System.out.println("Вводимые данные имеют неверный формат\n");
            }
        }

        System.out.println("Сторона А = " + lengthA);
        System.out.println("Сторона B = " + lengthB);
        System.out.println("Сторона C = " + lengthC);

        switch (Existing.isExistingTriangle(lengthA, lengthB, lengthC)) {
            case Existing.NEGATIVE_SIDE:
                System.out.println("Треугольник не существует. Сторона треугольника не может быть отрицательной");
                break;
            case Existing.EXIST:
                System.out.println("Треугольник существует");
                break;
            case Existing.NOT_APPROPRIATE_LENGTHS:
                System.out.println("Треугольник не существует. Длинна стороны треугольника не может быть больше " +
                        "суммы длин двух других его сторон");
                break;
        }
    }
}
