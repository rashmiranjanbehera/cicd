package com.indianeagle.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VisitorsMedicalInsurance {

    Boolean isPageLoad(RemoteWebDriver obj){
        return obj.findElement(By.id("mainHeadNav")).getText().contains("VISITOR INSURANCE EVALUATION");
    }

    Boolean verifyQuestionOne(RemoteWebDriver obj){
        return obj.findElement(By.id("surveyInfoForm")).getText().contains("Where did you purchase the visitors medical insurance?")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("United States")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("India");
    }

    Boolean verifyQuestionTwo(RemoteWebDriver obj){
        return obj.findElement(By.id("surveyInfoForm")).getText().contains("Where did you hear about the visitors medical insurance?")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("Word of mouth") ||
                obj.findElement(By.id("surveyInfoForm")).getText().contains("Internet")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("Travel Agent");
    }

    Boolean verifyQuestionThree(RemoteWebDriver obj){
        return obj.findElement(By.id("surveyInfoForm")).getText().contains("Would you purchase visitors medical insurance for your future travel to the United States?")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("YES")
                || obj.findElement(By.id("surveyInfoForm")).getText().contains("NO");
    }

    Boolean submitFeedback(RemoteWebDriver obj) throws InterruptedException {

        obj.findElement(By.xpath("//form[@id='surveyInfoForm']/div/div/div/div/div/label/span")).click();
        Thread.sleep(5000);
        obj.findElement(By.xpath("//form[@id='surveyInfoForm']/div/div/div[2]/div/div/label[3]/span")).click();
        Thread.sleep(5000);
        obj.findElement(By.xpath("//form[@id='surveyInfoForm']/div/div/div[3]/div/div/label[2]/span")).click();
        Thread.sleep(5000);
        obj.findElement(By.id("submitSurveyBtDivId")).click();
        Thread.sleep(5000);
        return obj.findElement(By.xpath("//div[@id='surveySuccessMessageDivId']/p")).getText().contains("Thank you for completing your survey! we will come up better service on going!");

    }
}
