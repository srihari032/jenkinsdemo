package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\harish program\\softwares\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/"); 
	    
	}

}
