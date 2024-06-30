package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _15_Window_Handle_Sasi_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/windows");
		String windowHandle_1 = d.getWindowHandle();
		
		WebElement Home_page = d.findElement(By.xpath("//*[@id=\"home\"]"));
		Home_page.click();
		Thread.sleep(1000);
		//d.switchTo().newWindow(WindowType.TAB);
		
		String window_2_title = d.getTitle();
		System.out.println("window_2_title = "+window_2_title);
		
//		Set<String> windowHandles_2 = d.getWindowHandles();
//		String windowHandles_2_title = d.getTitle();
//		
//		System.out.println("window_2_title = "+windowHandles_2_title);
//		Thread.sleep(1000);
//		
//		for (String windowHandles_1_2 : windowHandles_2) {
//			d.switchTo().window(windowHandles_1_2);
//			if (windowHandles_1_2.equals(d.getCurrentUrl().equals("https://letcode.in/test"))) {
//				d.close();
//			}
//			//d.switchTo().window(windowHandle_1);
//			}
		
//		d.switchTo().window(windowHandle_1);
//		WebElement Muiltiple_windows = d.findElement(By.xpath("//*[@id=\"multi\"]"));
//		Muiltiple_windows.click();
		}}
