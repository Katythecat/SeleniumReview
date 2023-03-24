package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropdownWithoutSelectTag {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();

        //click dropdown without select tag
        WebElement bankDrp = driver.findElement(By.xpath("//span[@aria-labelledby='passengers-label']"));
        bankDrp.click();

        //find list of all dropdown
        List<WebElement> listOfdrp = driver.findElements(By.xpath("//ul[@id='passengers-desc']/li"));
        for(WebElement l:listOfdrp){
            String s=l.getText();
            if(s.equalsIgnoreCase("9 Passengers")){
                l.click();
                break;
            }







        }




    }
}
