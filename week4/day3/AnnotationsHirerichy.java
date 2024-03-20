package week4.day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHirerichy {
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  @Test
  public void test3() {
	  System.out.println("Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("Before Method2");
  }

  @AfterMethod
  public void afterMethod2() {
	  System.out.println("After Method 2");
  }

  @BeforeClass
  public void beforeClass2() {
	  System.out.println("Before Class2");
  }

  @AfterClass
  public void afterClass2() {
	  System.out.println("After class2");
  }

  @BeforeTest
  public void beforeTest2() {
	  System.out.println("Before Test2");
  }

  @AfterTest
  public void afterTest2() {
	  System.out.println("After Test2");
  }

  @BeforeSuite
  public void beforeSuite2() {
	  System.out.println("Before Suite2");
  }

  @AfterSuite
  public void afterSuite2() {
	  System.out.println("After Suite2");
  }

}
