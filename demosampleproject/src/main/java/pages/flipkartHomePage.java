package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartHomePage {
	
	
	WebDriver driver; 
	
	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement searchaBar;
	
	@FindBy(xpath="//a[@title='Cart'  and contains(text(),'Cart')]")
	private WebElement cartIcon;
	
	@FindBy(xpath="//div[@class='WOvzF4']//span//span")
	private WebElement resultText;
	
	
	public flipkartHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchItem(String item )
	{
		searchaBar.sendKeys(item);
	}
	
	public void submitSearch()
	{
		searchaBar.submit();
	}
	
	public String getTextOfSearch()
	{
		return resultText.getText();
	}
	
	public String searchItemInFlipKart(String item)
	{
		searchItem(item);
		submitSearch();
		return getTextOfSearch();
	}
	
	
	

}
