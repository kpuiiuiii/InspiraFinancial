package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RedfinSearchRestultsPage {
    public RedfinSearchRestultsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='RichSelect__label flex align-center']/p[contains(text(), 'Price')]")
    public WebElement priceDropdownButton;


    @FindBy(xpath = "//input[@placeholder='Enter min']")
    public WebElement minField;

    @FindBy(xpath = "//input[@placeholder='Enter max']")
    public WebElement maxField;

    @FindBy(xpath = "//span[contains(text(), 'Done')]")
    public WebElement searchDoneButton;

    @FindBy(xpath = "//div[@data-rf-test-name='basicNode-homeCard']/div/div/div/span[@class='bp-Homecard__Price--value']")
    public List<WebElement> allPrices;


    @FindBy(xpath = "//div[@class='flex align-center']/a/span[contains(text(), '2')]")
    public WebElement secondPageButton;




}
