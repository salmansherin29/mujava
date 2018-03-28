package cal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator obj = new Calculator();
		int a= obj.sub(4, 4);
		assertEquals(0,a);
	}

}
