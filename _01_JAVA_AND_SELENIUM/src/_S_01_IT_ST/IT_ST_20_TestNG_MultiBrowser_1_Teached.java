package _S_01_IT_ST;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IT_ST_20_TestNG_MultiBrowser_1_Teached {
	 
	 public WebDriver driver;
	
	//  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
		  
	System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			 
	 
	   driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
	   // Here I am setting up the path for my IEDriver
	 
	   System.setProperty("webdriver.ie.driver", "C:\\selenium jars\\IEDriverServer.exe");
	 
	   driver = new InternetExplorerDriver();
	 
	  } else if (browser.equalsIgnoreCase("Chrome")) { 
			 
		   // Here I am setting up the path for my Chrome
		 
		   System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
		 
		   driver = new ChromeDriver();
		 
		  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://www.store.demoqa.com"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test public void login() throws InterruptedException {
	 
	 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	    driver.findElement(By.id("login")).click();
	 
	 }  
	 
	  @AfterClass public void afterTest() {
	 
	 //driver.quit();
	 
	 }
	 
	}


