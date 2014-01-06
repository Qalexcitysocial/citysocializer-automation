package com.citysocializer.test.web;

import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import com.citysocializer.test.web.uicomponent.FacebookWindow;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 09/12/13
 * Time: 12:37
 * To change this template use File | Settings | File Templates.
 */
public class CreateNewUserTest {




    WebDriver driver;
    MainPage MainPage;
    LoginPage LoginPage;
    FacebookWindow FacebookWindow;

    @Before
    public void setUp() throws Exception {


        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testCreateNewUser() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com");
        MainPage = PageFactory.initElements(driver, MainPage.class);

        String parentWindowId = driver.getWindowHandle();
        MainPage.clickEmailButton();
        MainPage.FirstName("Pawel");
        MainPage.LastName("Kaminski");
        MainPage.EmailAddress("alex+pawel@citysocializer.com");
        MainPage.Password("123456");
        MainPage.ContinueButton();
        MainPage.Location();
        driver.findElement(By.xpath("//div[@id='location_id_chzn']/a")).click();
        driver.findElement(By.cssSelector("a.chzn-single.chzn-single-with-drop > div > b")).click();
        driver.findElement(By.id("sel8RP_chzn_o_31")).click();
        driver.findElement(By.cssSelector("a.chzn-single.chzn-single-with-drop > span")).click();
        driver.findElement(By.id("selRAQ_chzn_o_12")).click();
        driver.findElement(By.cssSelector("a.chzn-single.chzn-single-with-drop > span")).click();
        driver.findElement(By.id("selSE7_chzn_o_65")).click();
        driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='register_form_step2']/button")).click();
    }




    @Test
    public void testCheckboxActivate() throws InterruptedException {

        //Get the checkbox as WebElement using it's value attribute
        //Test the right page
        driver.get("https://staging.citysocializer.com");
        MainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage.clickLoginButton();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        assertEquals("https://staging.citysocializer.com/login", url );


        //Test LoginPage
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        LoginPage.enterEmail("agranada69@hotmail.com");
        LoginPage.enterPassword("123456");
        //Check if its already selected? otherwise select the Checkbox
        //by calling click() method
        if (!LoginPage.isCheckBoxSelected())
            //LoginPage.clickCheckBox();
            //Verify checkbox is selected
            assertTrue(LoginPage.isCheckBoxSelected());


    }
    @After
    public void tearDown() throws Exception {
        // driver.quit();
    }

}




