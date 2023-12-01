package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_08_Enter_Data_Sasi_Basic_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM WEBDRIVER\\chromedriver_win32\\chromedriver.exe");
WebDriver Chrome = new ChromeDriver();
Chrome.get("http://www.bing.com");*/

System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM WEBDRIVER\\geckodriver-v0.32.2-win64\\geckodriver.exe");
WebDriver Firefox = new FirefoxDriver();
Firefox.get("https://www.google.com");
Firefox.findElement(By.name("q")).sendKeys("Kovai"+Keys.ENTER);
	}

}
