package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class AmazonHomePage {
	
	public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//a[@id='nav-link-accountList']")
	public WebElement signIn;
	
	
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
