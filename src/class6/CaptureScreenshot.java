package class6;


import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        TakesScreenshot tk=(TakesScreenshot) driver;
        File src=tk.getScreenshotAs(OutputType.FILE);
        File target=new File("C:\\Users\\Wilasinee Ramirez\\IdeaProjects\\ReviewSelenium\\Picture\\Screenshots\\saleforce.png");
        FileUtils.copyFile(src,target);
    }
}
