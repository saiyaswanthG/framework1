package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assg1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		//chrome(driver);
		//ff(driver);
		edge(driver);
		
	}
	public static void chrome(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yaswa\\Documents\\java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	public static void ff(WebDriver driver) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yaswa\\Documents\\java\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		//Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	public static void edge(WebDriver driver) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\yaswa\\Documents\\java\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		//Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}

}
