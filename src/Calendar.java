

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='flatpickr-calendar animate arrowTop open'] [class='flatpickr-month']")).getText().contains("August"))
		{
			driver.findElement(By.cssSelector("[class='flatpickr-calendar animate arrowTop open'] span[class='flatpickr-next-month']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		
		//Grab common attribute/put into the list and iterate
		
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for(int i = 0; i<count; i++) 
		{
			String Text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(Text.equalsIgnoreCase("6"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
	}

}
