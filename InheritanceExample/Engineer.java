package com.InheritanceExample;

public class Engineer extends Employee
{
  private String designation;
  /**
   * @param designation the designation to set
   */
  public void setDesignation(String designation)
  {
  	this.designation = designation;
  }
    
/**
 * @return the designation
 */
public String getDesignation()
{
	return designation;
}


}
