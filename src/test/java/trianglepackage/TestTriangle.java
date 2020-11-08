package trianglepackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTriangle {
	int max = Integer.MAX_VALUE;

	/**
	 * Test if is impossible
	 */
	@Test
	public void testClassify_1() {
		Triangle t = new Triangle(0, 0, 0);
		Assertions.assertFalse(!t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "Should be impossible");
	}

	/**
	 * Test if is equilateral
	 */
	@Test
	public void testClassify_2() {
		Triangle t = new Triangle(2, 2, 2);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertEquals("equilateral", t.classify(), "Sould be equilateral");
	}

	/**
	 * Test if is isossceles
	 */
	@Test
	public void testClassify_3() {
		Triangle t = new Triangle(2, 2, 1);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertEquals("isossceles", t.classify(), "Sould be isossceles");
	}

	/**
	 * Test if is right-angled
	 */
	@Test
	public void testClassify_4() {
		Triangle t = new Triangle(5, 12, 13);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertEquals("right-angled", t.classify(), "Sould be Right-Angled");
	}

	/**
	 * Test if is scalene
	 */
	@Test
	public void testClassify_5() {
		Triangle t = new Triangle(2, 3, 4);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertEquals("scalene", t.classify(), "Sould be scalene");
	}

	/**
	 * Test if is not impossible
	 */
	@Test
	public void testClassify_6() {
		Triangle t = new Triangle(4, 1, 1);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertNotEquals("impossible", t.classify(), "Should not be impossible");
	}

	/**
	 * Test if is not equilateral
	 */
	@Test
	public void testClassify_7() {
		Triangle t = new Triangle(1, 1, 3);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertNotEquals("equilateral", t.classify(), "Should not be quilateral");
	}

	/**
	 * Test if is not isossceles
	 */
	@Test
	public void testClassify_8() {
		Triangle t = new Triangle(1, 2, 3);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertNotEquals("isossceles", t.classify(), "Should not be isossceles");
	}

	/**
	 * Test if is not right-angled
	 */
	@Test
	public void testClassify_9() {
		Triangle t = new Triangle(1, 1, 3);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertNotEquals("right-angled", t.classify(), "Should not be right-angled");
	}

	/**
	 * Test if is not scalene
	 */
	@Test
	public void testClassify_10() {
		Triangle t = new Triangle(3, 4, 5);
		Assertions.assertFalse(t.isImpossible());
		Assertions.assertNotEquals("scalene", t.classify(), "Should not be scalene");
	}

	@Test
	public void testClassify_BVA_1() {
		Triangle t = new Triangle(1, 1, max + 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "Should be impossible");
	}

	@Test
	public void testClassify_BVA_2() {
		Triangle t = new Triangle(1, max + 1, 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "Sould be impossible");
	}

	@Test
	public void testClassify_BVA_3() {
		Triangle t = new Triangle(1, max + 1, max + 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_4() {
		Triangle t = new Triangle(max + 1, 1, 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_5() {
		Triangle t = new Triangle(max + 1, 1, max + 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_6() {
		Triangle t = new Triangle(max + 1, max + 1, max + 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_7() {
		Triangle t = new Triangle(1, 1, -1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_8() {
		Triangle t = new Triangle(1, -1, 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_9() {
		Triangle t = new Triangle(1, -1, -1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_10() {
		Triangle t = new Triangle(-1, 1, 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_11() {
		Triangle t = new Triangle(-1, 1, -1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_12() {
		Triangle t = new Triangle(-1, 1, -1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_13() {
		Triangle t = new Triangle(-1, -1, 1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	@Test
	public void testClassify_BVA_14() {
		Triangle t = new Triangle(-1, -1, -1);
		Assertions.assertTrue(t.isImpossible());
		Assertions.assertEquals("impossible", t.classify(), "");
	}

	/*
	@Test
	public void testClassify_BVA_15() {
		Triangle t = new Triangle(2, 3, null);
		Assertions.assertEquals("isosceles", t.classify(), "Classify Isosceles Triangle");
	}
	*/
}
