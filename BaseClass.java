package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	@BeforeTest
	
	//WebDriver wd;
	public void Baseclass() {
	
		WebDriverManager.chromedriver().setup();
	WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://snsadmin.cxengine.net/");
//		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(3, 0));
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
//		String expectedtitile = "Login - Soul & Soul";
//		String actualtitle = wd.getTitle();
//		assertEquals(actualtitle, expectedtitile, "username is mismatch");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
	}

}
