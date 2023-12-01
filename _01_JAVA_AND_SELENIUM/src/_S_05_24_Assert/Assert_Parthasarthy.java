package _S_05_24_Assert;

import org.testng.Assert;

public class Assert_Parthasarthy {

	public static void main(String[] args) throws InterruptedException{
		
		
		String sValue = "Assert Equals Test";
		
		Assert.assertEquals("Assert Equals Test", sValue);
		
		System.out.println("Test Passed");
		driver.get("https://www.google.com");
		
		Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));
		
		driver.close();

		
		}
}
