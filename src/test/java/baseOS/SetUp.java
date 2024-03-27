package baseOS;

import Login.Login1;
import Product.Paging;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SetUp  {
   public static WebDriver driver;
    @BeforeMethod
    public static void setupLogin(){
        driver =new ChromeDriver();
        driver.get("http://ect.itlearn360.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }
    @Test
    public void mano(){

        Login1 log=new Login1(driver);
        log.loginUser("nkk2274221@gmail.com","12345");


    }
    @Test
    public void mano1(){
        Paging page=new Paging(driver);
        page.ProductAll();
        page.button();


    }
  /*  @AfterMethod
    public void closeup(){
        Login1 log=new Login1(driver);
        log.closeUp1();

    }*/
}
