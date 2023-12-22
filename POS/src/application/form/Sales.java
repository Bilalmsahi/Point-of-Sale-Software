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
 * 
 *
 * @author Raven
 */
public class Sales extends javax.swing.JPanel {

    
    
    

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


    
    
    
    
    
    
    public Sales() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    int net_price=0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("HOLD ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("PRINT & SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel14.setText("SALES");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("CLEAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel10.setText("Final Price");

        jLabel12.setText("Cash");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        DefaultTableCellRenderer crr=new DefaultTableCellRenderer();
        crr.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(String.class, crr);
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
        System.out.println(jTable1.getRowCount());

        jLabel13.setText("Change");

        jTextField10.setEditable(false);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Qty");

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSpinner1KeyReleased(evt);
            }
        });

        jButton10.setText("Clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        jLabel8.setText("Discount");

        jLabel17.setText("Additional Charges");

        jLabel7.setText("Voucher Code");

        jTextField6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField6InputMethodTextChanged(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addComponent(jTextField7)
                        .addComponent(jTextField14))
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6))
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField9.setEditable(false);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jTextField4.requestFocusInWindow();

        jLabel4.setText("Product Id.");

        jTextField12.setEditable(false);

        jLabel5.setText("Invoice no.");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setText("Customer No.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton12.setText("Update");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel16)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton10)
                            .addComponent(jButton12)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Search Products");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Price", "Avg. Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer cr=new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);
        jTable3.setDefaultRenderer(String.class, cr);
        jTable3.setColumnSelectionAllowed(true);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable3KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        {try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT P_Id, P_Name, P_Selling_Price,P_Quantity FROM Stock ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable3.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}

        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });

        jLabel11.setText("Product Name.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice Number", "Customer No", "Total Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer cr1=new DefaultTableCellRenderer();
        cr1.setHorizontalAlignment(JLabel.CENTER);
        jTable2.setDefaultRenderer(String.class, cr1);
        jTable2.setColumnSelectionAllowed(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT Invoce, Coustomer, net_price FROM HoldsalesbyInvoices ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable2.getModel();
            tbm.setRowCount(0);

            while(rs.next()){

                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3)});

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("HOLD Invoices");

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText(" Vouchers");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voucher Code", "Voucher Name", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer cr2=new DefaultTableCellRenderer();
        cr2.setHorizontalAlignment(JLabel.CENTER);
        jTable4.setDefaultRenderer(String.class, cr2);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jTable4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable4KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT v_code, v_name, Percentage FROM VouchersAndDiscount ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable4.getModel();
            tbm.setRowCount(0);

            System.out.println("hi");
            while(rs.next()){
                System.out.println("hi");
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3)});
                System.out.println("hi");
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setText("SAVE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(6, 6, 6)
                                .addComponent(jButton3)
                                .addGap(6, 6, 6)
                                .addComponent(jButton4)
                                .addGap(12, 12, 12)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton11))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
        String s1s=jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString();
        jTextField4.setText(s1s);

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField3.getText().equals("")){
        
        JOptionPane.showMessageDialog(this, "Please Enter your Customer No. first");
        
        }else{
 try {
String customer=jTextField3.getText();
       
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pt=connection.prepareStatement("INSERT INTO AutoNumbers (hi) VALUES ( ? ) ");
            PreparedStatement pst=connection.prepareStatement("INSERT INTO HoldsalesbyInvoices ( Invoce, Coustomer, total_price, Discount, VoucherCode, AdditionalCharges, net_price,cost) VALUES (?,?,?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO HoldsalesbyProduct (Invoice, Customer, Productname, Productno, Quantity, price)VALUES(?,?,?,?,?,?)");
            
             pt.setString(1, "bye");
                Statement s = connection.createStatement();
pt.executeUpdate();
            
            pt.executeUpdate();ResultSet rss = s.executeQuery("SELECT OrderNumber FROM AutoNumbers ORDER BY OrderNumber DESC LIMIT 1");
          
//            in order to supplier order no waly me sirf ik hi bar store honi
            
            
            String invoice=null;
            while(rss.next()){
            invoice=rss.getString(1);
            }
            
            
            pst.setString(1, invoice);
            
            pst.setString(2, customer);
            
            pst.setString(3, jTextField8.getText());
            
            pst.setString(4, jTextField7.getText());
            
            pst.setString(5, jTextField6.getText());
            
            pst.setString(6, jTextField14.getText());
            pst.setString(7, jTextField9.getText());
            pst.setString(8, String.valueOf(cost));
             System.out.println("hii12");
            pst.executeUpdate();
            
           
                
           System.out.println("hii12");
            
            
            
            
            
         int rcount=jTable1.getRowCount();
          System.out.println("hii12");
         for(int i=0;i<rcount;i++){
              System.out.println("hii12");
         psts.setString(1, invoice);
         psts.setString(2, customer);
         psts.setString(3, String.valueOf(( jTable1.getValueAt(i, 1))));
         psts.setString(4, String.valueOf(jTable1.getValueAt(i, 0)) );
         psts.setInt(5, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
         psts.setString(6, String.valueOf( jTable1.getValueAt(i, 3)));
         psts.executeUpdate();
         }
            DefaultTableModel dft = (DefaultTableModel)jTable2.getModel();
            
             dft.addRow(new Object[]{invoice, customer, jTextField8.getText()});
            
             connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
  Application.showForm(new Sales());
    
    }

       

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed



            
            if(jTextField12.getText().equals("")){
                
                  try {

        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pt=connection.prepareStatement("INSERT INTO AutoNumbers (hi) VALUES ( ? ) ");
            PreparedStatement pst=connection.prepareStatement("INSERT INTO Sales ( Invoice,Customer_name, cost, sales, Actual_bill, Discount) VALUES (?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO SoldProducts (InvoiceNo, Customer, P_Id, Quantiy, Cost, SoldPrice,  Brand, Supplier,Category,P_Name)VALUES(?,?,?,?,?,?,?,?,?,?)");
          
            
                
            pt.setString(1, "bye");
                Statement s = connection.createStatement();
            pt.executeUpdate();
            ResultSet rss = s.executeQuery("SELECT OrderNumber FROM AutoNumbers ORDER BY OrderNumber DESC LIMIT 1");
          
            
            
            
            while(rss.next()){
            invoice=rss.getString(1);
            }
            String customer=jTextField3.getText();
            
            
            
            
            
            

 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"salesinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); 
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Sales.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new Sales.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString()));
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
String voper="";
if(VoucherValid==true){for(int i=0;i<jTable4.getRowCount();i++){
    if((jTable4.getValueAt(i, 0).toString()).equals(jTextField6.getText())){
    voper=jTable4.getValueAt(i, 2).toString();
    break;
    }
}}
// finding customer 

String cus="";
if(jTextField3.getText().equals("")){
cus="Regular";
}else{

cus=jTextField3.getText();}
Map<String, Object> parameters = new HashMap<>();
            parameters.put("invoiceno",invoice );
            parameters.put("totalprice ", jTextField8.getText());
            parameters.put("discountper", jTextField7.getText());
            parameters.put("voucher", voper );
            parameters.put("aditionalcharges", jTextField14.getText());
            parameters.put("netprice", jTextField9.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);


            
             String printerName = PrinterName.getInvoicePrinterName(); // Change to your printer name
            
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
        

            
            
            
            
            
            
            
            pst.setString(1, invoice);
            
             pst.setString(2, customer);
            
            pst.setString(3, String.valueOf(cost));
            
            pst.setString(4, jTextField9.getText());
                        pst.setString(5, jTextField8.getText());
                                    int Disc=Integer.parseInt(jTextField8.getText())-Integer.parseInt(jTextField9.getText());

                        if(Integer.parseInt(jTextField8.getText())>Integer.parseInt(jTextField9.getText())){
            pst.setString(6, String.valueOf(Disc));
            }else{
                        pst.setString(6, "0");

            }

            pst.executeUpdate();
            
           
                
            
            
            
            
            
            
         int rcount=jTable1.getRowCount();
         for(int i=0;i<rcount;i++){
             
             
               Statement ss = connection.createStatement();
                 ResultSet rsss = ss.executeQuery("SELECT P_Cost,P_Brand_Name,Supplier_ID,P_Category,P_Name, P_Quantity FROM Stock WHERE P_Id ='"+(jTable1.getValueAt(i, 0))+"'");
         psts.setInt(1, Integer.parseInt(invoice));
         psts.setString(2, customer);
         psts.setString(3,  String.valueOf(jTable1.getValueAt(i, 0)));
         psts.setInt(4, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
          psts.setString(6, String.valueOf(jTable1.getValueAt(i, 3)));
         
          String Sql="";
   
           int newqty=0;
           while(rsss.next()){
               psts.setString(5,rsss.getString(1) );
       psts.setString(7,rsss.getString(2) );
         psts.setString(8,rsss.getString(   3) );
            psts.setString(9,rsss.getString(4) );
           psts.setString(10,rsss.getString(5) );
           
            newqty=(Integer.parseInt(rsss.getString(6))-(Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
           
           }
           
           
           
          Sql="UPDATE Stock SET P_Quantity='"+newqty+"' WHERE P_Id ='"+Integer.valueOf((jTable1.getValueAt(i, 0).toString()))+"'";
            PreparedStatement ps1=connection.prepareStatement(Sql);
                      ps1.executeUpdate();
          psts.executeUpdate();
          
          
          
                     
          
          
          
          
          
          
         }
         
         
        
         
         
         
         
         
         Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Sold");
                   
             connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
            }else{
                
                 try {
                     invoice=jTextField12.getText();
                     
                     
String customer=jTextField3.getText();
        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pst=connection.prepareStatement("INSERT INTO Sales ( Invoice,Customer_name, cost, sales, Actual_bill,Discount) VALUES (?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO SoldProducts (InvoiceNo, Customer, P_Id, Quantiy, Cost,  SoldPrice,  Brand, Supplier,Category,P_Name)VALUES(?,?,?,?,?,?,?,?,?,?)");
          
          
                
           
//            Invoice Printing


 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath = "src/raven/application/printableReports/salesinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Sales.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new Sales.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString()));
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
String voper="";
for(int i=0;i<jTable4.getRowCount();i++){
    if((jTable4.getValueAt(i, 0).toString()).equals(jTextField6.getText())){
    voper=jTable4.getValueAt(i, 2).toString();
    break;
    }
}
// finding customer 

String cus="";
if(jTextField3.getText().equals("")){
cus="Regular";
}else{

cus=jTextField3.getText();}
Map<String, Object> parameters = new HashMap<>();
            parameters.put("invoiceno",invoice );
            parameters.put("totalprice ", jTextField8.getText());
            parameters.put("discountper", jTextField7.getText());
            parameters.put("voucher", voper );
            parameters.put("aditionalcharges", jTextField14.getText());
            parameters.put("netprice", jTextField9.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
            


System.out.println("sourceeeeeeee");
            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
System.out.println("dataaaaaaaaaaaaa");
            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);
 System.out.println("idhrrrrrrrr");
           

            
             String printerName = "hp123"; // Change to your printer name
            
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
        
        
            
            
            
            
            
            
            
          
//            in order to supplier order no waly me sirf ik hi bar store honi
            
            
            
            
            
            pst.setInt(1, Integer.parseInt(jTextField12.getText()));
            
            pst.setString(2, customer);
            
            pst.setString(3, String.valueOf(cost));
            
            pst.setString(4,  jTextField9.getText());
            pst.setString(5, jTextField8.getText());
            int Disc=Integer.parseInt(jTextField8.getText())-Integer.parseInt(jTextField9.getText());
            if(Integer.parseInt(jTextField8.getText())>Integer.parseInt(jTextField9.getText())){
            pst.setString(6, String.valueOf(Disc));
            }else{
                        pst.setString(6, "0");

            }

            pst.executeUpdate();
            
           
                
            
            
            
            
            
            
         int rcount=jTable1.getRowCount();
         for(int i=0;i<rcount;i++){
             
             
               Statement ss = connection.createStatement();
                 ResultSet rsss = ss.executeQuery("SELECT P_Cost,P_Brand_Name,Supplier_ID,P_Category,P_Name, P_Quantity FROM Stock WHERE P_Id ='"+(jTable1.getValueAt(i, 0))+"'");
         psts.setString(1, invoice);
         psts.setString(2, customer);
         psts.setString(3, String.valueOf(jTable1.getValueAt(i, 0)) );
         psts.setInt(4, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
          psts.setString(6, String.valueOf(jTable1.getValueAt(i, 3)) );
          
           
                      
          
           String Sql="";
   
           int newqty=0;
          
          while(rsss.next()){
               psts.setString(5,rsss.getString(1) );
       psts.setString(7,rsss.getString(2) );
         psts.setString(8,rsss.getString(3) );
            psts.setString(9,rsss.getString(4) );
            psts.setString(10,rsss.getString(5) );
                            newqty=(Integer.parseInt(rsss.getString(6))-(Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
                    
           }
          
           
          Sql="UPDATE Stock SET P_Quantity='"+newqty+"' WHERE P_Id ='"+Integer.valueOf((jTable1.getValueAt(i, 0).toString()))+"'";
            PreparedStatement ps1=connection.prepareStatement(Sql);
                      ps1.executeUpdate();
          psts.executeUpdate();
          
          
         
         
         }
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Sold");
             connection.close();
        
             
                 }catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}
 
            
            
//            Adding customer if not in our Record if it Exists then add purchasing amon
            
if(jTextField3.getText().equals("")){}else{System.out.println("inelse");
try{
String customer_name=jTextField3.getText();
       
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stte=connection.createStatement();
               ResultSet rs09=stte.executeQuery("SELECT PH_Customers,T_Bought FROM Customers");
               int x1=0;
              
               int pprice=0;
               while(rs09.next()){
               if(customer_name.equals(rs09.getString(1))){
                   if((rs09.getString(2)).equals("")){
               pprice=(0);
                   }else{pprice=(Integer.parseInt(rs09.getString(2)));}
               pprice+=Integer.parseInt(jTextField9.getText());
               x1=1;
               }
               
               }
               if(x1==0){
                   System.out.println("addinga new");
               PreparedStatement pss=connection.prepareStatement("INSERT INTO Customers (PH_Customers, T_Bought) VALUES (?,?) ");
              pss.setString(1, jTextField3.getText());
              pss.setString(2, jTextField9.getText());
               pss.executeUpdate();
               }else{
               PreparedStatement pss=connection.prepareStatement("UPDATE Customers SET T_Bought="+pprice+" WHERE PH_Customers='"+customer_name+"'");
               pss.executeUpdate();
               
               }
               
               
              }catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}
         Application.showForm(new Sales());





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
String invoice="";
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


        
      
            
            if(jTextField12.getText().equals("")){
                
                  try {

      
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pt=connection.prepareStatement("INSERT INTO AutoNumbers (hi) VALUES ( ? ) ");
            PreparedStatement pst=connection.prepareStatement("INSERT INTO Sales ( Invoice,Customer_name, cost, sales, Actual_bill, Discount) VALUES (?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO SoldProducts (InvoiceNo, Customer, P_Id, Quantiy, Cost, SoldPrice,  Brand, Supplier,Category,P_Name)VALUES(?,?,?,?,?,?,?,?,?,?)");
          
            
                
            pt.setString(1, "bye");
                Statement s = connection.createStatement();
            pt.executeUpdate();
            ResultSet rss = s.executeQuery("SELECT OrderNumber FROM AutoNumbers ORDER BY OrderNumber DESC LIMIT 1");
          
            
            
            
            while(rss.next()){
            invoice=rss.getString(1);
            }
            String customer=jTextField3.getText();
            
            
            
            
            
            

 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"salesinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Sales.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new Sales.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString()));
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
String voper="";
if(VoucherValid==true){for(int i=0;i<jTable4.getRowCount();i++){
    if((jTable4.getValueAt(i, 0).toString()).equals(jTextField6.getText())){
    voper=jTable4.getValueAt(i, 2).toString();
    break;
    }
}}
// finding customer 

String cus="";
if(jTextField3.getText().equals("")){
cus="Regular";
}else{

cus=jTextField3.getText();}
Map<String, Object> parameters = new HashMap<>();
            parameters.put("invoiceno",invoice );
            parameters.put("totalprice ", jTextField8.getText());
            parameters.put("discountper", jTextField7.getText());
            parameters.put("voucher", voper );
            parameters.put("aditionalcharges", jTextField14.getText());
            parameters.put("netprice", jTextField9.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
            


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
        

            
            
            
            
            
            
            
            pst.setString(1, invoice);
            
             pst.setString(2, customer);
            
            pst.setString(3, String.valueOf(cost));
            
            pst.setString(4, jTextField9.getText());
                        pst.setString(5, jTextField8.getText());
                                    int Disc=Integer.parseInt(jTextField8.getText())-Integer.parseInt(jTextField9.getText());

                        if(Integer.parseInt(jTextField8.getText())>Integer.parseInt(jTextField9.getText())){
            pst.setString(6, String.valueOf(Disc));
            }else{
                        pst.setString(6, "0");

            }

            pst.executeUpdate();
            
           
                
            
            
            
            
            
            
         int rcount=jTable1.getRowCount();
         for(int i=0;i<rcount;i++){
             
             
               Statement ss = connection.createStatement();
                 ResultSet rsss = ss.executeQuery("SELECT P_Cost,P_Brand_Name,Supplier_ID,P_Category,P_Name, P_Quantity FROM Stock WHERE P_Id ='"+(jTable1.getValueAt(i, 0))+"'");
         psts.setInt(1, Integer.parseInt(invoice));
         psts.setString(2, customer);
         psts.setString(3,  String.valueOf(jTable1.getValueAt(i, 0)));
         psts.setInt(4, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
          psts.setString(6, String.valueOf(jTable1.getValueAt(i, 3)));
         
          String Sql="";
   
           int newqty=0;
           while(rsss.next()){
               psts.setString(5,rsss.getString(1) );
       psts.setString(7,rsss.getString(2) );
         psts.setString(8,rsss.getString(   3) );
            psts.setString(9,rsss.getString(4) );
           psts.setString(10,rsss.getString(5) );
           
            newqty=(Integer.parseInt(rsss.getString(6))-(Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
           
           }
           
           
           
          Sql="UPDATE Stock SET P_Quantity='"+newqty+"' WHERE P_Id ='"+Integer.valueOf((jTable1.getValueAt(i, 0).toString()))+"'";
            PreparedStatement ps1=connection.prepareStatement(Sql);
                      ps1.executeUpdate();
          psts.executeUpdate();
          
          
          
                     
          
          
          
          
          
          
         }
         
         
        
         
         
         
         
         
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Sold");
                   
             connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
            }else{
                
                 try {
                     invoice=jTextField12.getText();
                     
                     
String customer=jTextField3.getText();
        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pst=connection.prepareStatement("INSERT INTO Sales ( Invoice,Customer_name, cost, sales, Actual_bill,Discount) VALUES (?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO SoldProducts (InvoiceNo, Customer, P_Id, Quantiy, Cost,  SoldPrice,  Brand, Supplier,Category,P_Name)VALUES(?,?,?,?,?,?,?,?,?,?)");
          
          
                
           
//            Invoice Printing


 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath =reports.getUrl()+"salesinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Sales.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new Sales.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString()));
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
String voper="";
for(int i=0;i<jTable4.getRowCount();i++){
    if((jTable4.getValueAt(i, 0).toString()).equals(jTextField6.getText())){
    voper=jTable4.getValueAt(i, 2).toString();
    break;
    }
}
// finding customer 

String cus="";
if(jTextField3.getText().equals("")){
cus="Regular";
}else{

cus=jTextField3.getText();}
Map<String, Object> parameters = new HashMap<>();
            parameters.put("invoiceno",invoice );
            parameters.put("totalprice ", jTextField8.getText());
            parameters.put("discountper", jTextField7.getText());
            parameters.put("voucher", voper );
            parameters.put("aditionalcharges", jTextField14.getText());
            parameters.put("netprice", jTextField9.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
            


System.out.println("sourceeeeeeee");
            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
System.out.println("dataaaaaaaaaaaaa");
            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);
 System.out.println("idhrrrrrrrr");
           

            
             String printerName = "hp123"; // Change to your printer name
            
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
        
        
            
            
            
            
            
            
            
          
//            in order to supplier order no waly me sirf ik hi bar store honi
            
            
            
            
            
            pst.setInt(1, Integer.parseInt(jTextField12.getText()));
            
            pst.setString(2, customer);
            
            pst.setString(3, String.valueOf(cost));
            
            pst.setString(4,  jTextField9.getText());
            pst.setString(5, jTextField8.getText());
            int Disc=Integer.parseInt(jTextField8.getText())-Integer.parseInt(jTextField9.getText());
            if(Integer.parseInt(jTextField8.getText())>Integer.parseInt(jTextField9.getText())){
            pst.setString(6, String.valueOf(Disc));
            }else{
                        pst.setString(6, "0");

            }

            pst.executeUpdate();
            
           
                
            
            
            
            
            
            
         int rcount=jTable1.getRowCount();
         for(int i=0;i<rcount;i++){
             
             
               Statement ss = connection.createStatement();
                 ResultSet rsss = ss.executeQuery("SELECT P_Cost,P_Brand_Name,Supplier_ID,P_Category,P_Name, P_Quantity FROM Stock WHERE P_Id ='"+(jTable1.getValueAt(i, 0))+"'");
         psts.setString(1, invoice);
         psts.setString(2, customer);
         psts.setString(3, String.valueOf(jTable1.getValueAt(i, 0)) );
         psts.setInt(4, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
          psts.setString(6, String.valueOf(jTable1.getValueAt(i, 3)) );
          
           
                      
          
           String Sql="";
   
           int newqty=0;
          
          while(rsss.next()){
               psts.setString(5,rsss.getString(1) );
       psts.setString(7,rsss.getString(2) );
         psts.setString(8,rsss.getString(3) );
            psts.setString(9,rsss.getString(4) );
            psts.setString(10,rsss.getString(5) );
                            newqty=(Integer.parseInt(rsss.getString(6))-(Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
                    
           }
          
           
          Sql="UPDATE Stock SET P_Quantity='"+newqty+"' WHERE P_Id ='"+Integer.valueOf((jTable1.getValueAt(i, 0).toString()))+"'";
            PreparedStatement ps1=connection.prepareStatement(Sql);
                      ps1.executeUpdate();
          psts.executeUpdate();
          
          
         
         
         }
                         Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Sold");
             connection.close();
        
             
                 }catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}
 
            
            
//            Adding customer if not in our Record if it Exists then add purchasing amon
            
if(jTextField3.getText().equals("")){}else{System.out.println("inelse");
try{
String customer_name=jTextField3.getText();
     
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stte=connection.createStatement();
               ResultSet rs09=stte.executeQuery("SELECT PH_Customers,T_Bought FROM Customers");
               int x1=0;
              
               int pprice=0;
               while(rs09.next()){
               if(customer_name.equals(rs09.getString(1))){
                   if((rs09.getString(2)).equals("")){
               pprice=(0);
                   }else{pprice=(Integer.parseInt(rs09.getString(2)));}
               pprice+=Integer.parseInt(jTextField9.getText());
               x1=1;
               }
               
               }
               if(x1==0){
                   System.out.println("addinga new");
               PreparedStatement pss=connection.prepareStatement("INSERT INTO Customers (PH_Customers, T_Bought) VALUES (?,?) ");
              pss.setString(1, jTextField3.getText());
              pss.setString(2, jTextField9.getText());
               pss.executeUpdate();
               }else{
               PreparedStatement pss=connection.prepareStatement("UPDATE Customers SET T_Bought="+pprice+" WHERE PH_Customers='"+customer_name+"'");
               pss.executeUpdate();
               
               }
               
               
              }catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}
         Application.showForm(new Sales());


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Application.showForm(new Sales());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased

        
        
        
        String ss = jTextField4.getText();
      try {

    
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
    Statement st= connection.createStatement();
    String sql1="SELECT P_Id, P_Name, P_Selling_Price FROM Stock WHERE P_Id LIKE '%"+ss+"%'";           
    ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable3.getModel();
             tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyReleased
int total_price=0;
    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
  String cus =jTextField3.getText();
        String s1s=jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString();
        if(cus.equals("")){
                  Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please Enter Customer Number Before Selecting a Voucher");

}else{

        if(s1s.equals("")){
          voucher=0;
          String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);
        }else{
            System.out.println("indside first");
            
            
          
    
         try {
             
            int a=0;
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement sts=connection.createStatement();
           Date fromm=null;
           Date tto=null;
            String sql2="SELECT CustPurchasing, fromm, tto  FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' ";
            ResultSet rs2=sts.executeQuery(sql2);
            while(rs2.next()){
            
            if(rs2.getString(1).equals("yes")){
           
                fromm=rs2.getDate(2);
                tto=rs2.getDate(3);
            a=1;
            }
            }
            
            if(a==0){
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE ";
            ResultSet rs1=sts.executeQuery(sqll);
        
       while(rs1.next()){
        voucher=(((rs1.getInt(1))*total_price)/100);
       }
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            }else{
                
              
               
                
                
                 String sql3="SELECT sales FROM Sales WHERE Customer_name = '"+cus+"' AND Datetime>='"+fromm+"' AND Datetime<='"+tto+"'";
            ResultSet rs3=sts.executeQuery(sql3);
            int tam=0;
                System.out.println("cuuuuus"+cus);
                while(rs3.next()){
                    System.out.println("testing tam");
               tam+=Integer.parseInt(rs3.getString(1));
               System.out.println(tam);
                }
                System.out.println("strenghth checked");
                
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"'AND minAmount <='"+tam+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE  ";
            ResultSet rs16=sts.executeQuery(sqll);
        System.out.println("betttttt");
       
        System.out.println(tam);
        System.out.println(s1s);

           while(rs16.next()){
               System.out.println("innnnn");
               System.out.println(rs16.getString(1));
               
        voucher=(((rs16.getInt(1))*total_price)/100);
       }
           
       System.out.println("Voucherrrr"+voucher);
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
System.out.println(calc); 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            
            
        
            }
 connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
String ss=jTextField5.getText();
      int a=  Integer.parseInt(jTextField5.getText());
 try {

    
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement sts=connection.createStatement();
            String sql="SELECT  Productname, Productno, Quantity, price FROM HoldsalesbyProduct WHERE Invoice='"+a+"'";
            ResultSet rs=sts.executeQuery(sql);
            String sql1="SELECT  Coustomer, total_price, Discount, VoucherCode, AdditionalCharges, cost FROM HoldsalesbyInvoices WHERE Invoce ='"+ss+"'";
            ResultSet rss=sts.executeQuery(sql1);
            
//            fIRST OFF ALL WE ARE GOING TO SET THE JTABLE
        DefaultTableModel dft = (DefaultTableModel)jTable1.getModel();
        dft.setRowCount(0);
        
            while(rs.next()){
                
             dft.addRow(new Object[]{Integer.valueOf(rs.getString(2)), rs.getString(1), rs.getString(3), Integer.valueOf(rs.getString(4))});
             
            }
            while(rss.next()){
            cost=Integer.parseInt(rss.getString(6));
            jTextField3.setText(rss.getString(1));
            total_price=Integer.parseInt(rss.getString(2));
         
        jTextField8.setText(rss.getString(2));
        jTextField9.setText(rss.getString(2));
            }
            
       
        
       jTextField12.setText(ss);
       
        
     
    
        
             
     String s1=jTextField5.getText();
int s2=Integer.parseInt(jTextField5.getText());


             
            
            String sqll= "DELETE FROM HoldsalesbyInvoices WHERE Invoce='"+s1+"'";
            PreparedStatement ssts=connection.prepareStatement(sqll);
            ssts.executeUpdate();
           String sqll1= "DELETE FROM HoldsalesbyProduct WHERE Invoice="+s2+"";
            PreparedStatement Psts=connection.prepareStatement(sqll1);
            Psts.executeUpdate();
           

            

            Statement st= connection.createStatement();
            String ssql1="SELECT Invoce, Coustomer, net_price FROM HoldsalesbyInvoices ";
            ResultSet rs1 =st.executeQuery(ssql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable2.getModel();
            tbm.setRowCount(0);

              
            while(rs1.next()){
              
                tbm.addRow(new Object[]{rs1.getString(1),rs1.getString(2),rs1.getInt(3)});
                
            }
     
     
     
     
     
     jTextField5.setText("");
             
 connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

// TODO add your handling code here:

// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        Application.showForm(new Sales());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dft = (DefaultTableModel)jTable1.getModel();
        
        
        
        
         try {
           
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement sts=connection.createStatement();
           int pid= Integer.parseInt(dft.getValueAt(jTable1.getSelectedRow(), 0).toString());
       int qt=Integer.parseInt(dft.getValueAt(jTable1.getSelectedRow(), 2).toString());
            String sqll="SELECT P_Cost FROM Stock Where P_Id = '"+pid+"'";
            ResultSet rss1=sts.executeQuery(sqll);
        
        
        
        
        while(rss1.next()){
        cost-=(rss1.getInt(1)*qt);
        }
        
        
      
        dft.removeRow(jTable1.getSelectedRow());
        //        Calculations for Subtracting the amount of deleted object

         
        
        
        connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        total_price=0;
        for(int i=0;i<jTable1.getRowCount();i++){
            int q=Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            int p=Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            total_price+=(p*q);
        }

        String a=(String.valueOf(total_price));
        System.out.println(total_price);
        jTextField8.setText(a);
        String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);
System.out.println(cost);



jTextField4.setText(null);
jSpinner1.setValue(1);
jTextField11.setText(null);
jTextField10.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
int cost=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        String s1=jTextField4.getText();
         int qq1=0;
         int q1=0;
        try {
            
//            going to calculate the quantity that exist in the table of this product

int tbQty=0; //Table quantity
             for(int i=0;i<jTable1.getRowCount();i++){
                 if(s1.equals(jTable1.getValueAt(i, 0))){
                 tbQty=Integer.parseInt(jTable1.getValueAt(i, 2).toString());
                 }
             }
            
            
            
            
      qq1 =Integer.parseInt(jSpinner1.getValue().toString())+tbQty;
            
        
        
        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
        Statement st= connection.createStatement();
            String sql1="SELECT P_Quantity FROM Stock WHERE P_Id='"+s1+"' ";
            ResultSet rs3=st.executeQuery(sql1);
        
            
            
            while(rs3.next()){
            q1=Integer.parseInt(rs3.getString(1));
            }
            
            
            
            
            
            if(qq1>q1){
            JOptionPane.showMessageDialog(this, "Your Stock is LOW!!! \n You Only Have '"+(q1-tbQty)+"' Quantity Left For This Product");
            }else{
        try {
        System.out.println("1");
        
            
            total_price=0;
           
            Statement sts=connection.createStatement();
            String aa=(jTextField4.getText());
            String sqll="SELECT P_Id, P_Name, P_Selling_Price,P_Cost FROM Stock Where P_Id = '"+aa+"'";
            ResultSet rs=sts.executeQuery(sqll);

            DefaultTableModel dft = (DefaultTableModel)jTable1.getModel();
            boolean exists=false;

            //            Data is inserting in a table

            {  if(dft.getRowCount()==0){
System.out.println("2");
                while(rs.next()){
                    dft.addRow(new Object[]{rs.getString(1), rs.getString(2),  jSpinner1.getValue(), rs.getString(3)});
                    int qu=Integer.parseInt(jSpinner1.getValue().toString());
                cost+=((Integer.parseInt(rs.getString(4)))*qu);
                jTextField4.setText("");
            jSpinner1.setValue(0);
                }

            }else{
                System.out.println(exists);
                for(int i=0;i<jTable1.getRowCount();i++){
System.out.println("3");
                    String qq= (jTable1.getValueAt(i, 0).toString());
                    System.out.println(qq);
                    System.out.println(aa);

                    if(qq.equals(aa)){
                        exists=true;
                    }
                    System.out.println(exists);
                }

                if(exists==true){
                      System.out.println("4");
                    for(int i=0;i<jTable1.getRowCount();i++){
                        String qa= jTable1.getValueAt(i, 0).toString();
                        if(qa.equals(aa)){
                           
                            int s18=Integer.parseInt(jSpinner1.getValue().toString());
                               
                            while(rs.next()){
                            cost+=((Integer.parseInt(rs.getString(4)))*s18);
                            }
                            
                            int a= (Integer.parseInt((jTable1.getValueAt(i, 2).toString())))+s18;
                            jTable1.setValueAt(a, i, 2);
                            
                            
                        }
                    }

                }else{
System.out.println("5");                    while(rs.next()){

                        dft.addRow(new Object[]{rs.getString(1), rs.getString(2),  jSpinner1.getValue(), rs.getString(3)});
                      int quu=Integer.parseInt(jSpinner1.getValue().toString());
                
                      cost+=((Integer.parseInt(rs.getString(4)))*quu);
                   
                 }
                }
           
            
            System.out.println("6");
            
             
            
            
            jTextField4.setText("");
            jSpinner1.setValue(1);
            
            
                        System.out.println("7");}}
            System.out.println("7");
        connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

        //         Calculating The calculated fields

        for(int i=0;i<jTable1.getRowCount();i++){
            int q=Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            int p=Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            total_price+=(p*q);
        }

        String a=(String.valueOf(total_price));

        jTextField8.setText(a);
        String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);
System.out.println(cost);

 }
  connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField11.setText(null);
jTextField10.setText(null);

        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased

        if(!numeric.isNumeric(jTextField11.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        
        
        
        
        int aaa=Integer.parseInt(jTextField9.getText());
        int bbb=Integer.parseInt(jTextField11.getText());
        String change = String.valueOf(aaa-bbb);
        jTextField10.setText(change);

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
jSpinner1.setValue(jTable1.getValueAt(jTable1.getSelectedRow(), 2));


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
Boolean VoucherValid=false;
    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
            String s1s=jTextField6.getText();
        
  String cus =jTextField3.getText();
      
        if(cus.equals("")){
                  Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please Enter Customer Number Before Selecting a Voucher");

}else{

        if(s1s.equals("")){
          voucher=0;
          String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);
        }else{
            System.out.println("indside first");
            
            
          
    
         try {
             
            int a=0;
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement sts=connection.createStatement();
           Date fromm=null;
           Date tto=null;
            String sql2="SELECT CustPurchasing, fromm, tto  FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' ";
            ResultSet rs2=sts.executeQuery(sql2);
            while(rs2.next()){
            
            if(rs2.getString(1).equals("yes")){
           
                fromm=rs2.getDate(2);
                tto=rs2.getDate(3);
            a=1;
            }
            }
            
            if(a==0){
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE ";
            ResultSet rs1=sts.executeQuery(sqll);
        
       while(rs1.next()){
        voucher=(((rs1.getInt(1))*total_price)/100);
       }
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            }else{
                
              
               
                
                
                 String sql3="SELECT sales FROM Sales WHERE Customer_name = '"+cus+"' AND Datetime>='"+fromm+"' AND Datetime<='"+tto+"'";
            ResultSet rs3=sts.executeQuery(sql3);
            int tam=0;
                System.out.println("cuuuuus"+cus);
                while(rs3.next()){
                    System.out.println("testing tam");
               tam+=Integer.parseInt(rs3.getString(1));
               System.out.println(tam);
                }
                System.out.println("strenghth checked");
                
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"'AND minAmount <='"+tam+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE  ";
            ResultSet rs16=sts.executeQuery(sqll);
        System.out.println("betttttt");
       
        System.out.println(tam);
        System.out.println(s1s);

           while(rs16.next()){
               System.out.println("innnnn");
               System.out.println(rs16.getString(1));
               
        voucher=(((rs16.getInt(1))*total_price)/100);
       }
           
       System.out.println("Voucherrrr"+voucher);
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
System.out.println(calc); 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            
            
        
            }
 connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased

        if(!numeric.isNumeric(jTextField14.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        
        if(jTextField14.getText().equals("")){
          addtional_charges=0;
         String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);

        }else{
         addtional_charges=(Integer.parseInt(jTextField14.getText()));
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);

        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
if(!numeric.isNumeric(jTextField7.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}  
        
       
        if(jTextField7.getText().equals("")){
          discount=0;
         String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);

        }else{
         discount=(Integer.parseInt(jTextField7.getText()));
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);

        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

String s1=jTextField5.getText();
int s2=Integer.parseInt(jTextField5.getText());

try {
             
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            String sqll= "DELETE FROM HoldsalesbyInvoices WHERE Invoce='"+s1+"'";
            PreparedStatement sts=connection.prepareStatement(sqll);
            sts.executeUpdate();
           String sqll1= "DELETE FROM HoldsalesbyProduct WHERE Invoice="+s2+"";
            PreparedStatement Psts=connection.prepareStatement(sqll1);
            Psts.executeUpdate();
           

            

            Statement st= connection.createStatement();
            String sql1="SELECT Invoce, Coustomer, net_price FROM HoldsalesbyInvoices ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable2.getModel();
            tbm.setRowCount(0);

              
            while(rs.next()){
              
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3)});
                
            }
            
            jTextField5.setText("");
           connection.close();
          
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jSpinner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyReleased
            
        


        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTable3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyReleased
   String s1s=jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString();
        jTextField4.setText(s1s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyReleased

    private void jTable4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable4KeyReleased
          String cus =jTextField3.getText();
        String s1s=jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString();
        if(cus.equals("")){
                  Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please Enter Customer Number Before Selecting a Voucher");

}else{

        if(s1s.equals("")){
          voucher=0;
          String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);
        }else{
            System.out.println("indside first");
            
            
          
    
         try {
             
            int a=0;
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement sts=connection.createStatement();
           Date fromm=null;
           Date tto=null;
            String sql2="SELECT CustPurchasing, fromm, tto  FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' ";
            ResultSet rs2=sts.executeQuery(sql2);
            while(rs2.next()){
            
            if(rs2.getString(1).equals("yes")){
           
                fromm=rs2.getDate(2);
                tto=rs2.getDate(3);
            a=1;
            }
            }
            
            if(a==0){
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE ";
            ResultSet rs1=sts.executeQuery(sqll);
        
       while(rs1.next()){
        voucher=(((rs1.getInt(1))*total_price)/100);
       }
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            }else{
                
              
               
                
                
                 String sql3="SELECT sales FROM Sales WHERE Customer_name = '"+cus+"' AND Datetime>='"+fromm+"' AND Datetime<='"+tto+"'";
            ResultSet rs3=sts.executeQuery(sql3);
            int tam=0;
                System.out.println("cuuuuus"+cus);
                while(rs3.next()){
                    System.out.println("testing tam");
               tam+=Integer.parseInt(rs3.getString(1));
               System.out.println(tam);
                }
                System.out.println("strenghth checked");
                
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"'AND minAmount <='"+tam+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE  ";
            ResultSet rs16=sts.executeQuery(sqll);
        System.out.println("betttttt");
       
        System.out.println(tam);
        System.out.println(s1s);

           while(rs16.next()){
               System.out.println("innnnn");
               System.out.println(rs16.getString(1));
               
        voucher=(((rs16.getInt(1))*total_price)/100);
       }
           
       System.out.println("Voucherrrr"+voucher);
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
System.out.println(calc); 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            
            
        
            }
 connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

        }


// TODO add your handling code here:
    }//GEN-LAST:event_jTable4KeyReleased

    private void jTextField6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField6InputMethodTextChanged
  String s1s=jTextField6.getText();
        
  String cus =jTextField3.getText();
    
        if(cus.equals("")){
                  Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please Enter Customer Number Before Selecting a Voucher");

}else{

        if(s1s.equals("")){
          voucher=0;
          String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc);
        }else{
            System.out.println("indside first");
            
            
          
    
         try {
             
            int a=0;
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement sts=connection.createStatement();
           Date fromm=null;
           Date tto=null;
            String sql2="SELECT CustPurchasing, fromm, tto  FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' ";
            ResultSet rs2=sts.executeQuery(sql2);
            while(rs2.next()){
            
            if(rs2.getString(1).equals("yes")){
           
                fromm=rs2.getDate(2);
                tto=rs2.getDate(3);
            a=1;
            }
            }
            
            if(a==0){
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE ";
            ResultSet rs1=sts.executeQuery(sqll);
        
       while(rs1.next()){
        voucher=(((rs1.getInt(1))*total_price)/100);
       }
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            }else{
                
              
               
                
                
                 String sql3="SELECT sales FROM Sales WHERE Customer_name = '"+cus+"' AND Datetime>='"+fromm+"' AND Datetime<='"+tto+"'";
            ResultSet rs3=sts.executeQuery(sql3);
            int tam=0;
                System.out.println("cuuuuus"+cus);
                while(rs3.next()){
                    System.out.println("testing tam");
               tam+=Integer.parseInt(rs3.getString(1));
               System.out.println(tam);
                }
                System.out.println("strenghth checked");
                
            String sqll="SELECT Percentage FROM VouchersAndDiscount WHERE v_code = '"+s1s+"'AND minAmount <='"+tam+"' AND Starting_Date<=CURDATE AND Ending_Date>=CURDATE  ";
            ResultSet rs16=sts.executeQuery(sqll);
        System.out.println("betttttt");
       
        System.out.println(tam);
        System.out.println(s1s);

           while(rs16.next()){
               System.out.println("innnnn");
               System.out.println(rs16.getString(1));
               
        voucher=(((rs16.getInt(1))*total_price)/100);
       }
           
       System.out.println("Voucherrrr"+voucher);
        
 String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
System.out.println(calc); 
        jTextField9.setText(calc);
        jTextField6.setText(s1s);
         System.out.println(calc);
            
            
        
            }
 connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6InputMethodTextChanged

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased

        String ss = jTextField13.getText();
      try {

    
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
    Statement st= connection.createStatement();
    String sql1="SELECT P_Id, P_Name, P_Selling_Price FROM Stock WHERE P_Name LIKE '%"+ss+"%'";           
    ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable3.getModel();
             tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:



        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased

        jTable2.getValueAt(jTable2.getSelectedRow(),0);
jTextField5.setText( jTable2.getValueAt(jTable2.getSelectedRow(),0).toString());




        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        jTable2.getValueAt(jTable2.getSelectedRow(),0);
jTextField5.setText( jTable2.getValueAt(jTable2.getSelectedRow(),0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed


            
            if(jTextField12.getText().equals("")){
                
                  try {

        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pt=connection.prepareStatement("INSERT INTO AutoNumbers (hi) VALUES ( ? ) ");
            PreparedStatement pst=connection.prepareStatement("INSERT INTO Sales ( Invoice,Customer_name, cost, sales, Actual_bill, Discount) VALUES (?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO SoldProducts (InvoiceNo, Customer, P_Id, Quantiy, Cost, SoldPrice,  Brand, Supplier,Category,P_Name)VALUES(?,?,?,?,?,?,?,?,?,?)");
          
            
                
            pt.setString(1, "bye");
                Statement s = connection.createStatement();
            pt.executeUpdate();
            ResultSet rss = s.executeQuery("SELECT OrderNumber FROM AutoNumbers ORDER BY OrderNumber DESC LIMIT 1");
          
            
            
            
            while(rss.next()){
            invoice=rss.getString(1);
            }
            String customer=jTextField3.getText();
            
            
            
            
            
            

 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"salesinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Sales.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new Sales.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString()));
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
String voper="";
if(VoucherValid==true){for(int i=0;i<jTable4.getRowCount();i++){
    if((jTable4.getValueAt(i, 0).toString()).equals(jTextField6.getText())){
    voper=jTable4.getValueAt(i, 2).toString();
    break;
    }
}}
// finding customer 

String cus="";
if(jTextField3.getText().equals("")){
cus="Regular";
}else{

cus=jTextField3.getText();}
Map<String, Object> parameters = new HashMap<>();
            parameters.put("invoiceno",invoice );
            parameters.put("totalprice ", jTextField8.getText());
            parameters.put("discountper", jTextField7.getText());
            parameters.put("voucher", voper );
            parameters.put("aditionalcharges", jTextField14.getText());
            parameters.put("netprice", jTextField9.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);

           

 JasperViewer.viewReport(jasperPrint,false);
           
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
        

            
            
            
            
            
            
            
            pst.setString(1, invoice);
            
             pst.setString(2, customer);
            
            pst.setString(3, String.valueOf(cost));
            
            pst.setString(4, jTextField9.getText());
                        pst.setString(5, jTextField8.getText());
                                    int Disc=Integer.parseInt(jTextField8.getText())-Integer.parseInt(jTextField9.getText());

                        if(Integer.parseInt(jTextField8.getText())>Integer.parseInt(jTextField9.getText())){
            pst.setString(6, String.valueOf(Disc));
            }else{
                        pst.setString(6, "0");

            }

            pst.executeUpdate();
            
           
                
            
            
            
            
            
            
         int rcount=jTable1.getRowCount();
         for(int i=0;i<rcount;i++){
             
             
               Statement ss = connection.createStatement();
                 ResultSet rsss = ss.executeQuery("SELECT P_Cost,P_Brand_Name,Supplier_ID,P_Category,P_Name, P_Quantity FROM Stock WHERE P_Id ='"+(jTable1.getValueAt(i, 0))+"'");
         psts.setInt(1, Integer.parseInt(invoice));
         psts.setString(2, customer);
         psts.setString(3,  String.valueOf(jTable1.getValueAt(i, 0)));
         psts.setInt(4, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
          psts.setString(6, String.valueOf(jTable1.getValueAt(i, 3)));
         
          String Sql="";
   
           int newqty=0;
           while(rsss.next()){
               psts.setString(5,rsss.getString(1) );
       psts.setString(7,rsss.getString(2) );
         psts.setString(8,rsss.getString(   3) );
            psts.setString(9,rsss.getString(4) );
           psts.setString(10,rsss.getString(5) );
           
            newqty=(Integer.parseInt(rsss.getString(6))-(Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
           
           }
           
           
           
          Sql="UPDATE Stock SET P_Quantity='"+newqty+"' WHERE P_Id ='"+Integer.valueOf((jTable1.getValueAt(i, 0).toString()))+"'";
            PreparedStatement ps1=connection.prepareStatement(Sql);
                      ps1.executeUpdate();
          psts.executeUpdate();
          
          
          
                     
          
          
          
          
          
          
         }
         
         
        
         
         
         
         
         
         
                      Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Sold");
             connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
            }else{
                
                 try {
                     invoice=jTextField12.getText();
                     
                     
String customer=jTextField3.getText();
        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            PreparedStatement pst=connection.prepareStatement("INSERT INTO Sales ( Invoice,Customer_name, cost, sales, Actual_bill,Discount) VALUES (?,?,?,?,?,?)");
            PreparedStatement psts=connection.prepareStatement("INSERT INTO SoldProducts (InvoiceNo, Customer, P_Id, Quantiy, Cost,  SoldPrice,  Brand, Supplier,Category,P_Name)VALUES(?,?,?,?,?,?,?,?,?,?)");
          
          
                
           
//            Invoice Printing


 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath = "src/raven/application/printableReports/salesinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<Sales.ReportData> reportDataList = new ArrayList<>();
            
//                    public ReportData(String productid, String productname, String quantity, String price) {

            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new Sales.ReportData( jTable1.getValueAt(i, 0).toString(), jTable1.getValueAt(i, 1).toString(), jTable1.getValueAt(i, 2).toString(), jTable1.getValueAt(i, 3).toString()));
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
String voper="";
for(int i=0;i<jTable4.getRowCount();i++){
    if((jTable4.getValueAt(i, 0).toString()).equals(jTextField6.getText())){
    voper=jTable4.getValueAt(i, 2).toString();
    break;
    }
}
// finding customer 

String cus="";
if(jTextField3.getText().equals("")){
cus="Regular";
}else{

cus=jTextField3.getText();}
Map<String, Object> parameters = new HashMap<>();
            parameters.put("invoiceno",invoice );
            parameters.put("totalprice ", jTextField8.getText());
            parameters.put("discountper", jTextField7.getText());
            parameters.put("voucher", voper );
            parameters.put("aditionalcharges", jTextField14.getText());
            parameters.put("netprice", jTextField9.getText());
            parameters.put("curdatetime", currentDateTimeString);
            parameters.put("customer", cus);
//             Create a JRBeanCollectionDataSource
            


System.out.println("sourceeeeeeee");
            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
System.out.println("dataaaaaaaaaaaaa");
            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);
 System.out.println("idhrrrrrrrr");
           

            
             String printerName = "hp123"; // Change to your printer name
            
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
        
        
            
            
            
            
            
            
            
          
//            in order to supplier order no waly me sirf ik hi bar store honi
            
            
            
            
            
            pst.setInt(1, Integer.parseInt(jTextField12.getText()));
            
            pst.setString(2, customer);
            
            pst.setString(3, String.valueOf(cost));
            
            pst.setString(4,  jTextField9.getText());
            pst.setString(5, jTextField8.getText());
            int Disc=Integer.parseInt(jTextField8.getText())-Integer.parseInt(jTextField9.getText());
            if(Integer.parseInt(jTextField8.getText())>Integer.parseInt(jTextField9.getText())){
            pst.setString(6, String.valueOf(Disc));
            }else{
                        pst.setString(6, "0");

            }

            pst.executeUpdate();
            
           
                
            
            
            
            
            
            
         int rcount=jTable1.getRowCount();
         for(int i=0;i<rcount;i++){
             
             
               Statement ss = connection.createStatement();
                 ResultSet rsss = ss.executeQuery("SELECT P_Cost,P_Brand_Name,Supplier_ID,P_Category,P_Name, P_Quantity FROM Stock WHERE P_Id ='"+(jTable1.getValueAt(i, 0))+"'");
         psts.setString(1, invoice);
         psts.setString(2, customer);
         psts.setString(3, String.valueOf(jTable1.getValueAt(i, 0)) );
         psts.setInt(4, (Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
          psts.setString(6, String.valueOf(jTable1.getValueAt(i, 3)) );
          
           
                      
          
           String Sql="";
   
           int newqty=0;
          
          while(rsss.next()){
               psts.setString(5,rsss.getString(1) );
       psts.setString(7,rsss.getString(2) );
         psts.setString(8,rsss.getString(3) );
            psts.setString(9,rsss.getString(4) );
            psts.setString(10,rsss.getString(5) );
                            newqty=(Integer.parseInt(rsss.getString(6))-(Integer.parseInt(jTable1.getValueAt(i, 2).toString())));
                    
           }
          
           
          Sql="UPDATE Stock SET P_Quantity='"+newqty+"' WHERE P_Id ='"+Integer.valueOf((jTable1.getValueAt(i, 0).toString()))+"'";
            PreparedStatement ps1=connection.prepareStatement(Sql);
                      ps1.executeUpdate();
          psts.executeUpdate();
          
          
         
         
         }
                         Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Sold");
             connection.close();
        
             
                 }catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}
 
            
            
//            Adding customer if not in our Record if it Exists then add purchasing amon
            
if(jTextField3.getText().equals("")){}else{System.out.println("inelse");
try{
String customer_name=jTextField3.getText();
        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stte=connection.createStatement();
               ResultSet rs09=stte.executeQuery("SELECT PH_Customers,T_Bought FROM Customers");
               int x1=0;
              
               int pprice=0;
               while(rs09.next()){
               if(customer_name.equals(rs09.getString(1))){
                   if((rs09.getString(2)).equals("")){
               pprice=(0);
                   }else{pprice=(Integer.parseInt(rs09.getString(2)));}
               pprice+=Integer.parseInt(jTextField9.getText());
               x1=1;
               }
               
               }
               if(x1==0){
                   System.out.println("addinga new");
               PreparedStatement pss=connection.prepareStatement("INSERT INTO Customers (PH_Customers, T_Bought) VALUES (?,?) ");
              pss.setString(1, jTextField3.getText());
              pss.setString(2, jTextField9.getText());
               pss.executeUpdate();
               }else{
               PreparedStatement pss=connection.prepareStatement("UPDATE Customers SET T_Bought="+pprice+" WHERE PH_Customers='"+customer_name+"'");
               pss.executeUpdate();
               
               }
               
               
              }catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }}
         Application.showForm(new Sales());








        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

if(!numeric.isNumeric(jTextField3.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased

if(!numeric.isNumeric(jTextField5.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased


jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
jSpinner1.setValue(jTable1.getValueAt(jTable1.getSelectedRow(), 2));


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
int pid=Integer.parseInt(jTextField4.getText());
        for(int i=0;i<jTable1.getRowCount();i++){
            
         int valtable=Integer.parseInt(jTable1.getValueAt(i, 0).toString());   
//            New quantity finding
if(pid==valtable){          

int PreQty=Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            
               int newqty= Integer.parseInt(jSpinner1.getValue().toString());

            int finalqty=PreQty-newqty;
            
       
            
            
          int q1=0;
             try {
                Connection connection = DriverManager.getConnection(dbConnection.getDataBaseURL());
                 Statement st= connection.createStatement();
                   String sql1="SELECT P_Quantity FROM Stock WHERE P_Id='"+pid+"' ";
            ResultSet rs3=st.executeQuery(sql1);
        
            
           
            while(rs3.next()){
            q1=Integer.parseInt(rs3.getString(1));
            }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
             }
           
        
          
            
            
            
            
            
            if(newqty>q1){
            JOptionPane.showMessageDialog(this, "Your Stock is LOW!!! \n You Only Have '"+(q1)+"' Quantity Left For This Product");
            }else{
            
                   
        
        


        




jTable1.setValueAt(jSpinner1.getValue(), i, 2);


      System.out.println("final qty"+finalqty);
        System.out.println(cost);
         
       
                            Connection connection;
    try {
        connection = DriverManager.getConnection(dbConnection.getDataBaseURL());
         Statement sts=connection.createStatement();
                          String sqll="SELECT P_Cost FROM Stock Where P_Id = '"+pid+"'";
            ResultSet rs=sts.executeQuery(sqll);
      
                            while(rs.next()){
                            cost-=((Integer.parseInt(rs.getString(1)))*finalqty);
                            }
        
        System.out.println(cost);
    } catch (SQLException ex) {
        Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        }
         
        total_price=0;
        for(int j=0;j<jTable1.getRowCount();j++){
            int q=Integer.parseInt(jTable1.getValueAt(j, 2).toString());
            int p=Integer.parseInt(jTable1.getValueAt(j, 3).toString());
            total_price+=(p*q);
        }

        String a=(String.valueOf(total_price));
        System.out.println(total_price);
        jTextField8.setText(a);
        String calc=String.valueOf(((total_price-discount)+ addtional_charges)-voucher);
        jTextField9.setText(calc); 
        }
        
        
        
        
        jTextField4.setText(null);
jSpinner1.setValue(1);
jTextField11.setText(null);
jTextField10.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed
int discount=0;int addtional_charges=0;int voucher=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
