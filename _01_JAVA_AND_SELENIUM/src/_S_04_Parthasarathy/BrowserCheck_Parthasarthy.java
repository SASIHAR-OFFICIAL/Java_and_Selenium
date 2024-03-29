package _S_04_Parthasarathy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCheck_Parthasarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");*/
		/*System.setProperty("webdriver.ie.driver", "C:\\WebDriver\\IEDriver\\IEDriverServer.exee");
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.co.in");*/
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		DesiredCapabilities capabilities= DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in");
	

	}

}
