package step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends Base{
	@Before
	public void setup() throws MalformedURLException {

		ChromeOptions opt = new ChromeOptions();

		browser = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
	}
	@After
	public void tearDown() {
	if (browser!=null){
		browser.quit();
	}
		//browser.close();
	}

}
