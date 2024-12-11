package com.project.step_definitions;

import com.project.pages.RedfinMainPage;
import com.project.pages.RedfinSearchRestultsPage;
import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {

    RedfinMainPage rf;
    RedfinSearchRestultsPage rfs;

    Actions action;


    @Test
    public void test1() {

        rf = new RedfinMainPage();
        rfs = new RedfinSearchRestultsPage();


        Driver.getDriver().get("https://www.redfin.com/");

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        rf.redfinSearchField.click();
        rf.redfinSearchField.sendKeys("Chicago");

        rf.redfinSearchButton.click();

        rfs.priceDropdownButton.click();

        rfs.minField.sendKeys("200000");
        rfs.maxField.sendKeys("300000");

        rfs.searchDoneButton.click();

        List<String> list = new ArrayList<>();


        List<String> arrayList = BrowserUtils.getElementsText(rfs.allPrices);

        rfs.secondPageButton.click();

        arrayList.addAll(BrowserUtils.getElementsText(rfs.allPrices));

        for (String word : arrayList) {
            //Integer.parseInt(word.replace("$", "").replace(","));

        }

    }


}
