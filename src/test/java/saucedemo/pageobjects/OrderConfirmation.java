package saucedemo.pageobjects;

import org.openqa.selenium.By;
import saucedemo.base.BasePageObject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.By.xpath;

public class OrderConfirmation extends BasePageObject {

    private final By labelSuccessIcon = xpath("//*[@class='pony_express']");
    private final By labelSuccessMessageHeader = xpath("//*[@class='complete-header']");
    private final By labelSuccessMessageDescription = xpath("//*[@class='complete-text']");
    private final By buttonBackHome = xpath("//button[@id='back-to-products']");

    public void clickBackHomeButton(){
        driver.findElement(buttonBackHome).click();
    }

    public void checkSuccessImageIsDisplayed(){
        assertThat(driver.findElement(labelSuccessIcon).isDisplayed(), is(true) );
    }

    public void checkMessageHeaderIsDisplayed(){
        assertThat(driver.findElement(labelSuccessMessageHeader).isDisplayed(), is(true));
    }

    public void checkMessageDescriptionIsDisplayed(){
        assertThat(driver.findElement(labelSuccessMessageDescription).isDisplayed(), is(true));
    }

}