package p2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.cj.protocol.x.CompressionSplittedOutputStream;

import org.openqa.selenium.support.ui.ExpectedConditions;
public class multiplelinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.w3schools.com/html/html_elements.asp");
		System.out.println(driver.findElements(By.tagName("table")).size());
		WebElement tabl=driver.findElement(By.xpath("//table[2]/tbody/tr"));
		System.out.println(tabl.findElements(By.xpath("//td/a")).size());
		for(int i=0;i<tabl.findElements(By.xpath("//td/a")).size();i++) {
			String clik=Keys.chord(Keys.CONTROL,Keys.ENTER);
			tabl.findElements(By.xpath("//td/a")).get(i).sendKeys(clik);
			Thread.sleep(5000);
		}
		Set <String> lis=driver.getWindowHandles();
		Iterator <String> itr=lis.iterator();
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}*/
		
		//calender with Navigable months and dates
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|529647797668&s_kwcid=AL!1631!3!529647797668!e!!g!!make%20my%20trip&ef_id=CjwKCAjwgb6IBhAREiwAgMYKRsOsxHM3fThv9u6PhNl1CCUTO0M64Vr5hQZs_wjSqecVHlQvPkBkrRoCNHEQAvD_BwE:G:s&gclid=CjwKCAjwgb6IBhAREiwAgMYKRsOsxHM3fThv9u6PhNl1CCUTO0M64Vr5hQZs_wjSqecVHlQvPkBkrRoCNHEQAvD_BwE");
		//WebDriverWait w=new WebDriverWait(driver,20);
		//w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p[data-cy='departureDate']")));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement ele=driver.findElement(By.cssSelector("p[data-cy='departureDate']"));
		jse.executeScript("arguments[0].click()", ele);
		int count1=driver.findElements(By.cssSelector("div[class='DayPicker-Month']")).size();
		//List<WebElement> b=driver.findElements(By.cssSelector("div[class='DayPicker-Month']"));
		System.out.println(count1);
		//Thread.sleep(10000);DayPicker-NavButton DayPicker-NavButton--next
		while(true) {
		String m1=( driver.findElements(By.cssSelector("div[class='DayPicker-Caption']")).get(0).getText());
		//System.out.println("Its aug");
		//String m2=( driver.findElements(By.cssSelector("div[class='DayPicker-Caption']")).get(1).getText());
		if(m1.contains("November")) {
			break;
		}
		else {
			ele=driver.findElement(By.cssSelector("span[aria-label=\"Next Month\"]"));
			jse.executeScript("arguments[0].click()", ele);
		}
		}
		
		int count=driver.findElements(By.className("DayPicker-Day")).size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String str=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(str.equalsIgnoreCase("23")) {
				WebElement a=driver.findElements(By.className("DayPicker-Day")).get(i);
				jse.executeScript("arguments[0].click()", a);
				
				break;
			}
		}
	}
}
