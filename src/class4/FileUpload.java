package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("C:\\Users\\Wilasinee Ramirez\\Documents\\About CNA\\food handlers permit.pdf");

        // Note: This will work only for those file upload button for which the tag name is input and type is file
        // sendKeys use
        // 1. entering values in the text boxes
        // 2. uploading the file
        // 3. for performing the keyboard interactions


    }

}
