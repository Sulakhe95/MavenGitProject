package mvnproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {

		@Test
		public void mavenTwo()
		{
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("http://facebook.com");
		}

}
