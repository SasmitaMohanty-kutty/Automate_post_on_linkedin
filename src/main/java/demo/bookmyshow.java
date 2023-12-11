package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bookmyshow {
  ChromeDriver driver;
   public bookmyshow()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        //driver.close();
        driver.quit();

    }
    public  void bookshow(){
      System.out.println("Start Test case: testCase01");
      driver.get("https://in.bookmyshow.com/explore/home/chennai");
      System.out.println("bookmyshow open");
      //List<WebElement>recomded= driver.findElements(By.xpath("//h2[contains(text(),'Recommended Movies')]/../../../..//img"));
      //for(int i=0;i<recomded.size();i++){
//System.out.println(recomded.get(i).getText());

      //}

      List<WebElement> recommendemovie=  driver.findElements(By.xpath("//h2[contains(text(),'Recommended Movies')]/../../../..//img"));
     
        for (WebElement element : recommendemovie) {
          String movie=element.getAttribute("src");
System.out.println("Value of autocomplete attribute: "+movie);

List<WebElement> Premieres=  driver.findElements(By.xpath("//h2[contains(text(),'Premieres')]/../../../..//img"));
for (WebElement element2 : Premieres) {
	String movee=element2.getAttribute("alt");
    //String movie2=element2.getAttribute("alt");
System.out.println(" autocomplete attribute2: "+movee);



}

    }
     
  }

  
}
