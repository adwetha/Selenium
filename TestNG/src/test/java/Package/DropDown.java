package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base{
	@Test
 public void dropDown() {
	 driver.navigate().to("https://selenium.qabible.in/select-input.php");
	 WebElement drop=driver.findElement(By.xpath("//select[@id=\"single-input-field\"]"));
	 Select select=new Select(drop);
	 select.selectByIndex(2); 
 }
	@Test
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simplealert=driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		simplealert.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmationalert=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		confirmationalert.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void promtAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promtalert=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		promtalert.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		
	}
}
