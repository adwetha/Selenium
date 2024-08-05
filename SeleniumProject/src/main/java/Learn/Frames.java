package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base{
  public void frames() {
	  driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	  WebElement iframes=driver.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]"));
	  driver.switchTo().frame(iframes);
	  WebElement element=driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
	  element.click();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Frames frames=new Frames();
        frames.initialiseBrowser();
        frames.frames();
	}

}
