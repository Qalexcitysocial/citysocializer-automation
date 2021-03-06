package com.citysocializer.test.web;


import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginPageTest {

    WebDriver driver;
    MainPage MainPage;
    LoginPage LoginPage;

    @Before
    public void setUp() throws Exception {


        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);




    }

    @Test
    public void testLogin() throws InterruptedException {


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
        LoginPage.clickCheckBox();
        LoginPage.clickButtonLoginMe();
        Thread.sleep(2000);
        LoginPage.clickUserMenu();
        LoginPage.clickLogout();



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
        driver.quit();
    }

}
