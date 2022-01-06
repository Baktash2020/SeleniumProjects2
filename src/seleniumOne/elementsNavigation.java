package seleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementsNavigation {

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
		
		WebElement contButton = driver.findElement(By.name("signup"));
		
		boolean contdisplay = contButton.isDisplayed();
		boolean contEnable = contButton.isEnabled();
		
		System.out.println(contdisplay);
		System.out.println(contEnable);
		
		String conttext = contButton.getText();
		
		System.out.println(conttext);
		
		driver.quit();

	}

}
