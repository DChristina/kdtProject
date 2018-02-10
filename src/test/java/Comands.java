import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Comands {
    WebDriver driver;

    public void OpenChrome(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\chromedriver.exe");
        driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    }
    public void EnterURL(String s){
        driver.get(s);
    }
    public void EnterSearchField(String a){
        driver.findElement(By.xpath("//input[@id=\"lst-ib\"]")).sendKeys(a);
        driver.findElement(By.xpath("//div[@id=\"gb\"]")).click();
    }
    public void ClickOnSearchButton(){
        driver.findElement(By.xpath("//input[@name=\"btnK\"]")).click();

    }
    public void GoTo3dLink(){
        driver.findElement(By.xpath("//div[@class=\"g\"][3]//a")).click();
    }
}
