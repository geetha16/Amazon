package script;

import java.util.ArrayList;
import generic.BaseTest;

import org.testng.annotations.Test;

import pom.PDPPage;
import pom.SearchPage;
import pom.SearchResultPage;
import pom.cartPage;

public class Amazon extends BaseTest
{
	SearchPage sp=new SearchPage();
	@Test
	public void testAmazon()
	{
		SearchPage sp=new SearchPage();
		SearchResultPage sr= new SearchResultPage();
		PDPPage p=new PDPPage();
		cartPage c=new cartPage();
		
		sp.enterSearchKeyword();
		sp.clickOnSearchIcon();
		
		sr.clickOnFifthShoe();
		sr.clickOnSixthShoe();
		
		 
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 p.addToCart();
       		
		 driver.switchTo().window(tabs.get(2));
		 p.addToCart();
		 
		 p.navigateToCart();
		 
		 c.deleteCartItem();
	}

}
