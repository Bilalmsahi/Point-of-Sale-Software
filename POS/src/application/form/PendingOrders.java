package raven.application.form;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
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
import raven.application.Application;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class PendingOrders extends javax.swing.JPanel {

    
   public class ReportData {

        public ReportData(String productid, String productname, String quantity, String cost, String orderno, String supplier, String status, String orderdate, String recdate, String canceldate) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.cost = cost;
            this.orderno = orderno;
            this.supplier = supplier;
            this.status = status;
            this.orderdate = orderdate;
            this.recdate = recdate;
            this.canceldate = canceldate;
        }

       
private String productid;
private String productname;
private String quantity;
private String cost;
private String orderno;
private String supplier;
private String status;
private String orderdate;
private String recdate;
private String canceldate;

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

        public String getOrderno() {
            return orderno;
        }

        public void setOrderno(String orderno) {
            this.orderno = orderno;
        }

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getstatus() {
            return status;
        }

        public void setstatus(String status) {
            this.status = status;
        }

        public String getOrderdate() {
            return orderdate;
        }

        public void setOrderdate(String orderdate) {
            this.orderdate = orderdate;
        }

        public String getRecdate() {
            return recdate;
        }

        public void setRecdate(String recdate) {
            this.recdate = recdate;
        }

        public String getCanceldate() {
            return canceldate;
        }

        public void setCanceldate(String canceldate) {
            this.canceldate = canceldate;
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




    
    
    public PendingOrders() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(907, 650));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order No", "Product Name", "Product ID", "Cost / Item", "Quantity", "Supplier Name", "P-Category", "Status", "Order_Date", "Receive_Date", "Cancel_Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable1);
        try{

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("PRINT & SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel14.setText("Orders Status Management");
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

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Order No");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Product Id ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Receive");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCheckBox1.setText("Whole Order");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Supplier Name");

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Order Status");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "Received", "Canceled" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT supplier_name FROM SuppliersRecord";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox1.addItem("All");
            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            } connection.close();} catch (SQLException ex) {
            Logger.getLogger(AddNewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel7.setText("Search By Order Number");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jDateChooser1.setVisible(false);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        jDateChooser1.setMinSelectableDate(date);
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(120, 120, 120)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
String filter="null";
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"orderstatusreport.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            
//        public ReportData(String productid, String productname, String quantity, String cost, String orderno, String supplier, String Status, String orderdate, String recdate, String canceldate) {

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
                
                String x ="";
                String y="";
                String z="";
                if(jTable1.getValueAt(i, 10)==null){
                    x="...";
                }else{
                x=jTable1.getValueAt(i, 10).toString();
                }
                if(jTable1.getValueAt(i, 9)==null){
                    y="...";
                }else{
                y=jTable1.getValueAt(i, 9).toString();
                }
                if(jTable1.getValueAt(i, 8)==null){
                    z="...";
                }else{
                z=jTable1.getValueAt(i, 8).toString();
                }
//                System.out.println(x + y + z);
                
                            reportDataList.add(new ReportData( jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 5).toString(), jTable1.getValueAt(i, 7).toString(), z, y, x));

            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("productid: " + data.productid);
//    System.out.println("productname: " + data.productname);
//    System.out.println("quantity: " + data.quantity);
//    System.out.println("cost: " + data.cost);
//    System.out.println("orderno: " + data.orderno);
//    System.out.println("supplier: " + data.supplier);
//    System.out.println("Status: " + data.Status);
//    System.out.println("orderdate: " + data.orderdate);
//    System.out.println("recdate: " + data.recdate);
//    System.out.println("canceldate: " + data.canceldate);
// 
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);
Date currentDate = new Date();
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
String relativePath =  reports.getUrl()+"orderstatusreport.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            
//        public ReportData(String productid, String productname, String quantity, String cost, String orderno, String supplier, String Status, String orderdate, String recdate, String canceldate) {

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
                
                String x ="";
                String y="";
                String z="";
                if(jTable1.getValueAt(i, 10)==null){
                    x="...";
                }else{
                x=jTable1.getValueAt(i, 10).toString();
                }
                if(jTable1.getValueAt(i, 9)==null){
                    y="...";
                }else{
                y=jTable1.getValueAt(i, 9).toString();
                }
                if(jTable1.getValueAt(i, 8)==null){
                    z="...";
                }else{
                z=jTable1.getValueAt(i, 8).toString();
                }
//                System.out.println(x + y + z);
                
                            reportDataList.add(new ReportData( jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 5).toString(), jTable1.getValueAt(i, 7).toString(), z, y, x));

            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("productid: " + data.productid);
//    System.out.println("productname: " + data.productname);
//    System.out.println("quantity: " + data.quantity);
//    System.out.println("cost: " + data.cost);
//    System.out.println("orderno: " + data.orderno);
//    System.out.println("supplier: " + data.supplier);
//    System.out.println("Status: " + data.Status);
//    System.out.println("orderdate: " + data.orderdate);
//    System.out.println("recdate: " + data.recdate);
//    System.out.println("canceldate: " + data.canceldate);
// 
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);
Date currentDate = new Date();
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
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try{


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
            
            
            
        if((jComboBox3.getSelectedItem().toString()).equals("All")){
        if((jComboBox1.getSelectedItem().toString()).equals("All")){
        
            
           
Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }

  
        }else{
                
            Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE Supplier='"+(jComboBox1.getSelectedItem().toString())+"'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
            
        }
        }else{
        if(jComboBox1.getSelectedItem().equals("All")){
           Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE reciveingStatus='"+(jComboBox3.getSelectedItem().toString())+"'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
        }else{
        
             Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE reciveingStatus='"+(jComboBox3.getSelectedItem().toString())+"' AND Supplier='"+(jComboBox1.getSelectedItem().toString())+"' ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
            
        }
        }
        
        
        
        
        filter="Order Status = "+jComboBox3.getSelectedItem()+" , Supplier Name = "+jComboBox1.getSelectedItem();
         connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);
        
        }
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
     
 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"orderstatusreport.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
            
//        public ReportData(String productid, String productname, String quantity, String cost, String orderno, String supplier, String Status, String orderdate, String recdate, String canceldate) {

         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
                
                String x ="";
                String y="";
                String z="";
                if(jTable1.getValueAt(i, 10)==null){
                    x="...";
                }else{
                x=jTable1.getValueAt(i, 10).toString();
                }
                if(jTable1.getValueAt(i, 9)==null){
                    y="...";
                }else{
                y=jTable1.getValueAt(i, 9).toString();
                }
                if(jTable1.getValueAt(i, 8)==null){
                    z="...";
                }else{
                z=jTable1.getValueAt(i, 8).toString();
                }
//                System.out.println(x + y + z);
                
                            reportDataList.add(new ReportData( jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 5).toString(), jTable1.getValueAt(i, 7).toString(), z, y, x));

            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("productid: " + data.productid);
//    System.out.println("productname: " + data.productname);
//    System.out.println("quantity: " + data.quantity);
//    System.out.println("cost: " + data.cost);
//    System.out.println("orderno: " + data.orderno);
//    System.out.println("supplier: " + data.supplier);
//    System.out.println("Status: " + data.Status);
//    System.out.println("orderdate: " + data.orderdate);
//    System.out.println("recdate: " + data.recdate);
//    System.out.println("canceldate: " + data.canceldate);
// 
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);
Date currentDate = new Date();
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        
 try {
            
        int orderno = Integer.parseInt(jTextField1.getText());
            
            
         
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            
            Statement stt=connection.createStatement();
            

            
            
            
            
            
            
            
            if(jCheckBox1.isSelected()){
                System.out.println("selected");
                                        ResultSet rss=stt.executeQuery("SELECT reciveingStatus FROM OrderToSupplierByProduct WHERE Order_No = '"+Integer.valueOf(jTextField1.getText())+"'" );

                                        int a=0;
                                        while(rss.next()){
                                           if(rss.getString(1).equals("Pending")){
                                           
                                           a=1;}else if(rss.getString(1).equals("Canceled")){
                                           
                                           a=2;} 
                                        }
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        if(a==1){
                                        
            PreparedStatement ptst =connection.prepareStatement("UPDATE OrderToSupplierByProduct   SET  reciveingStatus='"+"Received"+"', receving_date=CURDATE WHERE Order_No = '"+ orderno +"' AND reciveingStatus='"+"Pending"+"'");


  int ga= JOptionPane.showConfirmDialog(this, "Do you want to add into you STOCK?");
                                        if(ga==JOptionPane.YES_OPTION){
                                              int gb= JOptionPane.showConfirmDialog(this, "Do you want to Update Cost of your Stock?");
                                                if(gb==JOptionPane.YES_OPTION){
                                        ResultSet rst=stt.executeQuery("SELECT P_Id, Quantity,Cost FROM OrderToSupplierByProduct WHERE Order_No = '"+ orderno +"' AND reciveingStatus='"+"Pending"+"' ");
                                            
                                            while(rst.next()){
                                            int pid=Integer.parseInt(rst.getString(1));
                                            String cost=rst.getString(3);
                                            int qnt = Integer.parseInt(rst.getString(2));
                                            
                                            ResultSet rst1=stt.executeQuery("SELECT  P_Quantity FROM Stock WHERE P_Id = '"+pid+"'");
 int stqnt=0;                               int fqt=0;
                                            while(rst1.next()){
                                            stqnt= Integer.parseInt(rst1.getString(1));
                                             
                                            }                         fqt=stqnt+qnt;                  
                                            System.out.println("cost "+cost);
                                            System.out.println("qty "+fqt);
                                     PreparedStatement ptst1 =connection.prepareStatement("UPDATE Stock   SET  P_Quantity='"+fqt+"', P_Cost='"+cost+"' WHERE P_Id = '"+pid+"'");
                                        ptst1.executeUpdate();
                                        
                                        
                                        String sql21="SELECT P_Name,P_Selling_Price,P_Category,P_Brand_Name,P_Quantity,P_Unit,P_Expiry,P_Min_Stock,Supplier_ID,Discription FROM  STOCK WHERE P_Id = '"+pid+"'";
                        ResultSet rs2 =stt.executeQuery(sql21);
                                         
                        
//                        Geting Expiary Date for every product
        
               int za; 
  
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
  jDateChooser1.setVisible(true);
  String ss="";
   
            String a2= "";
            String a3= "";
            String a4= "";
            
            String a6= "";
            int a7=0;
            String a8= "";
            String a9= "";
  while(rs2.next()){
  ss=rs2.getString(1);
   a2=rs2.getString(2);
             a3=rs2.getString(3);
            a4=rs2.getString(4);
             
             a6=rs2.getString(6);

             a7=rs2.getInt(8);
            a8= rs2.getString(9);
             a9=rs2.getString(10);
  }
  
        String date="";
        
        za=JOptionPane.showConfirmDialog(this,jDateChooser1, "Select Expiary for "+pid+" "+ss, JOptionPane.DEFAULT_OPTION);
            if(za==JOptionPane.OK_OPTION){
            date = sdf.format(jDateChooser1.getDate());
            System.out.println(date);
            } 
            jDateChooser1.setVisible(false);
           jDateChooser1.setDate(null);



                         PreparedStatement ptst2 =connection.prepareStatement("INSERT INTO StockAdded(P_Id, P_Name, P_Cost, P_Selling_Price, P_Category, P_Brand_Name, P_Quantity, P_Unit, P_Expiry, P_Min_Stock, Supplier_ID, Discription) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                          { 
           
            
            
             ptst2.setString(1, rst.getString(1));
             ptst2.setString(2, ss);

            ptst2.setString(3, rst.getString(3));
             ptst2.setString(4, a2);
            ptst2.setString(5, a3);
            ptst2.setString(6, a4);
            ptst2.setInt(7, rst.getInt(2));
            ptst2.setString(8, a6);
            ptst2.setString(9,date);
            ptst2.setInt(10, a7);
            ptst2.setString(11, a8);
            ptst2.setString(12, a9);
            
                     ptst2.executeUpdate();     }
                         
                        
                                        
                                        
                                            }
                                                }else{
                                                
                                                 ResultSet rst=stt.executeQuery("SELECT P_Id, Quantity, Cost FROM OrderToSupplierByProduct WHERE Order_No = '"+ orderno +"' AND reciveingStatus='"+"Pending"+"' ");
                                            
                                            while(rst.next()){
                                            int pidu=Integer.parseInt(rst.getString(1));
                                          
                                            int qnt = Integer.parseInt(rst.getString(2));
                                            
                                            ResultSet rst1=stt.executeQuery("SELECT  P_Quantity FROM Stock WHERE P_Id = '"+pidu+"'");
                                             int stqnt=0; 
                                            while(rst1.next()){
                                            stqnt= Integer.parseInt(rst1.getString(1));
                                            }
                                            int fqt=stqnt+qnt;
                                             
                                            System.out.println("qty "+fqt);
                                     PreparedStatement ptst1 =connection.prepareStatement("UPDATE Stock  SET  P_Quantity='"+fqt+"' WHERE P_Id = '"+pidu+"'");
                                        ptst1.executeUpdate();
                                        
                                        
                                        
                                         String sql21="SELECT P_Name,P_Selling_Price,P_Category,P_Brand_Name,P_Quantity,P_Unit,P_Expiry,P_Min_Stock,Supplier_ID,Discription FROM  STOCK WHERE P_Id = '"+pidu+"'";
                                        
                                         ResultSet rs2 =stt.executeQuery(sql21);
                                        
//                        Geting Expiary Date for every product
        
               int za; 
  
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
  jDateChooser1.setVisible(true);
  String ss="";
   
            String a2= "";
            String a3= "";
            String a4= "";
            
            String a6= "";
            int a7=0;
            String a8= "";
            String a9= "";
  while(rs2.next()){
  ss=rs2.getString(1);
   a2=rs2.getString(2);
             a3=rs2.getString(3);
            a4=rs2.getString(4);
             
             a6=rs2.getString(6);

             a7=rs2.getInt(8);
            a8= rs2.getString(9);
             a9=rs2.getString(10);
  }
  
        String date="";
        za=JOptionPane.showConfirmDialog(this, jDateChooser1, "Select Expiary for "+pidu+" "+ss, JOptionPane.DEFAULT_OPTION);
            if(za==JOptionPane.OK_OPTION){
            date = sdf.format(jDateChooser1.getDate());
            System.out.println(date);
            } 
            jDateChooser1.setVisible(false);
                        jDateChooser1.setDate(null);
                         PreparedStatement ptst2 =connection.prepareStatement("INSERT INTO StockAdded(P_Id, P_Name, P_Cost, P_Selling_Price, P_Category, P_Brand_Name, P_Quantity, P_Unit, P_Expiry, P_Min_Stock, Supplier_ID, Discription) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                                       
                          { 
             ptst2.setString(1, rst.getString(1));
             ptst2.setString(2, ss);

            ptst2.setString(3, rst.getString(3));
             ptst2.setString(4, a2);
            ptst2.setString(5, a3);
            ptst2.setString(6, a4);
            ptst2.setInt(7, rst.getInt(2));
            ptst2.setString(8, a6);
            ptst2.setString(9,date);
            ptst2.setInt(10, a7);
            ptst2.setString(11, a8);
            ptst2.setString(12, a9);
            
                     ptst2.executeUpdate();     }
                         
                         
                                        
                                            }
                                                
                                                }     
                                        }
                                        
                                        ptst.executeUpdate();
                                     
      Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Received Order");
                                   
                                        
                                     
                                        }else if(a==2){
                                            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Your Whole Order is Already Canceled");
                                         
                                        }else{
                                            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Your Whole Order is Already Recived");
                                       
                                        }
            }else{
                
                int pid = Integer.parseInt(jTextField2.getText());
                        ResultSet rss=stt.executeQuery("SELECT reciveingStatus FROM OrderToSupplierByProduct WHERE Order_No = '"+Integer.valueOf(jTextField1.getText())+"'  AND P_Id = '"+Integer.valueOf(jTextField2.getText())+"'"   );

                        int a=0;
                                        while(rss.next()){
                                           if(rss.getString(1).equals("Pending")){
                                           
                                           a=1;}else if(rss.getString(1).equals("Canceled")){
                                           
                                           a=2;} 
                                        }
                                        if(a==1){
                        
                        
            PreparedStatement ptst =connection.prepareStatement("UPDATE OrderToSupplierByProduct   SET  reciveingStatus='"+"Received"+"', receving_date=CURDATE WHERE Order_No = '"+ orderno +"' AND P_Id = '"+ pid +"' AND reciveingStatus='"+"Pending"+"' ");

             int ga= JOptionPane.showConfirmDialog(this, "Do you want to add into you STOCK?");
                                        if(ga==JOptionPane.YES_OPTION){
                                              int gb= JOptionPane.showConfirmDialog(this, "Do you want to Update Cost of your Stock?");
                                                if(gb==JOptionPane.YES_OPTION){
                                        ResultSet rst=stt.executeQuery("SELECT P_Id, Quantity,Cost FROM OrderToSupplierByProduct WHERE Order_No = '"+ orderno +"' AND P_Id = '"+ pid +"' AND reciveingStatus='"+"Pending"+"'");
                                            
                                            while(rst.next()){
                                            int pid2=Integer.parseInt(rst.getString(1));
                                            String cost=rst.getString(3);
                                            int qnt = Integer.parseInt(rst.getString(2));
                                            
                                            ResultSet rst1=stt.executeQuery("SELECT  P_Quantity FROM Stock WHERE P_Id = '"+pid2+"'");
                                           int stqnt=0; 
                                            while(rst1.next()){
                                            stqnt= Integer.parseInt(rst1.getString(1));
                                            }
                                            int fqt=stqnt+qnt;
                                             System.out.println("cost "+cost);
                                            System.out.println("qty "+fqt);
                                     PreparedStatement ptst1 =connection.prepareStatement("UPDATE Stock   SET  P_Quantity='"+fqt+"', P_Cost='"+cost+"' WHERE P_Id = '"+pid2+"'");
                                        ptst1.executeUpdate();
                                        
                                        String sql21="SELECT P_Name,P_Selling_Price,P_Category,P_Brand_Name,P_Quantity,P_Unit,P_Expiry,P_Min_Stock,Supplier_ID,Discription FROM  STOCK WHERE P_Id = '"+pid2+"'";
                        ResultSet rs2 =stt.executeQuery(sql21);
                                        
                        
                      //                        Geting Expiary Date for every product
        
                int za; 
  
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
  jDateChooser1.setVisible(true);
  String ss="";
   
            String a2= "";
            String a3= "";
            String a4= "";
            
            String a6= "";
            int a7=0;
            String a8= "";
            String a9= "";
  while(rs2.next()){
  ss=rs2.getString(1);
   a2=rs2.getString(2);
             a3=rs2.getString(3);
            a4=rs2.getString(4);
             
             a6=rs2.getString(6);

             a7=rs2.getInt(8);
            a8= rs2.getString(9);
             a9=rs2.getString(10);
  }
        String date="";
        za=JOptionPane.showConfirmDialog(this, jDateChooser1, "Select Expiary for "+pid2+" "+ss, JOptionPane.DEFAULT_OPTION);
            if(za==JOptionPane.OK_OPTION){
            date = sdf.format(jDateChooser1.getDate());
            System.out.println(date);
            } 
            jDateChooser1.setVisible(false);
            jDateChooser1.setDate(null);            
                         PreparedStatement ptst2 =connection.prepareStatement("INSERT INTO StockAdded(P_Id, P_Name, P_Cost, P_Selling_Price, P_Category, P_Brand_Name, P_Quantity, P_Unit, P_Expiry, P_Min_Stock, Supplier_ID, Discription) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                                       
                          { 
           
            
          
           
            
             ptst2.setString(1, rst.getString(1));
             ptst2.setString(2, ss);

            ptst2.setString(3, rst.getString(3));
             ptst2.setString(4, a2);
            ptst2.setString(5, a3);
            ptst2.setString(6, a4);
            ptst2.setInt(7, rst.getInt(2));
            ptst2.setString(8, a6);
            ptst2.setString(9,date);
            ptst2.setInt(10, a7);
            ptst2.setString(11, a8);
            ptst2.setString(12, a9);
            
                     ptst2.executeUpdate();     }
                         
                         
                                        
                                            }
                                                }else{
                                                
                                                 ResultSet rst=stt.executeQuery("SELECT P_Id, Quantity, Cost FROM OrderToSupplierByProduct WHERE Order_No = '"+ orderno +"' AND P_Id = '"+ pid +"' AND reciveingStatus='"+"Pending"+"' ");
                                            
                                            while(rst.next()){
                                            int pidi=Integer.parseInt(rst.getString(1));
                                          
                                            int qnt = Integer.parseInt(rst.getString(2));
                                            
                                            ResultSet rst1=stt.executeQuery("SELECT  P_Quantity FROM Stock WHERE P_Id = '"+pidi+"'");
                                             int stqnt=0; 
                                            while(rst1.next()){
                                            stqnt= Integer.parseInt(rst1.getString(1));
                                            }
                                            int fqt=stqnt+qnt;
                                            
                                            System.out.println("qty "+fqt);
                                     PreparedStatement ptst1 =connection.prepareStatement("UPDATE Stock  SET  P_Quantity='"+fqt+"' WHERE P_Id = '"+pidi+"'");
                                        ptst1.executeUpdate();
                                        String sql21="SELECT P_Name,P_Selling_Price,P_Category,P_Brand_Name,P_Quantity,P_Unit,P_Expiry,P_Min_Stock,Supplier_ID,Discription FROM  STOCK WHERE P_Id = '"+pidi+"'";
                        ResultSet rs2 =stt.executeQuery(sql21);
                                        
                        
                       //                        Geting Expiary Date for every product
        
                int za; 
  
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
  jDateChooser1.setVisible(true);
  String ss="";
   
            String a2= "";
            String a3= "";
            String a4= "";
            
            String a6= "";
            int a7=0;
            String a8= "";
            String a9= "";
  while(rs2.next()){
  ss=rs2.getString(1);
   a2=rs2.getString(2);
             a3=rs2.getString(3);
            a4=rs2.getString(4);
             
             a6=rs2.getString(6);

             a7=rs2.getInt(8);
            a8= rs2.getString(9);
             a9=rs2.getString(10);
  }
        String date="";
        za=JOptionPane.showConfirmDialog(this, jDateChooser1, "Select Expiary for "+pidi+" "+ss, JOptionPane.DEFAULT_OPTION);
            if(za==JOptionPane.OK_OPTION){
            date = sdf.format(jDateChooser1.getDate());
            
            } 
            jDateChooser1.setVisible(false);
            jDateChooser1.setDate(null);
                        
                         PreparedStatement ptst2 =connection.prepareStatement("INSERT INTO StockAdded (P_Id, P_Name, P_Cost, P_Selling_Price, P_Category, P_Brand_Name, P_Quantity, P_Unit, P_Expiry, P_Min_Stock, Supplier_ID, Discription) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                                       
                           { 
             ptst2.setString(1, rst.getString(1));
             ptst2.setString(2, ss);

            ptst2.setString(3, rst.getString(3));
             ptst2.setString(4, a2);
            ptst2.setString(5, a3);
            ptst2.setString(6, a4);
            ptst2.setInt(7, rst.getInt(2));
            ptst2.setString(8, a6);
            ptst2.setString(9,date);
            ptst2.setInt(10, a7);
            ptst2.setString(11, a8);
            ptst2.setString(12, a9);
            
                     ptst2.executeUpdate();     }
                          
                                            }
                                                
                                                }
                                        }
            ptst.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Received Order");
                  
                     }else if(a==2){
                         
                         Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Your Order is Already been Canceled");
                                        
                                        }else{
                         Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Your Order is Already Received");
                                        
                                        }
            }

            
        jTextField1.setText("");
        jTextField2.setText("");
        
        

           
            connection.close();
        } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(this, ex);

            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);
        }

        Application.showForm(new PendingOrders());
        
           


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        
        try {
            
            int orderno = Integer.parseInt(jTextField1.getText());
            
           
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
             Statement stt=connection.createStatement();
            if(jCheckBox1.isSelected()){
                
                ResultSet rss=stt.executeQuery("SELECT reciveingStatus FROM OrderToSupplierByProduct WHERE Order_No = '"+Integer.valueOf(jTextField1.getText())+"'" );

                                        int a=0;
                                        while(rss.next()){
                                           if(rss.getString(1).equals("Received") || rss.getString(1).equals("Canceled")){
                                           
                                           a=1;}
                                        }
                                        if(a==1){   
                                            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Some Products or Full Order is Already Recived or Canceled. So you are Unable to Cancel it.");
                             

                                        }else{
                                           System.out.println("rn");
                                           System.out.println(a);
                                               int cp_amount=0, Order_Amount=0, Amount_Payed=0, A_TAmount=0, A_AmountRemaining=0;   
                 ResultSet rss1=stt.executeQuery("SELECT TotalAmount FROM OrderToSupplierByProduct WHERE Order_No = '"+ orderno +"' AND reciveingStatus='"+"Pending"+"'");
                            while(rss1.next()){
                            cp_amount+=(Integer.parseInt(rss1.getString(1)));
                            }
                                            
                ResultSet rss2=stt.executeQuery("SELECT TotalAmount, AmountPayed FROM OrderToSupplier WHERE Order_No = '"+ orderno +"'");
                            
                while(rss2.next()){
                    Order_Amount+=(Integer.parseInt(rss2.getString(1)));
                            Amount_Payed+=(Integer.parseInt(rss2.getString(2)));
                            System.out.println(rss2.getString(1));
                            }                            
                System.out.println(Order_Amount);
                System.out.println(cp_amount);
                
                            A_TAmount=Order_Amount-cp_amount;
                            A_AmountRemaining=A_TAmount-Amount_Payed;
                            System.out.println(A_TAmount);
                PreparedStatement ps=connection.prepareStatement("UPDATE OrderToSupplier SET TotalAmount="+A_TAmount+", AmountRemaining="+A_AmountRemaining+"   WHERE Order_No = "+ orderno +"");
                        ps.executeUpdate();
                            
                                            
                                            PreparedStatement ptst =connection.prepareStatement("UPDATE OrderToSupplierByProduct   SET  reciveingStatus='"+"Canceled"+"', canceled_date=CURDATE WHERE Order_No = '"+ orderno +"' AND reciveingStatus='"+"Pending"+"'");
                                        ptst.executeUpdate();
                                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Canceled Order");
     
                                        
                                        }

            }else{
                
                    ResultSet rss=stt.executeQuery("SELECT reciveingStatus FROM OrderToSupplierByProduct WHERE Order_No = '"+Integer.valueOf(jTextField1.getText())+"'  AND P_Id = '"+Integer.valueOf(jTextField2.getText())+"'"   );

                        int a=0;
                                        while(rss.next()){
                                           if(rss.getString(1).equals("Received")){
                                           
                                           a=1;}else if(rss.getString(1).equals("Canceled")){
                                           
                                           a=2;}
                                        }
                                        if(a==1){
                                            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "This Product of this Order id Already Recived.");
                            

           
         }else if (a==2){
              Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "This Product of this Order Are is Already Canceled.");
                                        
                                        }else{
                      int pid = Integer.parseInt(jTextField2.getText());                      
                                            int cp_amount=0, Order_Amount=0, Amount_Payed=0, A_TAmount=0, A_AmountRemaining=0;   
                 ResultSet rss1=stt.executeQuery("SELECT TotalAmount FROM OrderToSupplierByProduct WHERE Order_No = '"+ orderno +"' AND P_Id = '"+ pid +"' AND reciveingStatus='"+"Pending"+"' ");
                            while(rss1.next()){
                            cp_amount+=(Integer.parseInt(rss1.getString(1)));
                            }
                                            
                ResultSet rss2=stt.executeQuery("SELECT TotalAmount, AmountPayed FROM OrderToSupplier WHERE Order_No = '"+ orderno +"'");
                            while(rss2.next()){
                            Order_Amount+=(Integer.parseInt(rss2.getString(1)));
                            Amount_Payed+=(Integer.parseInt(rss2.getString(2)));
                            }                            
                
                            A_TAmount=Order_Amount-cp_amount;
                            A_AmountRemaining=A_TAmount-Amount_Payed;
                            
                PreparedStatement ps=connection.prepareStatement("UPDATE OrderToSupplier SET TotalAmount='"+A_TAmount+"', AmountRemaining='"+A_AmountRemaining+"'  WHERE Order_No = '"+ orderno +"' ");
                        ps.executeUpdate();
                                            
                                            
                                            
                                            
                                             PreparedStatement ptst =connection.prepareStatement("UPDATE OrderToSupplierByProduct   SET  reciveingStatus='"+"Canceled"+"', canceled_date=CURDATE WHERE Order_No = '"+ orderno +"' AND P_Id = '"+ pid +"' AND reciveingStatus='"+"Pending"+"' ");
ptst.executeUpdate();

Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Canceled Order");
      
                                        
                }
            }

            

jTextField1.setText("");
        jTextField2.setText("");
        
        

           
            connection.close();
        } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(this, ex);

            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
                   Application.showForm(new PendingOrders());


        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
     if(jCheckBox1.isSelected()){
     jTextField2.setVisible(false);
     jLabel3.setVisible(false);
     
     }else{
         jTextField2.setVisible(true);
     jLabel3.setVisible(true);
     }
        


// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
 try{


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
            
            
            
        if((jComboBox3.getSelectedItem().toString()).equals("All")){
        if((jComboBox1.getSelectedItem().toString()).equals("All")){
        
            
           
Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }

  
        }else{
                
            Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE Supplier='"+(jComboBox1.getSelectedItem().toString())+"'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
            
        }
        }else{
        if(jComboBox1.getSelectedItem().equals("All")){
           Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE reciveingStatus='"+(jComboBox3.getSelectedItem().toString())+"'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
        }else{
        
             Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE reciveingStatus='"+(jComboBox3.getSelectedItem().toString())+"' AND Supplier='"+(jComboBox1.getSelectedItem().toString())+"' ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
            
        }
        }
        
        
        
        filter="Order Status = "+jComboBox3.getSelectedItem()+" , Supplier Name = "+jComboBox1.getSelectedItem();
        
         connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

        if(!numeric.isNumeric(jTextField3.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        
        
String ss=jTextField3.getText();
   
     try {

         jComboBox3.setSelectedIndex(0);
         jComboBox1.setSelectedIndex(0);

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
            
            if(ss.equals("")){
            
           


            
Statement st= connection.createStatement();
               String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),  rs.getString(9), rs.getString(10), rs.getString(11)});
           }
           
       
            }else{
Statement st= connection.createStatement();
              String sql1="SELECT Order_No, P_Name, P_Id, Cost, Quantity, Supplier, P_Category,  reciveingStatus, Order_date, receving_date, canceled_date FROM OrderToSupplierByProduct WHERE Order_No LIKE '%"+Integer.valueOf(jTextField3.getText())+"%'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),  rs.getString(8),rs.getString(9), rs.getString(10), rs.getString(11)});
           }
            }
            
            filter="Contains Order No = "+jTextField3.getText();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);
        
        }

// TODO add your handling code here:

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void jDateChooser1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyTyped
       
      
// TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

if(!numeric.isNumeric(jTextField1.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

if(!numeric.isNumeric(jTextField2.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JRadioButton jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private transient javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
