package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDPPage extends BasePage
{
	public PDPPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;
	
	@FindBy(xpath="//select[@id='native_dropdown_selected_size_name']")
	private WebElement sizeDrpDwn;
	
	@FindBy(xpath="((//option[@class='dropdownAvailable'])[2])")
	private WebElement selectSize;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCartBtn;
	
	@FindBy(id="nav-cart-count")
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
