package com.indianeagle.impl;

import com.indianeagle.browser.LinuxDocker;
import com.indianeagle.browser.Local_Setup_DockerGrid;
import com.indianeagle.browser.WindowsDocker;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class VisitorsMedicalInsuranceNotPurchasedTest {


    private VisitorsMedicalInsuranceNotPurchased visitorsMedicalInsurance = new VisitorsMedicalInsuranceNotPurchased();
    private Local_Setup_DockerGrid local_setup_dockerGrid = new Local_Setup_DockerGrid();
    private WindowsDocker windowsDocker=new WindowsDocker();
    private RemoteWebDriver remoteWebDriver;
    private LinuxDocker linuxDocker = new LinuxDocker();

    @BeforeClass
    public void startDocker() throws IOException, InterruptedException {
        String url = "www.indianeagle.com/insurance/survey?id=tOvLv8x+uAR62Psk66X/Vw==";
        remoteWebDriver=linuxDocker.launch(url);
        /*local_setup_dockerGrid.startDockerGrid();
        remoteWebDriver = windowsDocker.launchCrome(url);*/
    }

    @AfterClass
    public void stopDocker() throws IOException, InterruptedException {
        remoteWebDriver.quit();
        //local_setup_dockerGrid.stopDockerGrid();
    }

    @Test(priority = 1)
    public void testIsPageLoad() throws MalformedURLException {
        assertTrue(visitorsMedicalInsurance.isPageLoad(remoteWebDriver), "verify Visitor Insurance Evaluation page landed");
    }

    @Test(priority = 2)
    public void testVerifyQuestionOne() {
        assertTrue(visitorsMedicalInsurance.verifyQuestionOne(remoteWebDriver), "verify the First question");
    }

    @Test(priority = 3)
    public void testVerifyQuestionTwo() {
        assertTrue(visitorsMedicalInsurance.verifyQuestionTwo(remoteWebDriver), "Verify the Second question");
    }

    @Test(priority = 4)
    public void testSubmitFeedback() throws InterruptedException {
        assertTrue(visitorsMedicalInsurance.submitFeedback(remoteWebDriver), "Verify the submition part.");
    }
}
