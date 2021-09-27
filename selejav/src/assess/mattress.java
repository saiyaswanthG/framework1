package assess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class mattress {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yaswa\\\\Documents\\\\java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("*[class=\"topnav_item mattressesunit\"]"))).build().perform();
		ele=driver.findElement(By.cssSelector("*[href=\"/mattress-by-range?src=g_topnav_mattresses_mattresses-bedding_mattress-by-range\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		System.out.println(driver.findElement(By.className("_3PVJC")).getText());
		//Assert.assertEquals(driver.findElement(By.className("_3PVJC")).getText(), "Dreamlite Mattress");
		//Dreamlite Mattress
	}
}
