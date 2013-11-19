package com.citysocializer.test.ios.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 17/11/2013
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 */


public class LoginScreen {






    private WebDriver driver;

    //declare page Elements
    //email address field
    @FindBy(xpath = "//window[1]/button[2]")
    private WebElement Login;

//    @FindBy(xpath = "//*[@id='login_form']/input[2]")
//    private WebElement password;
//
//    @FindBy(xpath = "//*[@id='login_form']/button")
//    private WebElement loginMeButton;
//
//    @FindBy(xpath = "//*[@id='remember_me']")
//    private WebElement rememberCheckBox;
//
//    @FindBy(xpath = "//*[@id='user_nav_ul']/li[4]/a/span")
//    private WebElement Usermenu;
//
//    @FindBy(xpath = "//*[@id='user_nav_drop']/div/ul/li[3]/a")
//    private WebElement Logout;
//
//    //constructor
//
      public LoginScreen(WebDriver driver){

        this.driver = driver;

      }
//
//    //methods
      public void TapLoginButton(){
          Login.click();
    }
//
//    public void enterPassword(String enterPassword){
//        password.sendKeys(enterPassword);
//
//    }
//
//    public void clickButtonLoginMe(){
//        loginMeButton.click();
//    }
//
//    public void clickCheckBox(){
//        rememberCheckBox.click();
//    }
//
//    public boolean isCheckBoxSelected(){
//        return rememberCheckBox.isSelected();
//
//    }
//
//    public void clickUserMenu(){
//        Usermenu.click();
//    }
//
//    public void clickLogout(){
//        Logout.click();
//    }

}


