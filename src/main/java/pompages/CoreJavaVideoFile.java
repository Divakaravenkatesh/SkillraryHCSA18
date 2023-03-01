package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreJavaVideoFile {

	//Declaration
	@FindBy(xpath = "//h1")
	private WebElement pageHeader;
	@FindBy(xpath = "//button[@aria-label='Play']")
	private WebElement playButton;
	@FindBy(xpath = "//button[@aria-label='Pause']")
	private WebElement pauseButton;
	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addToWishlist;
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement closeCookiesIcon;
}
