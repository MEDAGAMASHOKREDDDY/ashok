package org.ashokreddy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends BaseTest
{

	@Test
	public void FillForm() throws InterruptedException
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ashok Reddy");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@test=\"Female\"]")).click();
		driver.findElement(By.id("android.id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@test=\"Argentina\"]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
