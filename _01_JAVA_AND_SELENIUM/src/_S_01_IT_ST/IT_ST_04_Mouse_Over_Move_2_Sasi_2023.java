package _S_01_IT_ST;

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

public class IT_ST_04_Mouse_Over_Move_2_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login");
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(20),TimeUnit.SECONDS);
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
