package com.citysocializer.test.web.uicomponent;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    private WebDriver driver;

    //declare page Elements
    //email address field
    @FindBy(xpath = "//*[@id='login_form']/input[1]")
    private WebElement email;

    @FindBy(xpath = "//*[@id='login_form']/input[2]")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login_form']/button")
    private WebElement loginMeButton;

    @FindBy(css = "html body div#login_wrap div#login div#login_box div.login-form-region div form#login_form.clearfix div#below.center div.inline input#remember_me")
    private WebElement rememberCheckBox;

    @FindBy(xpath = "/html/body/div/nav/ul/li[5]/ul/li[4]/a/span")
    private WebElement UserMenu;
    //Settings element
    @FindBy(xpath = "//*[@id='user_nav_ul']/li[4]/a/span")
    private WebElement SettingsMenu;
    //My Account element
    @FindBy(xpath = "//*[@id='user_nav_drop']/div/ul/li[4]/a")
    private WebElement SettingsMyAccount;

    @FindBy(xpath = "//*[@id='user_nav_drop']/div/ul/li[3]/a")
    private WebElement Logout;

    //Cityboard
    @FindBy(xpath = "//*[@id='update_my_status']/input")
    private WebElement SendCityMessage;

    @FindBy(name = "message")
    private WebElement CityboardMessage;
    //constructor

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }

    //methods
    public void enterEmail(String enterEmail){
        email.sendKeys(enterEmail);
    }

    public void enterPassword(String enterPassword){
        password.sendKeys(enterPassword);

    }

    public void clickButtonLoginMe(){
        loginMeButton.click();
    }

    public void clickCheckBox(){
        rememberCheckBox.click();
    }

    public boolean isCheckBoxSelected(){
        return rememberCheckBox.isSelected();

    }

    public void clickUserMenu(){
        UserMenu.click();
    }

    public void clickSettingsMenu(){
        SettingsMenu.click();
    }

    public void clickSettingsMyAccount(){
        SettingsMyAccount.click();
    }

    public void clickLogout(){
        Logout.click();
    }

//    public void clickCityboard(){
//        Cityboard.click();
//
//    }

    public void clickSendCityMessageButton(){
       SendCityMessage.click();

    }

    public void writeCityMessage(String writeCityB){
        CityboardMessage.sendKeys(writeCityB);
    }


}
