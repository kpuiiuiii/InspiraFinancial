package com.project.step_definitions;

import com.project.pages.RedfinMainPage;
import com.project.pages.RedfinSearchRestultsPage;
import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {

    RedfinMainPage rf;
    RedfinSearchRestultsPage rfs;

    Actions action;
    WebDriverWait wait;

    Actions actions;

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));

        rf = new RedfinMainPage();
        rfs = new RedfinSearchRestultsPage();

        Driver.getDriver().get("https://www.redfin.com/");

        wait.until(ExpectedConditions.elementToBeClickable(rf.redfinSearchField));
        rf.redfinSearchField.click();
        rf.redfinSearchField.sendKeys("Chicago");
        rf.redfinSearchButton.click();


        rfs.priceDropdownButton.click();
        rfs.minField.sendKeys("200000");
        rfs.maxField.sendKeys("300000");
        action = new Actions(Driver.getDriver());
        action.clickAndHold(rfs.searchDoneButton).pause(1111).perform();



        List<String> arrayList = BrowserUtils.getElementsText(rfs.allPrices);

        rfs.secondPageButton.click();


        arrayList.addAll(BrowserUtils.getElementsText(rfs.allPrices));

        System.out.println("arrayList = " + arrayList);

        for (String word : arrayList) {
            int integerNum = Integer.parseInt(word.replace("$", "").replace(",", ""));
            if (integerNum > 300000) {
                Assert.fail("more then 300000");

            } else if (integerNum < 200000) {
                Assert.fail("less then 200000");
            } else {
                Assert.assertTrue(true);
            }

        }
        Driver.getDriver().close();


    }

}
