package first;

import static org.junit.Assert.*;

import org.junit.Test;

public class FTest {

	@Test
	public void test() {
		assertEquals(10,new Mycalc().sum(4, 6));
	}

}
