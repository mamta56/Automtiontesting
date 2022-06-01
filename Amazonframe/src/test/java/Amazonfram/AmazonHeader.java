package Amazonfram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPakage.Amazonhead;
import pomPakage.Signin;

public class AmazonHeader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//	Thread.sleep(3000);

			driver.get("https://www.amazon.com/");
			Signin  signin = new Signin(driver);
			signin.clickonsignin();
			signin.sendEmail();
			signin.clickContinue();
			signin.sendUserPass();
			signin.clickontext();
			Amazonhead amazonhead = new Amazonhead(driver);
			Thread.sleep(2000);
			
			amazonhead.clickongiftcrds();
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
			
			driver.close();
	}
	

}
