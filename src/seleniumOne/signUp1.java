package seleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp1 {

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
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Kimmy");
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Diam");
		
		driver.findElement(By.name("yid")).sendKeys("kimmy66");
		
		driver.findElement(By.name("password")).sendKeys("ZaheenRoom1");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).sendKeys("");
		
		
		
		
		
		driver.close();

	}

}
