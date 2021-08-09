package com.maruf.kube.app;

import org.openqa.selenium.chrome.ChromeDriver;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.56.106:9090");
		driver.findElementById("About Us").click();
		System.out.println("Ok");
		
	}
}
