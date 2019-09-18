package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
public static void main(String[] args) throws InterruptedException {
	AppiumDriver<MobileElement> driver = null;
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Galaxy S5");
	caps.setCapability("udid", "42e79be8"); //Give Device ID of your mobile phone
	caps.setCapability("platformName", "Android");
	caps.setCapability("platformVersion", "6.0.1"); //Give Device ID of your mobile phone
	caps.setCapability("appPackage", "com.android.vending");
	//caps.setCapability("appActivity", "md56770dc9572d12226a6bc48c4abd41ebe.SplashActivity");
	caps.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");	
	caps.setCapability("noReset", "true");
	caps.setCapability("autoGrantPermissions","true");		

	//Instantiate Appium Driver
			try {
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}		
	//Added 5 seconds wait so that the app loads completely before starting with element identification	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			driver.findElementByClassName("android.widget.TextView").click();
			TimeUnit.SECONDS.sleep(10);
			
			System.out.print("wwwwwwwww");	
			
			//List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.EditText"));
			//MobileElement el = driver.findElement(By.xpath("//*[@class='android.view.View']"));
			//MobileElement el2 = driver.findElement(By.xpath("//*[@id='btnLogin']"));
			MobileElement el2 = driver.findElementById("btnLogin");
			
			String s1 = el2.getText();
			String s2 = el2.getAttribute("value");
			
			//String s1 = el.getAttribute("text");
			//String s2 = el2.getAttribute("text");
			
			
//			if(el == null || el.getAttribute("text").equals("Login")) {
//				System.out.print("Inside If");
//		    MobileElement UserName= driver.findElementById("username");
//			UserName.clear();
//			UserName.sendKeys("Test.user2");
//			MobileElement PassWord= driver.findElementById("password");
//			PassWord.clear();
//			PassWord.sendKeys("embla123");
//			MobileElement BtnLogin= driver.findElementById("btnLogin");
//			BtnLogin.click();
//			TimeUnit.SECONDS.sleep(30);
//			MobileElement Context1=driver.findElementByClassName("android.widget.TextView");
//			Context1.click(); 
//			}
//			else {
//				System.out.print("Inside else");
//			}
				
}
}

