package S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_06_Sasi_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM WEBDRIVER\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.navigate().to("https://www.foundit.in/");
		Thread.sleep(3000);

		WebElement Search_box = D.findElement(By.xpath("//*[@id=\\\"SE_home_autocomplete\\\"]"));
		Search_box.sendKeys("SEL");
		
		
		List<WebElement> SE_home_autocomplete = D.findElements(By.xpath("//*[@id=\"SE_home_autocomplete\"]"));

	for (WebElement All : SE_home_autocomplete) {
		if (All.getText().contains("Selenium")) {
			Thread.sleep(3000);
			All.click();
			
		}
		
	}
	}

}
