package raven.application.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;  
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
public class ReportProductsReturned extends javax.swing.JPanel {

    
    
   public class ReportData {

        public ReportData(String productid, String productname, String quantity, String price, String timedate, String invoice, String customer, String amwodiscount, String discperitem, String todiscount, String tobill, String returnedam) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.price = price;
            this.timedate = timedate;
            this.invoice = invoice;
            this.customer = customer;
            this.amwodiscount = amwodiscount;
            this.discperitem = discperitem;
            this.todiscount = todiscount;
            this.tobill = tobill;
            this.returnedam = returnedam;
        }

       
private String productid;
private String productname;
private String quantity;
private String price;
private String timedate;
private String invoice;
private String customer;
private String amwodiscount;
private String discperitem;
private String todiscount;
private String tobill;
private String returnedam;

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

        public String getTimedate() {
            return timedate;
        }

        public void setTimedate(String timedate) {
            this.timedate = timedate;
        }

        public String getInvoice() {
            return invoice;
        }

        public void setInvoice(String invoice) {
            this.invoice = invoice;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

        public String getAmwodiscount() {
            return amwodiscount;
        }

        public void setAmwodiscount(String amwodiscount) {
            this.amwodiscount = amwodiscount;
        }

        public String getDiscperitem() {
            return discperitem;
        }

        public void setDiscperitem(String discperitem) {
            this.discperitem = discperitem;
        }

        public String getTodiscount() {
            return todiscount;
        }

        public void setTodiscount(String todiscount) {
            this.todiscount = todiscount;
        }

        public String getTobill() {
            return tobill;
        }

        public void setTobill(String tobill) {
            this.tobill = tobill;
        }

        public String getReturnedam() {
            return returnedam;
        }

        public void setReturnedam(String returnedam) {
            this.returnedam = returnedam;
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


    
    
    
    public ReportProductsReturned() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date_and_Time", "Invoice", "Customer", "Product Id", "Product Name", "Quantity", "Sales Price/Item", "Amount without Discount", "Discount/Item", "Total Discount", "Total Bill", "Returned Amount at a Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            int tProdReturned=0;
            int count=0;
            int treturned=0;

            int preinvoice=0;
            int curinvoice=0;
            while(rs15.next()){
                curinvoice=rs15.getInt(13);

                if(curinvoice!=preinvoice){
                    treturned+=(int)rs15.getDouble(10);
                }
                tProdReturned+=Integer.parseInt(rs15.getString(3));
                count++;
                tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
                preinvoice=curinvoice;
            }

            jTextField8.setText(String.valueOf(count));
            jTextField6.setText(String.valueOf(tProdReturned));
            jTextField7.setText(String.valueOf(treturned));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportProductsReturned.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("PRINT & SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel14.setText("Report ");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel4.setText("Total Returns By Customers");

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);

        jLabel5.setText("Total Quantity");

        jLabel7.setText("Total Returned Amount");

        jButton1.setText("Search");
        jButton1.setVisible(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Date Filter");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setVisible(false);

        jDateChooser2.setVisible(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Invoice", "Product" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setVisible(false);
        jLabel2.setText("From :");

        jLabel3.setVisible(false);
        jLabel3.setText("To :");

        jLabel10.setVisible(false);
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Enter Product id");

        jTextField1.setVisible(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel11.setVisible(false);
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Enter Invoice No");

        jTextField2.setVisible(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filter By :");

        jTextField8.setEditable(false);

        jLabel6.setText("Count");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                .addComponent(jLabel3)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents
String filter = "null";
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"returnbycustomer.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
                String s="";
                if(jTable1.getValueAt(i, 2)==null){s="Null";}else{s=jTable1.getValueAt(i, 2).toString();}
            reportDataList.add(new ReportData( jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 5).toString(),jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), s, jTable1.getValueAt(i, 7).toString(),jTable1.getValueAt(i, 8).toString(),jTable1.getValueAt(i, 9).toString(),jTable1.getValueAt(i, 10).toString(),jTable1.getValueAt(i, 11).toString()));

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
            parameters.put("dataset", dataSource);
            parameters.put("totalqty", jTextField6.getText());
            parameters.put("totalamreturned", jTextField7.getText());
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
        



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed



 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"returnbycustomer.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
                String s="";
                if(jTable1.getValueAt(i, 2)==null){s="Null";}else{s=jTable1.getValueAt(i, 2).toString();}
            reportDataList.add(new ReportData( jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 5).toString(),jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), s, jTable1.getValueAt(i, 7).toString(),jTable1.getValueAt(i, 8).toString(),jTable1.getValueAt(i, 9).toString(),jTable1.getValueAt(i, 10).toString(),jTable1.getValueAt(i, 11).toString()));

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
            parameters.put("dataset", dataSource);
            parameters.put("totalqty", jTextField6.getText());
            parameters.put("totalamreturned", jTextField7.getText());
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
String relativePath =  reports.getUrl()+"returnbycustomer.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
                String s="";
                if(jTable1.getValueAt(i, 2)==null){s="Null";}else{s=jTable1.getValueAt(i, 2).toString();}
            reportDataList.add(new ReportData( jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 5).toString(),jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), s, jTable1.getValueAt(i, 7).toString(),jTable1.getValueAt(i, 8).toString(),jTable1.getValueAt(i, 9).toString(),jTable1.getValueAt(i, 10).toString(),jTable1.getValueAt(i, 11).toString()));

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
            parameters.put("dataset", dataSource);
            parameters.put("totalqty", jTextField6.getText());
            parameters.put("totalamreturned", jTextField7.getText());
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            String sel=  jComboBox1.getSelectedItem().toString();

            Date input = jDateChooser2.getDate();
            Instant instant = input.toInstant();
            ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
            LocalDate date = zdt.toLocalDate();

            Date input1 = jDateChooser1.getDate();
            Instant instant1 = input1.toInstant();
            ZonedDateTime zdt1 = instant1.atZone(ZoneId.systemDefault());
            LocalDate date1 = zdt1.toLocalDate();
            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
            if(sel.equals("All")){
filter="All , Date  From : "+date1+" , To : "+ date;
                 Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products"); 

        tbm.setRowCount(0);
        int tProdReturned=0;
        int count=0;
     int treturned=0;

int preinvoice=0;
int curinvoice=0;
                while(rs15.next()){
                    if(((rs15.getDate(12).toLocalDate()).isAfter( date1)) && rs15.getDate(12).toLocalDate().isBefore(date)){
                       
curinvoice=rs15.getInt(13);

if(curinvoice!=preinvoice){
treturned+=(int)rs15.getDouble(10);
}
            tProdReturned+=Integer.parseInt(rs15.getString(3));
             count++;
        tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
preinvoice=curinvoice; }
                }
                jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(tProdReturned));
jTextField7.setText(String.valueOf(treturned));

                }else if(sel.equals("Invoice")){

                  filter="Invoice No = "+jTextField2.getText()+" , Date  From : "+date1+" , To : "+ date;
                 Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products WHERE InvoiceNo = '"+jTextField2.getText()+"'"); 

        tbm.setRowCount(0);
        int tProdReturned=0;
        int count=0;
     int treturned=0;

int preinvoice=0;
int curinvoice=0;
                while(rs15.next()){
                    if(((rs15.getDate(12).toLocalDate()).isAfter( date1)) && rs15.getDate(12).toLocalDate().isBefore(date)){
                       
curinvoice=rs15.getInt(13);

if(curinvoice!=preinvoice){
treturned+=(int)rs15.getDouble(10);
}
            tProdReturned+=Integer.parseInt(rs15.getString(3));
             count++;
        tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
preinvoice=curinvoice; }
                }
                jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(tProdReturned));
jTextField7.setText(String.valueOf(treturned));

                }else if(sel.equals("Product")){

                   filter="Product Id = "+jTextField1.getText()+" , Date  From : "+date1+" , To : "+ date;
                 Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products WHERE Pid = '"+Integer.valueOf(jTextField1.getText())+"'"); 

        tbm.setRowCount(0);
        int tProdReturned=0;
        int count=0;
     int treturned=0;

int preinvoice=0;
int curinvoice=0;
                while(rs15.next()){
                    if(((rs15.getDate(12).toLocalDate()).isAfter( date1)) && rs15.getDate(12).toLocalDate().isBefore(date)){
                       
curinvoice=rs15.getInt(13);

if(curinvoice!=preinvoice){
treturned+=(int)rs15.getDouble(10);
}
            tProdReturned+=Integer.parseInt(rs15.getString(3));
             count++;
        tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
preinvoice=curinvoice; }
                }
                jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(tProdReturned));
jTextField7.setText(String.valueOf(treturned));

                }

                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
            }

            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if(jRadioButton1.isSelected()){
            jDateChooser1.setVisible(true);
            jDateChooser2.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jButton1.setVisible(true);
        }else{

            jDateChooser1.setVisible(false);
            jDateChooser2.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jButton1.setVisible(false);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        jTextField2.setVisible(false);
        jLabel11.setVisible(false);
        jDateChooser2.setVisible(false);
        jDateChooser1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jButton1.setVisible(false);
        jRadioButton1.setSelected(false);
        jDateChooser2.setDate(null);
        jDateChooser1.setDate(null);

        try {

            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            if((jComboBox1.getSelectedItem().toString()).equals("All")){
               filter="All";
                jLabel10.setVisible(false);
               
                jTextField1.setVisible(false);
                jDateChooser1.setVisible(false);
                jDateChooser2.setVisible(false);
                jTextField2.setVisible(false);
                jLabel11.setVisible(false);

                //Now trying to get the record from the sales table;

               
               Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products"); 

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int tProdReturned=0;
        int count=0;
     int treturned=0;

int preinvoice=0;
int curinvoice=0;
        while(rs15.next()){
curinvoice=rs15.getInt(13);

if(curinvoice!=preinvoice){
treturned+=(int)rs15.getDouble(10);
}
            tProdReturned+=Integer.parseInt(rs15.getString(3));
             count++;
        tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
preinvoice=curinvoice;        
}

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(tProdReturned));
jTextField7.setText(String.valueOf(treturned));
            }else if(jComboBox1.getSelectedItem().equals("Product")){
               
                jLabel10.setVisible(true);
                                jTextField1.setVisible(true);
                jTextField2.setVisible(false);
                jLabel11.setVisible(false);

            }else if(jComboBox1.getSelectedItem().equals("Invoice")){
                
                jLabel10.setVisible(false);
                
                jTextField1.setVisible(false);
                jTextField2.setVisible(true);
                jLabel11.setVisible(true);
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jDateChooser2.setDate(null);
        jDateChooser1.setDate(null);

        try {
filter="Product Id = "+jTextField1.getText();

           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products  WHERE Pid= '"+Integer.valueOf(jTextField1.getText())+"'"); 

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int tProdReturned=0;
        int count=0;
     int treturned=0;

int preinvoice=0;
int curinvoice=0;
        while(rs15.next()){
curinvoice=rs15.getInt(13);

if(curinvoice!=preinvoice){
treturned+=(int)rs15.getDouble(10);
}
            tProdReturned+=Integer.parseInt(rs15.getString(3));
             count++;
        tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
preinvoice=curinvoice;        
}

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(tProdReturned));
jTextField7.setText(String.valueOf(treturned));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

        jDateChooser2.setDate(null);
        jDateChooser1.setDate(null);

        try {

           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            filter="Invoice No = "+jTextField2.getText();
Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT InvoiceNo, Pid, quantity, PName, salesPrice_Item, BillWOdiscount,DiscPerItem, Total_disc,TotalSaleAfterDisc,TotalReturnedAmount,Customer,DateTime,oneTimeid   FROM Customers_Returned_Products  WHERE InvoiceNo= '"+Integer.valueOf(jTextField2.getText())+"'"); 

            
DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int tProdReturned=0;
        int count=0;
     int treturned=0;

int preinvoice=0;
int curinvoice=0;
        while(rs15.next()){
curinvoice=rs15.getInt(13);

if(curinvoice!=preinvoice){
treturned+=(int)rs15.getDouble(10);
}
            tProdReturned+=Integer.parseInt(rs15.getString(3));
             count++;
        tbm.addRow(new Object[]{rs15.getString(12),rs15.getString(1), rs15.getString(11), rs15.getString(2), rs15.getString(4), rs15.getString(3), rs15.getString(5),rs15.getString(6),rs15.getString(7), rs15.getString(8), rs15.getString(9), rs15.getString(10)});
preinvoice=curinvoice;        
}

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(tProdReturned));
jTextField7.setText(String.valueOf(treturned));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
