package com.Saurabh.AutomationProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	Properties prop;
	public static WebDriver driver;
	public void initializeBorwser() throws FileNotFoundException, IOException {
		
		prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\SAURABH\\SaurabhProject\\AutomationProject\\data.properties"));
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Browser Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SAURABH\\Browser Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\SAURABH\\Browser Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	

}
