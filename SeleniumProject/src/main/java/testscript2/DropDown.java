package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDown extends Base{
public void dropDown() {
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement drop=driver.findElement(By.xpath("//select[@id=\"single-input-field\"]"));
	Select select=new Select(drop);
	//select.selectByVisibleText("Red");
	//select.selectByIndex(3);
	select.selectByValue("Yellow");
}
	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.initialiseBrowser();
		dropdown.dropDown();

	}

}
