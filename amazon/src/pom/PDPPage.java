package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PDPPage 
{
	public WebDriver driver;
	@FindBy(xpath="//select[@id='native_dropdown_selected_size_name']")
	private WebElement sizeDrpDwn;
	
	@FindBy(xpath="((//option[@class='dropdownAvailable'])[2])")
	private WebElement selectSize;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCartBtn;
	
	@FindBy(id="hlb-view-cart-announce")
	private WebElement cartBtn;
	
	public void clickOnSizeDrpDwn()
	{
		sizeDrpDwn.click();
	}
	
	public void selectsize()
	{
		selectSize.click();
	}
	
	public void addToCart()
	{
		addToCartBtn.click();
	}
	
	public void navigateToCart()
	{
		cartBtn.click();
	}
}
