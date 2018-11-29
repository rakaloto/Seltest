import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/edureka/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.24.103");
		driver.findElement(By.id("About Us")).click();
	}

}
