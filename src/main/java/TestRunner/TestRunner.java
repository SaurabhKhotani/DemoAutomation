package TestRunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Saurabh.AutomationProject.Base;

import PageObjects.AamzonSignPage;
import PageObjects.AmazonHomePage;
import StepDescription.LoginPageStepDescription;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\main\\java\\features", glue="StepDescription")
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	 @BeforeClass 
	 public void openBrowser() throws FileNotFoundException, IOException 
	 { 
		 Base b=new Base(); 
		 b.initializeBorwser(); 
		 
		
	 }
	 
	 
	 
	 @AfterClass
	 public void tearDown() {
		Base.driver.quit();
	 }
	 
	
}
