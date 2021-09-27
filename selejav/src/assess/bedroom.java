package assess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bedroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\G Sai Yaswanth\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("*[class=\"topnav_item bedroomunit\"]"))).build().perform();
		ele=driver.findElement(By.cssSelector("*[href=\"/king-size-bed?src=g_topnav_bedroom_beds_king-size-beds\"]"));
		jse.executeScript("arguments[0].click()", ele);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		if(ele.isDisplayed()) {
		jse.executeScript("arguments[0].click()", ele);
		}
		a.moveToElement(driver.findElement(By.cssSelector("*[data-group=\"price\"]"))).build().perform();
		ele=driver.findElement(By.id("price_limit_6954-20561"));
		jse.executeScript("arguments[0].click()", ele);
	}

}
