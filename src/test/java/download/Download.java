package download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Download {
    public static void main(String[] arg){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://rahulshettyacademy.com/upload-download-test/");
        driver.findElement(By.id("downloadButton")).click();
       WebElement upload= driver.findElement(By.cssSelector(".upload"));
       upload.sendKeys("/home/amit/Downloads/download.xlsx");
        By toastLocator=By.cssSelector(".Toastify_toast-body div:nth-child(2");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

       // WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
        String toast=   driver.findElement(toastLocator).getText();
     System.out.println(toast);
        Assert.assertEquals("Updated Excel Data Successfully.",toast);
    }

}
