package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcal {

	@Test
	public void test() {
		Calculator obj = new Calculator();
		int a = obj.addition(2,4);
		assertEquals(6, a);
	}
	@Test
	public void test1() {
		Calculator obj = new Calculator();
		int a= obj.sub(4, -4);
		assertEquals(8,a);
	}
	@Test
	public void test3() {
		Calculator obj = new Calculator();
		int a= obj.sub(4, 4);
		assertEquals(0,a);
	}

}
