package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base{
public void radioButton() {
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radioButtonDemo=driver.findElement(By.xpath("//input[@id=\"inlineRadio2\"]"));
	if(!radioButtonDemo.isSelected())
	{
		radioButtonDemo.click();
		System.out.println("Radio button selected");
	}
	else
	{
		System.out.println("already selected");
	}
	WebElement showselectedvalue=driver.findElement(By.xpath("//button[@id=\"button-one\"]"));
	showselectedvalue.click();
}

	public static void main(String[] args) {
     RadioButton radiobutton=new RadioButton();
     radiobutton.initialiseBrowser();
     radiobutton.radioButton();
     
	}

}
