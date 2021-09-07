package mediumTests;
import application.Calculator;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
public class MediumTestClass {
  Calculator calc = new Calculator();
  @Test (groups = "Smoke")
  public void testCalculateAverageValueOfThreeNumbers() {
    double actualResult = calc.calculateAverageValueOfThreeNumbers(10, 20,30);
    assertEquals("(10 + 20 + 30)/3 must be 20", 20.0, actualResult);
  }
// some new comment to medium tests
  @Test
  public void testIsNumberEven() {
    boolean actualResult = calc.isNumberEven(10);
    assertEquals("10 is even, so it must return true", true, actualResult);
  }
  @Test
  public void testGetBiggerOfTwoNumbers() {
    int actualResult = calc.getBiggerOfTwoNumbers(10, 11);
    assertEquals("11 is bigger than 10, it must return 11", 11, actualResult);
  }
}
