package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextInputs {
	private static WebElement element = null;
			
	public static void textBoxName(WebDriver driver) {
		element = driver.findElement(By.id("name"));
		return;

	}
	public static void textBoxEmail(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return;
	}
	public static void textBoxPhone(WebDriver driver) {
		element = driver.findElement(By.id("phone"));
		return;
}
	public static void textBoxAdress(WebDriver driver) {
		element = driver.findElement(By.id("textarea"));
		return;
}
	
	}
