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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class ChangingAddressTest {

    WebDriver driver;
    MainPage MainPage;
    MyAccount MyAccount;
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
        LoginPage.clickButtonLoginMe();
        Thread.sleep(3000);
        LoginPage.clickUserMenu();
        Thread.sleep(3000);
        LoginPage.clickSettingsMenu();
//
//        Thread.sleep(5000);
//        //LoginPage.clickSettingsMyAccount();
//        //Thread.sleep(3000);
//        MyAccount.setEmailField();
//        MyAccount.setAddress("alex+9@citysocializer.com");
//        MyAccount.clickSaveSettings();
//        LoginPage.clickUserMenu();
        LoginPage.clickLogout();




    }









    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

}
