package raven.application.form;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Notification;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.application.Application;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class AddNewStaff1 extends javax.swing.JPanel {
    // Helper method to type a string using Robot
    private static void typeString(Robot robot, String s) {
        for (char c : s.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                throw new IllegalArgumentException("Cannot type character: " + c);
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }
    }

    public AddNewStaff1() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }
    
    public class clearfield {
    
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CNIC");

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 28)); // NOI18N
        jLabel14.setText("Staff Management");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Search Staff Id : ");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Designation");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ph Number");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Email");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Pay / Month");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setText("Detailed Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Id", "CNIC", "Name", "Designation", "Ph Number", "Email", "Pay", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();

            String sql1="SELECT Staff_ID,CNIC,Staff_name,Designation,PH_number,Email,Monthly_Pay,Address FROM Staff";
            ResultSet rs =st.executeQuery(sql1);

            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            while(rs.next()){

                //          tbm.setRowCount(0);
                tbm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Staff Id ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 452, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
         
        try {
            
            
           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            String sql="INSERT INTO Staff(CNIC, Staff_name, Designation, PH_number, Email, Monthly_Pay, Address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ptst =connection.prepareStatement(sql);
            
            
            ptst.setString(1, jTextField3.getText());
            
            ptst.setString(2, jTextField5.getText());
            
            ptst.setString(3, jTextField9.getText());
            
            ptst.setString(4, jTextField10.getText());
            
            ptst.setString(5, jTextField11.getText());
            
            ptst.setString(6, jTextField6.getText());
          
            ptst.setString(7, jTextArea1.getText());
            
             ptst.executeUpdate();
             Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Stored ");
             jTextField3.setText(null);
            jTextField5.setText(null);
            jTextField9.setText(null);
            jTextField10.setText(null);
            jTextField11.setText(null);
              jTextField6.setText(null);
              jTextArea1.setText(null);
             jTextField2.setText(null);
             
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         Application.showForm(new AddNewStaff1());
    }//GEN-LAST:event_jButton4ActionPerformed
 
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased



if(!numeric.isNumeric(jTextField1.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}


        String id = jTextField1.getText();
      {try {
          
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

          
          if(jTextField1.getText().equals("")){
          try {



Statement st= connection.createStatement();
            
            String sql1="SELECT Staff_ID,CNIC,Staff_name,Designation,PH_number,Email,Monthly_Pay,Address FROM Staff";
            ResultSet rs =st.executeQuery(sql1);
           
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
              tbm.setRowCount(0);
while(rs.next()){
               

           tbm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            
            }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }

          }else{


Statement st= connection.createStatement();
            
           
            
            String sql1="SELECT Staff_ID,CNIC,Staff_name,Designation,PH_number,Email,Monthly_Pay,Address FROM Staff WHERE Staff_ID LIKE '%"+id+"%'";
            ResultSet rs =st.executeQuery(sql1);
           
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            while(rs.next()){
               
                
                
          tbm.setRowCount(0);
            tbm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            
            }
          }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }}
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

        
        String id = jTextField2.getText();
    
    if(id.equals("")){jTextField3.setText(null);
            jTextField5.setText(null);
            jTextField9.setText(null);
            jTextField10.setText(null);
            jTextField11.setText(null);
              jTextField6.setText(null);
              jTextArea1.setText(null);
             jTextField2.setText(null);}else{
      {try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement st= connection.createStatement();
             String sql1="SELECT CNIC,Staff_name,Designation,PH_number,Email,Monthly_Pay,Address FROM Staff WHERE Staff_ID = '"+id+"'";
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            
           
            String cnic=rs.getString(1);
            String Staffname=rs.getString(2);
            String des=rs.getString(3);
            String ph=rs.getString(4);
            String email=rs.getString(5);
            String pay=rs.getString(6);
            String contact=rs.getString(7);
            
            jTextField3.setText(cnic);
            jTextField5.setText(Staffname);
            jTextField9.setText(des);
            jTextField10.setText(ph);
            jTextField11.setText(email);
            jTextField6.setText(pay);
            jTextArea1.setText(contact);
           }
           

             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }}}
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            
            String id = jTextField2.getText();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            
            PreparedStatement ptst =connection.prepareStatement("UPDATE Staff   SET  CNIC=?, Staff_name= ?, Designation=?, PH_number=?, Email=?, Monthly_Pay=?, Address=? WHERE Staff_ID = "+ id +"  ");
//      ptst.setString(1, jTextField2.getText());
      ptst.setString(1, jTextField3.getText());
      ptst.setString(2, jTextField5.getText());
      ptst.setString(3, jTextField9.getText());
      ptst.setString(4, jTextField10.getText());
      ptst.setString(5, jTextField11.getText());
      ptst.setString(6, jTextField6.getText());
      ptst.setString(7, jTextArea1.getText());
      
            
            int a= JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Update ");
             if(a==JOptionPane.YES_OPTION){
                         ptst.executeUpdate();
                          Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Updated Successfully ");
            }
              connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      Application.showForm(new AddNewStaff1());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            
            String id = jTextField2.getText();
          
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            
            PreparedStatement ptst =connection.prepareStatement("DELETE FROM Staff  WHERE Staff_ID = "+ id +"  ");
            
             int a=JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Deleted ");
             if(a==JOptionPane.YES_OPTION){
                         ptst.executeUpdate();
                            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Deleted ");
            }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         Application.showForm(new AddNewStaff1());
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

    String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
    
    if(id.equals("")){
     
        jTextField3.setText(null);
            jTextField5.setText(null);
            jTextField9.setText(null);
            jTextField10.setText(null);
            jTextField11.setText(null);
              jTextField6.setText(null);
              jTextArea1.setText(null);
             jTextField2.setText(null);}else{
      {try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement st= connection.createStatement();
             String sql1="SELECT CNIC,Staff_name,Designation,PH_number,Email,Monthly_Pay,Address FROM Staff WHERE Staff_ID = '"+id+"'";
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            
           
            String cnic=rs.getString(1);
            String Staffname=rs.getString(2);
            String des=rs.getString(3);
            String ph=rs.getString(4);
            String email=rs.getString(5);
            String pay=rs.getString(6);
            String contact=rs.getString(7);
            
            
            jTextField2.setText(id);
            jTextField3.setText(cnic);
            jTextField5.setText(Staffname);
            jTextField9.setText(des);
            jTextField10.setText(ph);
            jTextField11.setText(email);
            jTextField6.setText(pay);
            jTextArea1.setText(contact);
           }
           

             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }}}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked



    String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
    
    if(id.equals("")){
     
        jTextField3.setText(null);
            jTextField5.setText(null);
            jTextField9.setText(null);
            jTextField10.setText(null);
            jTextField11.setText(null);
              jTextField6.setText(null);
              jTextArea1.setText(null);
             jTextField2.setText(null);}else{
      {try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement st= connection.createStatement();
             String sql1="SELECT CNIC,Staff_name,Designation,PH_number,Email,Monthly_Pay,Address FROM Staff WHERE Staff_ID = '"+id+"'";
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            
           
            String cnic=rs.getString(1);
            String Staffname=rs.getString(2);
            String des=rs.getString(3);
            String ph=rs.getString(4);
            String email=rs.getString(5);
            String pay=rs.getString(6);
            String contact=rs.getString(7);
            
            
              jTextField2.setText(id);
            jTextField3.setText(cnic);
            jTextField5.setText(Staffname);
            jTextField9.setText(des);
            jTextField10.setText(ph);
            jTextField11.setText(email);
            jTextField6.setText(pay);
            jTextArea1.setText(contact);
           }
           

             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
        }}}



        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased

if(!numeric.isNumeric(jTextField10.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyReleased

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
