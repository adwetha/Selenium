package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
   public void id() {
	   ////WebElement elementname=driver.findElement(By.Locator("locator value"));
	   WebElement message=driver.findElement(By.id("Single Input Field"));//method used to locate a single webelement n a webpage//By is a class used to locate a webelement//id() etc are method of By class
	   WebElement showmessage=driver.findElement(By.id("button-one"));
	   WebElement entervalue=driver.findElement(By.id("value-a"));
	   WebElement gettotal=driver.findElement(By.id("button-two"));
   }
   public void className() {
	   WebElement element1=driver.findElement(By.className("clearfix"));
	   WebElement element2=driver.findElement(By.className("container page"));
	   WebElement element3=driver.findElement(By.className("mb-sec"));
   }
   public void name() {
	   WebElement element1=driver.findElement(By.name("description"));
	   WebElement element2=driver.findElement(By.name("author"));
	   WebElement element3=driver.findElement(By.name("keywords"));
	   
   }
   public void linkText() {
	   WebElement element1=driver.findElement(By.linkText("Checkbox Demo"));
	   WebElement element2=driver.findElement(By.linkText("Radio Buttons Demo"));
	   WebElement element3=driver.findElement(By.linkText("Simple Form Demo"));
   }
   public void partialLinkText() {
	   WebElement element1=driver.findElement(By.partialLinkText("Select Input"));
	   WebElement element2=driver.findElement(By.partialLinkText("Form Submit"));
	   WebElement element3=driver.findElement(By.partialLinkText("Ajax For"));
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locators locators=new Locators();
        locators.initialiseBrowser();
        locators.id();
        locators.className();
        locators.linkText();
        locators.partialLinkText();
        locators.driverQuitAndClose();
        
	}

}
