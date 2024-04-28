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

public class ScrollTest extends BaseTest{
	
	@Test
	public void ScrollTestDemo () throws MalformedURLException, InterruptedException{
		
	//configure the appium according to base class
		
		
		//Actual automation
		//Appium support locator Xpath, id, accessiblityID, classname, androidUIAutomator 
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		Thread.sleep(2000);
		
		
	}
	

}
