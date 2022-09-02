package com.calendario;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.BrowserFactory;
import driver.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import pageModel.AppCalendario;

public class CalendarioTest {
	WebDriver driver;
	BrowserFactory bf;
	AppCalendario gl;
	
  @Test
  public void f() {
	  gl = new AppCalendario(driver);
	  gl.scroll(gl.container(),"arriba");//(AndroidDriver)driver
	  gl.scroll(gl.container(),"abajo");
	  gl.scroll(gl.container(),"izquierda");
	  gl.scroll(gl.container(),"derecha");
	  //gl.longAlbum();
	  
  }
  
  @BeforeTest
  @Parameters("nodeUrl")
  public void buildDriver(String nodeUrl) {
	  try {
			bf = new BrowserFactory();
			DriverFactory.getInstance().setDriver(bf.setDriver(nodeUrl));
			driver = DriverFactory.getInstance().getDriver();
		} catch (Exception e) {
			e.getMessage();
		}
  }
  @AfterTest
  public void afterTest(){
	  
  }
}
