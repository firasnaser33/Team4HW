package TRE.M.homeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class googleImageTask {


    public static void main(String[] args) throws InterruptedException {

//task2
         //1- Open a chrome browser and go to google
        //2- Click to Images link from top right
        //3- Verify Title contains Images, expected: "Images

        WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(3000);

        // click to Image link
        driver.findElement(By.linkText("Images")).click();
        driver.findElement(By.partialLinkText("Ima")).click();



        // verify title contains Images. expected "Images"
        String containsTitle="Images";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(containsTitle)){
            System.out.println("Passed for Images");
        }else {
            System.out.println("Failed For Images !!!!");
            System.out.println("actualTitle = " + actualTitle);
        }

        Thread.sleep(3000);

        driver.close();
    }
}
