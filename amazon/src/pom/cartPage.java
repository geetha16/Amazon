package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage 
{
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteBtn;
	
	public void deleteCartItem()
	{
		deleteBtn.click();
	}

}
