import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tlee12\\IdeaProjects\\seleniumTest\\src\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tlee12\\IdeaProjects\\seleniumTest\\src\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\tlee12\\IdeaProjects\\seleniumTest\\src\\MicrosoftWebDriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Users\\tlee12\\IdeaProjects\\seleniumTest\\src\\IEDriverServer.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");

        driver.quit();
    }
}