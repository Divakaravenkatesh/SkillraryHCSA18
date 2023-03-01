package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillraryDemoAppPage {
public SkillraryDemoAppPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	//Declaration
	@FindBy(xpath ="//div[@class='navbar-header']")
	private WebElement pageheader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement SeleniumTrainingLink;
	@FindBy(xpath = "//select[@name='adresstype']")
	private WebElement categoryDropdown;
	@FindBy(xpath = "//a[text()='Contact Us'")
	private WebElement contactUsLink;
}
