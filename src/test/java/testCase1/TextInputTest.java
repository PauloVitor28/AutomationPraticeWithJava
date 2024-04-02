package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;

import page.TextInputs;


public class TextInputTest {
	private static WebDriver driver = null;
	
	public static void main(String[]args) {
		inputs();
	}
public static void inputs() {
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chrome-win32/chrome.exe");
	 driver = new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com");
	 
	 TextInputs.textBoxName(driver);
	 TextInputs.textBoxEmail(driver);
	 TextInputs.textBoxPhone(driver);
	 TextInputs.textBoxAdress(driver);
	 
	 System.out.println("Test completed");
	}
}
