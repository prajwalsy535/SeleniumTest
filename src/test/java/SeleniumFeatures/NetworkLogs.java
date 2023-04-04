package SeleniumFeatures;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.network.Network;
import org.openqa.selenium.devtools.v110.network.model.Request;
import org.openqa.selenium.devtools.v110.network.model.Response;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.ImmutableList;

public class NetworkLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedgee.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		DevTools devTool = driver.getDevTools();
		devTool.createSession();
		Optional<Integer> num = Optional.empty();
		devTool.send(Network.enable(num,num,num));
		devTool.addListener(Network.responseReceived(), response->
		{
			Response res = response.getResponse();
			if(res.getStatus().toString().startsWith("4")) {
			System.out.println(res.getUrl()+" failed with  response code "+res.getStatus());
			//System.out.println(res.getStatusText());
			//System.out.println(res.getStatus());
			}
			
		});
		
		devTool.addListener(Network.requestWillBeSent(),  response->
			{
				Request res = response.getRequest();
				
				//System.out.println(res.getUrl());
			
			}
				
				);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[@routerlink='/library']")).click();
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.xpath("//a[@routerlink='/cart']")).click();
	
	}

}
