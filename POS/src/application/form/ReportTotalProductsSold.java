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
/**
 *
 * @author Raven
 */
public class ReportTotalProductsSold extends javax.swing.JPanel {

    
    
    

   public class ReportData {

        public ReportData(String productid, String productname, String quantity, String cost, String price, String totalprice, String timedate, String totalcost, String invoice, String supp, String category) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.cost = cost;
            this.price = price;
            this.totalprice = totalprice;
            this.timedate = timedate;
            this.totalcost = totalcost;
            this.invoice = invoice;
            this.supp = supp;
            this.category = category;
        }

       

private String productid;
private String productname;
private String quantity;
private String cost;
private String price;
private String totalprice;
private String timedate;
private String totalcost;
private String invoice;
private String supp;
private String category;

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

        public String getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(String totalprice) {
            this.totalprice = totalprice;
        }

        public String getTimedate() {
            return timedate;
        }

        public void setTimedate(String timedate) {
            this.timedate = timedate;
        }

        public String getTotalcost() {
            return totalcost;
        }

        public void setTotalcost(String totalcost) {
            this.totalcost = totalcost;
        }

        public String getInvoice() {
            return invoice;
        }

        public void setInvoice(String invoice) {
            this.invoice = invoice;
        }

        public String getSupp() {
            return supp;
        }

        public void setSupp(String supp) {
            this.supp = supp;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
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




        
        


    
    
    public ReportTotalProductsSold() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filter By :");

        jButton1.setText("Search");
        jButton1.setVisible(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Date & Time", "Product ID", "Product Name", "Quantity", "Cost / Item", "Total Cost", "Sell Price /Item", "Total Sell Price", "Supplier Id", "P-Category", "Customer No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo   FROM SoldProducts");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            int stcost=0;
            int count=0;
            int tSellingprice=0;
            while(rs15.next()){
                int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
                stcost+=tcost;
                count++;
                int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
                tSellingprice+=tprice;
                tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});
            }

            jTextField8.setText(String.valueOf(count));
            jTextField6.setText(String.valueOf(stcost));
            jTextField7.setText(String.valueOf(tSellingprice));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Invoice", "Product", "Supplier", "Category" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setVisible(false);
        jLabel2.setText("From :");

        jLabel3.setVisible(false);
        jLabel3.setText("To :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel4.setText("Total Products Sold");

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);

        jLabel5.setText("Stock Cost");

        jLabel6.setText("Total Selling Price");

        jRadioButton1.setText("Date Filter");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setVisible(false);

        jDateChooser2.setVisible(false);

        jTextField8.setEditable(false);

        jLabel7.setText("Count");

        jLabel8.setVisible(false);
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Select Supplier");

        jComboBox3.setVisible(false);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT Category FROM P_Categories";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox3.setModel(new DefaultComboBoxModel());
            jComboBox3.addItem("Select Category");
            while(rs.next()){
                jComboBox3.addItem(rs.getString(1));
            } connection.close();} catch (SQLException ex) {
            Logger.getLogger(ReportTotalProductsSold.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel9.setVisible(false);
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Select Category");

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

        jComboBox2.setVisible(false);
        jComboBox2.setModel(new DefaultComboBoxModel());
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT supplier_name FROM SuppliersRecord";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox2.addItem("Select Supplier");
            while(rs.next()){
                jComboBox2.addItem(rs.getString(1));
            }
            connection.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ReportTotalProductsSold.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
String filter ="Null";
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed



 try {
            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"productssold.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);
            // Set parameters
            
            Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
            
            


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 5).toString()), (jTable1.getValueAt(i, 7).toString()), (jTable1.getValueAt(i, 8).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 9).toString()), (jTable1.getValueAt(i, 10).toString())));
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

Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dataset", dataSource);
            parameters.put("coststock", jTextField6.getText());
            parameters.put("sellprice", jTextField7.getText());
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
                filter="All , Date From = "+date1+" To = "+date;
            
                Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer , InvoiceNo  FROM SoldProducts");



         tbm.setRowCount(0);
        int stcost=0;
         int count=0;
     int tSellingprice=0;
        while(rs15.next()){
                        if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){
        count++;
             int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});                }
                        }
jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));

            
            }else if(sel.equals("Supplier")){
                filter="Supplier = "+jComboBox2.getSelectedItem()+" , Date From = "+date1+" To = "+date;
                Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo   FROM SoldProducts WHERE Supplier= '"+jComboBox2.getSelectedItem()+"'");

        tbm.setRowCount(0);
        int stcost=0;
         int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            
                                    if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){
count++;
             int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        
        }}
jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));

                
            }else if(sel.equals("Product")){
                    filter="Product = "+jTextField1.getText()+" , Date From = "+date1+" To = "+date;
                Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo   FROM SoldProducts WHERE P_Id= '"+Integer.valueOf(jTextField1.getText())+"'");

         tbm.setRowCount(0);
        int stcost=0;
       int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            
        if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){
count++;
             int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }
        }
jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));

                
            }else if(sel.equals("Category")){
                filter="Category = "+jComboBox3.getSelectedItem()+" , Date From = "+date1+" To = "+date;
                Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo   FROM SoldProducts WHERE Category= '"+jComboBox3.getSelectedItem()+"'");

         tbm.setRowCount(0);
        int stcost=0;
       int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){
count++;
             int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }
            }
jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));

                
            }else if(sel.equals("Invoice")){
                filter="Invoice = "+jTextField2.getText()+" , Date From = "+date1+" To = "+date;
                Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo   FROM SoldProducts WHERE InvoiceNo= '"+Integer.valueOf(jTextField2.getText())+"'");

         tbm.setRowCount(0);
        int stcost=0;
       int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){
count++;
             int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }
            }
jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));

                
            }


connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed



 try {
            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"productssold.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);
            // Set parameters
            
            Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
            
            


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 5).toString()), (jTable1.getValueAt(i, 7).toString()), (jTable1.getValueAt(i, 8).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 9).toString()), (jTable1.getValueAt(i, 10).toString())));
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

Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dataset", dataSource);
            parameters.put("coststock", jTextField6.getText());
            parameters.put("sellprice", jTextField7.getText());
            parameters.put("curdatetime", (currentDateTimeString));
            
//             Create a JRBeanCollectionDataSource
            



            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

           

            
             String printerName =PrinterName.getReportPrinterName(); // Change to your printer name
            
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
String relativePath =  reports.getUrl()+"productssold.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);
            // Set parameters
            
            Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
            
            


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 5).toString()), (jTable1.getValueAt(i, 7).toString()), (jTable1.getValueAt(i, 8).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 9).toString()), (jTable1.getValueAt(i, 10).toString())));
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

Map<String, Object> parameters = new HashMap<>();
            parameters.put("filter", filter);
            parameters.put("dataset", dataSource);
            parameters.put("coststock", jTextField6.getText());
            parameters.put("sellprice", jTextField7.getText());
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
    filter= "All";
jLabel8.setVisible(false);
    jLabel9.setVisible(false);
    jLabel10.setVisible(false);
    jComboBox2.setVisible(false);
    jComboBox3.setVisible(false);
    jTextField1.setVisible(false);
jDateChooser1.setVisible(false);
jTextField2.setVisible(false);
                jLabel11.setVisible(false);

//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo   FROM SoldProducts"); 

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int stcost=0;
     int tSellingprice=0;
     int count=0;
        while(rs15.next()){
            count++;
            int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));

}else if(jComboBox1.getSelectedItem().equals("Supplier")){
jLabel8.setVisible(true);
    jLabel9.setVisible(false);
    jLabel10.setVisible(false);
    jComboBox2.setVisible(true);
    jComboBox3.setVisible(false);
    jTextField1.setVisible(false);
    jTextField2.setVisible(false);
                jLabel11.setVisible(false);

}else if(jComboBox1.getSelectedItem().equals("Product")){
jLabel8.setVisible(false);
    jLabel9.setVisible(false);
    jLabel10.setVisible(true);
    jComboBox2.setVisible(false);
    jComboBox3.setVisible(false);
    jTextField1.setVisible(true);
    jTextField2.setVisible(false);
                jLabel11.setVisible(false);

}else if(jComboBox1.getSelectedItem().equals("Category")){
jLabel8.setVisible(false);
    jLabel9.setVisible(true);
    jLabel10.setVisible(false);
    jComboBox2.setVisible(false);
    jComboBox3.setVisible(true);
    jTextField1.setVisible(false);
    jTextField2.setVisible(false);
                jLabel11.setVisible(false);
}else if(jComboBox1.getSelectedItem().equals("Invoice")){
jLabel8.setVisible(false);
    jLabel9.setVisible(false);
    jLabel10.setVisible(false);
    jComboBox2.setVisible(false);
    jComboBox3.setVisible(false);
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

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
filter="Supplier = "+jComboBox2.getSelectedItem();
        try {
            jDateChooser2.setDate(null);
            jDateChooser1.setDate(null);
           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo FROM SoldProducts WHERE Supplier= '"+jComboBox2.getSelectedItem()+"'");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int stcost=0;
        int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            count++;
            int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        jDateChooser2.setDate(null);
        jDateChooser1.setDate(null);

        try {
filter="Category = "+jComboBox3.getSelectedItem();
       
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo FROM SoldProducts WHERE Category= '"+jComboBox3.getSelectedItem()+"'");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int stcost=0;
        int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            count++;
            int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jDateChooser2.setDate(null);
        jDateChooser1.setDate(null);

        try {
filter="Product = "+jTextField1.getText();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo FROM SoldProducts WHERE P_Id= '"+Integer.valueOf(jTextField1.getText())+"'");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int stcost=0;
        int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            count++;
            int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

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

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

             jDateChooser2.setDate(null);
        jDateChooser1.setDate(null);

        try {
filter="Invoice = "+jTextField2.getText();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT Date, P_Id, P_Name, Quantiy, Brand, Cost, SoldPrice, Supplier, Category, Customer,InvoiceNo FROM SoldProducts WHERE InvoiceNo= '"+Integer.valueOf(jTextField2.getText())+"'");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int stcost=0;
        int count=0;
     int tSellingprice=0;
        while(rs15.next()){
            count++;
            int tcost=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(6));
             stcost+=tcost;
             int tprice=Integer.parseInt(rs15.getString(4))*Integer.parseInt(rs15.getString(7));
             tSellingprice+=tprice;
 tbm.addRow(new Object[]{rs15.getString(11),rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(6), tcost,rs15.getString(7), tprice,rs15.getString(8), rs15.getString(9), rs15.getString(10)});        }

jTextField8.setText(String.valueOf(count));
jTextField6.setText(String.valueOf(stcost));
jTextField7.setText(String.valueOf(tSellingprice));
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
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
