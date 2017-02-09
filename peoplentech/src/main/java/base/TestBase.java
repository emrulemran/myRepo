package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.ContactUs;
import pages.Employer;
import pages.FacebookLink;
import pages.Header;
import pages.JobSearch;
import pages.JobSeeker;
import pages.PageSideBar;
import pages.Registration;
import pages.SignIn;

public class TestBase extends Driver {
	String browserType = getBrowserType();
	String appURL = getEnvProperty("appURL");
	protected static Header headerSection;
	protected static JobSearch jobSearchPage;
	protected static SignIn signinPage;
	protected static JobSeeker jobSeekerPage;
	protected static Employer employerPage;
	protected static ContactUs contactusPageLink;
	protected static Registration registrationPage;
	protected static PageSideBar sideBar;
	protected static FacebookLink facebookLinkPage;

	@BeforeTest
	public void setUp() {

		try {
			chromeDriverPath = "./ExternalDriver/chromeDriver";
			setDriver(browserType, appURL);
		} catch (Exception e) {
			e.printStackTrace();
		}

		headerSection = PageFactory.initElements(driver, Header.class);
		jobSearchPage = PageFactory.initElements(driver, JobSearch.class);
		signinPage = PageFactory.initElements(driver, SignIn.class);
		jobSeekerPage = PageFactory.initElements(driver, JobSeeker.class);
		employerPage = PageFactory.initElements(driver, Employer.class);
		contactusPageLink = PageFactory.initElements(driver, ContactUs.class);
		registrationPage = PageFactory.initElements(driver, Registration.class);
		sideBar = PageFactory.initElements(driver, PageSideBar.class);
		facebookLinkPage = PageFactory.initElements(driver, FacebookLink.class);

	}

	@AfterTest
	public void tearDown() {
		getDriver().quit();

	}

}
