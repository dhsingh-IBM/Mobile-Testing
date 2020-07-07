package Newmoblile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobiletesting {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"abc");
     	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"in.amazon.mShop.android.shopping");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.amazon.windowshop.home.HomeLauncherActivity");
      	
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Already a customer? Sign in\")")).click();
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"Create account. New to Amazon?\"]/android.view.View[1]\r\n")).click(); 
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_customer_name\")")).sendKeys("Pulla handana");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_phone_number\")")).sendKeys("8639773756");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_email\")")).sendKeys("pullacha420@gmail.com");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_password\")")).sendKeys("tc@TCS");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Verify mobile number\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Mobile number already in use\")")).isDisplayed();
		System.out.println("test case was completed");
		
		
		
		
		
	

	}

}