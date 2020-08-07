package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class CicdSample
{

    WebDriver obj;
    public void launch(String url) {
        String driverPath = "src/main/java/driver/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);
        obj = new FirefoxDriver();
        obj.get("https://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        windowMaximize(obj);
        obj.quit();
    }

    public void windowMaximize(WebDriver obj) {
        obj.manage().window().maximize();
    }

}
