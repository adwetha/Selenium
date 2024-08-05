package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement element=driver.findElement(By.xpath("//select[@id=\"single-input-field\"]"));
		Select select=new Select(element);
		select.selectByIndex(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DropDown dropdown=new DropDown();
     dropdown.initialiseBrowser();
     dropdown.dropDown();
     
	}

}
