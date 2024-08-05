package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import testscript.Base;

public class MultipleWindowHandling extends Base{
public void multipleWindowHandling() {
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contact.click();
	WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	login.click();
	String parent=driver.getWindowHandle();
	System.out.println("Parent:"+parent);
	System.out.println("*************");
	//Set<String>allwindows=driver.getWindowHandles();
	Set<String> allwindows=driver.getWindowHandles();
	for(String handles:allwindows) {
		if(!(handles.equals(parent))) {
		System.out.println("Windows:"+handles);
		driver.switchTo().window(handles);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("*************");
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
      multiplewindowhandling.initialiseBrowser();
      multiplewindowhandling.multipleWindowHandling();
	}

}
