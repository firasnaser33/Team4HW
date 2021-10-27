package TRE.M.homeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookVerificationTitle {

    //Facebook title verification Task




    public static void main(String[] args) throws InterruptedException {
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


       //Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


         Thread.sleep(2000);

        //Verify title: Expected: "Facebook - Log In or Sign Up"

        String expectedTitle= "Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println(" Title passed ");
        }else {
            System.out.println(" Title failed");
            System.out.println("actualTitle = " + actualTitle);
        }
        Thread.sleep(2000);


        driver.close();

    }
}
