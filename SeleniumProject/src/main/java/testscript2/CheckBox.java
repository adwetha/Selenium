package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox extends Base{
public void checkBox() {
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id=\"gridCheck\"]"));
	/*if(singlecheckbox.isSelected())
	{
	  singlecheckbox.click();
	  System.out.println("The checkbox is deselected");
	}
	else
	{
		singlecheckbox.click();
		System.out.println("The checkbox is selected");
	}*/	
	if(!singlecheckbox.isSelected()) {
		singlecheckbox.click();
		System.out.println("Check box is selected");
	}
	else
	{
		System.out.println("single checkbox not selected");
	}
}
	public static void main(String[] args) {
		CheckBox checkbox=new CheckBox();
		checkbox.initialiseBrowser();
		checkbox.checkBox();
	}

}
