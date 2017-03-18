package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage 
{
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
