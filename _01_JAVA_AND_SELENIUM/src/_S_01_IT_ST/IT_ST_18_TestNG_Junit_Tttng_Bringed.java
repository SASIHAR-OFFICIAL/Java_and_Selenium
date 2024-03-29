package _S_01_IT_ST;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class IT_ST_18_TestNG_Junit_Tttng_Bringed {
	WebDriver d;
	@BeforeClass
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }

	@Test
  public void f() throws BiffException, IOException, InterruptedException 
	{
		FileInputStream k=new FileInputStream("D:\\raj.xls");
		Workbook l=Workbook.getWorkbook(k);
		Sheet s=l.getSheet(0);
		int count=s.getRows();
		for(int i=1;i<count;i++) {
		String user=s.getCell(0,i).getContents();
		d.findElement(By.id("txt_unam")).sendKeys(user);
		Thread.sleep(2000);
		String password=s.getCell(1,i).getContents();
		d.findElement(By.id("txt_pass")).sendKeys(password);
		Thread.sleep(2000);
		d.findElement(By.id("Button3")).click();
		Thread.sleep(2000);
		d.findElement(By.id("LinkButton1")).click();
	}
	}
	@Test
	  public void f1() throws IOException, InterruptedException, JXLException
		{
			FileInputStream j=new FileInputStream("D:\\raj1.xls");
			Workbook i=Workbook.getWorkbook(j);
			Sheet s=i.getSheet(0);
			int count=s.getRows();
			for(int v=1;v<count;v++) {
			String user=s.getCell(0,v).getContents();
			d.findElement(By.id("txt_unam")).sendKeys(user);
			Thread.sleep(2000);
			String password=s.getCell(1,v).getContents();
			d.findElement(By.id("txt_pass")).sendKeys(password);
			Thread.sleep(2000);
			d.findElement(By.id("Button3")).click();
			Thread.sleep(2000);
			d.findElement(By.id("LinkButton1")).click();
		}
		}
	@AfterClass
	public void after() {
		d.quit();
	}
}


