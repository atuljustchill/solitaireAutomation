package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetStockIn {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    //baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGetStockIn() throws Exception {
    driver.get("http://127.0.0.1/solitaire/StockInward/Index?docId=19");
    driver.findElement(By.id("to_location")).click();
    new Select(driver.findElement(By.id("to_location"))).selectByVisibleText("Sales Counter");
    driver.findElement(By.id("InsertNewIteamSoiF7")).click();
    new Select(driver.findElement(By.name("ib_item_name"))).selectByVisibleText("CHAIN");
    driver.findElement(By.id("ib_purity_id")).click();
    new Select(driver.findElement(By.id("ib_purity_id"))).selectByVisibleText("23CT");
    driver.findElement(By.id("ib_pcs")).clear();
    driver.findElement(By.id("ib_pcs")).sendKeys("14");
    driver.findElement(By.id("ib_gross_wt")).clear();
    driver.findElement(By.id("ib_gross_wt")).sendKeys("150");
    driver.findElement(By.id("ib_submit")).click();
    driver.findElement(By.xpath("(/html/body/div[16]/div[3]/div/button[2])")).click();
    driver.findElement(By.id("narration")).clear();
    driver.findElement(By.id("narration")).sendKeys("test");
    driver.findElement(By.id("btnsubmit")).click();
    driver.findElement(By.xpath("(/html/body/div[16]/div[3]/div/button[1])")).click();
    driver.findElement(By.xpath("(/html/body/div[14]/div[11]/div/button)")).click();
    driver.findElement(By.id("NewDocument")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
