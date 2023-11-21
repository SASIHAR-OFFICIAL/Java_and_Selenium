package S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Open_Browser_04_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\WEB DRIVERS\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\WEB DRIVERS\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
	
	}

}




		