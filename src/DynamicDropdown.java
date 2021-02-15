import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//navigate to spicejet.com
		//driver.get("https://www.spicejet.com/"); 
		driver.get("http://qaclickacademy.com/practice.php");
		//maximize window 
		driver.manage().window().maximize(); 
		//check 1st checkbox
		driver.findElement(By.cssSelector("input[value='option1']")).click(); 
		//verify that checkbox is successful 
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		//uncheck the checkbox
		driver.findElement(By.xpath("//*[@name = 'checkBoxOption1']")).click();
		//Verify checkbox is unchecked  
		System.out.println(driver.findElement(By.xpath("//*[@name = 'checkBoxOption1']")).isSelected());
		//count the number of checkboxes on the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//validate if a checkbox item is selected 
		//System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		//click on the checkbox
		//driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
		//validate if the checkbox item was selected
		//System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		//count the number of checkboxes on the page
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//click on the "from" dropdow
		//driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();  
		//click on "Delhi" in the "from" dropdown
		//driver.findElement(By.cssSelector("a[value='DEL']")).click(); 
		//click on the "to" dropdown 
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//click on "Hydrabad" in the "To" dropdown 
		//driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
		//driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date1']")).click();
		
	
	}

}
