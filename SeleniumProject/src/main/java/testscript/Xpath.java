package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
public void relativeXPath() //tagname[@attributetype='value']
{
	WebElement element1=driver.findElement(By.xpath("//input[@placeholder='Message']"));
	/*absolute xpath
	 /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
	 */
}
public void dynamicXPath() {
	//contains
	WebElement element1=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	//text
	WebElement element2=driver.findElement(By.xpath("//button[text()='Show Message']"));
	//Starts with
	 //tag[starts-with(@attribute,'value')]
	 WebElement element5=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	//tag[@attribute='value' and @attribute='value']
	//tag[@attribute='value' or @attribute='value']
}
public void axesMethod() {
//1.parent//
 WebElement element1=driver.findElement(By.xpath("//button[text()='Show Message']//parent::form"));
 //2.child//
 WebElement element2=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
 //3.Following//
 WebElement element3=driver.findElement(By.xpath("//input[@type='text']//following::input"));
 //4.Indexing//
 WebElement element4=driver.findElement(By.xpath("//form[@method='POST'][1]"));
 
 
}
public static void main(String[]args) {
	Xpath xpath=new Xpath();
	xpath.initialiseBrowser();
	//xpath.relativeXPath();
	//xpath.dynamicXPath();
	xpath.axesMethod();
	xpath.driverQuitAndClose();
}
}
