package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {
 //Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="add")
	private WebElement plussButton;
	@FindBy(xpath = "//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id='callout']")
	private WebElement itemAddedMessage;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
	
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	
	}
	public void doubleClickPlusButton(WebDriverUtility web) {
		web.doubleClickOnElement(plusButton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
		
	}
	public WebElement getItemAddedMessage() {
		return itemAddedMessage;
		
	}
}
