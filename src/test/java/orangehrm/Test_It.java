package orangehrm;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_It {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver drv = new ChromeDriver();

		drv.manage().window().maximize();

		drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String url = "http://opensource.demo.orangehrmlive.com/";

		drv.get(url);

		String Title = drv.getTitle();
		String expectedTitle = "OrangeHRM";

		if (Title.equals(expectedTitle)) {
			System.out.println("The maint page successfully loaded. WELCOME");

		} else {
			System.out.println("Page is unaccessible. Please try again");
		}

	}

}
