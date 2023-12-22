package raven.application.form;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import raven.application.Application;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class Return extends javax.swing.JPanel {
    
    
    
   public class ReportData {

        public ReportData(String productid, String productname, String quantity, String price) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.price = price;
        }

       

      
private String productid;
private String productname;
private String quantity;
private String price;

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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
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
    
    
    
    
    
int x=0;
    public Return() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Customer");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Invoice Id.");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Quantity", "Sales_Price_Per_Item", "Bill wo Discount", "Disc_Per_tem", "Total_Discount", "Total Sale After Disc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer cr22=new DefaultTableCellRenderer();
        cr22.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(String.class, cr22);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField6.setEditable(false);

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jTextField8.setEditable(false);

        jLabel7.setText("Total Return");

        jLabel8.setText("Deduction");

        jLabel9.setText("Return Amount");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("RETURN & PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel14.setText("RETURN");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jRadioButton1.setText("Add In Stock");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Update ");

        jTextField4.setEditable(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel5.setText("Product  Name");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSpinner1KeyReleased(evt);
            }
        });

        jLabel6.setText("Quantity");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jDateChooser1.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(36, 36, 36))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String invoice=jTextField3.getText();
        
  
            

 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"returninvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Return.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            if(Integer.parseInt(jTable1.getValueAt(i, 2).toString())==0){}    
            reportDataList.add(new Return.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 7).toString()));
            
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
             
             
//             finding voucher percentage

// finding customer 

String cus="";
if(jTextField1.getText().equals("")){
cus="Regular";
}else{
cus=jTextField1.getText();
}
Map<String, Object> parameters = new HashMap<>();
//going to find the total discount
Double tdis=0.0; 
for(int i=0;i<jTable1.getRowCount();i++){
tdis = Double.valueOf(jTable1.getValueAt(i, 6).toString());
}
String ttdis=tdis.toString();

            parameters.put("invoiceno",invoice );
            parameters.put("totalprice", jTextField8.getText());
            parameters.put("discountper", ttdis);
            parameters.put("aditionalcharges", jTextField7.getText());
            parameters.put("netprice", jTextField6.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
System.out.println("hi here is this one "+jTextField8.getText());
            


System.out.println("sourceeeeeeee");
            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
System.out.println("dataaaaaaaaaaaaa");
            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);
 System.out.println("idhrrrrrrrr");
           

            
             String printerName = PrinterName.getInvoicePrinterName(); // Change to your printer name
            
            PrintService printService = findPrintService(printerName);
 System.out.println("sunnnnnnn");
 JasperViewer.viewReport(jasperPrint,false);
            if (printService != null) {
                
                
                 System.out.println("not nulllllll");
                DocPrintJob printJob = printService.createPrintJob();
                JasperPrintManager.printReport(jasperPrint, false);
                System.out.println("Report printed to printer: " + printerName);
            } else {
                 System.out.println("nulllllllll");
                System.out.println("Printer not found.");
            }
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
        

            





        try {
         
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
        Statement st1=connection.createStatement();
        
              
            PreparedStatement pt=connection.prepareStatement("INSERT INTO AutoNumbers (hi) VALUES ( ? ) ");
          pt.setString(1, "getting one time id for return report");
            pt.executeUpdate();
            ResultSet rss = st1.executeQuery("SELECT OrderNumber FROM AutoNumbers ORDER BY OrderNumber DESC LIMIT 1");
            System.out.println("a");
//            in order to supplier order no waly me sirf ik hi bar store honi
            
            
            int No=0;
            while(rss.next()){
            No=rss.getInt(1);
            }
        
        
        for(int i=0;i<jTable1.getRowCount();i++){
            if( Integer.parseInt(jTable1.getValueAt(i, 2).toString())==0){
            
            
            }else{
        
        PreparedStatement ptst2 =connection.prepareStatement("INSERT INTO Customers_Returned_Products(InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,oneTimeid) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                                       
                         
             ptst2.setString(1, invoice);
             ptst2.setInt(2, (Integer.parseInt(jTable1.getValueAt(i, 0).toString())));

            ptst2.setInt(3,(Integer.parseInt(jTable1.getValueAt(i, 2).toString())) );
             ptst2.setString(4, jTable1.getValueAt(i, 1).toString());
             ptst2.setString(5, (jTable1.getValueAt(i, 3).toString()));
             ptst2.setString(6, (jTable1.getValueAt(i, 4).toString()));
             ptst2.setString(7, (jTable1.getValueAt(i, 5).toString()));
            ptst2.setString(8, (jTable1.getValueAt(i, 6).toString()));
             ptst2.setString(9, (jTable1.getValueAt(i, 7).toString()));
             ptst2.setString(10, jTextField6.getText());
             ptst2.setString(11, jTextField1.getText());
             ptst2.setInt(12, No);
           
            
             ptst2.executeUpdate();
      
            }

        }

        
        
             
        String sql2ls="SELECT T_Bought  FROM Customers WHERE PH_Customers = '"+jTextField1.getText()+"'";
            ResultSet rss13s=st1.executeQuery(sql2ls);
            int bought=0;
            while(rss13s.next()){
                bought=rss13s.getInt(1);
            }
            
          int ret=(int) Double.parseDouble(jTextField6.getText());
            int finalprice =(bought-ret);
        
            
            String sql23y="UPDATE Customers SET T_Bought='"+finalprice+"' WHERE PH_Customers = '"+jTextField1.getText()+"'";
            
PreparedStatement py1= connection.prepareStatement(sql23y);
py1.executeUpdate();
        
        
        
        


if(x==0){
            String sql1="DELETE FROM Sales WHERE Invoice = '"+invoice+"' ";
PreparedStatement psts= connection.prepareStatement(sql1);
psts.executeUpdate();

}else{
    int ttcost=0;
    int sellpp=0;

 int tddisc=0;
            
    for(int i=0;i<jTable1.getRowCount();i++){
         String sqll8="SELECT P_Cost,P_Selling_Price  FROM Stock WHERE P_Id = '"+Integer.valueOf(jTable1.getValueAt(i, 0).toString())+"'";
            ResultSet rss18=st1.executeQuery(sqll8);
            int tcost=0;
             int sellp=0;
             int tdiscleftqty=0;
       while(rss18.next()){
       tcost =rss18.getInt(1);
       sellp =rss18.getInt(2);
       }
       
//       getting whole quanitity

String sql21="SELECT Quantiy FROM  SoldProducts WHERE InvoiceNo = '"+invoice+"' AND P_Id = '"+Integer.valueOf(jTable1.getValueAt(i, 0).toString())+"' ";
                                        
            ResultSet rs2 =st1.executeQuery(sql21);
            int preqtya=0;
    while(rs2.next()){
    preqtya=rs2.getInt(1);
    }
       int leftqty=preqtya-Integer.parseInt(jTable1.getValueAt(i, 2).toString());
       
       sellp = sellp*leftqty;
      sellpp+=sellp;
       tcost=tcost*leftqty;
ttcost+=tcost;
    tdiscleftqty=(int) (leftqty*Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
    tddisc+=tdiscleftqty;
    
    System.out.println("preqq"+preqtya);
    System.out.println("left"+leftqty);
    
    
    }
String sql1="UPDATE Sales SET cost='"+ttcost+"',sales='"+(sellpp-tddisc)+"' ,Actual_bill = '"+sellpp+"', Discount = '"+tddisc+"' WHERE Invoice = '"+invoice+"' ";
PreparedStatement psts= connection.prepareStatement(sql1);
psts.executeUpdate();

}
        
        if(jRadioButton1.isSelected()){
            
           
            
            Statement st11=connection.createStatement();
        
        
            
        for(int i=0;i<jTable1.getRowCount();i++){
            String Pid=jTable1.getValueAt(i, 0).toString();
            
            
//            just getting whole left quntity
            
            
        String sql2l="SELECT P_Quantity  FROM Stock WHERE P_Id = '"+Pid+"'";
            ResultSet rss13=st11.executeQuery(sql2l);
            int qq=0;
            while(rss13.next()){
                qq=rss13.getInt(1);
            }
            
            int qt=Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            int qty = qq+qt;
        
            
            String sql23="UPDATE Stock SET P_Quantity='"+qty+"' WHERE P_Id='"+Pid+"'";
            
PreparedStatement p1= connection.prepareStatement(sql23);
p1.executeUpdate();

{
    
    
    String sql21="SELECT P_Name,P_Selling_Price,P_Category,P_Brand_Name,P_Unit,P_Min_Stock,Supplier_ID,Discription,P_Cost FROM Stock WHERE P_Id = '"+Pid+"'";
                                        
                                         ResultSet rs2 =st11.executeQuery(sql21);
    
    
                         
                                         String a1="";
                                         String a2="";
                                         String a3="";
                                         String a4="";
                                         String a5="";
                                         String a6="";
                                         String a7="";
                                         String a8="";
                                         String a9="";
                                        
            while(rs2.next()){
                    a1=rs2.getString(1);
                                          a2=rs2.getString(2);
                                          a3=rs2.getString(3);
                                          a4=rs2.getString(4);
                                          a5=rs2.getString(5);
                                          a6=rs2.getString(6);
                                          a7=rs2.getString(7);
                                          a8=rs2.getString(8);
                                          a9=rs2.getString(9);       
                                         
            }
            
            
if(qt>0){
    jDateChooser1.setVisible(true);
    String date="";
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int za=JOptionPane.showConfirmDialog(this,jDateChooser1, "Select Expiary for "+Pid, JOptionPane.DEFAULT_OPTION);
            if(za==JOptionPane.OK_OPTION){
            date = sdf.format(jDateChooser1.getDate());
            System.out.println(date);
            }
    jDateChooser1.setVisible(false);
PreparedStatement ptst2 =connection.prepareStatement("INSERT INTO StockAdded(P_Id, P_Name, P_Cost, P_Selling_Price, P_Category, P_Brand_Name, P_Quantity, P_Unit, P_Expiry, P_Min_Stock, Supplier_ID, Discription, Added_from) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                                       
                         
             ptst2.setString(1, Pid);
             ptst2.setString(2, a1);

            ptst2.setString(3, a9);
             ptst2.setString(4, a2);
            ptst2.setString(5, a3);
            ptst2.setString(6, a4);
            ptst2.setInt(7, qt);
            ptst2.setString(8, a5);
            ptst2.setString(9,date);
            ptst2.setString(10, a6);
            ptst2.setString(11, a7);
            ptst2.setString(12, a8);
            ptst2.setString(13, "Returned By Customer");
                     ptst2.executeUpdate();   }  
}

if(x==1){
    
     String sql21="SELECT Quantiy FROM  SoldProducts WHERE InvoiceNo = '"+invoice+"' AND P_Id = '"+Pid+"' ";
                                        
            ResultSet rs2 =st11.executeQuery(sql21);
            int preqty=0;
    while(rs2.next()){
    preqty=rs2.getInt(1);
    }
    if(qt==preqty){
    String sql12="DELETE FROM SoldProducts WHERE InvoiceNo = '"+invoice+"'AND P_Name='"+jTable1.getValueAt(i, 1)+"' ";
 PreparedStatement psts2= connection.prepareStatement(sql12);
psts2.executeUpdate();

    }else{
  String sql28="UPDATE SoldProducts SET Quantiy='"+(preqty-qt)+"' WHERE InvoiceNo = '"+invoice+"' AND P_Id = '"+Pid+"' ";
            
PreparedStatement pt10= connection.prepareStatement(sql28); 
pt10.executeUpdate();
    }

}else{
            String sql12="DELETE FROM SoldProducts WHERE InvoiceNo = '"+invoice+"'AND P_Name='"+jTable1.getValueAt(i, 1)+"' ";
 PreparedStatement psts2= connection.prepareStatement(sql12);
psts2.executeUpdate();

            
}
        
        }
            

}else{
            
            if(x==1){
            
                for(int i=0;i<jTable1.getRowCount();i++){
                    int qt=Integer.parseInt(jTable1.getValueAt(i, 2).toString());
     String sql21="SELECT Quantiy FROM  SoldProducts WHERE InvoiceNo = '"+invoice+"' AND P_Id = '"+jTable1.getValueAt(i, 0)+"' ";
                             Statement st11=connection.createStatement();           
            ResultSet rs2 =st11.executeQuery(sql21);
            int preqty=0;
    while(rs2.next()){
    preqty=rs2.getInt(1);
    }
    
    if(preqty==qt){
    
         String sql12="DELETE FROM SoldProducts WHERE InvoiceNo = '"+invoice+"'AND P_Name='"+jTable1.getValueAt(i, 1)+"' ";
 PreparedStatement psts2= connection.prepareStatement(sql12);
psts2.executeUpdate();
        
    }else{
    
    System.out.println("Updating sold products ");
  String sql28="UPDATE SoldProducts SET Quantiy='"+(preqty-qt)+"' WHERE InvoiceNo = '"+invoice+"' AND P_Id = '"+jTable1.getValueAt(i, 0)+"'";
            
PreparedStatement pt1= connection.prepareStatement(sql28);
    
pt1.executeUpdate();
    }      
    }
            }else{
  for(int i=0;i<jTable1.getRowCount();i++){
    String sql12="DELETE FROM SoldProducts WHERE InvoiceNo = '"+invoice+"'AND P_Name='"+jTable1.getValueAt(i, 1)+"' ";
 PreparedStatement psts2= connection.prepareStatement(sql12);
psts2.executeUpdate();
    }
            }
}
        
        
     Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Returned");      

Application.showForm(new Return());
 connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased

        if(!numeric.isNumeric(jTextField7.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        
        int  ss=(int) Double.parseDouble(jTextField8.getText());
// try {
//           String DataBaseURL = "jdbc:ucanaccess://posproject1.accdb";
//            Connection connection=DriverManager.getConnection(DataBaseURL);
//            
     if(jTextField7.getText().equals("")){
    jTextField6.setText(jTextField8.getText());
     
     }else{
     
          

// Statement ssts=connection.createStatement();
//           
//            String sql2l="SELECT sales FROM Sales WHERE Invoice = '"+ss+"'";
//               
//            ResultSet rs1=ssts.executeQuery(sql2l); 
//             int rt_amount=0;
//            while(rs1.next()){  
//           rt_amount= Integer.parseInt(rs1.getString(1));
//            
//            
//            }
            
            
            int totalReturn =ss-Integer.parseInt(jTextField7.getText());
            jTextField6.setText(String.valueOf(totalReturn));
            
     }
//  connection.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, ex);
//            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
//        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

        if(!numeric.isNumeric(jTextField3.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        
        
        
        
 if(jTextField3.getText().equals("")){
            
                Application.showForm(new Return());
                
            }else{

    try {
         
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
          Statement sts=connection.createStatement();
           
            String sqll="SELECT Customer, P_Id, Quantiy,SoldPrice,P_Name,Cost FROM SoldProducts WHERE InvoiceNo = '"+Integer.valueOf(jTextField3.getText())+"'";
              
            ResultSet rs=sts.executeQuery(sqll);  
              DefaultTableModel dft = (DefaultTableModel)jTable1.getModel();
              dft.setRowCount(0);
              
              
              while(rs.next()){
                  String sql2l0="SELECT sales,Actual_bill,Discount FROM Sales WHERE Invoice = '"+Integer.valueOf(jTextField3.getText())+"'";
              ResultSet rs10=sts.executeQuery(sql2l0);
                  Double T_A_bill_p=(Double.parseDouble(rs.getString(3)))*(Double.parseDouble(rs.getString(4)));
                  Double p_dis=0.0;
                  Double dis_per_item=0.0;
                   Double actualBll=0.0;
                   Double ptcost=(Double.parseDouble(rs.getString(4)))*(Double.parseDouble(rs.getString(3)));
Double p_per=0.0;
                  while(rs10.next()){
                actualBll=Double.valueOf(rs10.getString(2));
                p_per=((T_A_bill_p/actualBll)*100);
                
                  p_dis=((Double.valueOf(rs10.getString(3)))*p_per)/100;
                   dis_per_item=p_dis/(Double.valueOf(rs.getString(3)));
                  }
                  
                  
                  
                  
                   dft.addRow(new Object[]{rs.getString(2), rs.getString(5), rs.getString(3) ,rs.getString(4), String.format("%.2f", ptcost), String.format("%.2f", dis_per_item),String.format("%.2f", p_dis) ,String.format("%.2f", (ptcost-p_dis))});
              jTextField1.setText(rs.getString(1));
              }
            
              Statement ssts=connection.createStatement();
           
            String sql2l="SELECT sales FROM Sales WHERE Invoice = '"+Integer.valueOf(jTextField3.getText())+"'";
               
            ResultSet rs1=ssts.executeQuery(sql2l); 
            
            while(rs1.next()){  
            jTextField8.setText(rs1.getString(1));
            jTextField6.setText(rs1.getString(1));
            }
            
           
           
            
           
  connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

 }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 x=1;
        
        String nam=jTextField4.getText();
       
        for(int i=0;i<jTable1.getRowCount();i++){
        if((jTable1.getValueAt(i, 1).toString()).equals(nam)){
            
        jTable1.setValueAt(0, i, 2);
        jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(i, 3).toString()))*0, i, 4);
        jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(i, 5).toString()))*0, i, 6);
        jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(i, 4).toString()))-(Double.parseDouble(jTable1.getValueAt(i, 6).toString())), i, 7);

        }
        }
        
        
        
        Double tsaleprice=0.0;
        for(int j=0;j<jTable1.getRowCount();j++){
        tsaleprice+=Double.parseDouble(jTable1.getValueAt(j, 7).toString());
        }
       String xu=String.valueOf(tsaleprice);
        jTextField8.setText(xu);
        jTextField6.setText(xu);
        jTextField7.setText("");
        jTextField4.setText("");
        jSpinner1.setValue(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
int qq1=0;

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

qq1=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
jSpinner1.setValue(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased

for(int i=0;i<jTable1.getRowCount();i++){

}


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
x=1;
        int qqty =Integer.parseInt(jSpinner1.getValue().toString());
        String nam=jTextField4.getText();
        Double tsaleprice=0.0;
        for(int i=0;i<jTable1.getRowCount();i++){
        if((jTable1.getValueAt(i, 1).toString()).equals(nam)){
            
        jTable1.setValueAt(qqty, i, 2);
        jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(i, 3).toString()))*qqty, i, 4);
        jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(i, 5).toString()))*qqty, i, 6);
        jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(i, 4).toString()))-(Double.parseDouble(jTable1.getValueAt(i, 6).toString())), i, 7);

        }
        tsaleprice+=Double.parseDouble(jTable1.getValueAt(i, 7).toString());
        }
       String xu=(tsaleprice).toString();
        jTextField8.setText(xu);
        jTextField6.setText(xu);
        jTextField7.setText("");
        jTextField4.setText("");
        jSpinner1.setValue(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1KeyReleased

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
    System.out.println(qq1);
if(Integer.parseInt(jSpinner1.getValue().toString())>qq1){
    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "You can not Add more Quantity");
   
    jSpinner1.setValue(qq1);
    
}    // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

qq1=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
jSpinner1.setValue(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
