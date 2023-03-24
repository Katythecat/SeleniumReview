package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropdown {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();
        WebElement countrydrp = driver.findElement(By.xpath("//select[@name='Country']"));
        Select select=new Select(countrydrp);
        //select.selectByVisibleText("France");
        //select.selectByValue("France");
        select.selectByIndex(12);// index from select start from 0
    }
}
