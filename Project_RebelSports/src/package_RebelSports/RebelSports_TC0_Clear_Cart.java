package package_RebelSports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.RebelSports_Homepage;
import Pages.RebelSports_Login_pg;
import Pages.RebelSports_Logout_pg;
import Pages.RebelSports_ShoppingCart_pg;

public class RebelSports_TC0_Clear_Cart {
	
	@Test
	public void clear_cart()
	{
		//System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
	//	boolean remove_button_exists = true;
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		RebelSports_Login_pg login_page= PageFactory.initElements(driver,RebelSports_Login_pg.class);
		
		login_page.flipkart_login("anup.damoda@gmail.com","starwars1");
		
		
		RebelSports_Homepage home =PageFactory.initElements(driver,RebelSports_Homepage.class);
		home.amazon_cart();
		
		RebelSports_ShoppingCart_pg cart =PageFactory.initElements(driver,RebelSports_ShoppingCart_pg.class);
		
		cart.delete_cart_exists();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	
		
        RebelSports_Logout_pg amazonsite_signout =PageFactory.initElements(driver,RebelSports_Logout_pg.class);
		
        amazonsite_signout.amazon_accountlink();
		amazonsite_signout.amazon_signout();
		driver.quit();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.close();
	}
	

}
