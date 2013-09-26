import static org.junit.Assert.*;

import org.junit.Test;


public class MathTest {
	@Test
	public void canMultiply(){
		assertEquals("can multiply 1 and 1", 1, MyMath.multiply(1,1));
		assertEquals("can multiply 1 and 2", 2, MyMath.multiply(1, 2));
		assertEquals("can multiply 1 and 4", 4, MyMath.multiply(1, 4));
		assertEquals("can multiply 4 and 1", 4, MyMath.multiply(4, 1));
		assertEquals("can multiply 36 and 89", 3204, MyMath.multiply(36,89));
	}
	@Test
	public void canPower(){
		assertEquals("can power 3 and 3", 27, MyMath.power(3, 3));
		assertEquals("can power 4 and 3", 64, MyMath.power(4, 3));
		assertEquals("can power 1 and 3", 1, MyMath.power(1, 3));
		assertEquals("can power 5 and 1", 5, MyMath.power(5, 1));
		assertEquals("can power 9 and 0", 1, MyMath.power(9, 0));
		assertEquals("can power 10 and -1", -1,  MyMath.power(10, -1));
	}
}
