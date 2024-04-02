package testCase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;

import page.Buttons;
import page.TextInputs;
public class ButtonsTest {
private static WebDriver driver = null;
	
	public static void main(String[]args) {
		buttons();
	}
	public static void buttons() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chrome-win32/chrome.exe");
		 driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com");
		 
		 Buttons.clickGender(driver);
		 Buttons.clickDay(driver);
		 Buttons.selectConutry(driver);

		 System.out.println("Test completed");
		}
}
