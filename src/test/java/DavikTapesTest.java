import org.M11_Part2.DavikPage;
import org.M11_Part2.PageBase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

import static org.M11_Part2.Constant.DAVIKTAPES_HOME_PAGE_URL;


public class DavikTapesTest {
    private static WebDriver driver;
    DavikPage davikPage = new DavikPage(driver);

    @BeforeAll
    public static void classSetUp() {
        driver = PageBase.getWebDriver();
        driver.get(DAVIKTAPES_HOME_PAGE_URL);
    }

    @AfterAll
    public static void classTearDown(){
        PageBase.closeBrowser();
    }

    @Test
    public void actionTest() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Home']")));

       WebElement homeButtonElement = driver.findElement(By.xpath("//*[text()='Home']"));
       homeButtonElement.click();
       assertNotNull(homeButtonElement);

        WebElement companyButtonElement = driver.findElement(By.xpath("//a[text()='Company']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(companyButtonElement).build().perform();
        assertNotNull(companyButtonElement);
        Thread.sleep(2000);

        WebElement productsButtonElement = driver.findElement(By.xpath("//*[text()='Products']"));
        actions.moveToElement(productsButtonElement).build().perform();
        assertNotNull(productsButtonElement);
        Thread.sleep(2000);

        WebElement industriesButtonElement = driver.findElement(By.xpath("//*[text()='Industries']"));
        actions.moveToElement(industriesButtonElement).build().perform();
        assertNotNull(industriesButtonElement);
        Thread.sleep(2000);

        WebElement knowledgeIndustriesButtonElement = driver.findElement(By.xpath("//*[text()='Knowledge Center']"));
        actions.moveToElement(knowledgeIndustriesButtonElement).build().perform();
        assertNotNull(knowledgeIndustriesButtonElement);
        Thread.sleep(2000);

        WebElement contactsButtonElement = driver.findElement(By.xpath("//*[text()='CONTACT']"));
        contactsButtonElement.click();
        assertNotNull(contactsButtonElement);
        Thread.sleep(2000);
    }
}
