package day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo2 {
	
	@Test(dependsOnMethods = "test2()")
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("Login successful");
	}
	
	@Test
	public void test2() {
		Assert.assertFalse(false);
		System.out.println("Logout of application");
	}

}
