package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class CicdSample
{

    WebDriver obj;
    public void launch(String url) {
        WebDriverManager.firefoxdriver().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("firefox");
        try {
            obj = new RemoteWebDriver(new URL("http://ec2-100-27-29-34.compute-1.amazonaws.com:4444/wd/hub"),cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        obj.get("https://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        System.out.println("#####################................."+obj.findElement(By.id("homePageId")).getText());
        windowMaximize(obj);
        obj.quit();
    }

    public void windowMaximize(WebDriver obj) {
        obj.manage().window().maximize();
    }

}
