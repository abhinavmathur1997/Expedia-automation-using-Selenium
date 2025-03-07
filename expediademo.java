package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class expediademo {
    public static void main(String[] args) throws NoSuchElementException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

    	    	  ChromeOptions options=new ChromeOptions();

  		options.addArguments("window-size=1920,1080");
        WebDriver driver = new ChromeDriver();
        
        
        	  
              try {
            driver.get("https://www.expedia.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           
                       // Wait for "Sign in" button and click
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign in')]")));
            signInButton.click();
            
            // Wait for "Flights" link and click
            WebElement flightsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Flights")));
            flightsLink.click();
            
            // Ensure proper field selection
            WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='Leaving from']")));
            searchField.sendKeys("Indira Gandhi International Airport(DEL)");
            searchField.sendKeys(Keys.RETURN);
       
      
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            Thread.sleep(8000); // Just to see the results before closing
           
        }
    }
}
