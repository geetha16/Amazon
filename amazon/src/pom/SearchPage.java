package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage
{
	public SearchPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")
	private WebElement searchTB;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchIcon;
	
	public void enterSearchKeyword()
	{
		searchTB.sendKeys("Shoes");
	}
	
	public void clickOnSearchIcon()
	{
		searchIcon.click();
	}
	
	

}
