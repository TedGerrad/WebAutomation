import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//driver.close();
	}

}