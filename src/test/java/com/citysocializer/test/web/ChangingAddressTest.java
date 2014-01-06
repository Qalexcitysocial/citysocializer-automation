package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 22/11/13
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */

import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import com.citysocializer.test.web.uicomponent.MyAccount;
import com.citysocializer.test.web.uicomponent.SendMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.*;
import static org.junit.Assert.assertEquals;

public class ChangingAddressTest {

    WebDriver driver;
    MainPage MainPage;
    MyAccount MyAccount;
    LoginPage LoginPage;
    SendMessage SendMessage;



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
        sleep(3000);
        String url = driver.getCurrentUrl();
        assertEquals("https://staging.citysocializer.com/login", url );


        //Test LoginPage
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        LoginPage.enterEmail("agranada69@hotmail.com");
        LoginPage.enterPassword("123456");
        LoginPage.clickButtonLoginMe();
        sleep(5000);
        SendMessage.clickcloseinitwindow(); //this step can be delete when the wizar not appear anymore
        LoginPage.clickUserMenu();
        sleep(3000);
        LoginPage.clickSettingsMyAccount();
        //sleep(5000);
         //MyAccount.setEmailField();

        //MyAccount.clickEmailField();
        sleep(5000);
        //MyAccount.setAddress("alex+9@citysocializer.com");
        LoginPage.clickUserMenu();
        //MyAccount.clickSaveSettings();
//        LoginPage.clickUserMenu();
        LoginPage.clickLogout();




    }









    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
