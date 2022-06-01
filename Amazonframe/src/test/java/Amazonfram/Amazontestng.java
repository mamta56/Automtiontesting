package Amazonfram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPakage.Amazonhead;
import pomPakage.Signin;

public class Amazontestng {

 WebDriver driver;
 Amazonhead amazonhead ;

	@BeforeClass
	public void launchingbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Downloads\\\\chromedriver.exe");
		driver = new ChromeDriver();
		//	Thread.sleep(3000);

		
		
	}
	@BeforeMethod
	public void login ()
	{

		driver.get("https://www.amazon.com/");

		Signin  signin = new Signin(driver);
		signin.clickonsignin();
		signin.sendEmail();
		signin.clickContinue();
		signin.sendUserPass();
		signin.clickontext();
		 amazonhead = new Amazonhead(driver);
	

	
	
	}
	
	@Test
	public void verifyregistry()
	{
		
		amazonhead.clickonregistry();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		if(url.equals("https://www.amazon.com/registries?ref_=nav_cs_registry")&& title.equals("Amazon Registry & Gifting"))
				{
			System.out.println("pass");
				}
		else 
		{
			System.out.println("fail");
		}
		
	}
	@Test
	public void verifygiftcards()
	{
		amazonhead.clickongiftcrds();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		//Soft assert
		SoftAssert s = new SoftAssert();
		s.assertEquals(url,"https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc");
		s.assertEquals(title,"Amazon.com Gift Cards");
		s.assertAll();
	/*	Assert.assertEquals(title,"Amazon.com Gift Cards");
		
		Assert.assertEquals(title,"Amazon.com Gift Cards");
		
	/*	if(url.equals("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc")&& title.equals("Amazon.com Gift Cards"))
				{
			System.out.println("pass");
				}
		else 
		{
			System.out.println("fail");
		}*/
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logoutafterclick"); //logoutclick
	}
    @AfterClass
    public void afterclass()
    {
    driver.close();
    }
    
	}





