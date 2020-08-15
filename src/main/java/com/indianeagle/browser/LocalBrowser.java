package com.indianeagle.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LocalBrowser {
    WebDriver obj;
    public WebDriver launchLocal(String url) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rashmiranjan\\Downloads\\geckodriver.exe");
        obj  = new FirefoxDriver();
        obj.get("https://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        windowMaximize(obj);

        return obj;
    }

    public void windowMaximize(WebDriver obj) {
        obj.manage().window().maximize();
    }
}
