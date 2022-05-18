package PracaDomowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        WebElement signIn = driver.findElement(By.id("_desktop_user_info"));
        signIn.click();
        WebElement creatingAccount = driver.findElement(By.xpath("//*[@id='content']/div/a"));
        creatingAccount.click();
        driver.navigate().back();
        driver.navigate().back();
    }
}