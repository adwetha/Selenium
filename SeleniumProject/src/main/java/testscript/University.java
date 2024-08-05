package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class University extends Base{
	public void check() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement element=driver.findElement(By.id("gridCheck"));
		element.click();
		System.out.println(element.isEnabled());
	}
public void checkBox() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement element=driver.findElement(By.xpath("//input[@value='option-3']"));
	element.click();
	System.out.println(element.isDisplayed());
}
public void radioBox() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement element=driver.findElement(By.xpath("//input[@value='blue']"));
	element.click();
	System.out.println(element.isSelected());
}
	public static void main(String[] args) {
		University university=new University();
		university.initialiseBrowser();
		university.check();
		university.checkBox();
		university.radioBox();
		

	}

}
