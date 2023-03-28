package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        WebElement freeTrialBtn=driver.findElement(By.xpath("(//a[contains(@aria-label,'Start my free trial')])[1]"));
        freeTrialBtn.click();
        Set<String> windowIds = driver.getWindowHandles();
        for(String id:windowIds){
            driver.switchTo().window(id);
            if(driver.getTitle().contains("Free CRM")){
                driver.findElement(By.name("UserFirstName")).sendKeys("Katy");
                driver.findElement(By.name("UserLastName")).sendKeys("Pitt");
                WebElement jobTitle=driver.findElement(By.xpath("//select[@name='UserTitle']"));
                Select select=new Select(jobTitle);
                select.selectByValue("IT_Manager_AP");


            }
        }
    }
}