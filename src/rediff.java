import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://qaclickacademy.com/interview.php");
driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
//

//driver.findElement(By.xpath("//a[@href='interview.php']")).click();
//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/h2[1]")).isSelected();
//driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
//driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
//driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
//driver.findElement(By.cssSelector("a[title* ='Sign in']")).click();
	}

}
