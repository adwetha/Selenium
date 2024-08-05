package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Automation extends Base{
@Test
public void action() {
	driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	Actions action=new Actions(driver);
	WebElement rightclickme=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	action.contextClick(rightclickme).perform();
	WebElement clickme=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	action.doubleClick(clickme).perform();
	driver.switchTo().alert().accept();	
}
@Test
public void mainItem() {
	driver.navigate().to("https://demoqa.com/menu/");
	Actions action=new Actions(driver);
	WebElement mainitem=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	action.moveToElement(mainitem).perform();	
}
@Test
public void DragDrop() {
	driver.navigate().to("https://demoqa.com/droppable");
	WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).build().perform();
}
@Test
public void register() {
	driver.navigate().to("https://demowebshop.tricentis.com/fiction");
	WebElement reg=driver.findElement(By.xpath("//a[@href=\"/register\"]"));
	reg.click();
	WebElement gender=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
	gender.click();
	WebElement firstname=driver.findElement(By.xpath("//input[@data-val-required=\"First name is required.\"]"));
	firstname.sendKeys("William");
	WebElement lastname=driver.findElement(By.xpath("//input[@data-val-required=\"Last name is required.\"]"));
	lastname.sendKeys("Blake");
	WebElement gmail=driver.findElement(By.xpath("//input[@data-val-required=\"Email is required.\"]"));
	gmail.sendKeys("william@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@data-val-length=\"The password should have at least 6 characters.\"]"));
	password.sendKeys("gl37hto");
	WebElement confirmpassword=driver.findElement(By.xpath("//input[@data-val-equalto=\"The password and confirmation password do not match.\"]"));
	confirmpassword.sendKeys("gl37hto");
	WebElement regis=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
	regis.click();
}
@Test
public void frame() {
	driver.navigate().to("https://www.dezlearn.com/nested-iframes-example/");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id=\"parent_iframe\"]"));
	driver.switchTo().frame(iframe);
	WebElement parentiframe=driver.findElement(By.xpath("//button[@id=\"u_5_5\"]"));
	parentiframe.click();
	WebElement iframe1=driver.findElement(By.xpath("//iframe[@id=\"iframe1\"]"));
	driver.switchTo().frame(iframe1);
	WebElement childiframe=driver.findElement(By.xpath("//button[@id=\"u_5_6\"]"));
	childiframe.click();
	}
@Test
public void dropDown() {
	driver.navigate().to("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
	WebElement country=driver.findElement(By.xpath("//select[@country-data-region-id=\"gds-cr-one\"]"));
	Select select=new Select(country);
	select.selectByValue("India");;
}
@Test
public void multipleCheckBox() {
	driver.navigate().to("https://total-qa.com/checkbox-example/#google_vignette");
	WebElement selenium=driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
	selenium.click();
	WebElement jmeter=driver.findElement(By.xpath("//input[@type=\"checkbox\"][4]"));
	jmeter.click();
}
@Test
public void alertHandling() {
	driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
	WebElement simplealert=driver.findElement(By.xpath("//button[@onclick=\"alertFunction()\"]"));
	simplealert.click();
	driver.switchTo().alert().accept();
	WebElement confirmationalert=driver.findElement(By.xpath("//button[@id=\"confirmBox\"]"));
	confirmationalert.click();
	driver.switchTo().alert().accept();
	WebElement promptalert=driver.findElement(By.xpath("//button[@onclick=\"promptFunction()\"]"));
	promptalert.click();
	driver.switchTo().alert().sendKeys("message");
	driver.switchTo().alert().accept();
}
@Test
public void contactForm() {
	driver.navigate().to("https://formsmarts.com/html-form-example");
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder=\"Your first name\"]"));
	firstname.sendKeys("William");
	WebElement lastname=driver.findElement(By.xpath("//input[@name=\"u_Ukq_338354\"]"));
	lastname.sendKeys("Blake");
	WebElement gmail=driver.findElement(By.xpath("//input[@name=\"u_Ukq_4608\"]"));
	gmail.sendKeys("william@gmail.com");
	WebElement subjectinquiry=driver.findElement(By.xpath("//select[@name=\"u_Ukq_338367\"]"));
	Select select=new Select(subjectinquiry);
	select.selectByIndex(1);
	WebElement inquiry=driver.findElement(By.xpath("//textarea[@name=\"u_Ukq_4609\"]"));
	inquiry.sendKeys("Inquiry about the medicines available");
	WebElement contin=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	contin.click();
}
@Test
public void Demo() {
	driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
	WebElement firstname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	firstname.sendKeys("Charlie");
	WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	lastname.sendKeys("Kate");
	WebElement gender=driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
	gender.click();
	WebElement yoe=driver.findElement(By.xpath("//input[@id=\"exp-2\"]"));
	yoe.click();
	WebElement date=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
	date.sendKeys("28/01/2002");
	WebElement profession=driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
	profession.click();
	WebElement auto=driver.findElement(By.xpath("//input[@id=\"tool-2\"]"));
	auto.click();
	WebElement continents=driver.findElement(By.xpath("//select[@id=\"continents\"]"));
	Select select=new Select(continents);
	select.selectByIndex(2);
	WebElement seleniumcom=driver.findElement(By.xpath("//select[@id=\"selenium_commands\"]"));
	Select select1=new Select(seleniumcom);
	select1.selectByValue("Navigation Commands");
	WebElement choosefile=driver.findElement(By.xpath("//input[@id=\"photo\"]"));
	choosefile.click();
	choosefile.sendKeys("\"C:\\Users\\user\\Documents\\Analysis.pdf\"");
	WebElement download=driver.findElement(By.xpath("//a[@href=\"https://github.com/stanfy/behave-rest/blob/master/features/conf.yaml\"]"));
	download.click();
	WebElement button=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	button.click();
}
@Test
public void roboform() {
driver.navigate().to("https://www.roboform.com/filling-test-all-fields");
WebElement title=driver.findElement(By.xpath("//input[@name=\"01___title\"]"));
title.sendKeys("Ms");
WebElement firstname=driver.findElement(By.xpath("//input[@name=\"02frstname\"]"));
firstname.sendKeys("Anagha");
WebElement middleinitial=driver.findElement(By.xpath("//input[@name=\"03middle_i\"]"));
middleinitial.sendKeys("k");
WebElement lastname=driver.findElement(By.xpath("//input[@name=\"04lastname\"]"));
lastname.sendKeys("krishna");
WebElement fullname=driver.findElement(By.xpath("//input[@name=\"04fullname\"]"));
fullname.sendKeys("Anagha K Krishna");
WebElement company=driver.findElement(By.xpath("//input[@name=\"05_company\"]"));
company.sendKeys("Infotech");
WebElement position=driver.findElement(By.xpath("//input[@name=\"06position\"]"));
position.sendKeys("QA analyst");
WebElement address1=driver.findElement(By.xpath("//input[@name=\"10address1\"]"));
address1.sendKeys("abc house");
WebElement address2=driver.findElement(By.xpath("//input[@name=\"11address2\"]"));
address2.sendKeys("kannur");
WebElement city=driver.findElement(By.xpath("//input[@name=\"13adr_city\"]"));
city.sendKeys("kannur");
WebElement state=driver.findElement(By.xpath("//input[@name=\"14adrstate\"]"));
state.sendKeys("kerala");
WebElement country=driver.findElement(By.xpath("//input[@name=\"15_country\"]"));
country.sendKeys("india");
WebElement zip=driver.findElement(By.xpath("//input[@name=\"16addr_zip\"]"));
zip.sendKeys("670005");
WebElement homepn=driver.findElement(By.xpath("//input[@name=\"20homephon\"]"));
homepn.sendKeys("2735486");
WebElement worktele=driver.findElement(By.xpath("//input[@name=\"21workphon\"]"));
worktele.sendKeys("2597654");
WebElement fax=driver.findElement(By.xpath("//input[@name=\"22faxphone\"]"));
fax.sendKeys("011-44-20-12345678");
WebElement cellpn=driver.findElement(By.xpath("//input[@name=\"23cellphon\"]"));
cellpn.sendKeys("9458762153");
WebElement email=driver.findElement(By.xpath("//input[@name=\"24emailadr\"]"));
email.sendKeys("anagha@gmail.com");
WebElement website=driver.findElement(By.xpath("//input[@name=\"25web_site\"]"));
website.sendKeys("abrn@lnkd.com");
WebElement userid=driver.findElement(By.xpath("//input[@name=\"30_user_id\"]"));
userid.sendKeys("anagha");
WebElement password=driver.findElement(By.xpath("//input[@name=\"31password\"]"));
password.sendKeys("adh3647");
WebElement credittype=driver.findElement(By.xpath("//select[@name=\"40cc__type\"]"));
Select select2=new Select(credittype);
select2.selectByIndex(1);
WebElement creditno=driver.findElement(By.xpath("//input[@name=\"41ccnumber\"]"));
creditno.sendKeys("59252696255");
WebElement cardver=driver.findElement(By.xpath("//input[@name=\"43cvc\"]"));
cardver.sendKeys("2540");
WebElement cardexpm=driver.findElement(By.xpath("//select[@name=\"42ccexp_mm\"]"));
Select select3=new Select(cardexpm);
select3.selectByIndex(1);
WebElement cardexpy=driver.findElement(By.xpath("//select[@name=\"43ccexp_yy\"]"));
Select select4=new Select(cardexpy);
select4.selectByIndex(1);
WebElement cardusername=driver.findElement(By.xpath("//input[@name=\"44cc_uname\"]"));
cardusername.sendKeys("anagha k");
WebElement Issuingbank=driver.findElement(By.xpath("//input[@name=\"45ccissuer\"]"));
Issuingbank.sendKeys("canara");
WebElement customerservicepn=driver.findElement(By.xpath("//input[@name=\"46cccstsvc\"]"));
customerservicepn.sendKeys("2795843613");
WebElement sex=driver.findElement(By.xpath("//input[@name=\"60pers_sex\"]"));
sex.sendKeys("Female");
WebElement socialsecurityno=driver.findElement(By.xpath("//input[@name=\"61pers_ssn\"]"));
socialsecurityno.sendKeys("28756");
WebElement licenseno=driver.findElement(By.xpath("//input[@name=\"62driv_lic\"]"));
licenseno.sendKeys("KL2485976324562");
WebElement month=driver.findElement(By.xpath("//select[@name=\"66mm\"]"));
Select select5=new Select(month);
select5.selectByIndex(1);
WebElement day=driver.findElement(By.xpath("//select[@name=\"67dd\"]"));
Select select6=new Select(day);
select6.selectByIndex(28);
WebElement year=driver.findElement(By.xpath("//select[@name=\"68yy\"]"));
Select select7=new Select(year);
select7.selectByValue("2002");
WebElement age=driver.findElement(By.xpath("//input[@name=\"66pers_age\"]"));
age.sendKeys("22");
WebElement birthplace=driver.findElement(By.xpath("//input[@name=\"67birth_pl\"]"));
birthplace.sendKeys("kannur");
WebElement income=driver.findElement(By.xpath("//input[@name=\"68__income\"]"));
income.sendKeys("400000");
WebElement custommes=driver.findElement(By.xpath("//input[@name=\"71__custom\"]"));
custommes.sendKeys("need customer service");
WebElement comments=driver.findElement(By.xpath("//input[@name=\"72__commnt\"]"));
comments.sendKeys("help required");
WebElement reset=driver.findElement(By.xpath("//input[@type=\"reset\"]"));
reset.click();
}
}
