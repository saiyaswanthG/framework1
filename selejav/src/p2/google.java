package p2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input[title=\"Search\"]")).sendKeys("samsung s10");
		WebElement ele=driver.findElement(By.cssSelector("input[title=\"Search\"]"));
		ele.sendKeys(Keys.ENTER);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.get(url);
		List<WebElement> price = driver.findElements(By.cssSelector("a[class=\"plantl pla-unit-single-clickable-target clickable-card\"]"));
		System.out.println(price.size());
		 for (int i1 = 0; i1 < price.size(); i1++) {
			 System.out.print("Price: ");
	           // System.out.println(price.get(i1).getAttribute("aria-label"));
	            getPrice(price.get(i1).getAttribute("aria-label"));
	           // System.out.println(price.get(i1).getText());
	        }
	}
	public static void getPrice(String s) {
		int k=0;
		String[] lis = s.split(" ");
		for(int i=0;i<lis.length;i++) {
			if(lis[i].equals("for"))	{
				k=i;
				break;
			}
		}
		System.out.println(lis[k+1].substring(1));
	}
}
