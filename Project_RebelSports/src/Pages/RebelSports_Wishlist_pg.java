/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * @author ANUP
 *
 */
public class RebelSports_Wishlist_pg {
	
	 WebDriver driver;
	    public int TimeoutValue = 80;
	    
	    public int count = 0;
	    
	    public RebelSports_Wishlist_pg (WebDriver driver){

	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	    }
	
	
	
	@FindBy(xpath="//*[@id=\"add-to-wishlist-button-submit\"]")
	WebElement amazon_wishlist_button;
	
	@FindBy(xpath="//*[@id=\"WLHUC_viewlist\"]/span/span")
	WebElement amazon_viewwishlist_button;

	
	@FindBy(xpath="//*[@id=\"nav-flyout-yourAccount\"]/div[2]/a[3]/span")
	WebElement amazon_existingwishlist;
	
	@FindBy(xpath="//*[contains(text(),'Add to Cart')]")
	WebElement amazon_add_to_cart_fromwishlist;
	
 public void amazon_wishlist()
	
	{
		amazon_wishlist_button.click();
		amazon_viewwishlist_button.click();
	}

	
	public void amazon_fromwishlisttocart()
	{
	//	Actions action = new Actions(driver);
	//	action.moveToElement(amazon_account_link).build().perform();
		
		amazon_existingwishlist.click();
		amazon_add_to_cart_fromwishlist.click();
	//	amazon_cart.click();
		
	}
}
