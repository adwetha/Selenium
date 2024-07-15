package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void initialiseBrowser() {
	driver=new ChromeDriver(); //Brower Initialisation
	driver.get("https://selenium.qabible.in/"); //launch URL
	driver.manage().window().maximize();
}
public void driverQuitAndClose() {
	//driver.close();
	driver.quit();
}
	public static void main(String[] args) {
	Base base=new Base();
	base.initialiseBrowser();

	}

}
