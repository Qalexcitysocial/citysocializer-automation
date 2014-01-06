package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04/12/13
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */


import com.citysocializer.test.web.uicomponent.SendMessage;
import com.citysocializer.test.web.uicomponent.JoinSocialPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;

public class SocialsByDateRangeTest {

    WebDriver driver;
    SendMessage SendMessage;
    JoinSocialPage JoinSocialPage;
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
    public void testSocialByDateRange() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com/login");
        SendMessage = PageFactory.initElements(driver, SendMessage.class);

        //Test LoginPage
        JoinSocialPage = PageFactory.initElements(driver, JoinSocialPage.class);
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        SendMessage.enterEmail("alex+5@citysocializer.com");
        SendMessage.enterPassword("123456");
        SendMessage.clickButtonLoginMe();
        Thread.sleep(2000);
        //Test the Main page
        //Join to socials
        SendMessage.clickcloseinitwindow(); //this step can be delete when the wizar not appear anymore
        //SendMessage.clickFindSocializer();
        //click in dates range for looking for Socials according with the date

        Thread.sleep(2000);
        JoinSocialPage.clickCalendar();
       // driver.findElement(By.cssSelector("span.icons.drop-icon")).click();

//        driver.findElement(By.id("filter_this_week")).click();
//        driver.findElement(By.id("filter_this_weekend")).click();
//
//        JoinSocialPage.clickDateCalendar();
//        JoinSocialPage.clickDateCalendar();
        System.out.println("Calendar with associated button.... ");
    }


    @After
        public void tearDown() throws Exception {
           //driver.quit();
        }

    }



