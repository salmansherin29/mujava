package cal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testcalc {
	@Test
	void additiontest() {
		Calculator obj = new Calculator();
		int a = obj.addition(2,4);
		assertEquals(6, a);
	}
	
	@Test 
	void subtractiontest()
	{
		Calculator obj = new Calculator();
		int a= obj.sub(4, -4);
		assertEquals(8,a);
		
	}
	@Test 
	void subtractiontest1()
	{
		Calculator obj = new Calculator();
		int a= obj.sub(4, 4);
		assertEquals(0,a);
		
	}
}

