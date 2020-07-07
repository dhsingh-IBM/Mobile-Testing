package Newmoblile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Addproductocart {

	public static void main(String[] args) throws MalformedURLException 
	
	{

		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"abc");
     	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"in.amazon.mShop.android.shopping");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.amazon.windowshop.home.HomeLauncherActivity");
      	
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Skip sign in\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).sendKeys("Iphone 7");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"iphone 7s plus\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Apple iPhone 7 (32GB) - Gold\")")).click();
		
		
	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Add to Cart\")")).click();
	
	}
	}

