package BlackBoxTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassify {
    Triangle triangle;

    @BeforeEach
    public void setUp() {

    }

    @Test
    void test() {
        assertEquals("1", "1");
    }

    @Test
    void ECP1() {
        triangle = new Triangle(2, 2, 5);
        assertEquals("isossceles", triangle.classify());
    }

    @Test
    void ECP2() {
        triangle = new Triangle(4, 10, 4);
        assertEquals("isossceles", triangle.classify());
    }

    @Test
    void ECP3() {
        triangle = new Triangle(8, 3, 3);
        assertEquals("isossceles", triangle.classify());
    }

    @Test
    void ECP4() {
        triangle = new Triangle(10, 2, 4);
        assertEquals("scalene", triangle.classify());
    }

    @Test
    void ECP6() {
        triangle = new Triangle(4, 4, 4);
        assertEquals("equilateral", triangle.classify());
    }

    @Test
    void ECP10() {
        triangle = new Triangle(5, 3, 4);
        assertEquals("right-angled", triangle.classify());

    }

    @Test
    void ECP11() {
        triangle = new Triangle(3, 5, 4);
        assertEquals("right-angled", triangle.classify());
    }

    @Test
    void ECP12() {
        triangle = new Triangle(3, 4, 5);
        assertEquals("right-angled", triangle.classify());
    }

    @Test
    void ECP13() {
        triangle = new Triangle(10, 2, 2);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void ECP14() {
        triangle = new Triangle(9, 35, 15);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void ECP15() {
        triangle = new Triangle(1, 1, 3);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA1() {
        triangle = new Triangle(1, 1, 1);
        assertEquals("equilateral", triangle.classify());
    }

    @Test
    void BVA2() {
        triangle = new Triangle(1, 1, 0);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA3() {
        triangle = new Triangle(1, 0, 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA4() {
        triangle = new Triangle(1, 0, 0);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA5() {
        triangle = new Triangle(0, 1, 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA6() {
        triangle = new Triangle(0, 1, 0);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA7() {
        triangle = new Triangle(0, 0, 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA8() {
        triangle = new Triangle(0, 0, 0);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA9() {
        triangle = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals("equilateral", triangle.classify());
    }

    @Test
    void BVA10() {
        triangle = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE + 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA11() {
        triangle = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE + 1, Integer.MAX_VALUE);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA12() {
        triangle = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA13() {
        triangle = new Triangle(Integer.MAX_VALUE + 1, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA14() {
        triangle = new Triangle(Integer.MAX_VALUE + 1, Integer.MAX_VALUE, Integer.MAX_VALUE + 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA15() {
        triangle = new Triangle(Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 1, Integer.MAX_VALUE);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void BVA16() {
        triangle = new Triangle(Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 1);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void ECP19() {
        triangle = new Triangle(5, 3, 2);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    void ECP20(){
        triangle = new Triangle(4,5,1);
        assertEquals("impossible",triangle.classify());
    }

    @Test
    void ECP21(){
        triangle = new Triangle(2,6,8);
        assertEquals("impossible",triangle.classify());
    }
}
