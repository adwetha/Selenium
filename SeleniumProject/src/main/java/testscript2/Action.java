package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Action extends Base{
public void action() {
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement drop=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	Actions actions=new Actions(driver);
	actions.moveToElement(drag).build().perform();
	actions.doubleClick(drag).build().perform();//or click
	actions.contextClick(drag).build().perform();//to right click
	actions.dragAndDrop(drag, drop).build().perform();
}
	public static void main(String[] args) {
		Action action=new Action();
		action.initialiseBrowser();
		action.action();

	}

}
