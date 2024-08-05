package Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;
public void initialiseBrowser() {
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
}
public void QuitAndClose() {
	driver.quit();
}
	public static void main(String[] args) {
		Base base=new Base();
		base.initialiseBrowser();
		base.QuitAndClose();

	}

}
