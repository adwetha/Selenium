package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PractiseTest extends Base{
public void inputForm() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagefield=driver.findElement(By.id("single-input-field"));
	messagefield.sendKeys("welcome");//to pass value
	WebElement showmessage=driver.findElement(By.id("button-one"));
	showmessage.click(); //to click the show messsage button
	System.out.println(showmessage.getText());
	System.out.println(showmessage.getAttribute("id"));
	System.out.println(showmessage.getTagName());
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PractiseTest practisetest=new PractiseTest();
       practisetest.initialiseBrowser();
       practisetest.inputForm();
       practisetest.driverQuitAndClose();
	}

}
