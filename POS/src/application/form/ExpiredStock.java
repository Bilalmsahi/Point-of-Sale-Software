package raven.application.form;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.JFileChooser;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;


import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Raven
 */
public class ExpiredStock extends javax.swing.JPanel {

    

   public class ReportData {

        public ReportData(String productid, String productname, String quantity, String expirydate) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.expirydate = expirydate;
        }

  
private String productid;
private String productname;
private String quantity;
private String expirydate;

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getExpirydate() {
            return expirydate;
        }

        public void setExpirydate(String expirydate) {
            this.expirydate = expirydate;
        }


      

      
    }
     
     
   private static PrintService findPrintService(String printerName) {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        for (PrintService service : printServices) {
            if (service.getName().equalsIgnoreCase(printerName)) {
                return service;
            }
        }
        return null;
    }


    
    
    
    
    public ExpiredStock() {
        initComponents();
        
       
   
    }

    @SuppressWarnings("unchecked")
    
//    IMPORTANT NOTE : jLabel4 And jPanel7 IS JUST MADE FOR SOLVING SOME BUGS DO NOT TRY TO DELETE THEM OR ANY THING WITH THEM THANKS
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jLabel11.setVisible(false);
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Product Name");

        jTextField4.setVisible(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jComboBox9.setModel(new DefaultComboBoxModel());
        jComboBox9.setVisible(false);
        jComboBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox9ItemStateChanged(evt);
            }
        });
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jLabel13.setVisible(false);
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Select Category");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(jComboBox9, 0, 117, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT Category FROM P_Categories";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox9.addItem("Select Category");
            while(rs.next()){
                jComboBox9.addItem(rs.getString(1));
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
            Logger.getLogger(ExpiredStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filter By:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Expire-Quantity", "P-Exp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("PRINT & SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 30)); // NOI18N
        jLabel14.setText("EXPIRED STOCK");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Filter", "ALL", "Categories", "Product" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("SAVE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
String filter;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed



        
        





 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"expirestock.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString())));
            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("ProductId: " + data.name);
//    System.out.println("Quantity: " + data.invoiceno);
//    System.out.println("Price: " + data.total);
//    System.out.println("Price: " + data.discount);
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);
 java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dataset", dataSource);
            parameters.put("curdatetime", (currentDateTimeString));
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);

 
   
 
             String printerName =PrinterName.getReportPrinterName(); // Change to your printer name
            
            PrintService printService = findPrintService(printerName);

 JasperViewer.viewReport(jasperPrint,false);
            if (printService != null) {
                
                
             
                DocPrintJob printJob = printService.createPrintJob();
                JasperPrintManager.printReport(jasperPrint, false);
                System.out.println("Report printed to printer: " + printerName);
            } else {
               
                System.out.println("Printer not found.");
            }
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
   



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

            if((jComboBox1.getSelectedItem().toString()).equals("ALL")){
                filter="All";
             { 
        jLabel13.setVisible(false);
        jComboBox9.setVisible(false);
            
            
        
        
        
        jLabel11.setVisible(false);
        jTextField4.setVisible(false);
        }
          System.out.println("dddd");
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        try {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
           LocalDate d=LocalDate.now();
           
           
//        Selection of all existing products in system by their Id;  


 List<Integer> aa; 
                 aa = new ArrayList<>();
           Statement stt=connection.createStatement();
          ResultSet rsst=stt.executeQuery("SELECT Product_Id FROM Products");
          while(rsst.next()){
          aa.add(rsst.getInt(1));
          }
          System.out.println("These are Products"+aa);
          
          
//          Expiary finding Started
          DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                                tbm.setRowCount(0);
           for(int i=0;i<aa.size();i++){
           
               
//               Getting all the data added in StockAdded Table are Selected by their primary key;

           int pid=aa.get(i);
           List<Integer> ss; 
                 ss = new ArrayList<>();
                 
                  Statement st1=connection.createStatement();
          ResultSet rs1=st1.executeQuery("SELECT Added_Number FROM StockAdded WHERE P_Id='"+pid+"'");
                 
          while(rs1.next()){
          ss.add(rs1.getInt(1));
          }
        System.out.println("This is The indexed number of some product no  "+pid+" ;  "+ss);
           
//        Now Starting the sort on the basis of the expiary Date;
        
            for(int p=ss.size()-1;p>=0;p--){
            for(int s=0;s<p;s++){
                
//                Getting an Expiary Date for the selected indexes
            
                Statement st2=connection.createStatement();
          ResultSet rs2=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
          ResultSet rs3=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(p)+"'");
          
          Date exs=null;
          Date exp=null;
          while(rs2.next()){
          exs=rs2.getDate(1);
          }
          while(rs3.next()){
          exp=rs3.getDate(1);
          }
          
       
          
                
                if((exs.compareTo(exp))<0){
                    int sw=ss.get(s);
                    ss.set(s, ss.get(p));
                    ss.set(p, sw);
                }
                
            }
        }
       System.out.println("FINAL  This is the Sorted Array by Date for product "+pid+":  "+ss);
        
//        Getting Quantity and adding it up from stock added table;
                          ResultSet rs01=st1.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id='"+pid+"'");
            int P_Qty=0;   
            while(rs01.next()){
            P_Qty+=rs01.getInt(1);
            }
            System.out.println("product total quantity"+P_Qty);
//Adding if statement here that if stock quantity of a particular product is zero how can be it expire

if(P_Qty!=0){
            int Add_Qty=0;
            int break_index=0;
           for(int y=0;y<ss.size();y++){
               if(Add_Qty>=P_Qty){
                   
                   
                   break;
               }else{
                   
                  
              ResultSet rs0=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(y)+"'");
              while(rs0.next()){
              Add_Qty+=(rs0.getInt(1));
              }
              break_index=y;
              
               }
           }
           
                  System.out.println("product Added quantity"+Add_Qty);
                  System.out.println(break_index); 
                  
                  
                  
                  
                        int k=break_index;     
                    
                      
                     System.out.println(k); 
            ResultSet rs02=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
            LocalDate ex=null;
            while(rs02.next()){
            ex=(rs02.getDate(1).toLocalDate());
            }
            System.out.println(ex);
            System.out.println(d);
            
            
            
            
            if(ex.isBefore(d)){
                System.out.println("yesss");
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
                        int exxqty=0;
                        while(rs03.next()){
                         exxqty=rs03.getInt(1);
                        }
                        
                        int nonexpiryqty=Add_Qty-exxqty;
                        int expireStock=P_Qty-nonexpiryqty;
                        
                        
                        
                        
                        
                        Statement st= connection.createStatement();
           String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            tbm.addRow(new Object[]{pid,rs.getString(1),expireStock,ex});
           }
                        
            }        
            
            
            
//            Includeing all of the indexes that are left behind the broken one
            for(int s=(break_index-1);s>=0;s--){
                ResultSet rs05=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
            LocalDate exx=null;
            while(rs05.next()){
            exx=(rs05.getDate(1).toLocalDate());
            }
                if(exx.isBefore(d)){
                System.out.println("yesss");
//                Expire quantity is taking
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
                        int exxqty1=0;
                        while(rs03.next()){
                         exxqty1=rs03.getInt(1);
                        }
                        
//                        Adding into row

                String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
            ResultSet rs =st1.executeQuery(sql1);
           while(rs.next()){
            tbm.addRow(new Object[]{pid,rs.getString(1),exxqty1,exx});
           }
                        
                        
                
                }
                
            }
           }
           
           }
           
           


           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ExpiredStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        } else if((jComboBox1.getSelectedItem().toString()).equals("Select")){
            { 
        jLabel13.setVisible(false);
        jComboBox9.setVisible(false);
            
            
        
        
        
        jLabel11.setVisible(false);
        jTextField4.setVisible(false);
        }
    } 
        
        
        else if((jComboBox1.getSelectedItem().toString()).equals("Categories")){
            { 
        jLabel13.setVisible(true);
        jComboBox9.setVisible(true);
            
      
        
        
        jLabel11.setVisible(false);
        jTextField4.setVisible(false);
        }
        } 
        
        
        else if((jComboBox1.getSelectedItem().toString()).equals("Product")){
          {
        jLabel13.setVisible(false);
        jComboBox9.setVisible(false);
            
            
       
        
        
        jLabel11.setVisible(true);
        jTextField4.setVisible(true);
        }
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
System.out.println(PrinterName.getReportPrinterName()+"  and  ");
System.out.println(PrinterName.getInvoicePrinterName());

 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"expirestock.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString())));
            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("ProductId: " + data.name);
//    System.out.println("Quantity: " + data.invoiceno);
//    System.out.println("Price: " + data.total);
//    System.out.println("Price: " + data.discount);
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);
 java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dataset", dataSource);
            parameters.put("curdatetime", (currentDateTimeString));
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

   
 
             String printerName = PrinterName.getReportPrinterName(); // Change to your printer name
            
            PrintService printService = findPrintService(printerName);

            if (printService != null) {
                
                
             
                DocPrintJob printJob = printService.createPrintJob();
                JasperPrintManager.printReport(jasperPrint, false);
                System.out.println("Report printed to printer: " + printerName);
            } else {
               
                System.out.println("Printer not found.");
            }
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
   


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

 try {

            // Load and compile the Jasper report
String relativePath = reports.getUrl()+"expirestock.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString())));
            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("ProductId: " + data.name);
//    System.out.println("Quantity: " + data.invoiceno);
//    System.out.println("Price: " + data.total);
//    System.out.println("Price: " + data.discount);
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);
 java.util.Date currentDate = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dataset", dataSource);
            parameters.put("curdatetime", (currentDateTimeString));
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);

 JasperViewer.viewReport(jasperPrint,false);
           
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased

        String cat=jTextField4.getText();
filter="Product = "+cat+".";
         try {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
           LocalDate d=LocalDate.now();
           
           
//        Selection of all existing products in system by their Id;  


 List<Integer> aa; 
                 aa = new ArrayList<>();
           Statement stt=connection.createStatement();
          ResultSet rsst=stt.executeQuery("SELECT Product_Id FROM Products WHERE Product_Name LIKE '%"+cat+"%'");
          while(rsst.next()){
          aa.add(rsst.getInt(1));
          }
          System.out.println("These are Products"+aa);
          
          
//          Expiary finding Started
          DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                                tbm.setRowCount(0);
           for(int i=0;i<aa.size();i++){
           
               
//               Getting all the data added in StockAdded Table are Selected by their primary key;

           int pid=aa.get(i);
           List<Integer> ss; 
                 ss = new ArrayList<>();
                 
                  Statement st1=connection.createStatement();
          ResultSet rs1=st1.executeQuery("SELECT Added_Number FROM StockAdded WHERE P_Id='"+pid+"'");
                 
          while(rs1.next()){
          ss.add(rs1.getInt(1));
          }
        System.out.println("This is The indexed number of some product no  "+pid+" ;  "+ss);
           
//        Now Starting the sort on the basis of the expiary Date;
        
            for(int p=ss.size()-1;p>=0;p--){
            for(int s=0;s<p;s++){
                
//                Getting an Expiary Date for the selected indexes
            
                Statement st2=connection.createStatement();
          ResultSet rs2=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
          ResultSet rs3=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(p)+"'");
          
          Date exs=null;
          Date exp=null;
          while(rs2.next()){
          exs=rs2.getDate(1);
          }
          while(rs3.next()){
          exp=rs3.getDate(1);
          }
          
       
          
                
                if((exs.compareTo(exp))<0){
                    int sw=ss.get(s);
                    ss.set(s, ss.get(p));
                    ss.set(p, sw);
                }
                
            }
        }
       System.out.println("FINAL  This is the Sorted Array by Date for product "+pid+":  "+ss);
        
//        Getting Quantity and adding it up from stock added table;
                          ResultSet rs01=st1.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id='"+pid+"'");
            int P_Qty=0;   
            while(rs01.next()){
            P_Qty+=rs01.getInt(1);
            }
            System.out.println("product total quantity"+P_Qty);

            int Add_Qty=0;
            int break_index=0;
           for(int y=0;y<ss.size();y++){
               if(Add_Qty>=P_Qty){
                   
                   
                   break;
               }else{
                   
                  
              ResultSet rs0=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(y)+"'");
              while(rs0.next()){
              Add_Qty+=(rs0.getInt(1));
              }
              break_index=y;
              
               }
           }
           
                  System.out.println("product Added quantity"+Add_Qty);
                  System.out.println(break_index); 
                  
                  
                  
                  
                        int k=break_index;     
                    
                      
                     System.out.println(k); 
            ResultSet rs02=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
            LocalDate ex=null;
            while(rs02.next()){
            ex=(rs02.getDate(1).toLocalDate());
            }
            System.out.println(ex);
            System.out.println(d);
            
            
            
            
            if(ex.isBefore(d)){
                System.out.println("yesss");
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
                        int exxqty=0;
                        while(rs03.next()){
                         exxqty=rs03.getInt(1);
                        }
                        
                        int nonexpiryqty=Add_Qty-exxqty;
                        int expireStock=P_Qty-nonexpiryqty;
                        
                        
                        
                        
                        
                        Statement st= connection.createStatement();
           String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            tbm.addRow(new Object[]{pid,rs.getString(1),expireStock,ex});
           }
                        
            }        
            
            
            
//            Includeing all of the indexes that are left behind the broken one
            for(int s=(break_index-1);s>=0;s--){
                ResultSet rs05=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
            LocalDate exx=null;
            while(rs05.next()){
            exx=(rs05.getDate(1).toLocalDate());
            }
                if(exx.isBefore(d)){
                System.out.println("yesss");
//                Expire quantity is taking
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
                        int exxqty1=0;
                        while(rs03.next()){
                         exxqty1=rs03.getInt(1);
                        }
                        
//                        Adding into row

                String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
            ResultSet rs =st1.executeQuery(sql1);
           while(rs.next()){
            tbm.addRow(new Object[]{pid,rs.getString(1),exxqty1,exx});
           }
                        
                        
                
                }
                
            }
           
           
           }
           
           


           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ExpiredStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed

        String cat=jComboBox9.getSelectedItem().toString();

       try {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
           LocalDate d=LocalDate.now();
           
           
//        Selection of all existing products in system by their Id;  


 List<Integer> aa; 
                 aa = new ArrayList<>();
           Statement stt=connection.createStatement();
          ResultSet rsst=stt.executeQuery("SELECT Product_Id FROM Products WHERE Product_Category='"+cat+"'");
          while(rsst.next()){
          aa.add(rsst.getInt(1));
          }
          System.out.println("These are Products"+aa);
          
          
//          Expiary finding Started
          DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                                tbm.setRowCount(0);
           for(int i=0;i<aa.size();i++){
           
               
//               Getting all the data added in StockAdded Table are Selected by their primary key;

           int pid=aa.get(i);
           List<Integer> ss; 
                 ss = new ArrayList<>();
                 
                  Statement st1=connection.createStatement();
          ResultSet rs1=st1.executeQuery("SELECT Added_Number FROM StockAdded WHERE P_Id='"+pid+"'");
                 
          while(rs1.next()){
          ss.add(rs1.getInt(1));
          }
        System.out.println("This is The indexed number of some product no  "+pid+" ;  "+ss);
           
//        Now Starting the sort on the basis of the expiary Date;
        
            for(int p=ss.size()-1;p>=0;p--){
            for(int s=0;s<p;s++){
                
//                Getting an Expiary Date for the selected indexes
            
                Statement st2=connection.createStatement();
          ResultSet rs2=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
          ResultSet rs3=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(p)+"'");
          
          Date exs=null;
          Date exp=null;
          while(rs2.next()){
          exs=rs2.getDate(1);
          }
          while(rs3.next()){
          exp=rs3.getDate(1);
          }
          
       
          
                
                if((exs.compareTo(exp))<0){
                    int sw=ss.get(s);
                    ss.set(s, ss.get(p));
                    ss.set(p, sw);
                }
                
            }
        }
       System.out.println("FINAL  This is the Sorted Array by Date for product "+pid+":  "+ss);
        
//        Getting Quantity and adding it up from stock added table;
                          ResultSet rs01=st1.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id='"+pid+"'");
            int P_Qty=0;   
            while(rs01.next()){
            P_Qty+=rs01.getInt(1);
            }
            System.out.println("product total quantity"+P_Qty);

            int Add_Qty=0;
            int break_index=0;
           for(int y=0;y<ss.size();y++){
               if(Add_Qty>=P_Qty){
                   
                   
                   break;
               }else{
                   
                  
              ResultSet rs0=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(y)+"'");
              while(rs0.next()){
              Add_Qty+=(rs0.getInt(1));
              }
              break_index=y;
              
               }
           }
           
                  System.out.println("product Added quantity"+Add_Qty);
                  System.out.println(break_index); 
                  
                  
                  
                  
                        int k=break_index;     
                    
                      
                     System.out.println(k); 
            ResultSet rs02=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
            LocalDate ex=null;
            while(rs02.next()){
            ex=(rs02.getDate(1).toLocalDate());
            }
            System.out.println(ex);
            System.out.println(d);
            
            
            
            
            if(ex.isBefore(d)){
                System.out.println("yesss");
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
                        int exxqty=0;
                        while(rs03.next()){
                         exxqty=rs03.getInt(1);
                        }
                        
                        int nonexpiryqty=Add_Qty-exxqty;
                        int expireStock=P_Qty-nonexpiryqty;
                        
                        
                        
                        
                        
                        Statement st= connection.createStatement();
           String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            tbm.addRow(new Object[]{pid,rs.getString(1),expireStock,ex});
           }
                        
            }        
            
            
            
//            Includeing all of the indexes that are left behind the broken one
            for(int s=(break_index-1);s>=0;s--){
                ResultSet rs05=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
            LocalDate exx=null;
            while(rs05.next()){
            exx=(rs05.getDate(1).toLocalDate());
            }
                if(exx.isBefore(d)){
                System.out.println("yesss");
//                Expire quantity is taking
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
                        int exxqty1=0;
                        while(rs03.next()){
                         exxqty1=rs03.getInt(1);
                        }
                        
//                        Adding into row

                String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
            ResultSet rs =st1.executeQuery(sql1);
           while(rs.next()){
            tbm.addRow(new Object[]{pid,rs.getString(1),exxqty1,exx});
           }
                        
                        
                
                }
                
            }
           
           
           }
           
           


           
           
           
           
        filter="Category = "+cat+".";   
           
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ExpiredStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox9ItemStateChanged
     // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
