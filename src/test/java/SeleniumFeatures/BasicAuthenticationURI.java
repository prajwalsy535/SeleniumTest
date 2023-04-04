package SeleniumFeatures;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthenticationURI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		DevTools devTools = driver.getDevTools();
		
		Predicate<URI> uriPredicate = uri->
			{uri.getHost().contains("httpbin.org");
			
			System.out.println(uri);
			return false;
			};
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		
		
	}
}
