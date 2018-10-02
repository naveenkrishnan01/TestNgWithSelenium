package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class SideCarPage {
  WebDriver driver;
    public static final By INPUT_EMAIL = By.xpath("//*[@id=\"email\"]");
    public static final By INPUT_PASSWORD =
            By.xpath("//*[@id=\"password\"]");
    public static final By LOGIN_BUTTON = By.xpath("//button[contains(text(), 'Login')]");


    public SideCarPage(WebDriver driver){
        this.driver=driver;
    }

    public void inputEmail(){
        driver.findElement(INPUT_EMAIL).sendKeys("abcd");
    }

    public void inputPassword() {
        driver.findElement(INPUT_PASSWORD).sendKeys("Test1234!");
    }

    public void clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }

}

