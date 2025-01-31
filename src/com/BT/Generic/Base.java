package com.BT.Generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.BT.Pom.JoinPom;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base {

	public static int time500=500;
	public static int time1000=1000;
	public AndroidDriver driver;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	//public static AppiumDriver driver;
	
public String Url="http://127.0.0.1:4723/";

@BeforeTest
public void test() throws MalformedURLException, InterruptedException {

	   UiAutomator2Options capabilities=new UiAutomator2Options();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2"); 
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sambit");
        capabilities.setCapability(MobileCapabilityType.APP,"D:\\Mobile\\src\\source\\app.apk");
       // capabilities.setCapability("noReset", true); 
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
      
}
}
