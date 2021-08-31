package testNGpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGClass {
  @Test
  public void f() {
	  System.out.println("Testing...");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Running before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Running after method");
  }

}
