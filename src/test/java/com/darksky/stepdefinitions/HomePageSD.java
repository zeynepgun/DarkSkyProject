package com.darksky.stepdefinitions;


import com.darksky.base.ConfigReader;
import com.darksky.pages.HomePage;
import com.darksky.utils.ElementUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HomePageSD {
    @Given("I am on darksky homepage")
    public void verifyTitle(){
        Assert.assertEquals("Dark Sky - 1 City Hall, New York, NY", HomePage.verifyTitle());
    }


    @When("I enter the location in the location field")
    public void EnterTheLocation() {
        HomePage.chooseLocation("1113 Brittany Drive,Wayne,NJ");

    }



    @Then("I see the lowest and highest Temperatures")
    public void VerifyLowestAndHighestTemp() {
       // HomePage.getHighTemp();
      //  HomePage.getLowTemp();
        System.out.println(HomePage.getHighTemp());
        System.out.println(HomePage.getLowTemp());
        String actualtitle = HomePage.verifyTitle();
        System.out.println(actualtitle);
    }
}
