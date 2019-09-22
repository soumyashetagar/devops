package devops2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTesting {

	@Test
	public void test() {
		square s=new square();
		int output=s.squareOf(5);
		assertEquals(25,output);
	}

}
