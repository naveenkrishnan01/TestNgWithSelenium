package com.webuitest.suite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SideCarPage;

//import org.testng.annotations.Test;

@Feature("Test the career page")

@Listeners({com.listener.Listener.class})
public class NavigatePage2Test extends BaseTest {

    @Test()
    @Story("click careers")
    @Description("check career page")

    public void careers() {
        SideCarPage career = PageFactory.initElements(browser,  SideCarPage.class);
        career.clickCareers();
    }

    @Test()
    @Story("click contacts")
    @Description("click contact page")
    public void contacts() {
        SideCarPage contact = PageFactory.initElements(browser, SideCarPage.class);
        contact.clickContacts();
    }


}
