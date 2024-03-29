package _S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IT_ST_22_DesiredCapabilities_BrowserCheck_Bringed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exee");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");*/
		/*System.setProperty("webdriver.ie.driver", "C:\WebDriver\IEDriver\IEDriverServer.exe");*/
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.co.in");
		DesiredCapabilities capabilities= DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		}

}
