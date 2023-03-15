package class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebDriverDemo1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        // driver.get("https://www.google.com/");//if "www.google.com/" it won't work
        //but if "https://google.com/"  it will work

        driver.navigate().to("https://www.google.com/");



    }
}
