package com.webuitest.suite;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.XpediaFrontPage;

//import org.testng.annotations.Test;

@Feature("test allure report")

@Listeners(com.listener.Listener.class)
public class NavigatePageTest extends BaseTest {

@Test()
@Story("click about")
    public void about() {
    XpediaFrontPage about = PageFactory.initElements(browser, XpediaFrontPage.class);
    about.clickAbout();
}
@Test
@Story("news")
    public void news() {
        XpediaFrontPage news = PageFactory.initElements(browser, XpediaFrontPage.class);
        news.clickNews();
    }
}