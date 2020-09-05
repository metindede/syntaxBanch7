package com.syntax.class29;

public interface WebDriver {
	
	void open();

	void close();

	String getTitle();
}

interface TakesScreenshot {
	
	String FILE_EXTENSION=".jpg";
	
	void getScreenshot();
	
	//from Java 8
	default void getFullScreen() {
		System.out.println("We can take screenshot of full screen");
	}
	
	//from Java 8
	static void getPartialScreen() {
		System.out.println("We can take screenshot of specific part of the screen");
	}
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {
	public void open() {
		System.out.println("We can open Chrome browser");
	}

	public void close() {
		System.out.println("We can close Chrome browser by clicking red cross");
	}

	public String getTitle() {
		System.out.println("Chrome browser can get title of the page");
		return null;
	}

	public void navigate() {
		System.out.println("we can  navigate to Chrome settings by clicking settings button");
	}

	public void getScreenshot() {
		System.out.println("We can get screen shots from Chrome");
	}
}

class FireFoxDriver implements RemoteWebDriver{
	public void open() {
		System.out.println("We can open FireFix browser");
	}

	public void close() {
		System.out.println("We can close FireFox browser by clicking red cross");
	}

	public String getTitle() {
		System.out.println("Firefox browser can get title of the page");
		return null;
	}

	public void navigate() {
		System.out.println("we can  navigate to FireFox settings by clicking settings button");
	}

	public void getScreenshot() {
		System.out.println("We can get screen shots from FireFox");
	}
}

class SafariDriver implements RemoteWebDriver {
	public void open() {
		System.out.println("We can open Safari browser");
	}

	public void close() {
		System.out.println("We can close Safari browser by clicking red cross");
	}

	public String getTitle() {
		System.out.println("Safari browser can get title of the page");
		return null;
	}

	public void navigate() {
		System.out.println("we can  navigate to Safari settings by clicking settings button");
	}

	public void getScreenshot() {
		System.out.println("We can get screen shots from Safari");
	}
}