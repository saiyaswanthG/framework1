package assess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yaswa\\\\Documents\\\\java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("span[class=\"header-icon-link user-profile-icon\"]"))).build().perform();
		//a.moveToElement(driver.findElement(By.linkText("Log in"))).click().build().perform();
		
		
		ele=driver.findElement(By.cssSelector("*[class=\"signup-link authentication_popup\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		List<WebElement> elem = driver.findElements(By.cssSelector("*[id='spree_user_email']"));
		ele=elem.get(0);
		jse.executeScript("arguments[0].setAttribute('value', 'abc@gamil.com')", ele);
		elem = driver.findElements(By.cssSelector("*[id='spree_user_password']"));
		ele=elem.get(1);
		jse.executeScript("arguments[0].setAttribute('value', 'password')", ele);
		ele=driver.findElement(By.cssSelector("*[data-gaaction=\"signup_email_click\"]"));
		jse.executeScript("arguments[0].click()", ele);
	}
}
