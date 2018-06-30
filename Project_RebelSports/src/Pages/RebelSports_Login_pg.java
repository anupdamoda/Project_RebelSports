package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RebelSports_Login_pg {
	
	
	WebDriver driver;
	public int TimeoutValue = 140;
	
	public RebelSports_Login_pg (WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }
	

	@FindBy(xpath="/html/body/div[2]/nav/div/div/div/div/div[2]/ul/li[2]/a[1]")
	WebElement amazon_loginbutton;
	
	//@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement amazon_Signinbutton;
	
	@FindBy(xpath="//*[@id=\"Username\"]")
	WebElement amazon_username;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement amazon_continuebutton;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement amazon_password;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div/div/div[2]/div/div[1]/form/div/div/button")
	WebElement amazon_Loginsubmitbutton;
	
	
	
	
	public void RebelSports_login(String uid,String pwd)
	
	{
		
		amazon_loginbutton.click();
		
		
	//    WebDriverWait wait = new WebDriverWait(driver,200);
	//    amazon_Signinbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")));
	   
	   
	//	amazon_Signinbutton.click();
		amazon_username.sendKeys(uid);
	//	amazon_continuebutton.click();
	    amazon_password.sendKeys(pwd);
		amazon_Loginsubmitbutton.click();
		
	}

	
	
}
