package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class SideCarPage {
  WebDriver driver;
    public static final By CLICK_CAREERS = By.xpath("//*[@class=\"header__navItem\"][3]/descendant::*[contains(text(), 'Careers')]");
    public static final By CLICK_CONTACTS = By.xpath("//*[@class=\"header__navItem\"][4]/descendant::*[contains(text(), 'Contact')]");

    public SideCarPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickCareers(){
        driver.findElement(CLICK_CAREERS).click();
    }

    public void clickContacts(){
        driver.findElement(CLICK_CONTACTS).click();
    }

}

