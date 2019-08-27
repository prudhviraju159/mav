package di;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void Testdi()
	{
	 WebDriver	driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 driver.get("http://www.google.com");
	 
	 
		
		
	}
	
}
