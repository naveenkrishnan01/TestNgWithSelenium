package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class XpediaPage {
  WebDriver driver;
    public static final By CLICK_FLIGHTS = By.xpath("//*[@id=\"primary-header-flight\"]");
    public static final By ORIGIN_FLIGHT =
            By.xpath("//*[@id=\"flight-origin-flp\"]");
    public static final By LOGIN_BUTTON = By.xpath("//button[contains(text(), 'Login')]");


    public XpediaPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickFlights(){
        driver.findElement(CLICK_FLIGHTS).click();
    }

    public void enterOriginFlight() {
        driver.findElement(ORIGIN_FLIGHT).sendKeys("LAX");
    }

    public void clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }

}

