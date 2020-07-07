package Newmoblile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Webtesting {

	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"abc");
	//	cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		//cap.setCapability(MobileCapabilityType.NO_RESET,true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
      	//	cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\ChandanaPulla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("https://google.com/");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		driver.findElement(MobileBy.AccessibilityId("Search")).sendKeys("Math");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Doodling in math: Stars\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Doodling in math: Stars\")"));
		TouchActions act =new TouchActions(driver);
		Dimension d=driver.manage().window().getSize();
	    int width=d.width;
		int height=d.height;
		int x1=width/2;
		int y1=4*height/5;driver.hideKeyboard();
	
	    int x2=width/2;
		int y2=height/5;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//act.press(PointOption.point(x1,y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(x2,y2)).release().perform();
	while(driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text(\"Math patterns: table\")")).size()==0);
	{
	    driver.executeScript("mobile:shell",ImmutableMap.of("command","input swipe "+x1+" "+y1+" "+x2+" "+y2));
	}
	    driver.openNotifications();
	    driver.findElement(MobileBy.AccessibilityId("Airplane mode")).click();
	    driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Gmail\")"));
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
	    
	}
	
	
		}

	
	

