/**
 * 
 */
package package_RebelSports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.RebelSports_Homepage;
import Pages.RebelSports_Login_pg;
import Pages.RebelSports_Logout_pg;
import Pages.RebelSports_ShoppingCart_pg;

/**
 * @author ANUP
 *
 */
@Test
public class RebelSports_TC13_AddProductMultipletimes {
	
	
	public void addProduct_Afterremoving()
	{
		int quantity = 5;
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		RebelSports_Login_pg login_page= PageFactory.initElements(driver,RebelSports_Login_pg.class);
		
		login_page.flipkart_login("anup.damoda@gmail.com","starwars1");
	    
	    RebelSports_Homepage home = PageFactory.initElements(driver, RebelSports_Homepage.class);
	    home.amazon_cart();
	    
	    RebelSports_ShoppingCart_pg Cart = PageFactory.initElements(driver, RebelSports_ShoppingCart_pg.class);
	    
	    
	    
	    
	    for (int i=0;i<quantity;i++)
	    {
	    home.flipkart_product("Jeans");
		Cart.amazon_add_product();
	    Cart.amazon_add_to_cart();
	    home.amazon_cart();
	    }
	    
	    
	    
	//    home.flipkart_product(product_name);
	    
	    RebelSports_Logout_pg amazonsite_signout =PageFactory.initElements(driver,RebelSports_Logout_pg.class);
		
		amazonsite_signout.amazon_accountlink();
		amazonsite_signout.amazon_signout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
		
		}
	}


