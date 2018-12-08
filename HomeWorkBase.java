package MavenAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HomeWorkBase {
	
	public WebDriver driver;
	
    public void setup() {
        //System.setProperty(“webdriver.chrome.driver”, “/Users/waqaskhan/Documents/JAR Files/chromedriver”);
        driver = new HtmlUnitDriver();
//        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }


}
