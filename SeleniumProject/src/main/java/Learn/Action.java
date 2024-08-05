package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends Base{
  public void action() {
	  driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	  WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	  drag.click();
	  WebElement drop=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	  drop.click();
	  Actions action=new Actions(driver);
	  action.dragAndDrop(drag, drop).build().perform();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Action action=new Action();
     action.initialiseBrowser();
     action.action();
	}

}
