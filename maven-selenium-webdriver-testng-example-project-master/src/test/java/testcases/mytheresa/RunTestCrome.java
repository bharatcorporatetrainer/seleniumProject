package testcases.mytheresa;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class RunTestCrome {


@Test
public void accountCreate() {
	

	//String exePath = "geckodriver.exe";
	//System.setProperty("webdriver.gecko.driver", exePath);
	//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	//capabilities.setCapability("marionette", true);
	WebDriver driver = new FirefoxDriver();
	String htmlLocation = "file:"+System.getProperty("user.dir")+"/test.html";
	System.out.println(htmlLocation);
	driver.get(htmlLocation);
	if (driver.getPageSource().contains("interview Questions" ))
	{
		System.out.println("Yes test exist");
	}
	
	else
	{
		System.out.println("does not exist");
	}


	driver.close();


}
}
