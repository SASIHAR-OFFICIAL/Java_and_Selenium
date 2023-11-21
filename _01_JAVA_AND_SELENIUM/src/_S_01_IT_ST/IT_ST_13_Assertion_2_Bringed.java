package S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class IT_ST_13_Assertion_2_Bringed {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		
		String sValue = "Assert Equals Test";
		
		Assert.assertEquals("Assert Equals Test", sValue);
		
		System.out.println("Test Passed");
		d.get("https://www.google.com");
		
		Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));
		
		//d.close();

		
		}
}
