package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class as2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.indiabookstore.net/");
		/*driver.findElement(By.id("searchBox")).sendKeys("India since independence");
		driver.findElement(By.id("searchButtonInline")).click();*/
		driver.findElement(By.id("searchBox")).sendKeys("india");
		driver.findElement(By.id("searchBox")).sendKeys(Keys.ENTER);
		driver.get("https://www.indiabookstore.net/search?q=india+since+independence");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.cssSelector("div[class=\"comparisonLink\"]"));
		jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);
		String isbnnum=driver.findElement(By.cssSelector("div[class=\"isbnContainer\"]")).getText();
		//System.out.println(isbnnum);
		ele=driver.findElement(By.cssSelector("a[href*=\"www.amazon.in\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		driver.get("https://www.amazon.in/dp/0143104098?tag=indi08-21&linkCode=osi&th=1&psc=1");
		String isbnamz=driver.findElement(By.xpath("//*[@id=\"detailBullets_feature_div\"]/ul/li[5]/span/span[2]")).getText();
		//System.out.println(isbnamz);
		if(isbnnum.equals(isbnamz)) {
			System.out.println("ISBN matched");
		}
		if(driver.findElement(By.cssSelector("span[class=\"a-size-medium a-color-success\"]")).getText().equalsIgnoreCase("In stock.")) {
			System.out.println("Book is in stock");
		}
		if(driver.findElement(By.id("SSOFpopoverLink")).getText().equalsIgnoreCase("Fulfilled by Amazon")) {
			System.out.println("Book is in Amazon Fulfilled Category");
		}
		driver.findElement(By.id("buy-now-button")).click();
	}

}