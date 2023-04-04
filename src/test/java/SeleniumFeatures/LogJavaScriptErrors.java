package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class LogJavaScriptErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("q");
		
		driver.findElement(By.name("q")).sendKeys("https://rahulshettyacademy.com/angularAppdemo/", Keys.ENTER);
		LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
		
	}

}
