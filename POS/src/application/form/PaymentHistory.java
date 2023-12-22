package raven.application.form;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
import javax.swing.DefaultComboBoxModel;
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
public class PaymentHistory extends javax.swing.JPanel {
    
    
    
   public class ReportData {

        public ReportData(String orderno, String supplier, String status, String date, String tamount, String ramount, String payedamount) {
            this.orderno = orderno;
            this.supplier = supplier;
            this.status = status;
            this.date = date;
            this.tamount = tamount;
            this.ramount = ramount;
            this.payedamount = payedamount;
        }

      
private String orderno;
private String supplier;
private String status;
private String date;
private String tamount;
private String ramount;
private String payedamount;

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

        public void setstatus(String Status) {
            this.status = Status;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTamount() {
            return tamount;
        }

        public void setTamount(String tamount) {
            this.tamount = tamount;
        }

        public String getRamount() {
            return ramount;
        }

        public void setRamount(String ramount) {
            this.ramount = ramount;
        }

        public String getPayedamount() {
            return payedamount;
        }

        public void setPayedamount(String payedamount) {
            this.payedamount = payedamount;
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


    
    

    public PaymentHistory() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("PRINT & SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel14.setText("Payment Management");
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

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setText("To :");

        jLabel11.setText("From :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("ADD FILTER");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "UnPaid", "Paid" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Supplier Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Payment Status");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT supplier_name FROM SuppliersRecord";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox2.addItem("All");
            while(rs.next()){
                jComboBox2.addItem(rs.getString(1));
            } connection.close();} catch (SQLException ex) {
            Logger.getLogger(AddNewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(101, 101, 101)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Order No");

        jTextField2.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Total Amount ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Amount payed");

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Amount Remaining");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Pay");

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addGap(14, 14, 14))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(jLabel8)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Status", "Order No", "Supplier", "Total Amount", "Amount Paid", "Amount Remaining"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }
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

        jLabel7.setText("Search By Order Number");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addGap(769, 769, 769))
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents
String filter="null";
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed



 try {

            // Load and compile the Jasper report

            // Set parameters
            


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 5).toString()));
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
            parameters.put("curdatetime", (currentDateTimeString));
//             Create a JRBeanCollectionDataSource
            

String relativePath =  reports.getUrl()+"orderpaymentmanagement.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


 try {

            // Load and compile the Jasper report

            // Set parameters
            


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 5).toString()));
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
            parameters.put("curdatetime", (currentDateTimeString));
//             Create a JRBeanCollectionDataSource
            

String relativePath =  reports.getUrl()+"orderpaymentmanagement.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);

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

            // Set parameters
            


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 4).toString(), jTable1.getValueAt(i, 6).toString(), jTable1.getValueAt(i, 5).toString()));
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
            parameters.put("curdatetime", (currentDateTimeString));
//             Create a JRBeanCollectionDataSource
            

String relativePath =  reports.getUrl()+"orderpaymentmanagement.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);

            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);

 JasperViewer.viewReport(jasperPrint,false);
           
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
        


        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        try{

          
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            if((jComboBox4.getSelectedItem().toString()).equals("All")){
                if((jComboBox2.getSelectedItem().toString()).equals("All")){
filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier = "+jComboBox2.getSelectedItem().toString();
                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

                }else{
filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier = "+jComboBox2.getSelectedItem().toString();
                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Supplier='"+(jComboBox2.getSelectedItem().toString())+"'";
                   
                                        
ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

                }
            }else{
                filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier = "+jComboBox2.getSelectedItem().toString();
                if(jComboBox2.getSelectedItem().equals("All")){
                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE payStatus='"+(jComboBox4.getSelectedItem().toString())+"'";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }
                }else{

                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE payStatus='"+(jComboBox4.getSelectedItem().toString())+"' AND Supplier='"+(jComboBox2.getSelectedItem().toString())+"' ";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

                }
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);

        try{

            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            if((jComboBox4.getSelectedItem().toString()).equals("All")){
                if((jComboBox2.getSelectedItem().toString()).equals("All")){
filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier "+jComboBox2.getSelectedItem().toString();
                    Statement st= connection.createStatement();
                String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

                }else{
                    filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier "+jComboBox2.getSelectedItem().toString();
                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Supplier='"+(jComboBox2.getSelectedItem().toString())+"'";

                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

                }
            }else{
                filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier "+jComboBox2.getSelectedItem().toString();
                if(jComboBox2.getSelectedItem().equals("All")){
                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE payStatus='"+(jComboBox4.getSelectedItem().toString())+"'";

                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }
                }else{

                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE payStatus='"+(jComboBox4.getSelectedItem().toString())+"' AND Supplier='"+(jComboBox2.getSelectedItem().toString())+"' ";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

                }
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               

   
      
        
         try {

             
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
 Statement st= connection.createStatement();
                String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Order_No='"+Integer.valueOf(jTextField1.getText())+"'";
                ResultSet rs =st.executeQuery(sql1);
               int amp=0;
               int amr=0;
               int uamp=0;
               int uamr=0;
               int tam=0;
               String supplier="";
                while(rs.next()){
                    supplier=rs.getString(4);
                    tam=Integer.parseInt(rs.getString(5));
                        amr=Integer.parseInt(rs.getString(7));
                        amp=Integer.parseInt(rs.getString(6));
                }
                uamp= amp+Integer.parseInt(jTextField6.getText());
                uamr=amr-Integer.parseInt(jTextField6.getText());
                
                if(Integer.parseInt(jTextField6.getText())<=amr){
                    
                    PreparedStatement ptp=connection.prepareStatement("INSERT INTO PaymentHistory1 (Process, InvoiceNo, Supplier, AmountPayed, TotalAmount, Remaining_Amount) VALUES ( ?,?,?,?,?,? ) ");
        ptp.setString(1,"Ordered");
        ptp.setInt(2, Integer.parseInt(jTextField1.getText()));
        ptp.setString(3, supplier);
        ptp.setString(4,jTextField6.getText());
        ptp.setString(5, String.valueOf(tam));
        ptp.setString(6, String.valueOf(uamr));
        ptp.executeUpdate();
                    
                    
                if(uamp==tam){
                    
                    
                     
        
        
                String sql2 ="UPDATE OrderToSupplier SET AmountPayed ='"+uamp+"',AmountRemaining ='"+uamr+"',payStatus = '"+"Paid"+"'  WHERE Order_No='"+Integer.valueOf(jTextField1.getText())+"'";
                PreparedStatement pst=connection.prepareStatement(sql2);
                pst.executeUpdate();
                jTextField1.setText("");
                 jTextField2.setText("");
                 jTextField4.setText("");
                 jTextField5.setText("");
                 jTextField6.setText("");
                 
                
                
                }else{
                
                    
                    
                    
                    String sql2 ="UPDATE OrderToSupplier SET AmountPayed ='"+uamp+"',AmountRemaining ='"+uamr+"'  WHERE Order_No='"+Integer.valueOf(jTextField1.getText())+"'";
                PreparedStatement pst=connection.prepareStatement(sql2);
                pst.executeUpdate();
                jTextField1.setText("");
                 jTextField2.setText("");
                 jTextField4.setText("");
                 jTextField5.setText("");
                 jTextField6.setText("");
                        }
                        
                
               
            
                
                
                }else{
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You entered pay amount more than Remaining amount");
             
                }
                
                  Application.showForm(new PaymentHistory());
                 
                
  connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }
       
         
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
            filter=" Order No = "+jTextField3.getText();

        
        try {

          
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());


Statement st= connection.createStatement();
                String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }
connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }

        
        
        
        
        
        
        
        
        try {

           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            if(jTextField3.getText().equals("")){

                Statement st= connection.createStatement();
                 String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }

            }
            Statement st= connection.createStatement();
             String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Order_No='"+Integer.valueOf(jTextField3.getText())+"'";
                    ResultSet rs =st.executeQuery(sql1);
                    DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
                    tbm.setRowCount(0);
                    while(rs.next()){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                    }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PendingOrders.class.getName()).log(Level.SEVERE, null, ex);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
if(!numeric.isNumeric(jTextField6.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
if(!numeric.isNumeric(jTextField1.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}

         try {

              
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
 Statement st= connection.createStatement();
                String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Order_No='"+Integer.valueOf(jTextField1.getText())+"'";
                ResultSet rs =st.executeQuery(sql1);
                String a="";
                String b="";
                String c="";
                while(rs.next()){
                
               a=rs.getString(5);
                                   b= rs.getString(6);
                                       c= rs.getString(7);

                }
                
                 jTextField2.setText(a);
                                    jTextField4.setText(b);
                                        jTextField5.setText(c);
                                        
                                       
             
  connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentHistory.class.getName()).log(Level.SEVERE, null, ex);

        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Date input = jDateChooser2.getDate();
            Instant instant = input.toInstant();
            ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
            LocalDate date = zdt.toLocalDate();

            Date input1 = jDateChooser1.getDate();
            Instant instant1 = input1.toInstant();
            ZonedDateTime zdt1 = instant1.atZone(ZoneId.systemDefault());
            LocalDate date1 = zdt1.toLocalDate();
            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
            
            
            
            
            if((jComboBox4.getSelectedItem().toString()).equals("All")){
                if((jComboBox2.getSelectedItem().toString()).equals("All")){

                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier";
                    ResultSet rs =st.executeQuery(sql1);
                    tbm.setRowCount(0);
                    while(rs.next()){
                        if(((rs.getDate(1).toLocalDate()).isAfter( date1)) && rs.getDate(1).toLocalDate().isBefore(date)){

                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                        }
                        }

                }else{

                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Supplier='"+(jComboBox2.getSelectedItem().toString())+"'";
                    ResultSet rs =st.executeQuery(sql1);
                    tbm.setRowCount(0);
                    while(rs.next()){
                        if(((rs.getDate(1).toLocalDate()).isAfter( date1)) && rs.getDate(1).toLocalDate().isBefore(date)){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                        }
                        }

                }
            }else{
                if(jComboBox2.getSelectedItem().equals("All")){
                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE payStatus='"+(jComboBox4.getSelectedItem().toString())+"'";
                    ResultSet rs =st.executeQuery(sql1);
                    tbm.setRowCount(0);
                    while(rs.next()){
                        if(((rs.getDate(1).toLocalDate()).isAfter( date1)) && rs.getDate(1).toLocalDate().isBefore(date)){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                        }
                        }
                }else{

                    Statement st= connection.createStatement();
                    String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE payStatus='"+(jComboBox4.getSelectedItem().toString())+"' AND Supplier='"+(jComboBox2.getSelectedItem().toString())+"' ";
                    ResultSet rs =st.executeQuery(sql1);
                    tbm.setRowCount(0);
                    while(rs.next()){
                        if(((rs.getDate(1).toLocalDate()).isAfter( date1)) && rs.getDate(1).toLocalDate().isBefore(date)){
                        tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                        }
                        }

                }
            }

            
            filter=" Status = "+jComboBox4.getSelectedItem().toString()+" , "+" Supplier "+jComboBox2.getSelectedItem().toString()+" , "+" Date  From :"+ date1+"  To :"+date;
            
            
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
   try {

             
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
 Statement st= connection.createStatement();
                String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Order_No='"+Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString())+"'";
                ResultSet rs =st.executeQuery(sql1);
                String a="";
                String b="";
                String c="";
                while(rs.next()){
                
               a=rs.getString(5);
                                   b= rs.getString(6);
                                       c= rs.getString(7);

                }
                
                 jTextField2.setText(a);
                                    jTextField4.setText(b);
                                        jTextField5.setText(c);
                                        
                                       
             
  connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentHistory.class.getName()).log(Level.SEVERE, null, ex);

        }

        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked



jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
   try {

      
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
 Statement st= connection.createStatement();
                String sql1="SELECT OrderDate, payStatus, Order_No, Supplier, TotalAmount, AmountPayed, AmountRemaining FROM OrderToSupplier WHERE Order_No='"+Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString())+"'";
                ResultSet rs =st.executeQuery(sql1);
                String a="";
                String b="";
                String c="";
                while(rs.next()){
                
               a=rs.getString(5);
                                   b= rs.getString(6);
                                       c= rs.getString(7);

                }
                
                 jTextField2.setText(a);
                                    jTextField4.setText(b);
                                        jTextField5.setText(c);
                                        
                                       
             
  connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentHistory.class.getName()).log(Level.SEVERE, null, ex);

        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private transient javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
