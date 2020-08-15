package com.indianeagle.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LinuxDocker {
    RemoteWebDriver obj;
    public RemoteWebDriver launch(String url) {
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        try {
            obj = new RemoteWebDriver(new URL("http://ec2-100-27-29-34.compute-1.amazonaws.com:4444/wd/hub"),cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        obj.get("http://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        windowMaximize(obj);

        return obj;
    }

    public void windowMaximize(WebDriver obj) {
        obj.manage().window().maximize();
    }
}
