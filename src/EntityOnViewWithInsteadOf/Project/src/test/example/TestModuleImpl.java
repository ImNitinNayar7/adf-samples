/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.example;
import oracle.jbo.server.ApplicationModuleImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.example", "TestModuleLocal");
  }

  /**
   * 
   *  Container's getter for TestEntityView
   */
  public TestEntityViewImpl getTestEntityView() {
    return (TestEntityViewImpl)findViewObject("TestEntityView");
  }
}