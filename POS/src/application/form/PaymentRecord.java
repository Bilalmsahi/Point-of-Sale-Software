package raven.application.form;

import java.awt.AWTException;
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
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class PaymentRecord extends javax.swing.JPanel {

    
   public class ReportData {

        public ReportData(String invoice, String datetime, String process, String supplier, String payed, String recamount, String total, String remaining) {
            this.invoice = invoice;
            this.datetime = datetime;
            this.process = process;
            this.supplier = supplier;
            this.payed = payed;
            this.recamount = recamount;
            this.total = total;
            this.remaining = remaining;
        }

        
private String invoice;
private String datetime;
private String process;
private String supplier;
private String payed;
private String recamount;
private String total;
private String remaining;

        public String getInvoice() {
            return invoice;
        }

        public void setInvoice(String invoice) {
            this.invoice = invoice;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public String getProcess() {
            return process;
        }

        public void setProcess(String process) {
            this.process = process;
        }

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getPayed() {
            return payed;
        }

        public void setPayed(String payed) {
            this.payed = payed;
        }

        public String getRecamount() {
            return recamount;
        }

        public void setRecamount(String recamount) {
            this.recamount = recamount;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getRemaining() {
            return remaining;
        }

        public void setRemaining(String remaining) {
            this.remaining = remaining;
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


    
    
    public PaymentRecord() {
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filter By :");

        jButton1.setVisible(false);
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date and Time", "Process", "Invoice No", "Supplier", "Payed Amount ", "Received Amount", "Total Amount", "Remaining Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            //Now trying to get the record from the sales table;

            Statement stt=connection.createStatement();
            ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1");

            DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);

            while(rs15.next()){

                tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReportTotalExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Invoice", "Supplier", "Orders", "Returns", " ", " " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
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
        jLabel4.setText("Suppliers Payment History");

        jDateChooser1.setVisible(false);

        jDateChooser2.setVisible(false);

        jRadioButton1.setText("Date Filter");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
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

        jLabel5.setVisible(false);
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Select Supplier");

        jTextField1.setVisible(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel6.setVisible(false);
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Enter Invoice No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox2, 0, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents
String filter="";
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"ledger.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);
            // Set parameters


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 5).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 7).toString())));
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

         Date input = jDateChooser2.getDate();
Instant instant = input.toInstant();
ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
LocalDate date = zdt.toLocalDate();

Date input1 = jDateChooser1.getDate();
Instant instant1 = input1.toInstant();
ZonedDateTime zdt1 = instant1.atZone(ZoneId.systemDefault());
LocalDate date1 = zdt1.toLocalDate();
  
        
         try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

if(jComboBox1.getSelectedItem().equals("All")){

filter="All , Date From : "+date1+" To : "+date;
//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int Tpay=0;
        int TRece=0;
        int TBill=0;
        int TRem=0;
        while(rs15.next()){
                        if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){

    
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}
}




}else if(jComboBox1.getSelectedItem().equals("Orders")){
    filter="Status = Orders , Date From : "+date1+" To : "+date;


//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE Process='"+"Ordered"+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
       
        while(rs15.next()){
                                    if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){

          
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}
}




}else if(jComboBox1.getSelectedItem().equals("Returns")){
filter="Status = Returns , Date From : "+date1+" To : "+date;

//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE Process='"+"Return"+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
       
        while(rs15.next()){
          if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){

   
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}
}




}else if(jComboBox1.getSelectedItem().equals("Invoice")){
    filter="Invoice No = "+jTextField1.getText()+" , Date From : "+date1+" To : "+date;
        
    try {

        if(jTextField1.getText().equals("")){
Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
       
        while(rs15.next()){
            
                                    if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){

            
            
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});

                                    }
        }

}else{


Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE InvoiceNo='"+Integer.valueOf(jTextField1.getText())+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
    
     
        while(rs15.next()){
                                    if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){

          
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
                                    }}

        }
connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}else if(jComboBox1.getSelectedItem().equals("Supplier")){
    filter="Supplier = "+jComboBox2.getSelectedItem()+" , Date From : "+date1+" To : "+date;

 try {


Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE Supplier='"+jComboBox2.getSelectedItem()+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
       
     
        while(rs15.next()){
                                    if(((rs15.getDate(1).toLocalDate()).isAfter( date1)) && rs15.getDate(1).toLocalDate().isBefore(date)){

            
          
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
                                    }}

connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
}



 connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecord.class.getName()).log(Level.SEVERE, null, ex);
        }




        // TODO add your handling code here:




        // TODO add your handling code here:




        // TODO add your handling code here:




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


 try {

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"ledger.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);
            // Set parameters


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 5).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 7).toString())));
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
String relativePath =  reports.getUrl()+"ledger.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath);
            // Set parameters


         // Create a list of ReportData objects
            List<ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable1.getRowCount();i++){
            reportDataList.add(new ReportData( (jTable1.getValueAt(i, 2).toString()), (jTable1.getValueAt(i, 0).toString()), (jTable1.getValueAt(i, 1).toString()), (jTable1.getValueAt(i, 3).toString()), (jTable1.getValueAt(i, 4).toString()), (jTable1.getValueAt(i, 5).toString()), (jTable1.getValueAt(i, 6).toString()), (jTable1.getValueAt(i, 7).toString())));
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

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
jDateChooser1.setVisible(false);
                jDateChooser2.setVisible(false);
                jLabel2.setVisible(false);
                        jLabel3.setVisible(false);
                        jButton1.setVisible(false);
                        jRadioButton1.setSelected(false);
                        
                        
        String spay="Staff Pay";
         try {

           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

if(jComboBox1.getSelectedItem().equals("All")){
    filter="All";
jComboBox2.setVisible(false);
                        jLabel5.setVisible(false);
                        jTextField1.setVisible(false);
                        jLabel6.setVisible(false);
//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
     
     
        while(rs15.next()){
         
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}



}else if(jComboBox1.getSelectedItem().equals("Orders")){
     filter="Process = "+jComboBox1.getSelectedItem();
jComboBox2.setVisible(false);
                        jLabel5.setVisible(false);
                        jTextField1.setVisible(false);
                        jLabel6.setVisible(false);

//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE Process='"+"Ordered"+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
        int Tpay=0;
        int TRece=0;
        int TBill=0;
        int TRem=0;
     
        while(rs15.next()){
            Tpay+=Integer.parseInt(rs15.getString(5));
            TRece+=Integer.parseInt(rs15.getString(6));
            TBill+=Integer.parseInt(rs15.getString(7));
            TRem+=Integer.parseInt(rs15.getString(8));
           
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}



}else if(jComboBox1.getSelectedItem().equals("Returns")){
    filter="Process = "+jComboBox1.getSelectedItem();
jComboBox2.setVisible(false);
                        jLabel5.setVisible(false);
                        jTextField1.setVisible(false);
                        jLabel6.setVisible(false);

//Now trying to get the record from the sales table;

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE Process='"+"Return"+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
    
     
        while(rs15.next()){
          
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});

        }



}else if(jComboBox1.getSelectedItem().equals("Invoice")){
jComboBox2.setVisible(false);
                        jLabel5.setVisible(false);
                        jTextField1.setVisible(true);
                        jLabel6.setVisible(true);
        }else if(jComboBox1.getSelectedItem().equals("Supplier")){
            jComboBox2.setVisible(true);
                        jLabel5.setVisible(true);
                        jTextField1.setVisible(false);
                        jLabel6.setVisible(false);

        }

 connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecord.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:



        // TODO add your handling code here:



        // TODO add your handling code here:



        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
//Now trying to get the record from the sales table;
   try {
filter="Supplier = "+jComboBox2.getSelectedItem();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE Supplier='"+jComboBox2.getSelectedItem()+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
       
     
        while(rs15.next()){
         
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}


connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
filter=" Invoice No = "+jTextField1.getText();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
        if(jTextField1.getText().equals("")){
Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
      
     
        while(rs15.next()){
           
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}



}else{


Statement stt=connection.createStatement();
ResultSet rs15=stt.executeQuery("SELECT DateandTime, Process, InvoiceNo, Supplier, AmountPayed, AmountRecived, TotalAmount, Remaining_Amount FROM PaymentHistory1 WHERE InvoiceNo='"+Integer.valueOf(jTextField1.getText())+"'");

DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
        tbm.setRowCount(0);
     
     
        while(rs15.next()){
          
           
            
            
            
        tbm.addRow(new Object[]{rs15.getString(1), rs15.getString(2), rs15.getString(3), rs15.getString(4), rs15.getString(5), rs15.getString(6), rs15.getString(7), rs15.getString(8)});
}


        }
connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
