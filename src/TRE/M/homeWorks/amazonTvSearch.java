package TRE.M.homeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

public class amazonTvSearch {
    //task3

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        //1.open Chrome browser
       //2.Go to https://www.amazon.com
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com");


        //3.type TV on search box
        //4.then click on search button
        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("TV"+ Keys.ENTER);
       Thread.sleep(3000);
        //5.verify title
        String expectedTitle="TV";
        String actualTitled=driver.getTitle();

        if (actualTitled.contains(expectedTitle)){
            System.out.println(" TV Title Passed ");
        }else  {
            System.out.println(" TV Title failed ");
            System.out.println("actualTitled = " + actualTitled);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
