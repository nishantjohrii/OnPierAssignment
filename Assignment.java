package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		
		//TestCase 1 : Launch the browser and open the Website
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://thg-greenair.dev.wgv.onpier.de/onboarding");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Test Case 2 : Verify the heading on the page
		String ActualTitle = driver.findElement(By.xpath("/html/body/app-root/div/div/app-default-landing-page/div/div/div[1]/h1")).getText();
		String ExpectedTitle = "Sichern Sie sich jetzt Ihre THG-Prämie von bis zu 360€!";
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	
		System.out.println("TC 2 passed successfully");
		
		//Test Case 3: Verify the Step 2
		String StepActual = driver.findElement(By.xpath("//*[@id=\"SoFunktionert\"]/div/div/div[2]/p")).getText();
		String StepExpected = "Geben Sie Ihre persönlichen Daten ein.";
		
		Assert.assertEquals(StepExpected, StepActual);
	
		System.out.println("TC 3 passed successfully");
		
		
		

	}

}
