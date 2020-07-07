package Newmoblile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Createonemobile {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
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
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
			driver.findElement(MobileBy.AccessibilityId("Continue with Facebook")).click();
			
			System.out.println(driver.getContextHandles());
			//driver.context(driver.getContextHandles.toArray()[1].toString());
			//driver.context("NATIVE_APP");
		//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//System.out.println(driver.getContext());
			Thread.sleep(5000);
		//	driver.findElement(MobileBy.xpath("//*[@id='m_login_email']")).sendKeys("pullachandana420@gmail.com");
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_email\")")).sendKeys("pullachandana420@gmail.com");
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_password\")")).sendKeys("tcs@123TCS");
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Log In\")")).click();
			

	}

}
