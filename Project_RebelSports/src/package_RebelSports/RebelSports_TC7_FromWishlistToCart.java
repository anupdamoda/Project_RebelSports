package package_RebelSports;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.RebelSports_Homepage;
import Pages.RebelSports_Login_pg;
import Pages.RebelSports_Logout_pg;
import Pages.RebelSports_Wishlist_pg;

public class RebelSports_TC7_FromWishlistToCart {
	
	@Test
	
	public void fromwishlist_tocart()
	{
	
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	RebelSports_Login_pg login_page= PageFactory.initElements(driver,RebelSports_Login_pg.class);
	
	login_page.flipkart_login("anup.damoda@gmail.com","starwars1");
	
	
    RebelSports_Homepage Click_cart =PageFactory.initElements(driver,RebelSports_Homepage.class);
	
    
    Click_cart.amazon_cart();
    
    
    Click_cart.account_link();
    
    RebelSports_Wishlist_pg wishlist =PageFactory.initElements(driver,RebelSports_Wishlist_pg.class);
    wishlist.amazon_fromwishlisttocart();
	
	RebelSports_Logout_pg amazonsite_signout =PageFactory.initElements(driver,RebelSports_Logout_pg.class);
	
	amazonsite_signout.amazon_accountlink();
	amazonsite_signout.amazon_signout();
	
	driver.close();
	driver.quit();
	
	}

}
