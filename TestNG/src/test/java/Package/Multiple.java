package Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Multiple extends Base{
	@Test
public void Frames() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]"));
	driver.switchTo().frame(iframe);
	WebElement element=driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
	element.click();
}
	@Test
	public void multipleWindow() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement buttonclick=driver.findElement(By.xpath("//h1[text()='BUTTON CLICKS']"));
		buttonclick.click();
		WebElement todolist=driver.findElement(By.xpath("//h1[text()='TO DO LIST']"));
		todolist.click();
		String parent=driver.getWindowHandle();
		System.out.println("parent"+parent);
		System.out.println("**********");
		Set<String> allwindow=driver.getWindowHandles();
		for(String handles:allwindow) {
			if(!(handles.equals(parent))) {
				System.out.println("windows:"+handles);
				driver.switchTo().window(handles);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println("**********");
			}
      }
}
	@Test	
	public void action() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[@draggable=\"true\"]"));
		drag.click();
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
		drop.click();
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
		
}
