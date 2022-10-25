package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.google.com");
		driver.close();
	}
}
