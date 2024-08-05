package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class FileUpload extends Base {
public void sendKeys() {
	driver.navigate().to("https://the-internet.herokuapp.com/upload");
	WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
	upload.sendKeys("C:\\Users\\user\\Documents\\Analysis.pdf");
	WebElement submit=driver.findElement(By.xpath("//input[@id='file-submit']"));
	submit.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FileUpload fileupload=new FileUpload();
     fileupload.initialiseBrowser();
     fileupload.sendKeys();
	}

}
