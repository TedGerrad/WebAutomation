import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.spicejet.com/"); 
		driver.findElement(By.id("divpaxinfo")).click(); 
		Thread.sleep(200L);
		
		/*	int i = 1;
		while(i<5) //because we want to click the button 4 times to get 5 passengers 
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // code that you want to be executed within the loop always exists within the block 
			i++;
		}*/
		
		for(int i=1; i<5; i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD"); 
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		
	}

}
