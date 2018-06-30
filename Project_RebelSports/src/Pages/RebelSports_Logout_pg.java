package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RebelSports_Logout_pg {
	
WebDriver driver;
public int TimeoutValue = 80;
	
	public RebelSports_Logout_pg (WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }

	@FindBy(xpath="/html/body/div[2]/nav/div/div/div/div/div[2]/ul/li[2]/a[2]")
	WebElement RebelSports_accountlink;
	
	@FindBy(linkText="Log Out")
	WebElement RebelSports_signout;
	
public void RebelSports_accountlink()
{
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
    RebelSports_accountlink.click();
}
public void RebelSports_signout()
	
	{
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		RebelSports_signout.click();
	}
	
}
