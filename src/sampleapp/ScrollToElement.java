package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noe\\Documents\\Jar Files and Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement nameInput = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);

        actions.moveToElement(nameInput);
        nameInput.sendKeys("Noe Esquivel");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2022");

        driver.quit();


    }

}
