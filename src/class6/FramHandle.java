package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramHandle {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.switchTo().frame("packageListFrame");
        WebElement firstFrame=driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium.bidi']"));
        firstFrame.click();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("packageFrame");
        WebElement secondFrame= driver.findElement(By.xpath("//span[text()='HasBiDi']"));
        secondFrame.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        WebElement thirdFrame=driver.findElement(By.xpath("//a[text()='FirefoxDriver']"));
        thirdFrame.click();
    }
}
