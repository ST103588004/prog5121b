/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class bill {
  private String sCustomer;
  private double dbminutes,dbCosts ;
  public bill (String sName , double dbMinutesss, double dbCostPerMinutes){
  sCustomer = sName ;
  dbminutes = dbMinutesss;
  dbCosts = dbCostPerMinutes ;
  
         
 
          }
    
  public String GetName (){
      return sCustomer ;
      
  }
 public double GetTotalBills () {
     return (dbminutes * dbCosts) ;
 }
}
