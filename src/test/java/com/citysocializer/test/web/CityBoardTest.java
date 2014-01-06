package com.citysocializer.test.web;

import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import com.citysocializer.test.web.uicomponent.SendMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.PageFactory;
import sun.plugin2.os.windows.Windows;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04/12/13
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class CityBoardTest {

    WebDriver driver;
    MainPage MainPage;
    LoginPage LoginPage;
    SendMessage SendMessage;

    @Before
    public void setUp() throws Exception {

        //WindowsUtils.tryToKillByName("chromedriver.exe");
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);




    }

    @Test
    public void testCityBoard() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com");
        MainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage.clickLoginButton();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        assertEquals("https://staging.citysocializer.com/login", url );
        //Test LoginPage
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        LoginPage.enterEmail("agranada69@hotmail.com");
        LoginPage.enterPassword("123456");
        LoginPage.clickCheckBox();
        LoginPage.clickButtonLoginMe();
        Thread.sleep(2000);
        //Click in Cityboard and send a message
        SendMessage.clickcloseinitwindow(); //this step can be delete when the wizar not appear anymore
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='cityboard-drop-wrapper']/a/span[2]")).click();
        LoginPage.writeCityMessage("to the cinema with Maciej :) ");
        Thread.sleep(1000);
        LoginPage.clickSendCityMessageButton();
        //end test
        System.out.println("City Message Sent successfully :) ");


    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
