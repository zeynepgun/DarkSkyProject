package com.darksky.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.darksky.base.BasePage.driver;

public class ElementUtils {


    //WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void waitForElementPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static String doGetPageTitle(){
        try {
            return driver.getTitle();
        }catch(Exception e){
            System.out.println("Some exception occurred while getting the page title");
            return null;
        }
    }


    public static void doSendText(WebElement element, String value){
        waitForElementPresent(element);
        try{
            element.sendKeys(value);
        }catch(Exception e){
            System.out.println("Some exception occurred while sending text at" + element);
        }
    }


    public static void doClick(WebElement element){
        waitForElementPresent(element);
        try{
            element.click();
        }catch(Exception e){
            System.out.println("Some exception occurred while clicking at" + element);
        }
    }

    public static String doGetText(WebElement element){
        waitForElementPresent(element);
        try{
            return element.getText();
        }catch (Exception e){
            System.out.println("Some exception occurred while getting text from" + element);
            return null;
        }
    }

    public static boolean doIsDisplayed(WebElement element) {
        waitForElementPresent(element);
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Some exception occurred while checking if element is displayed or not " + element);
            return false;
        }
    }
}
