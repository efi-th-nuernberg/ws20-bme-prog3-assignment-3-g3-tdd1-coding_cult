import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

@Test
public void testNothing() {
}

@Test
public void testSomeStuff() {
  int a = 2;
  int b = 3;
  int result = a+b;
  assertEquals("The equation is false", 5, result);
  
  String newString = "margo";
  assertNotNull("String is null,", newString);
  
  assertNotNull(newString);
  assertFalse("The comparison is right",3*7 > 4*5);

}

}