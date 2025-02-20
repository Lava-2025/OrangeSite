package base;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class TestBase {
	public static WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public TestBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void Setup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// launch
		driver.manage().window().maximize();// to maximize

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void ClickElement(WebElement element) {
		element.click();
	}

	public void EnterText(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void navigation() {
		driver.navigate().back();
	}

	public static void quitBrowser() {
		driver.close();
	}	

	public WebElement waitIsEnabled(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		softAssert.assertTrue(element.isEnabled(), "element is disabled");
		System.out.println("Element is enabled!");
		return element;
	}
	
	public void selectOption(WebElement element,int index)
	{
		Select option=new Select(element);
		option.selectByIndex(index);
	}
}
