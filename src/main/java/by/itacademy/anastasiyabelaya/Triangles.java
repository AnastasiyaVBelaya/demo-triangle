package by.itacademy.anastasiyabelaya;

public class Triangles {
    public static String defineTriangle(int a, int b, int c) {
        if (!isValidTriangle(a, b, c)) {
            return String.format("Треугольник a=%d, b=%d, c=%d не является треугольником", a, b, c);
        } else if (isEquilateralTriangle(a, b, c)) {
            return String.format("Треугольник a=%d, b=%d, c=%d - равносторонний треугольник", a, b, c);
        } else if (isRightTriangle(a, b, c)) {
            return String.format("Треугольник a=%d, b=%d, c=%d - прямоугольный треугольник", a, b, c);
        } else if (isIsoscelesTriangle(a, b, c)) {
            return String.format("Треугольник a=%d, b=%d, c=%d - равнобедренный треугольник", a, b, c);
        } else return String.format("Треугольник a=%d, b=%d, c=%d - обычный треугольник", a, b, c);
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return side1 > 0
                && side2 > 0
                && side3 > 0
                && side1 + side2 > side3
                && side1 + side3 > side2
                && side2 + side3 > side1;
    } //

    private static boolean isEquilateralTriangle(int side1, int side2, int side3) {
        return side1 == side2 && side2 == side3;
    }

    private static boolean isIsoscelesTriangle(int side1, int side2, int side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        int hypotenuse = Math.max(side1, (Math.max(side2, side3)));
        int sumOfSquaresOfLegs = side1 * side1 + side2 * side2 + side3 * side3 - hypotenuse * hypotenuse;
        return hypotenuse * hypotenuse == sumOfSquaresOfLegs;
    }
}
