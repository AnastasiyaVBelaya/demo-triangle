package by.itacademy.anastasiyabelaya;

public class Triangles {
    public static String defineTriangle(int a, int b, int c) {
        if (!isValidTriangle(a, b, c)) {
            return "Треугольник a=..., b=..., c=... не является треугольником";
        } else if (isEquilateralTriangle(a, b, c)) {
            return "Треугольник a=..., b=..., c=... - равносторонний треугольник";
        } else if (isIsoscelesTriangle(a, b, c)) {
            return "Треугольник a=..., b=..., c=... - равнобедренный треугольник";
        } else if (isRightTriangle(a, b, c)) {
            return "Треугольник a=..., b=..., c=... - прямогульный треугольник";
        } else return "Треугольник a=..., b=..., c=... - обычный треугольник";
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return side1 > 0
                && side2 > 0
                && side3 > 0
                && side1 + side2 > side3
                && side1 + side3 > side2
                && side2 + side3 > side1;
    }

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
