package assess;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import jdk.internal.misc.FileSystemOption;

public class sale {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yaswa\\\\Documents\\\\java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("*[class=\"topnav_item saleunit\"]"))).build().perform();
		ele=driver.findElement(By.cssSelector("*[href=\"/wooden-sofas?src=g_topnav_sale_deals-of-the-week_wooden-sofa-sets\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		if(ele.isDisplayed()) {
		jse.executeScript("arguments[0].click()", ele);
		}
		ele=driver.findElement(By.cssSelector("*[class=\"btn-wrap col-md-12\"]"));
		jse.executeScript("arguments[0].click()", ele);
		//System.out.println(driver.getCurrentUrl());
		driver.get("https://www.urbanladder.com/products/malabar-wooden-sofa-macadamia-brown?src=listing-wooden-sofas");
		String s=driver.findElement(By.xpath("//*[@id=\"product-details-visible\"]/li[4]/span[2]")).getText();
		System.out.println(s);
	}
}
