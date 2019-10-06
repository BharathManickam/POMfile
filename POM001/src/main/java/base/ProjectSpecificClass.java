package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.GettingDataFromExcel;

public class ProjectSpecificClass {
	public String excelFileName; 
	public static ChromeDriver driver;
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public void appClose(){
		driver.close();
	}
	
	@DataProvider(name="CreateLeadData")
	public Object[][] getData() throws IOException{
		return GettingDataFromExcel.readExcel(excelFileName);
	}
	


}
