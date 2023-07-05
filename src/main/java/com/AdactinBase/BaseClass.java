package com.AdactinBase;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	protected static WebDriver driver;
	public static void getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
			driver=new EdgeDriver();
		}
	}
	public static void launchUrl(String Url) {
		driver.manage().window().maximize();
		driver.get(Url);
	}
	public static void clickonElement(WebElement element) {
		element.click();
	}
	public static void clearTheElement(WebElement element) {

	}
	public static void inputToElement(WebElement element,String value) {
		element.sendKeys(value);
	}

	public static void screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\AdactinMaven\\Screenshots\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	public static void select(WebElement element,String text) {
		Select st = new Select(element);
		st.selectByVisibleText(text);
	}
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void explicitWait(int sec,String condition,WebElement element) {
		WebDriverWait  wait = new WebDriverWait(driver,sec);
		if (condition.equalsIgnoreCase("visibility")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}  else if((condition.equalsIgnoreCase("clickable"))){
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}
	public static void screenshotWithCurrenttime() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String filename = d.toString().replace(":","-").replace(",", "-")+".png";
		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\AdactinMaven\\Screenshots\\"+filename+".png");
		FileHandler.copy(src, dest);
	}
}
