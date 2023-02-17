import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToScreen2Test  {

    @Test(priority = 6)
    public void movetoscreen2() {

        {
            WebElement element = Setup.driver.findElement(By.cssSelector("a > picture > img:nth-child(3)"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-furniture-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }

    }

    }