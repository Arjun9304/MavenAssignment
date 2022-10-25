package prjct;

import org.testng.annotations.BeforeMethod;

public class demo {

	public WebDriver driver;

	@BeforeMethod
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chhotu Kumar\\eclipse-workspace\\salenium\\src\\test\\resources\\geckodriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https:makemytrip.com/hotels/");

	}
}