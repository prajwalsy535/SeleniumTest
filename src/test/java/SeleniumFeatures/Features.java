package SeleniumFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
import org.openqa.selenium.devtools.v108.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v108.page.model.Viewport;
import org.openqa.selenium.devtools.v108.runtime.model.WebDriverValue;
import org.openqa.selenium.edge.EdgeDriver;

public class Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedgee.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		/*System.setProperty("webdriver.chromee.driver", "./Softwares/chrome.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		
		
		//ChromeDriver driver=new ChromeDriver();
		
		
		/*WebDriver.chrome
				chromeOptions.add_experimental_option("prefs", {"profile.managed_default_content_settings.images": 2}) 
				chromeOptions.add_argument("--no-sandbox") 
				chromeOptions.add_argument("--disable-setuid-sandbox") 

				chromeOptions.add_argument("--remote-debugging-port=9222")  # this

				chromeOptions.add_argument("--disable-dev-shm-using") 
				chromeOptions.add_argument("--disable-extensions") 
				chromeOptions.add_argument("--disable-gpu") 
				chromeOptions.add_argument("start-maximized") 
				chromeOptions.add_argument("disable-infobars")
				chromeOptions.add_argument(r"user-data-dir=.\cookies\\test") 

				b = webdriver.Chrome(chrome_options=chromeOptions) 
				b.get("https://google.com/") 
				b.quit()
		
		
		
		
		
		
		/*System.setProperty("webdriver.chromee.driver", "./Softwares/chrome.exe");
		
		

		
		
		driver.get("https://www.google.co.in/");
		driver.quit();
		
		
		
		/*ChromeDriver driver=new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		
		//52,1*/
		//setGeolocationOverride for change the location 
		Map<String,Object> location=new HashMap<String,Object>();
		location.put("latitude", 45);
		location.put("longitude", 25);
		location.put("accuracy", 1);
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		driver.executeCdpCommand("Emulation.setGeolocationOverride", location);
		System.out.println("location");
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("restaurents near me",Keys.ENTER);
		
		
		
		
		
		
		
		
		/*devTools.send(Emulation.setDeviceMetricsOverride(700, 1000, 50, true,
				  Optional.<Integer>empty(), Optional.<Integer>empty(),
				  Optional.<Integer>empty(), Optional.<Integer>empty(),
				  Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.empty(),
				  Optional.<Integer>empty(), Optional.<Integer>empty()));
	  
		
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true,
				  100, 100,
				  Optional.<Integer>empty(), Optional.<Integer>empty(),
				  Optional.<Integer>empty(), Optional.<Boolean>empty(),
				  Optional.<ScreenOrientation>empty(), Optional.<Viewport>empty(),
				  Optional.<DisplayFeature>empty() ));
		driver.get("https://www.google.com/");

		/*
		 * ChromeDriver driver=new ChromeDriver(); DevTools devTools =
		 * driver.getDevTools(); devTools.createSession();
		 * 
		 * devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true,
		 * Optional.<Integer>empty(), Optional.<Integer>empty(),
		 * Optional.<Integer>empty(), Optional.<Integer>empty(),
		 * Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.empty(),
		 * Optional.<Integer>empty(), Optional.<Integer>empty()));
		 * devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true,,
		 * Optional.<Number>empty(), Optional.<Integer>empty(),
		 * Optional.<Integer>empty(), Optional.<Integer>empty(),
		 * Optional.<Integer>empty(), Optional.<Boolean>empty(),
		 * Optional.<ScreenOrientation>empty(), Optional.<Viewport>empty(),
		 * Optional.<DisplayFeature>empty()));
		 * 
		 * 
		 * /* devTools.send(Emulation.setDeviceMetricsOverride(700, 1000, 50, true,
		 * Optional.<Number> empty(), Optional.<Integer> empty(), Optional.<Integer>
		 * empty(), Optional.<Integer> empty(), Optional.<Integer> empty(),
		 * Optional.<Boolean> empty(), Optional.<ScreenOrientation> empty(),
		 * Optional.<Viewport> empty(), Optional.<DisplayFeature> empty()));
		 */
	}

}
