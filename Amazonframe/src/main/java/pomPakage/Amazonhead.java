package pomPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonhead {

	@FindBy (xpath = "(//a[@class='nav-a  '])[1]")
	private WebElement todaysdeals ;
	
	@FindBy (xpath = "//a[text()='Customer Service']")
	private WebElement service ;
	
	@FindBy (xpath = "//a[text()='Registry']")
	private WebElement registry ;
	
	@FindBy (xpath = "//a[text()='Gift Cards']")//i[@role='img']
	private WebElement giftcrds ;
	
	
	
	public Amazonhead(WebDriver driver)             //to call below methods are nonstatic so we have created object as it created webelements get declared nd as constructor got declared webelements get initialized 
	{
		PageFactory.initElements( driver, this);  //then method will call
	}
	
	public void clickondeals() {
		todaysdeals.click();
		
	}
	
   public void clickonservice() {
	service.click();
		
	}
   public void clickonregistry() {
	registry.click();
	
}
   public void clickongiftcrds() {
	giftcrds.click();
}
}
