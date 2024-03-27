import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class stanlone {
    public static void main(String[] agrs){
        WebDriver driver =new ChromeDriver();
        driver.get("http://ect.itlearn360.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(By.xpath("//a[@class='btn ml-3']")).click();
        driver.findElement(By.id("email")).sendKeys("nkk2274221@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.cssSelector(".btn.btn-outline-primary.btn-block")).click();
        driver.findElement(By.cssSelector(".text-success")).click();//
        List<WebElement> item=driver.findElements(By.cssSelector(".thumbnail"));
      List<WebElement> all= driver.findElements(By.cssSelector(".thumbnail h3"));

      for (int i=0;i< all.size();i++){
       String g=all.get(i).getText();
       if (g.equalsIgnoreCase("Laptop Products")){
           driver.findElements(By.cssSelector(".thumbnail  p")).get(i).click();

       }
      }
      driver.findElement(By.cssSelector(".btn.menu-btn")).click();
       driver.findElement(By.xpath("//a[normalize-space()='Checkout']")).click();
       driver.findElement(By.id("empty-cart")).click();
       driver.findElement(By.id("buttonConfirm")).click();








    }
}
