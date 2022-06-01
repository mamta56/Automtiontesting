package pomPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

	@FindBy (xpath = "//span[@id='nav-link-accountList-nav-line-1']") //span[@id='nav-link-accountList-nav-line-1']
	private WebElement signin ;
	
	@FindBy (xpath = "//input[@maxlength='128']")
	private WebElement emailorphone ;
	
	@FindBy (xpath = "//input[@tabindex=\"5\"]")
	private WebElement continuee ;
	
	@FindBy (xpath = "//input[@maxlength=\"1024\"]")//i[@role='img']
	private WebElement password ;
	
	@FindBy (xpath = "//i[@role='img']")
	private WebElement amazon ;
	
	
	public Signin(WebDriver driver)             //to call below methods are nonstatic so we have created object as it created webelements get declared nd as constructor got declared webelements get initialized 
	{
		PageFactory.initElements( driver, this);  //then method will call
	}
	
	public void clickonsignin() {
		signin.click();
		
	}
	
   public void sendEmail() {
	emailorphone.sendKeys("8766897811");
		
	}
   public void clickContinue() {
	continuee.click();
	
}
   public void sendUserPass() {
	password.sendKeys("mamta@89");
}
   public void clickontext() {
		amazon.click();
	}
	
}
