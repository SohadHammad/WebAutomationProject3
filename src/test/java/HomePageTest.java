import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomePageTest {

    @Test(priority = 1)
    public void verifyThatClickingClosePopUpClosesIt(){
        WebElement closePopUp = Setup.driver.findElement(By.xpath("//*[@id=\"cpwm-additionaldisclaimer3\"]/button"));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(closePopUp));
        closePopUp.click();
    }


    @Test(priority = 3)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement mainImage = Setup.driver.findElement(By.xpath("//*[@id=\"slider-container\"]/div/div/div/div/a/div/div/img[1]"));
        assertTrue(mainImage.isDisplayed());
    }



    @Test(priority = 3)
    public void verifyThatShopeNowButtonIsDisplayed() {
        WebElement shopNowButton = Setup.driver.findElement(By.xpath("//*[@id=\"home_topnav_layout_15_fillslot-7\"]/a/div"));
        assertTrue(shopNowButton.isDisplayed());
    }



    @Test(priority = 4)
    public void verifyThatNavegationBarIsHoverd() {

        {
            WebElement element = Setup.driver.findElement(By.cssSelector("a > picture > img"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
            assertTrue(element .isDisplayed());
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
            assertTrue(element .isDisplayed());
        }
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-decor-pillows-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
            assertTrue(element .isDisplayed());
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
            assertTrue(element .isDisplayed());
        }
    }

    @Test(priority =2)
    public void verifysearchwithoutclick() {

        Setup.driver.findElement(By.id("navsearchbox")).click();
        Setup.driver.findElement(By.id("navsearchbox")).sendKeys("table");
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-gifts-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
    }

    @Test(priority =5)
    public void verifyviewchart() {
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-inspiration-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.cssSelector(".ml-header-global-cart-label")).click();
    }
    }