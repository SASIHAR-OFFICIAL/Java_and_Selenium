package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handle_06_Sasi_4_Jan_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.diver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		String First_Window = d.getWindowHandle();
		d.navigate().to("https://www.leafground.com/window.xhtml");
		
		WebElement Open_Box = d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		Open_Box.click();
		
		Set<String> All_Windows = d.getWindowHandles();
		
		for (String Second_Window : All_Windows) {
			d.switchTo().window(Second_Window);
			
		}
Thread.sleep(2000);
d.close();

	}

}
