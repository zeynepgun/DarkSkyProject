package com.darksky.pages;


import static com.darksky.base.BasePage.driver;
import static java.lang.Thread.*;

import com.darksky.utils.ElementUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

//div[@id='searchForm']/input
@FindBy(xpath="//*[@id='searchForm']/input")
private static WebElement location;


    @FindBy(xpath="//a[@class='searchButton']")
    private static WebElement searchBtn;

    @FindBy(xpath="//span[@class='low-temp-text']")
    private static WebElement lowtemp;

    @FindBy(xpath="//span[@class='high-temp-text']")
    private static WebElement hightemp;

    public  HomePage(){
        PageFactory.initElements(driver,this);
    }


    public static String verifyTitle(){
        return ElementUtils.doGetPageTitle();
    }

    public static void chooseLocation(String loca) {
        String keyCombination = Keys.chord(Keys.COMMAND,"A");
        ElementUtils.waitForElementPresent(location);
        location.sendKeys(keyCombination);
        location.sendKeys(Keys.DELETE);
        ElementUtils.doSendText(location,loca);
        ElementUtils.doClick(searchBtn);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        String actualtitle = ElementUtils.doGetPageTitle();
//        System.out.println(actualtitle);
//        System.out.println(ElementUtils.doGetText(lowtemp));
//        System.out.println(ElementUtils.doGetText(hightemp));
    }

//    public static void clickSearchBtn(){
//        //ElementUtils.doClick(searchBtn);
//    }

    public static String getLowTemp(){
        return ElementUtils.doGetText(lowtemp);
    }

    public static String getHighTemp(){
        return ElementUtils.doGetText(hightemp);
    }


}
