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
	
	@Test
	public void testAmazon() throws InterruptedException
	{
		SearchPage sp=new SearchPage(driver);
		SearchResultPage sr= new SearchResultPage(driver);
		PDPPage p=new PDPPage(driver);
		cartPage c=new cartPage(driver);
		
		sp.enterSearchKeyword();
		sp.clickOnSearchIcon();
		
		sr.clickOnFifthShoe();
		sr.clickOnSixthShoe();
		
		 
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 p.addToCart();
       		
		 driver.switchTo().window(tabs.get(2));
		 p.addToCart();
		 Thread.sleep(5000);
		 
		 p.navigateToCart();
		 Thread.sleep(5000);
		 c.deleteCartItem();
	}

}
