package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage 
{
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
