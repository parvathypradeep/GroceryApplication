package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // initElements - method is used to find elements
	}

	@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']") WebElement adminButton;
	@FindBy(xpath="//a[@class='dropdown-item' and contains(@href,'logout')]") WebElement logoutButton;
	
	
	
	public void clickOnAdminButton() {
		
		adminButton.click();
	}
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
}
