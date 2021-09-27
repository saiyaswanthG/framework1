package p2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsiframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Actions
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Implicit wait
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Abd").build().perform();
		
		
		//windows handling
		/*driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a.sign-in-tooltip-link")).click();
		System.out.println(driver.getTitle());
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String p=it.next();
		String c=it.next();
		driver.switchTo().window(c);
		System.out.println(driver.getTitle());*/
		
		//iframes
		/*driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, dest).build().perform();
		 */
		
	}

}
