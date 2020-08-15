package com.indianeagle.impl;

import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class BrowserStackTest {

    BrowserStack browserStack = new BrowserStack();
    IndianEagleWebDriver indianEagleWebDriver;
    String url = "www.indianeagle.com/";
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sampleTest1() throws MalformedURLException {
        browserStack.launch(url);
    }

    @Test
    public void sampleTest2() throws MalformedURLException
    {
        browserStack.launch(url);
    }

    @Test
    public void sampleTest3() throws MalformedURLException
    {
        browserStack.launch(url);
    }

}
