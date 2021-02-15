import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://cleartrip.com");
		Select s= new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("5");
		Select p = new Select(driver.findElement(By.id("Childrens")));
		p.selectByValue("3");
		Select m= new Select(driver.findElement(By.id("Infants")));
		m.selectByValue("2"); 
		driver.findElement(By.id("DepartDate")).click(); 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select t= new Select(driver.findElement(By.id("Class")));
		t.selectByValue("First");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Emirates");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
