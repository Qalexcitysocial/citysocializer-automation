package com.citysocializer.test.web.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 09/12/13
 * Time: 13:10
 * To change this template use File | Settings | File Templates.
 */
public class FacebookWindow {
     WebDriver driver;


    @FindBy(xpath = "//*[@id='email']")
    private WebElement FacebookUserEmail;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement FacebookUserPassword;



    //constructor of the class

    public void FacebookWindow(WebDriver driver){
        this.driver = driver;
    }

    //methods of the elements
    public void setFacebookUserEmail(String username){
        FacebookUserEmail.sendKeys(username);
    }

    public void clickFacebookUserEmail(){
        FacebookUserEmail.click();
    }

    public void setFacebookUserPassword(String username){
        FacebookUserPassword.sendKeys(username);
    }


}


