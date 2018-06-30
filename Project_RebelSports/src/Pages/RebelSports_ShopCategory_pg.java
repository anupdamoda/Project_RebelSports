package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RebelSports_ShopCategory_pg {
	
	WebDriver driver;
    public int TimeoutValue = 80;
	public RebelSports_ShopCategory_pg (WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }
	
	
	
	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]/span[1]")
	WebElement amazon_shop_by_Category;
	
	@FindBy(linkText="Televisions")
	WebElement amazon_category_Televisions;
	
	@FindBy(linkText="Under ₹10,000")
	WebElement amazon_category_Televisions_price_Under_10000;
	
	@FindBy(linkText="₹10,000 - ₹20,000")
	WebElement amazon_category_Televisions_price_10000_20000;
	
	@FindBy(linkText="₹20,000 - ₹30,000")
	WebElement amazon_category_Televisions_price_20000_30000;
	
	@FindBy(linkText="₹30,000 - ₹50,000")
	WebElement amazon_category_Televisions_price_30000_50000;
	
	@FindBy(linkText="Over ₹50,000")
	WebElement amazon_category_Televisions_price_Over_50000;
	
	@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[7]/div/li[1]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_size_23;
	
	
	
	@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[7]/div/li[2]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_size_24to31;
	
	@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[7]/div/li[3]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_size_32to39;
	
	@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[7]/div/li[4]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_size_40to47;
	
	@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[7]/div/li[5]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_size_48to54;
	
	@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[7]/div/li[6]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_size_55;
	
	@FindBy(linkText="BPL")
	WebElement amazon_category_Televisions_brand_BPL;
	
	//@FindBy(xpath="//*[@id=\"leftNavContainer\"]/ul[11]/div/li[3]/span/span/div/label/span/span")
	WebElement amazon_category_Televisions_brand_Samsung;
	
	//@FindBy(linkText="Panasonic")
	WebElement amazon_category_Televisions_brand_Panasonic;
	
	
	
	public void amazon_shopbycategory_TV(String Price, String Size, String Brand)
	{
		
		
		amazon_shop_by_Category.click();
		amazon_category_Televisions.click();
		
	
		
		switch(Price) {
		   case "Under10000" :
			   amazon_category_Televisions_price_Under_10000.click();
		      break; // optional
		   
		   case "10000-20000" :
			   amazon_category_Televisions_price_10000_20000.click();
		      break; // optional
		      
		   case "20000-30000" :
			   amazon_category_Televisions_price_20000_30000.click();
		      break; // optional
		      
		   case "30000-50000" :
			   amazon_category_Televisions_price_30000_50000.click();
		      break; // optional
		      
		   case "Over50000" :
			   amazon_category_Televisions_price_Over_50000.click();
		      break; // optional
		   
		   // You can have any number of case statements.
		   default : // Optional
		      // Statements
		}
		
		
		switch(Size) {
		   case "23inch" :
			   amazon_category_Televisions_size_23.click();
		      break; // optional
		   
		   case "24to31" :
			   amazon_category_Televisions_size_24to31.click();
		      break; // optional
		      
		   case "32to39" :
			   amazon_category_Televisions_size_32to39.click();
		      break; // optional
		      
		   case "40to47" :
			   amazon_category_Televisions_size_40to47.click();
		      break; // optional
		      
		   case "48to54" :
			   amazon_category_Televisions_size_48to54.click();
		      break; // optional
		      
		   case "55andabove" :
			   amazon_category_Televisions_size_55.click();
		      break; // optional
		   
		   // You can have any number of case statements.
		   default : // Optional
		      // Statements
		}
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)", "");
		 
		WebDriverWait wait = new WebDriverWait(driver,30);
		amazon_category_Televisions_brand_Samsung = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'Samsung')]")));
		
		    switch(Brand) {
		   case "BPL" :
			   amazon_category_Televisions_brand_BPL.click();
		      break; // optional
		   
		   case "Samsung" :
			   amazon_category_Televisions_brand_Samsung.click();
		      break; // optional
		      
		   case "Panasonic" :
			   amazon_category_Televisions_brand_Panasonic.click();
		      break; // optional
		     
		   
		   // You can have any number of case statements.
		   default : // Optional
		      // Statements
		}
	}

}
