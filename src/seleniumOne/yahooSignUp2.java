package seleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUp2 {

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
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		
		firstName.sendKeys("Kimmy");
		
		firstName.clear();
		WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		lastName.sendKeys("Diam");
		
		WebElement userName = driver.findElement(By.name("yid"));
		userName.sendKeys("kimmy66");
		Thread.sleep(3000);
		
		WebElement passWord = driver.findElement(By.name("password"));
		
		passWord.sendKeys("ZaheenRoom1");
		Thread.sleep(3000);
		
		//driver.findElement(By.id("")).sendKeys("");
		
		//driver.findElement(By.id("")).sendKeys("");
		
		//driver.findElement(By.id("")).sendKeys("");
		
		driver.quit();

	}

}
