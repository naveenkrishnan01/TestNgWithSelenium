package com.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class DriverListener extends AbstractWebDriverEventListener{


    public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {

    }

    @Override
    public void afterClickOn(WebElement arg0, WebDriver arg1) {

        System.out.println("After click "+arg0.toString());

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {

        System.out.println("After FindBy "+arg0.toString());
    }

    @Override
    public void afterNavigateBack(WebDriver arg0) {

        System.out.println("After navigating back "+arg0.toString());

    }

    @Override
    public void afterNavigateForward(WebDriver arg0) {

        System.out.println("After navigating forword "+arg0.toString());

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateTo(String arg0, WebDriver arg1) {

        System.out.println("After navigating "+arg0.toString());

        System.out.println("After navigating "+arg1.toString());

    }

    @Override
    public void afterScript(String arg0, WebDriver arg1) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }


    public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {

    }

    @Override
    public void beforeClickOn(WebElement arg0, WebDriver arg1) {

        System.out.println("before click "+arg0.toString());

    }

    @Override
    public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {

        System.out.println("before FindBY "+arg0.toString());

    }

    @Override
    public void beforeNavigateBack(WebDriver arg0) {

        System.out.println("Before navigating back "+arg0.toString());
    }

    @Override
    public void beforeNavigateForward(WebDriver arg0) {
        System.out.println("Before navigating Forword "+arg0.toString());

    }

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String arg0, WebDriver arg1) {

        System.out.println("Before navigating "+arg0.toString());
        System.out.println("Before navigating "+arg1.toString());

    }

    @Override
    public void beforeScript(String arg0, WebDriver arg1) {

    }

    @Override
    public void onException(Throwable arg0, WebDriver arg1) {

        System.out.println("Testcase done"+arg0.toString());
        System.out.println("Testcase done"+arg1.toString());
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }
}
