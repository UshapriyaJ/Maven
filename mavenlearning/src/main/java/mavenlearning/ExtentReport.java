package mavenlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extentreport = new ExtentReports();
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("extentreport.html");
    	extentreport.attachReporter(htmlreport);
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	ExtentTest testcase = extentreport.createTest("verify google");
    	testcase.pass("passed");
    	driver.quit();
    	extentreport.flush();
    	
	}

}
