package Learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindow extends Base{
public void multipleWindow() {
	driver.navigate().to("https://webdriveruniversity.com/");
	String parent=driver.getWindowHandle();
	System.out.println("parent"+parent);
	WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	login.click();
	WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contact.click();
	Set<String> allwindows=driver.getWindowHandles();
	for(String handles:allwindows) {
		if(!(handles.equals(parent))) {
			driver.switchTo().window(handles);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
	}
	
	
}
	public static void main(String[] args) {
		MultipleWindow multiplewindow=new MultipleWindow();
		multiplewindow.initialiseBrowser();
		multiplewindow.multipleWindow();
		

	}

}
