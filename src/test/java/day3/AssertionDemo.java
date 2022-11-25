package day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	public void test1() {
		Assert.assertEquals(13,13);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(13,13,"Count matched");
	}
	@Test
	public void test3() {
		Assert.assertTrue(true);
	}
	@Test
	public void test4() {
		AssertJUnit.assertFalse(false);
	}

}
