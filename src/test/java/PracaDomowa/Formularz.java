package PracaDomowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formularz {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement signIn = driver.findElement(By.id("_desktop_user_info"));
        signIn.click();
        WebElement creatingAccount = driver.findElement(By.xpath("//*[@id='content']/div/a"));
        creatingAccount.click();
        driver.navigate().back();
        driver.navigate().back();
    }
}