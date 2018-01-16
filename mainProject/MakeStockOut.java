package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeStockOut {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMakeStockOut() throws Exception {
    driver.get("http://127.0.0.1/solitaire/StockOutward/Index?docId=20");
    driver.findElement(By.id("from_location")).click();
    new Select(driver.findElement(By.id("from_location"))).selectByVisibleText("Sales Counter");
    driver.findElement(By.id("from_location")).click();
    driver.findElement(By.id("InsertNewIteamSowF7")).click();
    new Select(driver.findElement(By.id("ib_item_name"))).selectByVisibleText("BANGLES");
    new Select(driver.findElement(By.id("ib_item_cat_name"))).selectByVisibleText("BANGLES");
    driver.findElement(By.id("ib_purity_id")).click();
    new Select(driver.findElement(By.id("ib_purity_id"))).selectByVisibleText("23CT");
    driver.findElement(By.id("ib_purity_id")).click();
    driver.findElement(By.id("ib_pcs")).click();
    driver.findElement(By.id("ib_pcs")).clear();
    driver.findElement(By.id("ib_pcs")).sendKeys("1");
    driver.findElement(By.id("ib_gross_wt")).clear();
    driver.findElement(By.id("ib_gross_wt")).sendKeys("12");
    driver.findElement(By.id("ib_submit")).click();
    driver.findElement(By.xpath("//button[@id='btnSave']/i")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
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
