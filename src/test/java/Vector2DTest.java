import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    Vector2D sampleA;
    Vector2D sampleB;

    @BeforeEach
    void initVector() {
        sampleA = new Vector2D(1, 2);
        sampleB = new Vector2D(5, 8);
    }

    @org.junit.jupiter.api.Test
    void getX() {
        assertEquals(sampleA.getX(), 1);
    }

    @org.junit.jupiter.api.Test
    void getY() {
        assertEquals(sampleA.getY(), 2);
    }

    @org.junit.jupiter.api.Test
    void getMagnitude() {
        assertEquals(sampleA.getMagnitude(), Math.sqrt(5));
    }

    @org.junit.jupiter.api.Test
    void setX() {
        sampleA.setX(10);
        assertEquals(sampleA.getX(), 10);
    }

    @org.junit.jupiter.api.Test
    void setY() {
        sampleA.setY(27);
        assertEquals(sampleA.getY(), 27);
    }

    @org.junit.jupiter.api.Test
    void addWithVector() {
        Vector2D result = sampleA.add(sampleB);
        double expectedX = sampleA.getX() + sampleB.getX();
        double expectedY = sampleA.getY() + sampleB.getY();
        assertEquals(result.getX(), expectedX);
        assertEquals(result.getY(), expectedY);
    }

    @org.junit.jupiter.api.Test
    void addWithValues() {
        Vector2D result = sampleA.add(27, 30);
        double expectedX = sampleA.getX() + 27;
        double expectedY = sampleA.getY() + 30;
        assertEquals(result.getX(), expectedX);
        assertEquals(result.getY(), expectedY);
    }

    @org.junit.jupiter.api.Test
    void subtractWithVector() {
        Vector2D result = sampleA.subtract(sampleB);
        double expectedX = sampleA.getX() - sampleB.getX();
        double expectedY = sampleA.getY() - sampleB.getY();
        assertEquals(result.getX(), expectedX);
        assertEquals(result.getY(), expectedY);
    }

    @org.junit.jupiter.api.Test
    void subtractWithValues() {
        Vector2D result = sampleA.subtract(27, 30);
        double expectedX = sampleA.getX() - 27;
        double expectedY = sampleA.getY() - 30;
        assertEquals(result.getX(), expectedX);
        assertEquals(result.getY(), expectedY);
    }

    @org.junit.jupiter.api.Test
    void dotProductWithVector() {
        double result = sampleA.dotProduct(sampleB);
        assertEquals(result, sampleA.getX() * sampleB.getX() + sampleA.getY() * sampleB.getY());
    }

    @org.junit.jupiter.api.Test
    void dotProductWithValues() {
        double result = sampleA.dotProduct(10, 20);
        assertEquals(result, sampleA.getX() * 10, sampleA.getY() * 20);
    }

    @org.junit.jupiter.api.Test
    void crossProductWithVector() {
        double result = sampleA.crossProduct(sampleB);
        assertEquals(result, sampleB.getX() * sampleA.getY() - sampleB.getY() * sampleA.getX());
    }

    @org.junit.jupiter.api.Test
    void crossProductWithValues() {
        double result = sampleA.crossProduct(10, 20);
        assertEquals(result, 10 * sampleA.getY() - 20 * sampleA.getX());
    }

    @org.junit.jupiter.api.Test
    void scalarMultiply() {
        sampleA.scalarMultiply(10);
        assertEquals(sampleA.getX(), 10);
        assertEquals(sampleA.getY(), 20);
    }

    @org.junit.jupiter.api.Test
    void copyVector() {
        Vector2D result = sampleA.copy();
        assertEquals(result.getX(), sampleA.getX());
        assertEquals(result.getY(), sampleA.getY());
        assertNotSame(result.getX(), sampleA.getX());
        assertNotSame(result.getY(), sampleA.getY());
    }

    @org.junit.jupiter.api.Test
    void toStringVector() {
        assertEquals("(1.0,2.0)", sampleA.toString());
    }
}