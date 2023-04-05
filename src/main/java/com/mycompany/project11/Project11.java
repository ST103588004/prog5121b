/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project11;
import javax.swing.* ;

/**
 *
 * @author david
 */
public class Project11 {

    public static void main(String[] args) {
       String sName = JOptionPane.showInputDialog(null,"Enter customer name");
       double dbMinsTaken = Double.parseDouble(JOptionPane.showInputDialog("enter mins"));
        double dbCost = Double.parseDouble(JOptionPane.showInputDialog("enter cost per min"));
        bill b = new bill(sName, dbMinsTaken,dbCost );
        JOptionPane.showMessageDialog(null,"Customer Name" + b.GetName().toUpperCase()+ "\n" + "Total due R " + b.GetTotalBills());
    }
}
