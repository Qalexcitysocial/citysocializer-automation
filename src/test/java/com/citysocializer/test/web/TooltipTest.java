package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04/12/13
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import com.citysocializer.test.web.uicomponent.SendMessage;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;

public class TooltipTest {

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
        baseUrl = "https://staging.citysocializer.com/";




    }

    @Test
    public void tooltipTest() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com/login");
        SendMessage = PageFactory.initElements(driver, SendMessage.class);

        //Test LoginPage
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        SendMessage.enterEmail("alex+5@citysocializer.com");
        SendMessage.enterPassword("123456");
        SendMessage.clickButtonLoginMe();
        Thread.sleep(2000);
        //Test the Main page
        //Join to socials
        SendMessage.clickcloseinitwindow(); //this step can be delete when the wizar not appear anymore
        SendMessage.clickFindSocializer();
        //Check the element tooltip is present
        if(driver.findElements(xpath("//*[@id='people_list']/div/section[2]/div[2]/div/div[1]/div[3]/article/div[2]/h3/span[2]")).size() != 0){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Not Present");
        }


    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
