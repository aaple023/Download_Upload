package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
    WebDriver driver;
    public Login1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='btn ml-3']")
    WebElement items;
    @FindBy(id = "email")
    WebElement userName;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(css = ".btn.btn-outline-primary.btn-block")
    WebElement ClickUp;
    @FindBy(css = ".text-success")
    WebElement ClickUp1;
    public  void loginUser(String user, String pass){
        items.click();
        userName.sendKeys(user);
        Password.sendKeys(pass);
        ClickUp.click();
        ClickUp1.click();

    }
    public void closeUp1(){
        driver.close();
    }


}
