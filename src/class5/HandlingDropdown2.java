package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropdown2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();
        WebElement countrydrp = driver.findElement(By.xpath("//select[@name='Country']"));
        Select country=new Select(countrydrp);
        List<WebElement> countryList = country.getOptions();//get options we have to use with loop
        for(WebElement c:countryList){
            String countryName=c.getText();
            if(countryName.equalsIgnoreCase("Fiji")){
                c.click();
                break;
            }





        }




    }
}
