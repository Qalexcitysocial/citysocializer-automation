package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 21/11/13
 * Time: 10:34
 * To change this template use File | Settings | File Templates.
 */
import com.citysocializer.test.web.uicomponent.JoinSocialPage;
import com.citysocializer.test.web.uicomponent.SendMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;


/**
 * Created with IntelliJ IDEA.
 * User: Alejandro Gomez
 * Date: 19/11/13
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */


public class SendAnswerTest {

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
    public void JoinASocial() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com/login");
        SendMessage = PageFactory.initElements(driver, SendMessage.class);

        //Test LoginPage
        SendMessage = PageFactory.initElements(driver, SendMessage.class);
        SendMessage.enterEmail("alex+15@citysocializer.com");
        SendMessage.enterPassword("123456");
        SendMessage.clickButtonLoginMe();
        //Test the Main page
        Thread.sleep(2000);
        //Join to socials
        SendMessage.clickFindSocializer();
        Thread.sleep(2000);
        SendMessage.clickJoinSocials();
        Thread.sleep(2000);
        SendMessage.clickYouAreGoing3();
        Thread.sleep(5000);
        if(driver.findElements(xpath("//*[@id='leave_social']")).size() != 0){
            System.out.println("Element is Present");
            Thread.sleep(5000);
            SendMessage.clickCancelJoinSocial();
            sleep(5000);
            SendMessage.clickCancelJoinSocialConfirm();
            Thread.sleep(5000);
        }else{

            System.out.println("Element is Not Present");
        }
        Thread.sleep(5000);
        SendMessage.clickJoinThisSocial();
        sleep(1000);
        SendMessage.clickConfirmAndJoin();
        sleep(5000);
        SendMessage.clickSocialMessage();
        SendMessage.sendSocialMessage("How many girls going to the party?");
        SendMessage.clickPostMyAnswer();
        Thread.sleep(4000);
        SendMessage.clickChooseFriend();
        Thread.sleep(4000);
        SendMessage.clickSendInvitation();

    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
