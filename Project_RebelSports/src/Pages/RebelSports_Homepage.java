package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RebelSports_Homepage {
	
	
    WebDriver driver;
    public int TimeoutValue = 80;
    
    public int count = 0;
    
    public RebelSports_Homepage (WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }
	
    @FindBy(xpath="//*[@id=\"nav-link-yourAccount\"]/span[2]/span")
	WebElement amazon_account_link;
    
	@FindBy(xpath="//*[@id=\"sli_search_1\"]")
	WebElement RebelSports_searchfield;
	
	@FindBy(className="icon-search")
	WebElement RebelSports_searchbutton;

	@FindBy(xpath="//*[@id=\"nav-cart-count\"]")
	WebElement amazon_cart;
	
	@FindBy(xpath="//*[@id=\"nav-cart-count\"]")
	WebElement amazon_cart_total_count;

	/*******************************************************
	 * Method body of functionalities and test cases
	 */
	
	public void RebelSports_product(String product)
	
	{
	RebelSports_searchfield.sendKeys(product);
	RebelSports_searchbutton.click();
	
	}

	public void amazon_cart()
	{
		amazon_cart.click();
	}
	
	public void account_link()
	{
		Actions action = new Actions(driver);
		action.moveToElement(amazon_account_link).build().perform();
	}
	
	public String cart_count()
	{
		String cart_count = amazon_cart_total_count.getText();
		return cart_count;
	}
	
	
	}
	
	
	
	


