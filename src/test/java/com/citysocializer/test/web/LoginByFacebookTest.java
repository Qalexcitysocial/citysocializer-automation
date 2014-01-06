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
public class LoginByFacebookTest {




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
    public void testLoginFacebook() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com");
        MainPage = PageFactory.initElements(driver, MainPage.class);
        //Save the WindowHandle of Parent Browser Window
        String parentWindowId = driver.getWindowHandle();
        //Clicking Help Button will open Help Page in a new Popup Browser Window
        WebElement facebookButton = driver.findElement(By.id("facebook"));
            facebookButton.click();
            try {
            //Switch to the Popup Browser Window
                driver.switchTo().window("Facebook");
            } catch (NoSuchWindowException e) {
                e.printStackTrace();
            }
        //Verify the driver context is  Popup Browser Window
        //   assertTrue(driver.getTitle().equals("facebook"));
        //Close the  Popup Window
            driver.close();
        //Move back to the Parent Browser Window
           // driver.switchTo().window(parentWindowId);
        //Verify the driver context is in Parent Browser Window
           //assertTrue(driver.getTitle().equals("facebook"));
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




