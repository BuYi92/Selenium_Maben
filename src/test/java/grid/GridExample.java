package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		URL HubURL = new URL("http://localhost:4444/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS); //hier wird die plattform vorgegeben in welchem plattform es läuft
		cap.setBrowserName("chrome");
		
		
		WebDriver driver = new RemoteWebDriver(HubURL,cap);
		//Für ansteuern an anderen maschienen nicht local dann wär es WebDriver
		
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		
	}

}
