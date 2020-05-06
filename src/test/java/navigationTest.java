import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class navigationTest {

    private WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void checkDownloadsTab(){
        driver.navigate().to("https://www.selenium.dev/downloads");
        Assertions.assertThat(driver.getCurrentUrl().contains("downloads"));
    }


    @Test
    public void checkProjectsTab(){
        driver.navigate().to("https://www.selenium.dev/projects");
        Assertions.assertThat(driver.getCurrentUrl().contains("projects"));
    }

    @Test
    public void checkDocumentationTab(){
        driver.navigate().to("https://www.selenium.dev/documentation");
        Assertions.assertThat(driver.getCurrentUrl().contains("documentation"));
    }

    @Test
    public void checkSupportTab(){
        driver.navigate().to("https://www.selenium.dev/support");
        Assertions.assertThat(driver.getCurrentUrl().contains("support"));
    }

    @Test
    public void checkBlogTab(){
        driver.navigate().to("https://www.selenium.dev/blog");
        Assertions.assertThat(driver.getCurrentUrl().contains("blog"));
    }


}
