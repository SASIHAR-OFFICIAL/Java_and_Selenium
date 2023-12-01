package _S_01_IT_ST;

import java.util.concurrent.ThreadFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IT_ST_03_Alert_Accept_GetText_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admi");
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		//d.switchTo().alert().accept();
		Alert alert = d.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();

						}

	
	
		}

