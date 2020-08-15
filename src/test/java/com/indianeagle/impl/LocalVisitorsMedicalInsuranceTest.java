package com.indianeagle.impl;


import com.indianeagle.browser.LocalBrowser;
import com.indianeagle.browser.Local_Setup_DockerGrid;
import com.indianeagle.browser.WindowsDocker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class LocalVisitorsMedicalInsuranceTest {

    private LocalVisitorsMedicalInsurance visitorsMedicalInsurance = new LocalVisitorsMedicalInsurance();
    private LocalBrowser localBrowser = new LocalBrowser();
    private WebDriver remoteWebDriver;

    @BeforeClass
    public void startDocker() throws IOException, InterruptedException {
        String url = "54.205.113.193/insurance/survey?id=5wbJGaZ1waDAk79Yf2_a9A";
        remoteWebDriver = localBrowser.launchLocal(url);
    }

    @AfterClass
    public void stopDocker() throws IOException, InterruptedException {
        remoteWebDriver.quit();
    }

    @Test
    public void testIsPageLoad() throws MalformedURLException {
        assertTrue(visitorsMedicalInsurance.isPageLoad(remoteWebDriver), "verify Visitor Insurance Evaluation page landed");
    }

    @Test
    public void testVerifyQuestionOne() {
        assertTrue(visitorsMedicalInsurance.verifyQuestionOne(remoteWebDriver), "verify the First question");
    }

    @Test
    public void testVerifyQuestionTwo() {
        assertTrue(visitorsMedicalInsurance.verifyQuestionTwo(remoteWebDriver), "Verify the Second question");
    }

    @Test
    public void testVerifyQuestionThree() {
        assertTrue(visitorsMedicalInsurance.verifyQuestionThree(remoteWebDriver),"Verify the third question");
    }

    @Test
    public void testSubmitFeedback() throws InterruptedException {
        assertTrue(visitorsMedicalInsurance.submitFeedback(remoteWebDriver), "Verify the submition part.");
    }
}