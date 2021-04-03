package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonItemPage {

public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="(//span[contains(text(),'My First Complete Learning Library')])[1]")
	public WebElement item1;
	
	@FindBy(how=How.XPATH,using="//img[contains(@alt,'Cherokee by Unlimited Boy')]")
	public WebElement item2;
	
	
	@FindBy(how=How.ID,using="quantity")
	public WebElement itemQuantity;
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	public WebElement addToCartItemBtn;
	
	
	public AmazonItemPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
