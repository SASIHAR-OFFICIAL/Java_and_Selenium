package S_01_IT_ST;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IT_ST_19_Robot_Class_2_Sasi_2020 {
	public static void main(String[] args) throws AWTException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.edureka.co/");
		d.findElement(By.linkText("Courses")).click();
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("a");
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("b");
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("c");
		
		r.mouseMove(30, 100);
		System.out.println("d");
		
	}

}