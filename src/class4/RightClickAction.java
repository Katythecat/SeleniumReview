package class4;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class RightClickAction {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        // actions class use for mouse action
        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();  // contextclick use for right click
        //action.contextClick(rightClickBtn).build.perform();  // contextclick use for right click

        WebElement copyBtn=driver.findElement(By.xpath("//span[text()='Copy']"));
        copyBtn.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
}
