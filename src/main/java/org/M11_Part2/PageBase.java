package org.M11_Part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageBase {
    private static WebDriver driver;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    public static WebDriver getWebDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void  closeBrowser(){
        if(driver!=null){
            driver.close();
        }
    }
}