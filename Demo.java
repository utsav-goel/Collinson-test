import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hcl.com");
		driver.getCurrentUrl();
		driver.navigate().to("https://www.hcl.com/leadership/hcl-corporation");
		driver.manage().window().maximize();
		String founder = driver.findElement(By.className("leaders-name-inner")).getText();
		
		String expText = "Shiv Nadar";
		
		if(founder.contains(expText)){
            System.out.println("1) Expected text '"+expText+"' present in the web page.");
        }else{
            System.out.println("1) Expected text '"+expText+"' is not present in the web page.");
        }
		
		//driver.getTitle();
		
		//driver.findElement(By.id("gb_70")).click();
		//driver.close();
	}

}
