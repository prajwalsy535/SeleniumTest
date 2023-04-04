package SeleniumFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.network.Network;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.ImmutableList;

public class BlockNetworkRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedgee.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		DevTools devTool = driver.getDevTools();
		devTool.createSession();
		Optional<Integer> empty = Optional.empty();
		devTool.send(Network.enable(empty, empty, empty));
		List urls = new ArrayList();
		urls.add(empty);
		urls.add(empty);
		devTool.send(Network.setBlockedURLs(ImmutableList.of("*.jpg*","*.css*")));
		


		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//a[@routerlink='/products']")).click();
	}

}
