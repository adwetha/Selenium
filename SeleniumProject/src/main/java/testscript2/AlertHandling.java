package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base{
 
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		 WebElement simpleAlertClick=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		 simpleAlertClick.click();
		 driver.switchTo().alert().accept();
		 }
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmationAlertClick=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		confirmationAlertClick.click();
		driver.switchTo().alert().dismiss();
	}
	public void promtAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promtAlertClick=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		promtAlertClick.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.initialiseBrowser();
		//alerthandling.simpleAlert();
		//alerthandling.promtAlert();
		alerthandling.confirmationAlert();

	}

}
