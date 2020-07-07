package Newmoblile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Shopbycatogeory {

	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"abc");
     	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
     	cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
     	cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\ChandanaPulla\\Downloads\\chromedriver_win32\\chromedriver.exe");
    //	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"in.amazon.mShop.android.shopping");
	//	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.amazon.windowshop.home.HomeLauncherActivity");

		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sbdCategory2\"]/div[1]/div[3]/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sbdCategory2\"]/div[2]/div/div[1]/a/div/div/div[2]")).click();
		
	
		
	}

}
