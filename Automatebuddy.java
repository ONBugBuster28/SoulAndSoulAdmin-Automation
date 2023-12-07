package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Automatebuddy extends BaseClass {
	WebDriver wd;

	@Test(priority = 1)
	public void Login_Soul_And_Soul() throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//	WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
//		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(3, 0));
//		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
//		String expectedtitile = "Login - Soul & Soul";
//		String actualtitle = wd.getTitle();
//		assertEquals(actualtitle, expectedtitile, "username is mismatch");
//		wd.findElement(By.id("Password")).sendKeys("******");
//		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
//		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[2]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[3]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[4]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[5]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[6]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[6]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[7]")).click();
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Successfully Login");

	}

	@Test(priority = 2)
	public void Add_New_Item() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
//		String expectedtitile = "Login - Soul & Soul";
//		String actualtitle = wd.getTitle();
//		assertEquals(actualtitle, expectedtitile, "username is mismatch");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"_layoutdiv\"]/ul/li[11]/a")).click();
		Thread.sleep(500);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[11]/div/ul/li[1]/a/span/span/span"))
				.click();
		wd.findElement(By.id("FoodType")).click();
		Select s = new Select(wd.findElement(By.id("FoodType")));
		s.selectByValue("2");
		Thread.sleep(200);
		Select b = new Select(wd.findElement(By.xpath("//*[@id=\"FoodSubType\"]")));
		b.selectByVisibleText("tea");
		Select l = new Select(wd.findElement(By.xpath("//*[@id=\"MainCate\"]")));
		l.selectByValue("MNCTG03");
		Select d = new Select(wd.findElement(By.id("Category")));
		d.selectByValue("CTG07");
		Select e = new Select(wd.findElement(By.name("SubCategory")));
		e.selectByValue("SCTG07");
		wd.findElement(By.xpath("//*[@id=\"pluName\"]")).sendKeys("Mumbai ki Chai");
		wd.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys(
				"Mumbai Cutting Chai is the perfect blend of strong Indian spices & exotic touch of fennel. It is famous for anti-ageing & lowering cholesterol levels,");
		wd.findElement(By.id("PluCode")).sendKeys("121244");
		Select f = new Select(wd.findElement(By.id("Visibility")));
		f.selectByVisibleText("Hub");
		Select g = new Select(wd.findElement(By.id("Offertype")));
		g.selectByVisibleText("Launch Offer");
		Select h = new Select(wd.findElement(By.id("Supplier")));
		h.selectByVisibleText("Akshay Kadam");
		Select i = new Select(wd.findElement(By.id("BrandId")));
		i.selectByVisibleText("Soul & Soul");
		wd.findElement(By.xpath("//*[@id=\"imagecdnpath\"]")).sendKeys(
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQSnv_9KCppfRnKAS3_tS-GIu1JIsZZXuLSw&usqp=CAU");
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(200);
		wd.findElement(By.xpath("//*[@id=\"btnSubmitItem\"]")).click();
		Thread.sleep(4000);
		WebElement bodyy = wd.findElement(By.tagName("body"));
		bodyy.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		bodyy.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);

		wd.quit();
		System.out.println("Created New Item Test Successfully");

	}

	@Test(priority = 3)
	public void Open_Finance_Dashboard() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
//		String expectedtitile = "Login - Soul & Soul";
//		String actualtitle = wd.getTitle();
//		assertEquals(actualtitle, expectedtitile, "username is mismatch");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"_layoutdiv\"]/ul/li[1]/a")).click(); // dashboard click
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[1]/div/ul/li[1]/a/span/span/span")).click();
		Thread.sleep(1000);
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Successfully Open Finance Dashboard");
	}

	@Test(priority = 4)
	public void Open_Customer_Dashboard() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"_layoutdiv\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		wd.findElement(By.cssSelector(
				"li.m-menu__item--submenu:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2) > span:nth-child(1) > span:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Successfully Open Customer Dashboard");
	}

	@Test(priority = 5)
	public void Open_Item_Master_Summary() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[2]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[2]/div/ul/li[1]/a/span/span/span")).click();
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Open Item Master Summary open successfully");

	}

	@Test(priority = 6)
	public void Open_Sales_Report_Summary() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[2]")).click();
		Thread.sleep(500);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[2]/div/ul/li[2]/a/span/span/span")).click();
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Open Sales Report Summary open successfully");

	}

	@Test(priority = 7)
	public void Open_Pending_Orders() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[5]/a/span/span/span")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[2]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[3]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[4]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[5]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[6]"));
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[6]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[7]")).click();
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Pending Order Open Successfully");

	}

	@Test(priority = 8)
	public void Open_Item_Master() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"_layoutdiv\"]/ul/li[11]/a")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[11]/div/ul/li[2]/a/span/span/span"))
				.click();
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);
		wd.quit();
		System.out.println("Item Master Open successfully");
	}

	@Test(priority = 9)
	public void Open_Admin_Panel() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[12]")).click();
		Thread.sleep(500);
//	WebElement bodyy = wd.findElement(By.tagName("body"));
//	bodyy.sendKeys(Keys.PAGE_DOWN);
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(4000);
		wd.quit();
		System.out.println("Admin Panel Open successfully");
	}

	@Test(priority = 10)
	public void Open_Setting() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
//		String expectedtitile = "Login - Soul & Soul";
//		String actualtitle = wd.getTitle();
//		assertEquals(actualtitle, expectedtitile, "username is mismatch");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(500);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[13]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[1]")).click();
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[2]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[3]")).click();
		Thread.sleep(1000);
		WebElement bodyy = wd.findElement(By.tagName("body"));
		bodyy.sendKeys(Keys.PAGE_DOWN);
		bodyy.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		bodyy.sendKeys(Keys.PAGE_UP);
		bodyy.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[4]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[9]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[10]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[11]")).click();
		WebElement bodyyy = wd.findElement(By.tagName("body"));
		bodyyy.sendKeys(Keys.PAGE_DOWN);
		bodyyy.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		bodyyy.sendKeys(Keys.PAGE_UP);
		bodyyy.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		wd.quit();
		System.out.println("Setting Open Successfully");
	}

	@Test(priority = 12)
	public void Log_Out_User() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/div/div[2]/a[2]/i")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/header/div/div/div[2]/div[2]/div[2]/ul/li[2]/a/span[2]/span/i"))
				.click();
		Thread.sleep(1000);
		wd.findElement(By
				.xpath("/html/body/div[2]/header/div/div/div[2]/div[2]/div[2]/ul/li[2]/div/div/div[2]/div/ul/li[4]/a"))
				.click();
		Thread.sleep(2000);
		wd.quit();
		System.out.println("User Log Out Successfully");

	}

	@Test(priority = 11)
	public void Removed_Item_Successfully() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("http://snsadmin.cxengine.net/");
		wd.findElement(By.xpath("//*[@id=\"EmailId\"]")).sendKeys("UCME");
		wd.findElement(By.id("Password")).sendKeys("******");
		wd.findElement(By.xpath("//*[@id=\"formSubmit\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"choosebranchId\"]")).click();
		wd.findElement(By.xpath("//*[@id=\"m_aside_left_offcanvas_toggle\"]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/ul/li[12]")).click();
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[2]/a/div/div/div"))
				.click();
		wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div")).click();
		// wd.findElement(By.cssSelector("div.col-md-3:nth-child(6) > div:nth-child(1) >
		// div:nth-child(2) > button:nth-child(2) > div:nth-child(1) >
		// div:nth-child(1)")).click();
		Select f = new Select(wd.findElement(By.id("ItemStatus")));
		f.selectByValue("2");
		wd.findElement(By.id("btnFilterItem")).click();
		WebElement body = wd.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		WebElement SearchInput = wd.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/div[2]/div/div/div[3]/div/form/div/div/div/div/div/div[1]/div[2]/div/label/input"));
		Thread.sleep(500);
		SearchInput.sendKeys("Mumbai ki Chai", Keys.ENTER);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"tbdyItemDetail\"]/tr/td[5]/a/i")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[1]")).click();
		wd.quit();
		System.out.println("Item Removed Successfully");

	}
}
