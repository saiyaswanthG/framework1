package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class ases4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marriott.com/loyalty/member-benefits.mi");
//		WebElement select= driver.findElement(By.cssSelector("input[name=\"destinationAddress.destination\"]"));
//		select.sendKeys("Banglore");
//		//select.sendKeys(Keys.DOWN);s
//		select.sendKeys(Keys.ENTER);
//		//driver.findElement(By.cssSelector("button[type='submit']")).click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		
//		WebElement ele=driver.findElement(By.cssSelector("button[type='submit']"));
//		jse.executeScript("arguments[0].click()", ele);
//		 System.out.println(driver.findElement(By.cssSelector("div[data-postal-code=\"560001\"]")).getAttribute("data-city"));
		//driver.findElements(By.cssSelector("h3[class=\\\"l-margin-top \\\"]"))[2].
	}
}
