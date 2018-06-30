package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class RebelSports_ShoppingCart_pg {
	
	
	 WebDriver driver;
	    public int TimeoutValue = 80;
	    
	    public int count = 0;
	    
	    public RebelSports_ShoppingCart_pg (WebDriver driver){

	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	    }
	
	@FindBy(xpath="//*[contains(@name,'delete')]")
	static
	WebElement amazon_deleteproduct;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
	WebElement amazon_addproduct;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement amazon_addtocart;
	
	@FindBy(xpath="//*[@id=\"quantity\"]")
	WebElement amazon_quantity;
	
	@FindBy(xpath="//*[@id=\"productTitle\"]")
	WebElement amazon_product_title;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	WebElement amazon_productname_addproduct;
	
	@FindBy(xpath="//*[@id=\"product-list-view\"]/div[2]/div[2]/div[3]/div/div/div[1]/a/div/div[2]/div[1]")
	WebElement amazon_productname_firstproduct_search;
	
	@FindBy(xpath="//*[@id=\"product-list-view\"]/div[2]/div[2]/div[3]/div/div/div[1]/a/div/div[2]/div[2]/div[2]/div/div/span[3]/span[2]/span")
	WebElement amazon_productname_firstprice_search;
	
	@FindBy(xpath="//*[@id=\"activeCartViewForm\"]/div[2]/div[1]/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
	WebElement amazon_productname_firstproduct_cart;
	
	
	@FindBy(xpath="//*[@id=\"activeCartViewForm\"]/div[2]/div[1]/div[4]/div[2]/div[2]/p[1]/span/span")
	WebElement amazon_productname_firstprice_cart;
	
	/*******************************************************
	 * Method body of functionalities and test cases
	 */

	
	public void remove_cart()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    amazon_deleteproduct.click();
	}
	
	
	public String first_product_name()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    return amazon_addproduct.getText();
	}

	
	public void delete_cart_exists()
	{		
	
		while (amazon_deleteproduct.isEnabled()) {
		amazon_deleteproduct.click();
	
		} 
	
	}
	
	public void amazon_add_product()
	{
		amazon_addproduct.click();
	}
	
	public void amazon_add_to_cart()
	{
		amazon_addtocart.click();
	}
	
	public void amazon_quantity(int quantity)
	{
		Select oSelect = new Select(amazon_quantity);
		oSelect.selectByIndex(quantity-1);
	}
	
	String product_name;
	public String amazon_product_name()
	{
		
		product_name = amazon_product_title.getText();
		return product_name;
	}
	
	
	public void amazon_add_specific_product_name()
	{
		amazon_productname_addproduct.click();
	}
	
	public String amazon_getproductname_search()
	{
		return amazon_productname_firstproduct_search.getText();
	}
	
	
	public String amazon_getproductprice_search()
	{
		return amazon_productname_firstprice_search.getText();
	}
	
	
	public String amazon_getproductname_cart()
	{
		return amazon_productname_firstproduct_cart.getText();
	}
	
	public String amazon_getprice_cart()
	{
		return amazon_productname_firstprice_cart.getText();
	}
	
	
	
	/*
	@FindBy(xpath="//*[contains(@aria-label,'"+ product_name +"')]")
	WebElement amazon_product_delete;
	
	public void delete_added_product()
	{
		ama
	}
	}
	*/
	}


