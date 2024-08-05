package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base{
public void tablePrinting() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement table=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]"));
	System.out.println(table.getText());
}
public void rowPrinting() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement row=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]//tbody//tr[1]"));
	System.out.println(row.getText());
}
public void cellPrinting() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement cell=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]//tbody//tr[1]//td[1]"));
	System.out.println(cell.getText());
}
public void columnHandling() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> tablelist=driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]//tbody//tr//td[2]"));
	for(WebElement menu:tablelist) {
	System.out.println(menu.getText());
	}
}
	public void searchValue() {
		String a="Ashton Cox";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> emp=driver.findElements(By.xpath("//table[@id=\"dtBasicExample\"]//tbody//tr//td[1]"));
		for(WebElement menu:emp) {
		if(a.equals(menu.getText())) {
		System.out.println("Both are same "+menu.getText());
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TableHandling tablehandling=new TableHandling();
	tablehandling.initialiseBrowser();
	tablehandling.tablePrinting();
	//tablehandling.rowPrinting();
	//tablehandling.cellPrinting();
	//tablehandling.columnHandling();
	tablehandling.searchValue();
	}

}
