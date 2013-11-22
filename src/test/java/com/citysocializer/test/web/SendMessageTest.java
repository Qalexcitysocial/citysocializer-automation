package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 19/11/13
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import com.citysocializer.test.web.uicomponent.SendMessage;

public class SendMessageTest {

    WebDriver driver;
    MainPage MainPage;
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

        baseUrl = "https://smoke.citysocializer.com/";




    }

    @Test
    public void LoginTest() throws InterruptedException {


        //Test the right page
        driver.get("https://smoke.citysocializer.com/login");
        SendMessage = PageFactory.initElements(driver, SendMessage.class);

        //Test LoginPage
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        SendMessage.enterEmail("alex+1@citysocializer.com");
        SendMessage.enterPassword("123456");
        SendMessage.clickButtonLoginMe();

        Thread.sleep(5000);

        //Test the Main page
        //Join to socials
        SendMessage.clickJoinSocials();
        SendMessage.clickFindSocializer();
        SendMessage.clickCityboard();
        SendMessage.clickMenuCityBoard();
        SendMessage.clickCredits();
        Thread.sleep(3000);
        SendMessage.clickUserMenu();
        SendMessage.clickSettings();
        SendMessage.clickMessage();
        Thread.sleep(3000);
        SendMessage.clickAllMessage();
        SendMessage.clickSendNewMessage();
        Thread.sleep(3000);
        SendMessage.EnterMessage("Hi, wellcome to Citysocializer comunity that is a message");
        SendMessage.clickSelectFriend();

        SendMessage.clickSendMessageButton();
//        Thread.sleep(5000);
//        SendMessage.clickFindSocializer();
//        Thread.sleep(5000);
//        SendMessage.clickWaveButton();
//        Thread.sleep(5000);
//        SendMessage.clickWaveButton2();
//        Thread.sleep(5000);
//        SendMessage.clickWaveButton3();
//        Thread.sleep(5000);
//        SendMessage.clickWaveButton4();
//        Thread.sleep(5000);
//        SendMessage.clickWaveButton5();
//        Thread.sleep(5000);
//        SendMessage.clickWaveButton6();
//        Thread.sleep(5000);


    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
