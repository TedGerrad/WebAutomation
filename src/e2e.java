import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//navigate to spicejet.com
		driver.get("https://www.spicejet.com/"); 
		//maximize window 
		driver.manage().window().maximize();   
		//Click on the "from" dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		//Click on Delhi
		driver.findElement(By.xpath("//a[@value='DEL']")).click(); 
		Thread.sleep(4000); 
		//On the destination dropdown, traverse from parent to child and click on Chennai
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//to click on a calender 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
		
		System.out.println("It is disabled");
		Assert.assertTrue(true);
		
		}
		else 
		{
			Assert.assertFalse(false);
			}
		//to click on family and friends checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); 
		//to select passengers button
		driver.findElement(By.id("divpaxinfo")).click(); 
		Thread.sleep(4000L);
		//to select 5 passengers 
		for (int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		Thread.sleep(4000L);
		driver.findElement(By.cssSelector("[name='ctl00$mainContent$DropDownListCurrency']")).click();
		driver.findElement(By.cssSelector("option[value='USD']")).click(); 
		Thread.sleep(4000L);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		}

}
