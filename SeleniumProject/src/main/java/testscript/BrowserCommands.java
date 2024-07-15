package testscript;

public class BrowserCommands extends Base{
public void browserCommands() {
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	String pagesource=driver.getPageSource();
	System.out.println(title);
	System.out.println(url);
	//System.out.println(pagesource);
	}
	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initialiseBrowser();
        browsercommands.browserCommands();
        browsercommands.driverQuitAndClose();
	}

}
