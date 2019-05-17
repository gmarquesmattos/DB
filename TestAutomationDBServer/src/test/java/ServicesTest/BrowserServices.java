package ServicesTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserServices {
	
	public WebDriver browser;	
	public void OpenBrowserService() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gmattos\\Desktop\\chromedriver_win32\\chromedriver.exe");
	System.out.println(System.getProperty("webdriver.chrome.driver"));
	browser = new ChromeDriver();
	browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	browser.get("http://automationpractice.com/index.php?");

}


	public String SelectPopUpService() {
		this.sleep(5000);
		String mainWindow = browser.getWindowHandle();
		Set<String> windows = browser.getWindowHandles();
		for (String windowId : windows) {
			if (!windowId.equals(mainWindow)) {
				browser.switchTo().window(windowId);
			}
		}
		return mainWindow;
	}

	public void SelectPageMain(final String mainWindow) {
		this.sleep(2500);
		browser.switchTo().window(mainWindow);
	}

	private void sleep(int timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


