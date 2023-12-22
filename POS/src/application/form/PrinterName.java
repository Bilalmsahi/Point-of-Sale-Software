/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.application.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BilalSahi
 */

class getprintername{
    
    
    public static String printerinvoice(){
    
     String rr="No Name";
    try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
            
            String sql11="SELECT printerinvoice FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql11);      
   
           
            while(rs.next()){
    
                rr=rs.getString(1);
             
                
            }
            
            
            
         
       
      
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(getprintername.class.getName()).log(Level.SEVERE, null, ex);
        }
return rr;
}
    
    
    
public static String printerreport(){
    
     String rr="No name";
    try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
            
            String sql11="SELECT  printerreports FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql11);      
   
           
            while(rs.next()){
    
                rr=rs.getString(1);
               
                
            }
            
            
            
         
       
      
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(getprintername.class.getName()).log(Level.SEVERE, null, ex);
        }
return rr;
}


}
public class PrinterName {

 
    
 
   
    
    
    
    
    private static final String ReportPrinterName=getprintername.printerreport();
    
    
     private static  String InvoicePrinterName=getprintername.printerinvoice();
    
       public static String getReportPrinterName() {
        return ReportPrinterName;
    }
       
         
    
       public static String getInvoicePrinterName() {
        return InvoicePrinterName;
    }

//    public static void setReportPrinterName(String aReportPrinterName) {
//        ReportPrinterName = aReportPrinterName;
//    }
//
//    public static void setInvoicePrinterName(String aInvoicePrinterName) {
//        InvoicePrinterName = aInvoicePrinterName;
//    }
     
}
