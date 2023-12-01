package _S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_02_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM JARS\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		WebElement google = d.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		google.sendKeys("c");
		Thread.sleep(3000);
		List<WebElement> optionsList=d.findElements(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[2]/li"));
		for (WebElement otionsInList : optionsList) {
			if(otionsInList.getText().equals("cricket")) {
				otionsInList.click();
			}
	
}
	}
}
