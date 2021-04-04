package Ketan;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import Ketan.NTHomePagePOImproved;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class NTHomePageTest {
	NTHomePagePOImproved myHomePage;
	
  @Test
  public void loginNT() {
	  String expectedTitle = "My account";
	  myHomePage.login("stc123", "12345");
	  assertEquals(myHomePage.getTitleAfterLogin(),expectedTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  myHomePage = new NTHomePagePOImproved();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
