package assess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yaswa\\\\Documents\\\\java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		
		driver.findElement(By.cssSelector("*[href=\"../../furniture-stores?src=header\"]")).click();
		//driver.findElement(By.className("_3aLC-")).click();
		driver.findElement(By.cssSelector("*[href=\"/furniture-stores/bangalore/jp-nagar?src=stores_listing\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"store-details\"]/div[4]/div[1]/address/div[1]")).getText());
	}

}
