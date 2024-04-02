package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Buttons {
	private static WebElement element = null;
	
	public static void clickGender(WebDriver driver) {
		element = driver.findElement(By.id("male"));
		return;
	}
	public static void clickDay(WebDriver driver) {
		element = driver.findElement(By.id("sunday"));
		return;
	}
	public static void selectConutry(WebDriver driver) {
		element = driver.findElement(By.id("country"));
		return;
	}
}
