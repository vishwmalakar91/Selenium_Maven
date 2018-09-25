package VM.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest 

{	public static WebDriver d;

	@Test
    public static void main1()
    {
		String current_path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",current_path+"\\Drivers\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("http://github.com");
	    System.out.println("Github Launched !");
	    d.quit();
        
    }
}
