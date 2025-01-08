package by.itacademy.anastasiyabelaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianglesTest {
    @Test
    public void testTriangleHasNegativeSide() {
        String result = Triangles.defineTriangle(-1, 5, 5);
        Assertions.assertEquals("Треугольник a=..., b=..., c=... не является треугольником", result);
    }

    @Test
    public void testTriangleHasZeroSide() {
        String result = Triangles.defineTriangle(0, 5, 5);
        Assertions.assertEquals("Треугольник a=..., b=..., c=... не является треугольником", result);
    }

    @Test
    public void testTriangleIsValid() {
        String result = Triangles.defineTriangle(1, 2, 3);
        Assertions.assertEquals("Треугольник a=..., b=..., c=... не является треугольником", result);
    }

    @Test
    public void testTriangleIsEquilateral() {
        String result = Triangles.defineTriangle(5, 5, 5);
        Assertions.assertEquals("Треугольник a=..., b=..., c=... - равносторонний треугольник", result);
    }

    @Test
    public void testTriangleIsIsosceles() {
        String result = Triangles.defineTriangle(5, 5, 8);
        Assertions.assertEquals("Треугольник a=..., b=..., c=... - равнобедренный треугольник", result);
    }

    @Test
    public void testTriangleIsRight() {
        String result = Triangles.defineTriangle(3, 4, 5);
        Assertions.assertEquals("Треугольник a=..., b=..., c=... - прямогульный треугольник", result);
    }
}
