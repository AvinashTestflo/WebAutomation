package com.demo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.demo.utils.CommonMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass{
	public static WebDriver driver;
	public static Properties prop;
	public String browserName;
	public String platformName;
	public String URL;
	

	public BaseClass() {

		try {
			prop = new Properties();
			System.out.println("Working Directory = " + System.getProperty("user.dir"));
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir")+"/src/test/resources/properties/Configuration.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}
	
	public WebDriver driverInitialization() throws MalformedURLException {
		
		browserName=prop.getProperty("Chrome");
		platformName=prop.getProperty("platformName");
		URL=prop.getProperty("prodUrl");
		
		if(platformName.equalsIgnoreCase("Web")) {
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		else {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Pixel 7 API 34");
			cap.setCapability("app", "C:/Users/avina/eclipse-workspace/Mobile_And_Web_Automation/apk_files/Never.apk");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "14.0");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		}
		
		return driver;
		
	}

}
