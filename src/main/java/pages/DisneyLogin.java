package pages;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class DisneyLogin {

    WebDriver driver;

    public static final By LOGIN_EMAIL = By.xpath("//*[@placeholder=\"Username or Email Address\"]");
    public static final By LOGIN_PASSWORD = By.xpath("//*[@placeholder=\"Password\"]");
    public static final By LOGIN_BUTTON = By.xpath("/descendant::*[contains(text(), \"Sign In\")][2]");
    public static final By VERIFY_LOGIN = By.xpath("//*[@class=\"user-message\"]");
    public static final By MY_ACCOUNT = By.xpath("/descendant::*[@href=\"/secure/account\"][5]");


    public static String Fname;
    public static String Lname;
    public String Email;

    // public static void main(String[] args) throws IOException {

    public DisneyLogin(WebDriver driver){
        this.driver=driver;
    }

    public String readcsvFile() throws IOException {

        String path = "../TestNgWithSelenium/output.csv";
        Reader reader = new FileReader(path);
        CSVReader csvreader = new CSVReader(reader);
        List<String[]> data = csvreader.readAll();

        for (String[] d : data) {

            Fname = d[0];
            Lname = d[1];
            Email = d[2];
            System.out.println(Fname);
            System.out.println(Lname);
            System.out.println(Email);

        }
         return Email;

    }


    public void loginEmail() {
        driver.switchTo().frame("disneyid-iframe");
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_EMAIL));
        driver.findElement(LOGIN_EMAIL).sendKeys(Email);

    }


    public void loginPasswd() {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_PASSWORD));
        driver.findElement(LOGIN_PASSWORD).sendKeys("Test1234!");

    }

    public void loginButton() {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        driver.findElement(LOGIN_BUTTON).click();

    }

    public boolean verifyLogin() {
        driver.switchTo().defaultContent();
        boolean present;
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(VERIFY_LOGIN));
        present = driver.findElement(VERIFY_LOGIN).isDisplayed();
        return present;

    }



    public void myAccount() {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(MY_ACCOUNT));
        driver.findElement(MY_ACCOUNT).click();

    }

    public String fluentWait(String xpath) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);


        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                 return driver.findElement(By.xpath(xpath));

            }
        });
        return fluentWait(xpath);
    }



}
