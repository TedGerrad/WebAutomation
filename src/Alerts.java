import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
