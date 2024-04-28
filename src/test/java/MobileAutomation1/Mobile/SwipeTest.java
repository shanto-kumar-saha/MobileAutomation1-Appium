package MobileAutomation1.Mobile;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeTest extends BaseTest{
	
	@Test
	public void SwipeTestDemo () throws MalformedURLException, InterruptedException{
		
		//Actual automation
		//Appium support locator Xpath, id, accessiblityID, classname, androidUIAutomator 
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		swipeAction(firstImage,"left");	
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

		
		
		
	}
	

}
