package SeleniumFeatures;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.fetch.Fetch;
import org.openqa.selenium.devtools.v108.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v109.network.model.ErrorReason;
import org.openqa.selenium.edge.EdgeDriver;

public class ApiResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		DevTools devTool = driver.getDevTools();
		devTool.createSession();
		//Optional<List<RequestPattern>> patterns, Optional<Boolean> handleAuthRequests)
		Optional<List<RequestPattern>> patterns=Optional.empty();
		Optional<Boolean> num = Optional.empty();
		devTool.send(Fetch.enable(patterns, num));
		devTool.addListener(Fetch.requestPaused(), res->{
				
			if(res.getRequest().getUrl().contains("shetty")) {
				String url = res.getRequest().getUrl().replace("shetty", "BadGuy");
				System.out.println(url);
				
			
			//(RequestId requestId, Optional<String> url, Optional<String> method, Optional<String> postData,
			//Optional<List<HeaderEntry>> headers, Optional<Boolean> interceptResponse)
			//devTool.send(Fetch.continueRequest(res.getRequestId(),   	Optional.of(url), num,num));
			
			
			
	
		
		//devTool.send(org.openqa.selenium.devtools.v108.fetch.Fetch.failRequest(res.getRequestId(), ErrorReason.FAILED))
			}
		});
				
	
		
	
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[@routerlink='/library']")).click();
		
	}

}
