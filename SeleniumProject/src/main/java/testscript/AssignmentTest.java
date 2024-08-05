package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AssignmentTest extends Base{
public void addition() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement valueA=driver.findElement(By.id("value-a"));
	valueA.sendKeys("1");
	WebElement valueB=driver.findElement(By.id("value-b"));
	valueB.sendKeys("2");
	WebElement gettotal=driver.findElement(By.id("button-two"));
	gettotal.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AssignmentTest assignmenttest=new AssignmentTest();
	assignmenttest.initialiseBrowser();
	assignmenttest.addition();
	}

}
