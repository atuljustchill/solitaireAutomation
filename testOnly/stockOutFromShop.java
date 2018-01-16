package testOnly;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class stockOutFromShop {
	  private WebDriver driver;
	@BeforeClass
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\atul_personal\\JAVA\\files\\new_chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	  } 
	@Test
	public void login() {
		driver.get("http://127.0.0.1/solitaire/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);// he lagte ka dar veles
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("btnlogin")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test()
		public void testGetStockIn() throws Exception {
		 driver.get("http://127.0.0.1/solitaire/StockInward/Index?docId=19");
		    //driver.findElement(By.id("to_location")).click();
		    new Select(driver.findElement(By.id("to_location"))).selectByVisibleText("Sales Counter");
		    driver.findElement(By.id("InsertNewIteamSoiF7")).click();
		    driver.findElement(By.id("ib_barcode")).sendKeys(Keys.TAB);
		    driver.findElement(By.xpath("//div[@id='divib_item_name']/div/div/div/div/ul/li[4]")).click();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		    driver.findElement(By.id("ib_item_cat_name")).click();
		    new Select(driver.findElement(By.id("ib_item_cat_name"))).selectByVisibleText("BANGLES");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.id("ib_purity_id")).click();
		    new Select(driver.findElement(By.id("ib_purity_id"))).selectByVisibleText("23CT");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.id("ib_pcs")).clear();
		    driver.findElement(By.id("ib_pcs")).sendKeys("14");
		    driver.findElement(By.id("ib_gross_wt")).clear();
		    driver.findElement(By.id("ib_gross_wt")).sendKeys("150");
		    driver.findElement(By.id("ib_submit")).click();
		    driver.findElement(By.xpath("(//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']"
		    		+ "/div[@class='ui-dialog-buttonset']/button[2])")).click();

		   // driver.findElement(By.xpath("(/html/body/div[16]/div[3]/div/button[2])")).click();
		    driver.findElement(By.id("narration")).clear();
		    driver.findElement(By.id("narration")).sendKeys("test");
		    driver.findElement(By.id("btnsubmit")).click();
		    driver.findElement(By.xpath("(//div[16]/div[3]/div/button[1])")).click();
		    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    //driver.findElement(By.xpath("(/html/body/div[14]/div[11]/div/button)")).click();
		   // driver.findElement(By.id("NewDocument")).click();
		    
		    driver.findElement(By.xpath("//div[16]/div[3]/div/button")).click();

		    //driver.findElement(By.xpath("/html/body/div[16]/div[11]/div/button")).click();
 
		  }
@Test
	public void testMakeStockOut() throws Exception {
	    driver.get("http://127.0.0.1/solitaire/StockOutward/Index?docId=20");
	    //driver.findElement(By.id("from_location")).click();
	    new Select(driver.findElement(By.id("from_location"))).selectByVisibleText("Sales Counter");
	    driver.findElement(By.id("from_location")).click();
	    driver.findElement(By.id("InsertNewIteamSowF7")).click();
	    driver.findElement(By.id("ib_barcode")).sendKeys(Keys.TAB,Keys.TAB);;
//	    //driver.findElement(By.id("ib_item_name")).click();
//	    new Select(driver.findElement(By.id("ib_item_name"))).selectByVisibleText("CHAIN");
	    driver.findElement(By.xpath("(//*[@id='divib_item_name']/div[@class='col-lg-6  col-md-6 col-sm-6 col-xs-6 notranslate']"
	    		+ "/div[@class='custom-select custom-select-open']/div/div/ul/li[4])")).click();
	    driver.findElement(By.id("ib_item_cat_name")).click();
	    new Select(driver.findElement(By.id("ib_item_cat_name"))).selectByVisibleText("BANGLES");
	    driver.findElement(By.id("ib_purity_id")).click();
	    new Select(driver.findElement(By.id("ib_purity_id"))).selectByVisibleText("23CT");
	    driver.findElement(By.id("ib_pcs")).click();
	    driver.findElement(By.id("ib_pcs")).clear();
	    driver.findElement(By.id("ib_pcs")).sendKeys("1");
	    driver.findElement(By.id("ib_gross_wt")).clear();
	    driver.findElement(By.id("ib_gross_wt")).sendKeys("12");
	    driver.findElement(By.id("ib_submit")).click();
	    driver.findElement(By.xpath("//div/button[@id='btnSave']/i")).click();
	    driver.findElement(By.xpath("(//div[class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable']"
	    		+ "/div[class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div[class='ui-dialog-buttonset']/button[1])")).click();
	    //driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
	    driver.findElement(By.xpath("(//div[class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable']"
	    		+ "/div[class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div[class='ui-dialog-buttonset']/button)")).click();
	    
	   // driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	  }


 
	@AfterClass
	public void tearDown() throws Exception {
	driver.quit();
//	    String verificationErrorString = verificationErrors.toString();
//	    if (!"".equals(verificationErrorString)) {
//	      fail(verificationErrorString);
	//    }
	  }

}
