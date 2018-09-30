package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class XpediaFrontPage {
    WebDriver driver;
    public static final By CLICK_ABOUT = By.xpath("//*[@class=\"header__navItem\"][1]/descendant::*[contains(text(), 'About')]");
    public static final By CLICK_NEWS = By.xpath("//*[@class=\"header__navItem\"][2]/descendant::*[contains(text(), 'News')]");

    public XpediaFrontPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAbout(){
        driver.findElement(CLICK_ABOUT).click();
    }

    public void clickNews(){
        driver.findElement(CLICK_NEWS).click();
    }

}

