package com.indianeagle.impl;

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

    public void launchCrome(String url) throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        URL urls = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver obj = new RemoteWebDriver(urls,cap);
        obj.get("https://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        System.out.println("#####################................."+obj.findElement(By.id("homePageId")).getText());
        windowMaximize(obj);
        obj.quit();
    }

    public void launchFirefox(String url) throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        URL urls = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver obj = new RemoteWebDriver(urls,cap);
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
