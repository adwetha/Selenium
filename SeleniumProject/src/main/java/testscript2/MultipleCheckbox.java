package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleCheckbox extends Base{
public void multipleCheckbox() {
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='check-box-one']"));
	 checkbox.click();
	 WebElement checkbox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
	 checkbox2.click();
}
	public static void main(String[] args) {
		MultipleCheckbox multiplecheckbox=new MultipleCheckbox();
		multiplecheckbox.initialiseBrowser();
		multiplecheckbox.multipleCheckbox();
	}

}
