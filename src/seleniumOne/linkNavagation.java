package seleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkNavagation {

	public static void main(String[] args) throws InterruptedException {


     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\ChromeD\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://login.yahoo.com/account/create");
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		WebElement Helplink = driver.findElement(By.linkText("Help"));
		
		Helplink.click();
		
		Thread.sleep(3000);
		
		
		String helppageUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		String helpPageTitle = driver.getTitle();
		
		System.out.println(helppageUrl);
		System.out.println(helpPageTitle);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
		helppageUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		helpPageTitle = driver.getTitle();
		
		System.out.println(helppageUrl);
		System.out.println(helpPageTitle);
		
		
		
		
		driver.quit();

	}

}
