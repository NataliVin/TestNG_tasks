package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testAddAnyQuantityOfParameters() {
    int actualResult = calc.addAnyQuantityOfParameters(10, 20, 30);
    assertEquals("(10 + 20 + 30) must be 60", 60, actualResult);
  }
  @Test
  public void testDivideWithCheckByZero() {
    double actualResult = calc.divideWithCheckByZero(10, 0);
    assertEquals("(10 / 0) must be -100", -100.0, actualResult);
  }
// some comment
}
