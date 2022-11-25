package testNGPractice;

import org.testng.annotations.Test;

public class FirstTestNGTestTest {

	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login successful");
		
	}
	@Test
	public void createAccount() {
		System.out.println("Account created successfully");
	}
	@Test
	public void deleteAccount() {
		System.out.println("Account deleted successful");
	}
	@Test
	public void logout() {
		System.out.println("Logged out of application");
	}

}
