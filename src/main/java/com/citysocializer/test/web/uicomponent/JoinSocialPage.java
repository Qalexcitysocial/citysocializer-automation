package com.citysocializer.test.web.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Alejandro Gomez Rodriguez
 * Date: 28/11/13
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public class JoinSocialPage {

    private WebDriver driver;


    //anotations
    @FindBy(xpath = "//*[@id='leave_social']")
    private WebElement CancelJoinSocial;


    @FindBy(xpath = "//*[@id='leave_social_popup']/button")
    private WebElement CancelJoinSocialConfirmation;

    @FindBy(xpath = "//*[@id='social_list']/div[2]/section[2]/div[1]/div[2]/div/div/a/span[1]")
    private WebElement DateCalendar;

    @FindBy(xpath = "//*[@id='popup-insert-container']/div/div/div[2]/div[1]/table/tbody/tr[3]/td[1]/a")
    private WebElement InitDay;

    @FindBy(xpath = "//*[@id=\"popup-insert-container\"]/div/div/div[2]/div[1]/table/tbody/tr[6]/td[2]/a")
    private WebElement EndDay;




    //constructor
    public void JoinSocialPage(WebDriver driver){
         this.driver = driver;
    }

    //metodos

    public void clickCancelJoinSocial(){
        CancelJoinSocial.click();
    }

    public void clickCancelJoinSocialConfirm(){
        CancelJoinSocialConfirmation.click();
    }

    public void clickCalendar(){
        DateCalendar.click();
    }

    //click in date range
    public void clickDateCalendar(){
        InitDay.click();
    }
    //click in date range
    public void clickChooseDay(){
        EndDay.click();
    }








}
