package junitcourse;

import static org.junit.Assert.*;

import org.junit.Test;

public class exceptiontest {

	@Test(expected=ArithmeticException.class)
	public void test() {
		Exception Ex = new Exception();
		Ex.ArithmeticException();
	}

}
