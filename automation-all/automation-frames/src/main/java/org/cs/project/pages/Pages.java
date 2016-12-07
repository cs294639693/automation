package org.cs.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Pages {

	protected Pages(String URL) {
		System.setProperty("webdriver.chrome.driver", "../automation-frames/resource/chromedriver_win32/chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get(URL);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
