package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(xpath = "//a[text()=' GEARS ")
	private WebElement gearsTab;
	@FindBy(xpath = "//ul[@class 'dropdown-menu gear_menu]descendant::a[text()=' SkillRary Whiteboard']")
	private WebElement skillraryDemoAppLink;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public WebElement getLogo() {
		return logo;
		
	}
	public void clickGears() {
		gearsTab.click();
		
	}
	public void clickSkillraryDemoApp() {
		skillraryDemoAppLink.click();
	}
}
