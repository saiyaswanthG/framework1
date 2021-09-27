package assess;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\G Sai Yaswanth\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]")));
		WebElement ele=driver.findElement(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]"));
		jse.executeScript("arguments[0].click()", ele);
		
		
		ele=driver.findElement(By.cssSelector("*[href=\"/locations?src=footer\"]"));
		jse.executeScript("arguments[0].click()", ele);
		//System.out.println(driver.getCurrentUrl());
		driver.get("https://www.urbanladder.com/locations?src=footer");
		List<WebElement> cities = driver.findElements(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[1]/div[2]/a"));
		int flag=0;
		for(int i=0;i<cities.size();i++) {
			if(cities.get(i).getText().equalsIgnoreCase("Chirala")) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[1]/div[2]/a[7]")).getText());
	}

}
