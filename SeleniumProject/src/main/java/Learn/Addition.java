package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Addition extends Base{
public void addition() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement value1=driver.findElement(By.xpath("//input[@id=\"value-a\"]"));
	value1.sendKeys("1");
	WebElement value2=driver.findElement(By.xpath("//input[@id=\"value-b\"]"));
	value2.sendKeys("2");
	WebElement result=driver.findElement(By.xpath("//button[@id=\"button-two\"]"));
	result.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition addition=new Addition();
		addition.initialiseBrowser();
		addition.addition();

	}

}
