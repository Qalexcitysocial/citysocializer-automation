package com.citysocializer.test.web.uicomponent;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



/**
 * Created with IntelliJ IDEA.
 * User: Alejandro gomez
 * Date: 04/12/13
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */
public class MainMenu {

   private WebDriver driver;

    //Citysocializer logo
    @FindBy(xpath = "//*[@id='logo']/img")
    private WebElement Logo;

    //Join socials  menu button
    @FindBy(xpath = "//*[@id='main_nav_ul']/li[2]/a")
    private WebElement JoinSocial;

    //Find Socializers menu button
    @FindBy(xpath = "//*[@id='main_nav_ul']/li[3]/a")
    private WebElement FindSocializers;

    //Cityboard button menu button
    @FindBy(xpath = "//li[@id='cityboard-drop-wrapper']/a/span[2]")
    private WebElement Cityboard;

    //Menu cityboard button
    @FindBy(xpath = "//li[@id='cityboard-drop-wrapper']/a/span[2]")
    private WebElement MenuCity;

    //Host socialButton
    @FindBy(xpath = "//*[@id='main_nav_ul']/li[6]/a")
    private WebElement HostSocialButton;

    //Credit icon
    @FindBy(xpath ="//*[@id='wallet_drop_wrapper']/a/span")
    private WebElement CreditIcon;

    //message icon
    @FindBy(xpath ="//*[@id='messages_invites_drop_wrapper']/a/span[1]")
    private WebElement MessageIcon;

    //Notification icon
    @FindBy(xpath ="//*[@id='notifications_drop_wrapper']/a/span[1]")
    private WebElement NotificationIcon;

    //Notification icon
    @FindBy(xpath ="//*[@id='user_nav_ul']/li[4]/a/span")
    private WebElement UserIcon;




    //Constructor
   public void MainMenu(WebDriver driver){
       this.driver = driver;
   }




    //Methods
    public void clickLogo(){
        Logo.click();
    }
    //click in findsocializers button
    public void clickFindSocializer(){
        FindSocializers.click();
    }


    public void clickCityboard(){
        Cityboard.click();

    }

    public void clickMenuCityBoard(){
        MenuCity.click();
    }

    public void clickCreditIcon(){
        CreditIcon.click();
    }

    public void clickMessageIcon(){
        MessageIcon.click();
    }

    public void clickNotificationIcon(){
        NotificationIcon.click();
    }

    public void clickUserIcon(){
        UserIcon.click();
    }





}
