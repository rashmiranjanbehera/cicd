package com.indianeagle.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WindowsDocker {
    public RemoteWebDriver launchCrome(String url) throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        URL urls = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver obj = new RemoteWebDriver(urls,cap);
        obj.get("http://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        System.out.println("#####################....Application Started.............");
        windowMaximize(obj);
        return obj;
    }

    public RemoteWebDriver launchFirefox(String url) throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        URL urls = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver obj = new RemoteWebDriver(urls,cap);
        obj.get("https://" + url);
        obj.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        System.out.println("#####################....Application Started.............");
        windowMaximize(obj);
        return obj;
    }

    public void windowMaximize(WebDriver obj) {
        obj.manage().window().maximize();
    }
}
