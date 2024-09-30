package Utility;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
	public ExtentHtmlReporter htmlreport;
	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;
	
	@BeforeSuite
	public void launch()   {
		 driver=new ChromeDriver();
		 driver.get("https://practice.expandtesting.com/");
		 driver.manage().window().maximize();
				
			}

}
