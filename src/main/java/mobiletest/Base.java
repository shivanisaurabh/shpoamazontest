package mobiletest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
	
		
		AppiumDriver<MobileElement> driver;
		  


		@BeforeTest
		public void setup() {
			
			try {
				
				
				DesiredCapabilities caps = new DesiredCapabilities();
				
			
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
				 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
				 caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G(5s)Plus");
				 caps.setCapability(MobileCapabilityType.UDID, "ZY322CD3LZ");
				 caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

						 
						 URL url = new URL("http://127.0.0.1:4723/wd/hub");
						 driver = new AppiumDriver<MobileElement>(url, caps); 
						 //driver = new AndroidDriver<MobileElement>(url, caps);
						 //driver = new IOSDriver<MobileElement>(url,caps);
			 
		}catch(Exception exp) {
			System.out.println("cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
			
		}
			
		}
		@Test
		public void sampleTest() {
			System.out.println("I am inside sample Test");
		}
		
	    @AfterTest
	    public void teardown() {
	    	
	    	driver.close();
	    	driver.quit();
	    	 
	    	
	    	
	    	
	    }





	}



