package com.citysocializer.test.web.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 22/11/13
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */
    public class MyAccount {

    private WebDriver driver;

    //elements and annotations
    @FindBy(name ="email" )
    private WebElement EmailField;

    @FindBy(name ="email" )
    private WebElement Address;

    @FindBy(xpath ="//section[@id='edit_settings']/div/div/table/tbody/tr/td[2]")
    private WebElement SaveSettings;





    //constructor
    public MyAccount(WebDriver driver){
         this.driver = driver;

    }


    //methods of the class

    public void setEmailField(){
     EmailField.clear();
 }

    public void clickEmailField(){
     EmailField.click();
 }

    public void setAddress(String setAddress){
     Address.sendKeys();
 }

    public void clickSaveSettings(){
     SaveSettings.click();
 }



}
