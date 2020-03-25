package pages;

import com.opencsv.CSVWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DisneySignup {

    WebDriver driver;



    public static final By CLICK_SHOP = By.xpath("/descendant::*[contains(text(), \"Shop\")][3]");
    public static final By CLICK_SIGNUP =
            By.xpath("/descendant::*[contains(text(), \"Sign In | Sign Up\")][1]");
    public static final By CLICK_HAMBURGER = By.xpath("//*[contains(@class, 'navbar-toggler')]");
    public static final By CLICK_CREATE_ACCOUNT = By.xpath("//*[contains(@class, 'btn-group-create-account')]");


    // signup form
    public static final By SIGNUP_FNAME = By.xpath("//*[@name=\"firstName\"]");
    public static final By SIGNUP_LNAME = By.xpath("//*[@name=\"lastName\"]");
    public static final By SIGNUP_EMAIL = By.xpath("//*[@name=\"email\"]");
    public static final By SIGNUP_NEW_PSWD = By.xpath("//*[@name=\"newPassword\"]");
    public static final By SIGNUP_VERIFY_PSWD = By.xpath("//*[@name=\"verifyPassword\"]");
    public static final By SIGNUP_DOB = By.xpath("//*[@name=\"dateOfBirth\"]");
    public static final By CREATE_ACCOUNT = By.xpath("//*[contains(text(), 'Create Account')]");
    public static final By CONTINE_BTN = By.xpath("//*[contains(text(), 'Continue')]");
    public static final By SIGNOUT = By.xpath("//*[@class=\"signout\"]");



    public DisneySignup(WebDriver driver){
        this.driver=driver;
    }

    public void writecsvFile(String fname, String lname, String email) {

        File file = new File("../TestNgWithSelenium/output.csv");
        try{
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] { fname, lname, email });
            writer.writeAll(data);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] cell;


    }
    /*
       Had to use sleep to run out the time for popup
       alert function did not work to stop the timeout popup
     */

    public void clickShop() throws InterruptedException {
        Thread.sleep(8000);
        //   Alert alertCancel = driver.switchTo().alert();
        //   alertCancel.dismiss();
           final Wait<WebDriver> wait =
                   new WebDriverWait(driver, 30);
           wait.until(ExpectedConditions.visibilityOfElementLocated(CLICK_SHOP));
        driver.findElement(CLICK_SHOP).click();
    }

    /*
       Had to increase the screen size to get to signup button
     */

    public void clickSignup() {

        driver.manage().window().setSize(new Dimension(1600, 1200));
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CLICK_SIGNUP));
        driver.findElement(CLICK_SIGNUP).click();
    }

    /*
       The method below, had to switch to iframe to locate create account
     */
    public void clickCreateAccount() throws InterruptedException {
        driver.switchTo().frame("disneyid-iframe");
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CLICK_CREATE_ACCOUNT));
        driver.findElement(CLICK_CREATE_ACCOUNT).click();
    }

    public void signupFname(String fname) throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNUP_FNAME));
        driver.findElement(SIGNUP_FNAME).sendKeys(fname);
    }

    public void signuplname(String lname) throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNUP_LNAME));
        driver.findElement(SIGNUP_LNAME).sendKeys(lname);
    }

    public void sigupemail(String email) throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNUP_EMAIL));
        driver.findElement(SIGNUP_EMAIL).sendKeys(email);
    }

    public void sigupPaswd(String pswd) throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNUP_NEW_PSWD));
        driver.findElement(SIGNUP_NEW_PSWD).sendKeys(pswd);
    }

    public void sigupVerifyPswd(String verifyPswd) throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNUP_VERIFY_PSWD));
        driver.findElement(SIGNUP_VERIFY_PSWD).sendKeys(verifyPswd);
    }

    public void sigupDoB(String dob) throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNUP_DOB));
        driver.findElement(SIGNUP_DOB).sendKeys(dob);
    }

    public void createAcct() throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_ACCOUNT));
        driver.findElement(CREATE_ACCOUNT).click();
    }

    public void continueBtn() throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONTINE_BTN));
        driver.findElement(CONTINE_BTN).click();
        driver.switchTo().defaultContent();
    }


    public void signout() throws InterruptedException {
        final Wait<WebDriver> wait =
                new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIGNOUT));
        driver.findElement(SIGNOUT).click();
    }

}
