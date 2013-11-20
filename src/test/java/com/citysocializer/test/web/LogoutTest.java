package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 19/11/13
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */


import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class LogoutTest {

    WebDriver driver;
    MainPage MainPage;
    LoginPage LoginPage;

    @Before
    public void setUp() throws Exception {

        //Firefox driver
        //driver = new FirefoxDriver();
        //GoogleChrome driver
        System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("http://www.google.com/xhtml");
        //Thread.sleep(5000);  // Let the user actually see something!
        //WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("ChromeDriver");
        //searchBox.submit();
        //Thread.sleep(5000);  // Let the user actually see something!
        //driver.quit();

    }

    @Test
    public void testLogin() throws InterruptedException {


        //Test the right page
        driver.get("https://smoke.citysocializer.com");
        MainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage.clickLoginButton();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        assertEquals("https://smoke.citysocializer.com/login", url );
        //Test LoginPage
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        LoginPage.enterEmail("agranada69@hotmail.com");
        LoginPage.enterPassword("123456");
        LoginPage.clickButtonLoginMe();

        Thread.sleep(3000);

        LoginPage.clickUserMenu();
        LoginPage.clickLogout();
        Thread.sleep(2000);

    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
