package CoreLogic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonLogics {
	static WebDriver driver;
	 static WebDriverWait wait;
	
	 public static void initializeDriver() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	 }
	 
	 public static void hitUrl() {
			driver.get(ConfigReader.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	 
	public static void clickElement(String xpath) {
	    try {
	        WebElement element = driver.findElement(By.xpath(xpath));
	        element.click();
	        System.out.println("Successfully clicked on the element: " + xpath);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void enterText(String xpath, String text) {
	    try {
	        WebElement element = driver.findElement(By.xpath(xpath));
	        element.clear();
	        element.sendKeys(text);
	        System.out.println("Successfully entered text into the element: " + xpath);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static String getText(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element.getText(); 
    }

	public static void scrollByElement() throws InterruptedException {
		Thread.sleep(4000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	public static void waitForElementToBeVisible(String xpath) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public static void waitForElementToBeClickable(String xpath) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
    
    public static void quit() {
		driver.quit();
}
}
