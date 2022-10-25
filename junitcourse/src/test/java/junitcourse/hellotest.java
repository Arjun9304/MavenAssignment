package junitcourse;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class hellotest {

	StringHelper helper = new StringHelper();

	@Test
	public void testArraySorted (){
		
	int [] numbers ={12,35,1,2};
	int [] sorted = {1,2,12,35};
	Arrays.sort(numbers);
	assertArrayEquals(numbers,sorted);
		
	}
}