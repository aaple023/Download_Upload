import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Pagination {
    public static void main(String []args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://mui.com/base-ui/react-table-pagination/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1300)");
       WebElement web= driver.findElement(By.id(":Rnalhpl6kud6:"));
        Select sc=new Select(web);
        int size = sc.getOptions().size();
        System.out.println(size);
     List<WebElement> allFruit = driver.findElements(By.xpath("//tbody/tr/td[1]"));
     int i=0;
        List<WebElement> dount;
     do {
        dount= allFruit.stream().filter(s->s.getText().contains("Oreo")).collect(Collectors.toList());
         driver.findElement(By.xpath("(//button[@aria-label='Go to next page'])[3]")).click();

     }while (i>0);



    }
}
