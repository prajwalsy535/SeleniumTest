package SeleniumFeatures;

import java.util.Optional;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.network.Network;
import org.openqa.selenium.devtools.v108.network.model.ConnectionType;
import org.openqa.selenium.devtools.v108.network.model.LoadingFailed;
import org.openqa.selenium.edge.EdgeDriver;



public class EmulateNetworkSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		Optional<Integer> empty = Optional.empty();
		devTools.send(Network.enable(empty, empty, empty));
		//Command<Void> org.openqa.selenium.devtools.v108.network.Network.emulateNetworkConditions(Boolean offline,
		//Number latency, Number downloadThroughput,
		//Number uploadThroughput, Optional<ConnectionType> connectionType)
		ConnectionType connectionType = ConnectionType.ETHERNET;
		devTools.send(Network.emulateNetworkConditions(true, 3000, 20000, 20000,Optional.of(connectionType)));
		
		devTools.addListener(Network.loadingFailed(), LoadingFailed->
			{
				
				System.out.println(LoadingFailed.getErrorText());
				System.out.println(LoadingFailed.getTimestamp());
				
			}
		
				
				);
		
		driver.get("https://www.google.co.in/");
		

	}

}
