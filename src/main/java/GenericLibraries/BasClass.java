package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaVideoFile;
import pompages.HomePage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class BasClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected HomePage home;
	protected SkillraryDemoAppPage demoApp;
	protected CoreJavaForSeleniumPage coreJava;
	protected CoreJavaVideoFile javaVideo;
	protected ContactUsPage contact;
	protected WebDriver driver;

//@BeforeSuite
//@BeforeTest
	@BeforeClass
	public void classConfiguration() {
		property = new PropertiesUtility();
		excel = new ExcelUtility();
		web = new WebDriverUtility();
		property.PropertiesInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);

	}

	@BeforeMethod
	public void methodConfiguration() {
		long time = Long.parseLong(property.FetchProperty("timeouts"));
		driver = web.openApplication(property.FetchProperty("browser"));

		home = new HomePage(driver);
		demoApp = new SkillraryDemoAppPage(driver);
		selenium = new SeleniumTrainingPage(driver);
		testing = new TestingPage(driver);
		coreJava = new CoreJavaForSeleniumPage(driver);
		javaVideo = new CoreJavaVideoFile(driver);
		contact = new ContactUsPage(driver);

	}

	@AfterMethod
	public void methodTeardown() {
		web.quitBrowser();

	}

	@AfterClass
	public void classTeardown() {
		excel.closeExcel();
	}
//@AfterTest
//@AfterSuite

}
