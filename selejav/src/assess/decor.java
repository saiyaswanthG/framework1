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

public class decor {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yaswa\\\\Documents\\\\java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("*[class=\"topnav_item decorunit\"]"))).build().perform();
		ele=driver.findElement(By.cssSelector("*[href=\"/wall-mirrors?src=g_topnav_decor_mirrors_wall-mirrors\"]"));
		jse.executeScript("arguments[0].click()", ele);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		if(ele.isDisplayed()) {
		jse.executeScript("arguments[0].click()", ele);
		}
		driver.findElement(By.id("filters_availability_In_Stock_Only")).click();
		Thread.sleep(3000);
		String mirror=driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/ul/li[1]/div/div[5]/a/div[1]/span")).getText();
		String cost=driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/ul/li[1]/div/div[5]/a/div[2]/span")).getText();
		System.out.println("Mirror type: "+mirror+" ,cost= "+cost.substring(1));
		driver.quit();
	}
}
