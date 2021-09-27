package p2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.w3schools.com/jsref/jsref_push.asp");
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("email")).sendKeys("hey google");
		driver.findElement(By.linkText("copyWithin()")).click();
		driver.navigate().back();"Browser manipulation "
		driver.close();<a target="_top" href="jsref_copywithin.asp">copyWithin()</a>/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a
		driver.quit();*/
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_a_po']/div[3]/a")).click();
		
	}

}
