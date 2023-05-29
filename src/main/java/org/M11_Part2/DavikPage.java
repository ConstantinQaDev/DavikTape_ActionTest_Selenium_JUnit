package org.M11_Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DavikPage extends PageBase{

    public DavikPage(WebDriver driver){
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//*[text()='Home']")
    public WebElement homeButton;
    @FindBy(how = How.XPATH, using = "//a[text()='Company']")
    public WebElement companyButton;
    @FindBy(how = How.XPATH, using = "//*[text()='Products']")
    public WebElement productsButton;
    @FindBy(how = How.XPATH, using = "//*[text()='Industries']")
    public WebElement industriesButton;
    @FindBy(how = How.XPATH, using = "//*[text()='Knowledge Center']")
    public WebElement knowledgeIndustriesButton;
    @FindBy(how = How.XPATH, using = "//*[text()='CONTACT']")
    public WebElement contactButton;
}
