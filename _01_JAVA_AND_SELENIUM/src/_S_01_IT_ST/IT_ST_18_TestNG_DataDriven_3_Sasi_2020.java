package S_01_IT_ST;

import java.io.File;
import java.io.FileInputStream;
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

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class IT_ST_18_TestNG_DataDriven_3_Sasi_2020 {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://demo.automationtesting.in/Register.html");
		FileInputStream f=new FileInputStream("C:\\Users\\JAYASREE SASIHAR\\Desktop\\datadriven\\dd.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s=b.getSheet(0);
		
		for(int x=1;x<=6;x++)
			
		{
			Thread.sleep(4000);
		
		String fn=s.getCell(0,x).getContents();
		String ln=s.getCell(1,x).getContents();
		String addr=s.getCell(2,x).getContents();
		String email=s.getCell(3,x).getContents();
		String pno=s.getCell(4,x).getContents();
		String pass=s.getCell(5,x).getContents();
		String cpass=s.getCell(6,x).getContents();
			
		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(fn);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(ln);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(addr);
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(pno);
		Thread.sleep(3000);
        d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(pass);
		
	    d.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(cpass);
	    d.navigate().refresh();
	   
			}
		}

}
