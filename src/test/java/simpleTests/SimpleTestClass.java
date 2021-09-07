package simpleTests;
import application.Calculator;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
public class SimpleTestClass {
  Calculator calc = new Calculator();
  @Test(groups = "Regression")
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }
  // TODO (*)
  //add tests for new methods (multiply, division, subtraction, square root, x^2)
  @Test
  public void testSubtractTwoPositiveValues() {
    int actualResult = calc.subtract(10, 5);
    assertEquals("10 - 5 must be 5", 5, actualResult);
  }


  @Test
  public void testMultiplyTwoPositiveValues() {
    int actualResult = calc.multiply(10, 5);
    assertEquals("10 * 5 must be 50", 50, actualResult);
  }
  @Test
  public void testDivideTwoPositiveValues() {
    int actualResult = calc.divide(10, 5);
    assertEquals("10 / 5 must be 2", 2, actualResult);
  }
  @Test
  public void testGetSquareRootOfNumber() {
    double actualResult = calc.getSquareRoot(25);
    assertEquals("square root for 25 must be 5", 5.0, actualResult);
  }
  @Test
  public void testGetNumberSquared() {
    int actualResult = calc.getNumberSquared(5);
    assertEquals("5^2 must be 2", 25, actualResult);
  }
}
