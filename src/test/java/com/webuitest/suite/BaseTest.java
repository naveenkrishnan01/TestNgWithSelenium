package com.webuitest.suite;

import  com.listener.DriverListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest  {

    public static WebDriver driver = null;
    String baseUrl = "https://staging.sidecarhealth.com";
   // String  browser = "chrome";
    public static EventFiringWebDriver browser;

    @BeforeSuite
    public void setupTest() throws IOException {
        DriverListener listen = new DriverListener();

            System.setProperty("webdriver chrome driver", System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe");



        driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.get(baseUrl);
        browser = new EventFiringWebDriver(driver);
        browser.register(listen);



        }


    @AfterSuite
    public void tearDownTest(){

        BaseTest.driver.quit();
    }

}

