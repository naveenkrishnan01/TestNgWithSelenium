package com.webuitest.suite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.XpediaPage;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Stories;

//import org.testng.annotations.Test;

@Feature("Test the career page")

@Listeners({com.listener.Listener.class})
public class NavigatePage2Test extends BaseTest {

    @Test()
    @Stories("click flights")
    @Description("navigate to flight page")
    @Step("case1")
    public void careers() {
        XpediaPage click_flight = PageFactory.initElements(browser,  XpediaPage.class);
         click_flight.clickFlights();
    }

    @Test()
    @Stories("enter origin")
    @Description("Enter Flight Origin")
    @Step("case2")
    public void enterOrigin() {
        XpediaPage enter_origin = PageFactory.initElements(browser, XpediaPage.class);
        enter_origin.enterOriginFlight();
    }


}
