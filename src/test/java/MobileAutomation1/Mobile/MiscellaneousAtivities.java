package MobileAutomation1.Mobile;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAtivities extends BaseTest{
	
	@SuppressWarnings("deprecation")
	@Test
	public void MiscellaneousTest() throws MalformedURLException{
		
	

				//App Package & App Activity
				
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		
		//Actual automation
		//Appium support locator Xpath, id, accessiblityID, classname, androidUIAutomator 
		//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc= '3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		
		//Rotated the mobile screen to landscape
		
		DeviceRotation landScape = new DeviceRotation(0, 0, 90);
		driver.rotate(landScape);
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		
		//copy paste
		//copy to clipboard- paste it clipboard
				
		driver.setClipboardText("Shanto Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		
	
		
		
		
	}
	

}
