package com.syntax.class29;

public class WebDriverTest {

	public static void main(String[] args) {

		//Array of Objects of RemoteWebDriver type
		RemoteWebDriver[] drivers = { new ChromeDriver(), new FireFoxDriver(), new SafariDriver() };

		for (RemoteWebDriver driver : drivers) {
			System.out.println(" ---------------- ");
			driver.open();
			driver.close();
			driver.navigate();
			driver.getTitle();
			driver.getScreenshot();
		}
		System.out.println(" ----------------------------------------- ");
		//Array of Objects of WebDriver type
		WebDriver[] drivers2={ new ChromeDriver(), new FireFoxDriver(), new SafariDriver() };
		
		for(WebDriver driver: drivers2) {
			System.out.println(" ---------------- ");
			driver.open();
			driver.close();
			driver.getTitle();
			//driver.navigate(); not accessible to WebDriver type of objects
			//driver.getScreenshot();not accessible to WebDriver type of objects
		}
		
		System.out.println(" -------- Array of Objects of TakesScreenshot type -------");
		TakesScreenshot[] drivers3={ new ChromeDriver(), new FireFoxDriver(), new SafariDriver() };
		for(TakesScreenshot driver:drivers3) {
			driver.getScreenshot();
			System.out.println(" ---------------- ");
		}
	}
}