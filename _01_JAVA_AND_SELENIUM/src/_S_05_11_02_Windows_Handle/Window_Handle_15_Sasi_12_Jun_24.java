package _S_05_11_02_Windows_Handle;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handle_15_Sasi_12_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Wedriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		// Open multiple URLs
		d.navigate().to("https://www.etvbharat.com/ta/!state");
		d.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		d.navigate().to("https://google.com");
		d.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);		
		d.navigate().to("https://stackoverflow.com");
		Thread.sleep(1000);
		
		// URL To Keep Open
		String urlToKeepOpen= "https://www.etvbharat.com/ta/!state";
		String TAB_ToKeepOpen = null;
		
		Set<String> All_3_Windows = d.getWindowHandles();
		for (String All_Windows : All_3_Windows) {
			if (urlToKeepOpen.equals(All_3_Windows)) {
				d.switchTo().window(All_Windows);
				
			}
			
		}

	}}

