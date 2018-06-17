package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		
		WebDriver drv = new ChromeDriver();

		//drv.manage().window().maximize();

		String url = "http://opensource.demo.orangehrmlive.com/";

		drv.get(url);

		String Title = drv.getTitle();
		String expectedTitle = "OrangeHRM";

		if (Title.equals(expectedTitle)) {
			System.out.println("The maint page successfully loaded. WELCOME");

		} else {
			System.out.println("Page is unaccessible. Please try again");

			WebElement username = drv.findElement(By.id("txtUsername"));
			WebElement password = drv.findElement(By.id("txtPassword"));
			WebElement loginBtn = drv.findElement(By.xpath("btnLogin"));

			username.sendKeys("Admin");
			password.sendKeys("admin");
			loginBtn.click();

			String expectedUrl = "http://opensource.demo.orangehrmlive.com/index.php/dashboard";

			if (drv.getCurrentUrl().equals(expectedUrl))
				;
			{

				System.out.println("It works");

			}

		}

	}

}