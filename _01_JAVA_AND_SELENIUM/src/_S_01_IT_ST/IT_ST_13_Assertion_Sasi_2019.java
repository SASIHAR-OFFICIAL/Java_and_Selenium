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

import common.Assert;

public class IT_ST_13_Assertion_Sasi_2019 {

	public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			String expected []= {"Arun","Kavi"};
			String actual []= {"Arun","Kavi"};

			
		Assert.assertEquals(expected,actual);
		System.out.println("Both expected and Actual are same");
		WebDriver d;
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.softwaretestingmaterial.com");
			
			 //Actual title is "Software Testing Material - A site for Software Testers" 
			 //We took title as "Software Testing Material" to make the test fail
			 String Title = "software Testing Material";
			 String GetTitle = d.getTitle();
			 System.out.println("Assertion starts here...");
			 Assert.assertEquals(Title, GetTitle);
			 System.out.println("As Per Expected");

		}

	}
