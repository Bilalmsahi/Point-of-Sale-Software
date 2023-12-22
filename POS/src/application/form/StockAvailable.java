package raven.application.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Raven
 */
public class StockAvailable extends javax.swing.JPanel {

     public class ReportData {

        public ReportData(String productid, String productname, String quantity, String cost, String price, String minstock, String category, String unit) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.cost = cost;
            this.price = price;
            this.minstock = minstock;
            this.category = category;
            this.unit = unit;
        }
private String productid;
private String productname;
private String quantity;
private String cost;
private String price;
private String minstock;
private String category;
private String unit;

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

        public String getCost() {
            return cost;
        }

        public void setCost(String cost) {
            this.cost = cost;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getMinstock() {
            return minstock;
        }

        public void setMinstock(String minstock) {
            this.minstock = minstock;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
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

    
    
    public StockAvailable() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filter By:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Quantity", "P-Cost", "P-Price", "Brand", "P-MIN-Stock", "P-Exp", "P-Catgory", "Unit", "Discription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT P_Id, P_Name,P_Quantity, P_Cost, P_Selling_Price, Supplier_ID, P_Brand_Name, P_Min_Stock, P_Expiry, P_Category,P_Unit, Discription FROM Stock ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbmM =(DefaultTableModel)jTable1.getModel();
            tbmM.setRowCount(0);
            while(rs.next()){
                tbmM.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getDate(9),rs.getString(10),rs.getString(11),rs.getString(12)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockAvailable.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("PRINT & SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel14.setText("STOCK AVAILABLE");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","ALL", "Categories", "Product", "Supplier" }));
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

        jLabel3.setVisible(false);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Product Name");

        jTextField1.setVisible(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox3.setVisible(false);
        jComboBox3.setModel(new DefaultComboBoxModel());
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setVisible(false);
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Select Supplier");

        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.setVisible(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setVisible(false);
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Category");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox2, 0, 107, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 107, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT supplier_name FROM SuppliersRecord";
            ResultSet rs =st.executeQuery(sql1);

            jComboBox3.addItem("Select Supplier");
            while(rs.next()){
                jComboBox3.addItem(rs.getString(1));
            } connection.close();} catch (SQLException ex) {
            Logger.getLogger(AddNewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT Category FROM P_Categories";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox2.addItem("Select Category");
            while(rs.next()){
                jComboBox2.addItem(rs.getString(1));
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
            Logger.getLogger(AddNewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
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
                .addGap(29, 29, 29)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents
String filter="Null";
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        

 try {

            // Load and compile the Jasper report
String relativePath = reports.getUrl()+"stockavailable.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); 
            // Set parameters
            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 8).toString()), (jTable1.getValueAt(i, 9).toString())));
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
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dt", dataSource);
            parameters.put("curdatetime", (currentDateTimeString));
            
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);
 
           

            
             String printerName = PrinterName.getReportPrinterName(); // Change to your printer name
            
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
        if(jComboBox1.getSelectedItem().equals("ALL")){
            filter="All";
            { 
        jLabel2.setVisible(false);
        jComboBox2.setVisible(false);
            jComboBox2.setSelectedIndex(0);
            
        jLabel4.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox3.setSelectedIndex(0);
        
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jTextField1.setText("");
        }
        try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
Statement st= connection.createStatement();
             String sql1="SELECT P_Id, P_Name,P_Quantity, P_Cost, P_Selling_Price, P_Brand_Name, P_Min_Stock, P_Expiry, P_Category,P_Unit, Discription FROM Stock ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getDate(8),rs.getString(9),rs.getString(10),rs.getString(11)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockAvailable.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        } else if(jComboBox1.getSelectedItem().equals("Select")){
            { 
        jLabel2.setVisible(false);
        jComboBox2.setVisible(false);
            jComboBox2.setSelectedIndex(0);
            
        jLabel4.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox3.setSelectedIndex(0);
        
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jTextField1.setText("");
        
        }
        }
        
        
        else if(jComboBox1.getSelectedItem().equals("Categories")){
            { 
        jLabel2.setVisible(true);
        jComboBox2.setVisible(true);
            
            
        jLabel4.setVisible(false);
        jComboBox3.setVisible(false);
         jComboBox3.setSelectedIndex(0);
        
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jTextField1.setText("");
        }
        }
        
        
        else if(jComboBox1.getSelectedItem().equals("Product")){
         { 
        jLabel2.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox2.setSelectedIndex(0);    
            
        jLabel4.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox3.setSelectedIndex(0);
        
        jLabel3.setVisible(true);
        jTextField1.setVisible(true);
        }
        }
        
        
        else if(jComboBox1.getSelectedItem().equals("Supplier")){
          
          
          { 
        jLabel2.setVisible(false);
        jComboBox2.setVisible(false);
            jComboBox2.setSelectedIndex(0); 
            
        jLabel4.setVisible(true);
        jComboBox3.setVisible(true);
        
        
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jTextField1.setText("");
        
        }
          
          
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


try {

            // Load and compile the Jasper report
String relativePath = reports.getUrl()+"stockavailable.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 8).toString()), (jTable1.getValueAt(i, 9).toString())));
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
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dt", dataSource);
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
String relativePath = reports.getUrl()+"stockavailable.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); 
            // Set parameters
            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 8).toString()), (jTable1.getValueAt(i, 9).toString())));
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
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dt", dataSource);
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

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
     
    String cat=jComboBox2.getSelectedItem().toString();
    filter="Category = "+cat;
     try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
Statement st= connection.createStatement();
             String sql1="SELECT P_Id, P_Name,P_Quantity, P_Cost, P_Selling_Price, P_Brand_Name, P_Min_Stock, P_Expiry, P_Category,P_Unit, Discription FROM Stock WHERE P_Category = '"+cat+"'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getDate(8),rs.getString(9),rs.getString(10),rs.getString(11)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockAvailable.class.getName()).log(Level.SEVERE, null, ex);
        }
    

// TODO add your handling code here:
    

// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       
        String cat=jTextField1.getText();
    filter="Product = "+cat;
     try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
Statement st= connection.createStatement();
             String sql1="SELECT P_Id, P_Name,P_Quantity, P_Cost, P_Selling_Price, P_Brand_Name, P_Min_Stock, P_Expiry, P_Category,P_Unit, Discription FROM Stock WHERE P_NameLIKE '%"+cat+"%'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getDate(8),rs.getString(9),rs.getString(10),rs.getString(11)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockAvailable.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
     
         String cat=jComboBox3.getSelectedItem().toString();
    filter = "Supplier = "+cat;
     try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
Statement st= connection.createStatement();
             String sql1="SELECT P_Id, P_Name,P_Quantity, P_Cost, P_Selling_Price,  P_Brand_Name, P_Min_Stock, P_Expiry, P_Category,P_Unit, Discription FROM Stock WHERE Supplier_ID = '"+cat+"'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getDate(8),rs.getString(9),rs.getString(10),rs.getString(11)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StockAvailable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
// TODO add your handling code here:
        
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
