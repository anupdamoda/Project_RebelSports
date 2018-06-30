package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RebelSports_Orders_pg {
	
	WebDriver driver;
    public int TimeoutValue = 80;
    
    public int count = 0;
    
    public RebelSports_Orders_pg (WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }
	
	@FindBy(xpath="//*[@id=\"nav_prefetch_yourorders\"]/span")
	WebElement amazon_your_Orders;
	
	
	@FindBy(xpath="//*[@id=\"a-autoid-1-announce\"]/span")
	WebElement amazon_timespan;
	
	@FindBy(xpath="//*[@id=\"orderFilter_6\"]")
	WebElement amazon_year_2014;
	
	
	@FindBy(xpath="//*[contains(@href,'o01')]")
	WebElement amazon_Orderdetails_link;

	@FindBy(xpath="//*[@id=\"orderDetails\"]/div[3]/div[1]/div/span[2]")
	WebElement amazon_Ordernumber;
	
	@FindBy(xpath="//*[@id=\"orderDetails\"]/div[3]/div[1]/div/span[1]")
	WebElement amazon_Orderdate;
	
	@FindBy(xpath="//*[@id=\"od-subtotals\"]/div[6]/div[2]/span/span")
	WebElement amazon_grandtotal;
	
	
public void amazon_retriveorders ()
	
	{
		
		amazon_your_Orders.click();
		amazon_timespan.click();
		amazon_year_2014.click();
		amazon_Orderdetails_link.click();
		amazon_Ordernumber.getText();
		amazon_Orderdate.getText();
		amazon_grandtotal.getText();
	}

}
