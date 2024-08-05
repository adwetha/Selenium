package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Assignment2 extends Base{
	private void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]//tr[1]"));
		System.out.println(row.getText());
	}

	private void columnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]//tr//td[3]"));
		for(WebElement col:column) {
		System.out.println(col.getText());
		}
	}
    private void cellPrinting() {
    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
    	WebElement cell=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]//tr[1]//td[4]"));
    	System.out.println(cell.getText());
    	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 assignment2=new Assignment2();
		assignment2.initialiseBrowser();
		assignment2.rowPrinting();
		assignment2.columnPrinting();
		assignment2.cellPrinting();
	}	
}
