package class4;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HoverAction {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        /*driver.get("https://demo.opencart.com/");
        WebElement hover=driver.findElement(By.xpath("//a[text()='Components']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(hover).perform();
        WebElement choose= driver.findElement(By.xpath("//a[contains(text() ,'Monitors')]"));
        //actions.moveToElement(choose).click().perform();
        choose.click(); // and it still works!!*/
        driver.get("https://www.amazon.com/");
        WebElement helloSignin= driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(helloSignin).perform();
        WebElement signin=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
        actions.moveToElement(signin).click().perform();
    }
}
