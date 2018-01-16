package mainProject;


import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {
public WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","E:\\atul_personal\\JAVA\\files\\new_chrome_driver\\chromedriver.exe");
				
	}
	
	@Test
	public void login() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/solitaire/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("btnlogin")).click();// now talking un-read email form inbox into a list
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.close();
		driver.findElement(By.XPath("//*[@id="main-meun1"]/text()")
	}
	
//	@After
//	
//	public void tearDown() throws Exception{
//		
//		//close the browser
//		driver.quit();
//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	
//	
//
}
