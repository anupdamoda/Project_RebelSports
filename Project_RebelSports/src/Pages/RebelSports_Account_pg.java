/**
 * 
 */
package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * @author ANUP
 *
 */
public class RebelSports_Account_pg {
	
	
	WebDriver driver;
    public int TimeoutValue = 80;
	public RebelSports_Account_pg (WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }
	
	@FindBy(xpath="//*[@id=\"nav-flyout-yourAccount\"]/div[2]/a[1]/span")
	WebElement amazon_your_Account;
	
	@FindBy(xpath="//div[@classs='a-box-inner']")
	WebElement amazon_Login_security_button;
	
	@FindBy(xpath="//*[@id=\"auth-cnep-edit-name-button\"]")
	WebElement amazon_editbutton;
	
	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	WebElement amazon_Customer_name;
	
	@FindBy(xpath="//*[@id=\"cnep_1C_submit_button\"]")
	WebElement amazon_SaveChanges;
	
	public void amazon_account_link()
	{
		Actions action = new Actions(driver);
		action.moveToElement(amazon_your_Account).build().perform();
	}
	
	
	public void amazon_editpersonalinfo()
	{

		amazon_your_Account.click();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		amazon_Login_security_button.click();
		amazon_editbutton.click();
		amazon_Customer_name.sendKeys("AnupDam");
		amazon_SaveChanges.click();
	}

}
