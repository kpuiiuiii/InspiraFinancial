package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedfinMainPage {

    public RedfinMainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='searchInputNode']/div/form/div/div/input")
    public WebElement redfinSearchField;


    @FindBy(xpath = "//div[@class='searchInputNode']/div/form/div/button")
    public WebElement redfinSearchButton;






}
