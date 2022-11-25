package testNGPractice;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AssertDemo2Test {
  @Test
  public void test1() {
		Assert.assertTrue(true);
		System.out.println("Login successful");
	}
  @Test
  public void test2() {
		Assert.assertFalse(false);
		System.out.println("Logout of application");
	}

}
