import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class App11 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/sujay/Desktop/Sem 5/Software testing/Lab/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.get("https://store.steampowered.com/");
        Thread.sleep(6000);

        //News
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//a[starts-with(@class, 'tab')]//span[contains(., 'News')]"))).click();
        Thread.sleep(4000);

        //Options ans filters
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//div[starts-with(@class, 'eventcalendar_FilterSettings')]//div[contains(., 'Options and Filters')]"))).click();
        Thread.sleep(4000);

        //checking the first check box "EVENTS"
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);

        //checking the first check box "LIVE-STREAMS"
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[3]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);
        
        //checking the first check box "CONTENT UPDATES"
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);

        //checking the first check box "RELEASES"
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[5]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);

        //checking the first check box "SALES"
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[6]/div/div/div[2]/span"))).click();
        Thread.sleep(1000);

        //checking the first check box "NEWS"
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[7]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
       

        //checking the boxes and printing the data 

        //the first check box
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);

        System.out.println("The elements titles in EVENTS are :");

        WebElement appNameElement1 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[1]/a/div/div/div[1]/div[2]/div[1]/div[1]/div/div"));
        String appNameText1 = appNameElement1.getText();
        System.out.println("Element1 Text: " + appNameText1);

        WebElement appNameElement2 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/a/div/div/div[1]/div[2]/div[1]/div[1]/div/div"));
        String appNameText2 = appNameElement2.getText();
        System.out.println("Element2 Text: " + appNameText2);

        WebElement appNameElement3 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[3]/a/div/div/div[1]/div[2]/div[1]/div[1]/div/div"));
        String appNameText3 = appNameElement3.getText();
        System.out.println("Element3 Text: " + appNameText3 +"\n\n");


        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);




        //second check box
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[3]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);

        System.out.println("The elements titles in LIVE-STREAMS are :");

        WebElement appNameElement4 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[1]/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText4 = appNameElement4.getText();
        System.out.println("Element1 Text: " + appNameText4);

        WebElement appNameElement5 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[3]/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText5 = appNameElement5.getText();
        System.out.println("Element2 Text: " + appNameText5 +"\n\n");

        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[3]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);


        //third check box

        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);
        
        System.out.println("The elements titles in CONTENT UPDATES are :");

        WebElement appNameElement6 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/div[2]/div/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText6 = appNameElement6.getText();
        System.out.println("Element1 Text: " + appNameText6);

        WebElement appNameElement7 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/div[3]/div/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText7 = appNameElement7.getText();
        System.out.println("Element2 Text: " + appNameText7 + "\n\n");

        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);



        // fourth check box
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[5]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);

        System.out.println("The elements titles in RELEASES are :");

        WebElement appNameElement8 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/div[2]/div/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText8 = appNameElement8.getText();
        System.out.println("Element1 Text: " + appNameText8);

        WebElement appNameElement9 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[9]/div/div[2]/div/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText9 = appNameElement9.getText();
        System.out.println("Element2 Text: " + appNameText9 + "\n\n");


        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[5]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);


        // fifth check box
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[6]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);

        System.out.println("The elements titles in SALES are :");

        WebElement appNameElement10 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[1]/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText10 = appNameElement10.getText();
        System.out.println("Element1 Text: " + appNameText10);

        WebElement appNameElement11 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText11 = appNameElement11.getText();
        System.out.println("Element2 Text: " + appNameText11+"\n\n");

        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[6]/div/div/div[2]/span"))).click();
        Thread.sleep(4000);
        

        //sixth checkbox
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[7]/div/div/div[2]/span"))).click();
        Thread.sleep(2000);

        System.out.println("The elements titles in NEWS are :");

        WebElement appNameElement12 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText12 = appNameElement12.getText();
        System.out.println("Element1 Text: " + appNameText12);

        WebElement appNameElement13 = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div/a/div/div/div[1]/div[2]/div[2]"));
        String appNameText13 = appNameElement13.getText();
        System.out.println("Element2 Text: " + appNameText13+"\n\n");

        wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("/html/body/div[1]/div[7]/div[6]/div[3]/div/div/div[1]/div/div[3]/div/div[3]/div[1]/div[7]/div/div/div[2]/span"))).click();
        
        driver.quit();
    }
    public static void firstCheckBox()
    {
        
    }
}



