package _S_05_10_02_Basic_All;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_New_Webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
FirefoxDriver d = new FirefoxDriver();
d.manage().window().maximize();
Path Path_for_Adblock = Paths.get("C:\\WebDriver\\geckodriver\\adblock_plus-4.0.xpi");
//d.installExtension(Path_for_Adblock);
String ExtensionID = d.installExtension(Path_for_Adblock);
//Thread.sleep(3000);
//d.uninstallExtension(ExtensionID);
	}

}
