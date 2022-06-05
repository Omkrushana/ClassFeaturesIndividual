package TestSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

	WebDriver driver;

	public void driversetting() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\OneDrive\\Desktop\\Selenium\\Selenium\\Installation\\chromedriver.exe");
		driver = new ChromeDriver();// getting error if 'ChromeDriver driver' used
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void testAlerts() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");

		// driver.get("https://mail.rediff.com/cgi-bin/login.cgi/"); // open login url
		driver.findElement(By.name("proceed")).click(); // click sign in button & create alert

		Alert objAlert = driver.switchTo().alert(); // switch to alert
		String text = objAlert.getText();
		System.out.println(text);
//	  objAlert.dismiss();
		objAlert.accept(); // click ok of alert box

		driver.switchTo().defaultContent(); // switch back to default window
	}

	public static void main(String[] args) {
		TestAlert obj = new TestAlert();
		
		obj.driversetting();
		obj.testAlerts();

	}

}
