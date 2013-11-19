package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 19/11/13
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.condition.Presence;

import citysocializer.LoginPage;
import citysocializer.Mainpage;
import citysocializer.SendMessage;

public class NotificationTest {

    WebDriver driver;
    Mainpage Mainpage;
    SendMessage SendMessage;
    LoginPage LoginPage;
    private String baseUrl;



    @Before
    public void setUp() throws Exception {

        //Firefox driver
        //driver = new FirefoxDriver();
        //GoogleChrome driver
        System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        baseUrl = "https://staging.citysocializer.com/";




    }

    @Test
    public void LoginTest() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com/login");
        SendMessage = PageFactory.initElements(driver, SendMessage.class);

        //Test LoginPage
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        SendMessage.enterEmail("alex+1@citysocializer.com");
        SendMessage.enterPassword("123456");
        SendMessage.clickButtonLoginMe();

        Thread.sleep(5000);

        //Test the Main page
        //Join to socials
        SendMessage.clickFindSocializer();
        SendMessage.clickJoinSocials();
        Thread.sleep(1000);
        SendMessage.clickYouAreGoing();
        Thread.sleep(3000);
        SendMessage.clickInviteSocial();
        Thread.sleep(3000);
        SendMessage.clickInviteFriends("Ole");
        Thread.sleep(3000);
        SendMessage.clearSendFriend();
        SendMessage.clickFriend0();
        Thread.sleep(3000);
        SendMessage.clickSendFriend();





    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
