package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingCalendar {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        //1.Identify the date that I want to select
        String year="2023";
        String month="Aug";
        String date="19";
        //2 click on calendar
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
        while(true){
            //3. capture month and year
            String monthY=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String[] ym=monthY.split(" ");
            if(ym[0].equalsIgnoreCase(month) && ym[1].equalsIgnoreCase(year)){
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
                for(WebElement d:dates){
                    if(d.getText().equalsIgnoreCase(date)){
                        d.click();
                        break;
                    }
                }
            }else{
                driver.findElement(By.xpath("//td[@class='next']")).click();
            }
        }
    }
}
