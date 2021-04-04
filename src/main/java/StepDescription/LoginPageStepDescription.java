package StepDescription;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Saurabh.AutomationProject.Base;

import PageObjects.AamzonSignPage;
import PageObjects.AmazonHomePage;
import TestRunner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageStepDescription extends Base{
	
	
	
	AamzonSignPage signPage=new AamzonSignPage(driver);
	AmazonHomePage homeObj=new AmazonHomePage(driver);	
	
	
	
	@Given("user naviagtes to {string}")
	public void user_naviagtes_to(String url) throws FileNotFoundException, IOException {
	    
			//initializeBorwser();
		
		
			driver.get(url);
	    
	}
	@Then("user clicks on sign button")
	public void user_clicks_on_sign_button() {
	    
	    homeObj.signIn.click();
	}
	@Then("user enters {string} as username")
	public void user_enters_as_username(String uName) {
	    signPage.userName.clear();
	    signPage.userName.sendKeys(uName);
	}
	@Then("user click on continue button")
	public void user_click_on_continue_button() {
	    signPage.continueBtn.click();
	}
	
	@Then("user enters {string} as password")
	public void user_enters_as_password(String pwd) {
	    
	    signPage.password.sendKeys(pwd);
	}
	
	@Then("user click on signIn button")
	public void user_click_on_signIn_button() {
	    signPage.submitBtn.click();
	}
	
	@Then("user validates error message.")
	public void user_validates_error_message() {
		String s=signPage.errorMessage.getText().split("\\n")[1];
	    Assert.assertEquals(s, "We cannot find an account with that email address");
	}

}
