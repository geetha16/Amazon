package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage
{
	public SearchResultPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//img[@class='s-access-image cfMarker'])[5]")
	private WebElement fifthShoe;
	
	@FindBy(xpath="(//img[@class='s-access-image cfMarker'])[6]")
	private WebElement sixthShoe;
	
	public void clickOnFifthShoe()
	{
		fifthShoe.click();
	}
	
	public void clickOnSixthShoe()
	{
		sixthShoe.click();
	}

}
