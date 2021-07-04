package com.test.gitjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest {
WebDriver driver = null;

@org.testng.annotations.Test(dataProvider = "getData")
public void Test(String browser) throws InterruptedException {
	if (browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	} else {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	driver.get("http://google.com");
	Thread.sleep(2000);
	System.out.println(Thread.currentThread().getName());
}
@DataProvider
public Object[][] getData() {
	
	Object[][] data=new Object[2][1];
	
	data[0][0]="Chrome";
	data[1][0]="Firefox";
	return data;
	
}

}
