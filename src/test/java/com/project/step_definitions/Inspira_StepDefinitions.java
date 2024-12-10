package com.project.step_definitions;

import com.project.pages.InspiraContactUsPage;
import com.project.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

public class Inspira_StepDefinitions {

    InspiraContactUsPage contactUsPage;
    Actions actions;



    @Given("User is on the Contact Us Page")
    public void user_is_on_the_contact_us_page() throws InterruptedException {
        contactUsPage = new InspiraContactUsPage();
        Thread.sleep(3333);
        Driver.getDriver().get("https://inspirafinancial.com/individual/contact-us");
        Thread.sleep(5333);


        actions = new Actions(Driver.getDriver());
        actions.moveToElement(contactUsPage.iAmDropdown).perform();
        contactUsPage.iAmDropdown.click();



    }


}
