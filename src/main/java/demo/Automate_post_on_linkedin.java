package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_post_on_linkedin {
  ChromeDriver driver;
  public Automate_post_on_linkedin()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
/**
 * @throws InterruptedException
 * 
 */
public void  Post_on_LinkedIn() throws InterruptedException{
  driver.get("https://www.linkedin.com/home");
  //Thread.sleep(3000);
  driver.findElement(By.xpath("//input[@id='session_key']")).clear();
   driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("sasmita.kuttymohanty@gmail.com");
   
    driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("cona@12345");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     WebElement login = driver.findElement(By.xpath("//li-icon[@type='app-linkedin-bug-color-icon']"));
        login.isDisplayed();
        System.out.println("linked in open succefully");
        
         driver.findElement(By.xpath("//span[text()='Profile viewers']")).click();
         Thread.sleep(2000);
       driver.findElements(By.xpath("//li[@class='member-analytics-addon-summary__list-item']//div")).size();
         // WebElement count=driver.findElement(By.xpath("//li//div//p[1]"));
//count.getSize();
         // System.out.println("no of view"+count);
         // List<String> count=new ArrayList<String>();
         // int count=driver.findElements(By.xpath("//li[@class='member-analytics-addon-summary__list-item']//div")).size();
         // count.size();
          //System.out.println("no of view"+count);
driver.findElement(By.xpath("//li-icon[@type='app-linkedin-bug-color-icon']")).click();
  Thread.sleep(2000);
 //driver.findElement(By.xpath("//span[text()='Post impressions']")).click();
 driver.findElement(By.xpath("//a[@class='ember-view full-width']//span[text()='Post impressions']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//li-icon[@type='app-linkedin-bug-color-icon']")).click();
  //driver.findElement(By.xpath("//span[text()='Start a post']")).click();
   Thread.sleep(2000);
  //button[@type='button']//div//div[@type='circle']
  // start witha a post in linkedin	Using Locator "XPath"	//button[@id='ember35'].click()
  driver.findElement(By.xpath("//button[@id='ember42']")).click();
  //Thread.sleep(3000);
  // select a image button	Using Locator "XPath"	//span[@id='ember355']/button 
  driver.findElement(By.xpath("(//span[@class='share-promoted-detour-button__icon-container'])[1]")).click();
  //Thread.sleep(3000);
  driver.findElement(By.xpath("//button[@type='button']//div//div[@type='circle']")).click();
 // 
  WebElement fileInput = driver.findElement(By.xpath("//input[@id='image-sharing-detour-container__file-input']"));
  //     Send the Path of the File to the Element:		fileInput.sendKeys("path/to/your/photo.jpg");
  //C:\Users\Sk.Siraj\Pictures\sports fashionreset.jpg.g
 fileInput.sendKeys("C:\\Users\\Sk.Siraj\\Pictures\\Screenshots\\Screenshot (592).png");
 // Thread.sleep(3000);
  // submit the form		
  // click on the done button	Using Locator "XPath"	//button[contains(@class,'share-box-footer__primary-btn artdeco-button')]
  //driver.findElement(By.xpath("//button[contains(@class,'share-box-footer__primary-btn artdeco-button')]")).click();
   
   //Thread.sleep(2000);
   //driver.findElement(By.xpath("//button//span[text()='Done']")).click();
   // Thread.sleep(2000);
   //driver.findElement(By.xpath(" //div[@class='ql-editor']"));
   //driver.findElement(By.xpath("//button//span[text()='Post']")).click();
   // Thread.sleep(2000);
  //div[@class='ql-editor']

} 

  
}
