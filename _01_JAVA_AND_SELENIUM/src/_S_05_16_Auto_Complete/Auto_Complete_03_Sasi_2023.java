package S_05_16_Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Complete_03_Sasi_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.globalsqa.com/demo-site/auto-complete/#Categories");

List<WebElement> Search_Box = F.findElements(By.xpath("//*[@id=\'search\']/li"));
//*[@id="search"]
//*[@id="search"]
int Search_Box_size = Search_Box.size();
System.out.println("Search_Box_size = "+Search_Box_size);
	}
}
