package com.citysocializer.test.ios;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 17/11/2013
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */

import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;




import com.citysocializer.test.ios.uicomponent.LoginScreen;
import com.citysocializer.test.web.uicomponent.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;
import static org.junit.Assert.assertEquals;


public class LoginScreenTest {

    RemoteWebDriver driver;
    LoginScreen LoginScreen;




    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "ios");
        capabilities.setCapability(CapabilityType.VERSION, "6.1");
        capabilities.setCapability(CapabilityType.PLATFORM, "MAC");
        capabilities.setCapability("app", "/Users/alexg/Library/Developer/Xcode/DerivedData/CitySocializer-aehjupgwiscfpkdrxnvdhdscngtn/Build/Products/Debug-iphonesimulator/CitySocializer.app");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    }


    @Test
    public void testLogin() throws InterruptedException {

       LoginScreen = PageFactory.initElements(driver, LoginScreen.class);
       LoginScreen.TapLoginButton();


    }









    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

}
