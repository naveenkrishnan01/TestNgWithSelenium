package com.webuitest.suite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SideCarPage;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Stories;

//import org.testng.annotations.Test;

@Feature("Test the career page")

@Listeners({com.listener.Listener.class})
public class NavigatePage2Test extends BaseTest {

    @Test()
    @Stories("click careers")
    @Description("check career page")
    @Step("case1")
    public void careers() {
        SideCarPage input_email = PageFactory.initElements(browser,  SideCarPage.class);
        input_email.inputEmail();
    }

    @Test()
    @Stories("click contacts")
    @Description("click contact page")
    @Step("case2")
    public void contacts() {
        SideCarPage input_password = PageFactory.initElements(browser, SideCarPage.class);
        input_password.inputPassword();
    }


}
