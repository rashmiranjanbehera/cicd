package com.indianeagle.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VisitorsMedicalInsuranceNotPurchased {
    Boolean isPageLoad(RemoteWebDriver obj){
        return obj.findElement(By.id("mainHeadNav")).getText().contains("VISITOR INSURANCE EVALUATION");
    }

    Boolean verifyQuestionOne(RemoteWebDriver obj){
        return obj.findElement(By.id("surveyInfoForm")).getText().contains("What was the reason for not purchasing visitors medical insurance?")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("I was not aware of it")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("I did not thing it offered sufficient coverage")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("I did not know it is different from travel insurance")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("It was expensive")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("The travelers were in good health");
    }

    Boolean verifyQuestionTwo(RemoteWebDriver obj){
        return obj.findElement(By.id("surveyInfoForm")).getText().contains("Would you purchase visitors medical insurance for your future travel to the United States?")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("Yes")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("No")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("May be");
    }

    Boolean submitFeedback(RemoteWebDriver obj) throws InterruptedException {

        obj.findElement(By.xpath("//form[@id='surveyInfoForm']/div/div/div/div/div/label/span")).click();
        Thread.sleep(5000);
        obj.findElement(By.xpath("//form[@id='surveyInfoForm']/div/div/div[2]/div/div/label/span")).click();
        Thread.sleep(5000);
        obj.findElement(By.id("submitSurveyBtDivId")).click();
        Thread.sleep(5000);
        return Boolean.TRUE;

    }
}
