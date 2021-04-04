package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AamzonSignPage {
	
	public WebDriver driver;
	
	@FindBy(how=How.ID,using="ap_email")
	public WebElement userName;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement password;
	
	@FindBy(how=How.ID,using="signInSubmit")
	public WebElement submitBtn;
	
	@FindBy(how=How.CLASS_NAME,using="a-button-input")
	public WebElement continueBtn;
	
	@FindBy(how=How.ID,using="auth-error-message-box")
	public WebElement errorMessage;
	
	@FindBy(how=How.CSS,using="div[class='a-alert-content']")
	public WebElement pwdErrorMessage;
	
	public AamzonSignPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
