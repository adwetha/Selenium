package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
public void checkBox() {
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkbox.click();
	System.out.println(checkbox.isEnabled());
	System.out.println(checkbox.isSelected());
	System.out.println(checkbox.isDisplayed());
}
	public static void main(String[] args) {
		CheckBox checkbox=new CheckBox();
		checkbox.initialiseBrowser();
		checkbox.checkBox();
		checkbox.QuitAndClose();

	}

}
