import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	public static void main(String[] args) throws InterruptedException {
		try {
		String driver=System.getProperty("user.dir")+"\\Driver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driver);
		WebDriver driverpath=new FirefoxDriver();
		Thread.sleep(2000);
		driverpath.get("https://www.google.com/");
		driverpath.quit();
		}
		catch(Exception e)
		{
			System.out.println("The problem is......................................."+e);
		}
		
		

	}

}
