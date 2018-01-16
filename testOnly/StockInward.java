package testOnly;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
import org.openqa.selenium.support.ui.Select;


public class StockInward {
	private WebDriver driver;
	private WebElement element;
	private String baseUrl;
	@BeforeClass
	public void setUp() {
	driver=new ChromeDriver();
	baseUrl="http://127.0.0.1/solitaire/StockInward/Index?docId=19";
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	  }
	@Test
  public void submitStockInward() {
		driver.get(baseUrl);
		//driver.findElement(By.xpath("//div[@id='frmStockInwardDetail']/div/div/div/label")).click();
		driver.findElement(By.id("to_location")).click();
	    new Select(driver.findElement(By.id("to_location"))).selectByValue("Sales Counter");
	    driver.findElement(By.id("to_location")).click();
	    driver.findElement(By.id("InsertNewIteamSoiF7")).click();
	    driver.findElement(By.xpath("//div[@id='divib_item_name']/div/div/div/div/ul/li[3]")).click();
	    driver.findElement(By.id("ib_item_cat_name")).click();
	    new Select(driver.findElement(By.id("ib_purity_id"))).selectByValue("22CT");
	    driver.findElement(By.id("ib_pcs")).click();
	    driver.findElement(By.id("ib_pcs")).clear();
	    driver.findElement(By.id("ib_pcs")).sendKeys("2");
	    driver.findElement(By.id("ib_gross_wt")).click();
	    driver.findElement(By.id("ib_gross_wt")).clear();
	    driver.findElement(By.id("ib_gross_wt")).sendKeys("12");

	  //*[@id="to_location"]
  }
  

  @AfterClass
  public void afterClass() {
  }

}
