import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://tlee753.com");

        WebElement tutorialButton = driver.findElement(By.xpath("(//div[@class='button'])[2]"));
        System.out.println(tutorialButton.getText());
        tutorialButton.click();

        WebElement guideLink = ((ChromeDriver) driver).findElementByLinkText("Guide");
        guideLink.click();

        WebElement nextArrow = driver.findElement(By.xpath("(//div[@class='controls-arrow'])[2]"));
        nextArrow.click();
        nextArrow.click();
        nextArrow.click();
        nextArrow.click();
        nextArrow.click();

        driver.quit();
    }
}
