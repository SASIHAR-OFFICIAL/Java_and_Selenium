package S_01_IT_ST;

import java.io.File;
import java.util.concurrent.ThreadFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IT_ST_12_Explicit_Wait_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//Launch the Application Under Test (AUT)
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=colbuddy9&Login=Login");	
		//d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login");
			
			Thread.sleep(30000);
			//d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			d.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
						
			Actions a=new Actions(d);
			WebElement moveonmenu = d.findElement(By.xpath(".//*[@id='Automation Tools']"));
			a.moveToElement(moveonmenu).build().perform();
			
			Thread.sleep(3000);
			WebElement elem2 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a"));
			a.moveToElement(elem2).build().perform();
			
			Thread.sleep(3000);
			WebElement elem3 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
			
			a.moveToElement(elem3).click().build().perform();
	}
			
}
