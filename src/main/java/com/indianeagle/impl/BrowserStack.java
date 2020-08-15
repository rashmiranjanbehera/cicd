package com.indianeagle.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserStack {
    public static final String USERNAME = "ashokyellisetty1";
    public static final String AUTOMATE_KEY = "ytrDnbT3tqRbjBDjzgob";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public void launch(String url) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");
        caps.setCapability("name", "ashokyellisetty1's First Test");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://" + url);
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        System.out.println("#####################................."+driver.findElement(By.id("homePageId")).getText());
        windowMaximize(driver);
        //Write your test here
        driver.quit();
    }

    public void windowMaximize(WebDriver obj) {
        obj.manage().window().maximize();
    }

}
