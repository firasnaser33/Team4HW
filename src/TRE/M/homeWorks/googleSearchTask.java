package TRE.M.homeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

public class googleSearchTask {

    public static void main(String[] args) throws InterruptedException {

        //TASK: Google search


        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");


        //3- Write "orange" in search box
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");

        Thread.sleep(3000);

        //4- Click google search button

        WebElement googleSearchButton= driver.findElement(By.name("btnK"));
        googleSearchButton.click();


        //5- Verify title:
        //Expected: Title should start with "apple" word
        String expectedTitle="apple";
        String actualTitle= driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed For apple");
        }else{
            System.out.println("Failed For apple");
            System.out.println("actualTitle = " + actualTitle);
        }
        Thread.sleep(3000);

        //6-navigate back

        driver.navigate().back();
     Thread.sleep(3000);
        //7-write cherry in search box

        driver.findElement(By.name("q")).sendKeys("cherry" + Keys.ENTER );


        //8-verify title contains cherry.



        String ContainsTitle="cherry";
        String actualTitle2=driver.getTitle();
        if (actualTitle.contains(ContainsTitle)){
            System.out.println(" Title Passed");
        }else{
            System.out.println(" title Failed");
            System.out.println("actualTitle = " + actualTitle2);
        }

        Thread.sleep(3000);
        driver.close();
    }
}
