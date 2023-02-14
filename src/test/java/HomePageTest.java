import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest {
    SetUp baseTest= new SetUp();


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement mainImage = SetUp.driver.findElement(By.xpath("//*[@id=\"slider-container\"]/div/div/div/div/a/div/div/img[1]"));
        assertTrue(mainImage.isDisplayed());
    }



    @Test(priority = 1)
    public void verifyThatShopeNowButtonIsDisplayed() {
        WebElement shopNowButton = SetUp.driver.findElement(By.xpath("//*[@id=\"home_topnav_layout_15_fillslot-7\"]/a/div"));
        assertTrue(shopNowButton.isDisplayed());
    }

//    @Test (priority = 2)
//    public void verifyThatAcademyButtonIsDisplayed() {
//        WebElement academyButton = SetUp.driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
//        assertTrue(academyButton.isDisplayed());
//    }
//
//    @Test(priority = 3, enabled = false)
//    public void verifyThatClickingAcademyButtonOpensTheAcademy() {
//        WebElement academyButton = SetUp.driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
//        academyButton.click();
//        WebElement ikhlasElement = SetUp.driver.findElement(By.xpath("//div[@data-id='4b8df64']"));
//        assertTrue(ikhlasElement.isDisplayed());
//    }
//

}