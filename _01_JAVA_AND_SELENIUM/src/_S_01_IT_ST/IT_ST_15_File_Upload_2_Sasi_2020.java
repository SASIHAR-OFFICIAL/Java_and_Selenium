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
import org.testng.Assert;

public class IT_ST_15_File_Upload_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			String baseUrl = "http://demo.guru99.com/test/upload/";
		       
	        d.get(baseUrl);
	        WebElement uploadElement = d.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("H:\\SELENIUM\\selenium 4.txt");

	        // check the "I accept the terms of service" check box
	        d.findElement(By.id("terms")).click();

	        // click the "UploadFile" button

		}

	}
