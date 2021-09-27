package assess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class furniture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yaswa\\\\Documents\\\\java\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		
		ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div[3]/a[7]"));
		jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("*[title*=\"Study Room Furniture\"]")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,550)", "");
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[class=\"carousel-widget-small widget-latest page-module\"]")));
		//Thread.sleep(4000);
		List<WebElement> price = driver.findElements(By.cssSelector("*[class=\"infotext\"]"));
		//System.out.println("size"+price.size());
		for (int i1 = 0; i1 < price.size(); i1++) {
			 if(i1!=3) {
			 System.out.print("Price: ");
	            getPrice(price.get(i1).getText());
	        }
		}
		//System.out.println("done");
	}
	public static void getPrice(String s) {
		int k=0;
		String[] lis = s.split(" ");
		//System.out.println(lis[0]+' '+lis[1]+' '+lis[2]+' '+lis[3]);
		for(int i=0;i<lis.length;i++) {
			if(lis[i].equals("starting"))	{
				k=i;
				break;
			}
		}
		System.out.println(lis[k+2].substring(1));
	}
}
