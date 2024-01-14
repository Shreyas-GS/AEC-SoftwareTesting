import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class App11 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\testing\\software testing\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        Thread.sleep(6000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//a[starts-with(@class, 'tab')]//span[contains(., 'News')]"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//div[starts-with(@class, 'eventcalendar_FilterSettings')]//div[contains(., 'Options and Filters')]"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[3]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[5]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[6]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[7]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
       
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[3]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[3]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[5]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[5]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[6]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[6]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[7]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[7]/div/div/div[2]/span"))).click();
        
        driver.quit();
    }
}