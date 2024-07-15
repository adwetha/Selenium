package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{
	public void tagAndId()//tag#id 
	{
		WebElement element1=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement element2=driver.findElement(By.cssSelector("input#value-a"));
		WebElement element3=driver.findElement(By.cssSelector("button#button-one"));
		
	}
    public void tagAndClass() //tag.class
    {
		WebElement element1=driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement element2=driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		WebElement element3=driver.findElement(By.cssSelector("a.navbar-brand"));
		
	}
    public void tagAndAttribute()//tag[attribute=value] 
    {
	 WebElement element1=driver.findElement(By.cssSelector("button[id=button-one]"));
	 WebElement element2=driver.findElement(By.cssSelector("input[id=value-a]"));
	 WebElement element3=driver.findElement(By.cssSelector("label[for=inputEmail4]"));
	 
    }
    public void tagClassAndAttribute()//tag.classname[attribute=value]
    {
    	WebElement element1=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
    	WebElement element2=driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
    	WebElement element3=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
    }
  public static void main(String[] args) {
	  CssSelector cssSelector=new CssSelector();
		cssSelector.initialiseBrowser();
		cssSelector.tagAndId();
		cssSelector.tagAndClass();
		cssSelector.tagAndAttribute();
		cssSelector.tagClassAndAttribute();
		cssSelector.driverQuitAndClose();
	}

}
