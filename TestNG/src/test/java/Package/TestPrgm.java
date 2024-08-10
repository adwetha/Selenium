package Package;

import org.testng.annotations.Test;

public class TestPrgm extends Base{
	@Test(priority=1)
 public void test1() {
	System.out.println("Hello");
}
	@Test(priority=2)
	public void message() {
		System.out.println("testing the program");
	}
	@Test(priority=3)
	public void display() {
		System.out.println("Displaying");
	}

}
