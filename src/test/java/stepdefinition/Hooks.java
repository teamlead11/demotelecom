package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public static void beforeMethod1() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		System.out.println("before method");

	}

	@After
	public static void afterMethod1() {
		driver.close();
		driver.quit();
	}

}
