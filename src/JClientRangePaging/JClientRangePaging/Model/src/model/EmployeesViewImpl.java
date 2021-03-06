/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package model;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ViewObjectImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class EmployeesViewImpl extends ViewObjectImpl 
{
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public EmployeesViewImpl()
  {
  }

  protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams)
  {
    if (getAccessMode() == RANGE_PAGING_AUTO_POST ) {
      System.out.println("### Executing EmployeesView in RANGE_PAGING_AUTO_POST Access Mode ###");      
    }
    else 
    {
      System.out.println("### Executing EmployeesView in Normal Access Mode ###");            
    }
    super.executeQueryForCollection(qc, params, noUserParams);
  }
}
