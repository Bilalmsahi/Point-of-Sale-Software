package raven.application.form;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class AddUpdateUser extends javax.swing.JPanel {
   

    public AddUpdateUser() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("User Name");

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 28)); // NOI18N
        jLabel14.setText("User Control");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Role");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
            String sql1="SELECT UserName,Role FROM POS_users_ ";
            ResultSet rs =st.executeQuery(sql1);

            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            while(rs.next()){

                tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Search User Name: ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
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

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new DefaultComboBoxModel());

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("SHOW");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("SHOW");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Search User Name: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addComponent(jLabel3))
                                                    .addComponent(jLabel5))
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jPasswordField1)
                                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2))
                                .addGap(0, 297, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT Role FROM UserRole";
            ResultSet rs =st.executeQuery(sql1);

            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// </editor-fold>//GEN-END:initComponents


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
         
        try {
            
            
           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
           
            
            
            
             if(String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword()))){ 
                  String sql="INSERT INTO POS_users_ (UserName, Password, Role) VALUES (?, ?, ?)";
            PreparedStatement ptst =connection.prepareStatement(sql);
            
            
            ptst.setString(1, jTextField3.getText());
            
            ptst.setString(2, String.valueOf(jPasswordField1.getPassword()));
            
            ptst.setString(3, jComboBox1.getSelectedItem().toString());
            
            
            jComboBox1.setSelectedItem(null);
                 jPasswordField1.setText(null);
                 jTextField3.setText(null);
                 jPasswordField2.setText(null);
            ptst.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Stored ");
            
             
             

Statement st= connection.createStatement();
            
            String sql1="SELECT UserName,Role FROM POS_users_ ";
            ResultSet rs =st.executeQuery(sql1);
           DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
          tbm.setRowCount(0);
            while(rs.next()){
               

           tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            
            }
             }else{
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, " Password Mismatches"); 
                }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
 
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String id = jTextField1.getText();
      {try {
          
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

          
          if(jTextField1.getText().equals("")){
          try {



Statement st= connection.createStatement();
String sql1="SELECT UserName,Role FROM POS_users_ WHERE UserName LIKE '%"+id+"%'";           
            ResultSet rs =st.executeQuery(sql1);
            
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
tbm.setRowCount(0);
            while(rs.next()){
               
          
             tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            
            }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

          }else{


Statement st= connection.createStatement();
String sql1="SELECT UserName,Role FROM POS_users_ WHERE UserName LIKE '%"+id+"%' ";           
            ResultSet rs =st.executeQuery(sql1);
            
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
tbm.setRowCount(0);
            while(rs.next()){
               
          
             tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            
            }
          }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            
            String id = jTextField3.getText();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            
            PreparedStatement ptst =connection.prepareStatement("UPDATE POS_users_   SET  Password=?, Role=? WHERE UserName = '"+ id +"'  ");
//      ptst.setString(1, jTextField2.getText());
      


            ptst.setString(1, String.valueOf(jPasswordField1.getPassword()));
            
            ptst.setString(2, jComboBox1.getSelectedItem().toString());
            
            
      
      
            if(String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword()))){ 
            int a= JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Update ");
             if(a==JOptionPane.YES_OPTION){
                 
                         ptst.executeUpdate();
                          Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Updated Successfully ");
            }
             Statement st= connection.createStatement();
String sql1="SELECT UserName,Role FROM POS_users_ ";           
            ResultSet rs =st.executeQuery(sql1);
            
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
tbm.setRowCount(0);
            while(rs.next()){
               
          
             tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            
            }
            jTextField2.setText(null);
            jTextField3.setText(null);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jComboBox1.setSelectedItem(null);
           
            
            
            }else{Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, " Password Mismatches");}
            
        
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            
            String id = jTextField2.getText();
           
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            
            PreparedStatement ptst =connection.prepareStatement("DELETE FROM POS_users_  WHERE UserName = '"+ id +"'  ");
            
             int a=JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Deleted ");
             if(a==JOptionPane.YES_OPTION){
                         ptst.executeUpdate();
                         Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Deleted Successfully ");
                         jTextField2.setText(null);
                         jTextField3.setText(null);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jComboBox1.setSelectedItem(null);
            }
             
            Statement st= connection.createStatement();
String sql1="SELECT UserName,Role FROM POS_users_ ";           
            ResultSet rs =st.executeQuery(sql1);
            
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
tbm.setRowCount(0);
            while(rs.next()){
               
          
             tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            
            }
            
            
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

if(jCheckBox1.isSelected()){

jPasswordField1.setEchoChar((char)0);
}else{
 
    jPasswordField1.setEchoChar('*');
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    
    if(jCheckBox2.isSelected()){

jPasswordField2.setEchoChar((char)0);
}else{
 
    jPasswordField2.setEchoChar('*');
}    

// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
    String id = jTextField2.getText();
      {try {
         
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());


          if(id.equals("")){
              jTextField2.setText(null);
            jTextField3.setText(null);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jComboBox1.setSelectedItem(null);
          
          }else{
          
          

Statement st= connection.createStatement();
String sql1="SELECT UserName,Password,Role FROM POS_users_ WHERE UserName = '"+id+"'";           
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            
           
            String username=rs.getString(1);
            String password=rs.getString(2);
            String role=rs.getString(3);
           
            jTextField3.setText(username);
            jPasswordField1.setText(password);
            jPasswordField2.setText(password);
            jComboBox1.setSelectedItem(role);
            
           }
      
          }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


 String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
      {try {
         
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());


          if(id.equals("")){
              jTextField2.setText(null);
            jTextField3.setText(null);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jComboBox1.setSelectedItem(null);
          
          }else{
          
          

Statement st= connection.createStatement();
String sql1="SELECT UserName,Password,Role FROM POS_users_ WHERE UserName = '"+id+"'";           
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            
           
            String username=rs.getString(1);
            String password=rs.getString(2);
            String role=rs.getString(3);
           
            jTextField3.setText(username);
            jPasswordField1.setText(password);
            jPasswordField2.setText(password);
            jComboBox1.setSelectedItem(role);
            
           }
      
          }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }} 

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

 String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
      {try {
         
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());


          if(id.equals("")){
              jTextField2.setText(null);
            jTextField3.setText(null);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jComboBox1.setSelectedItem(null);
          
          }else{
          
          

Statement st= connection.createStatement();
String sql1="SELECT UserName,Password,Role FROM POS_users_ WHERE UserName = '"+id+"'";           
            ResultSet rs =st.executeQuery(sql1);
           while(rs.next()){
            
           
            String username=rs.getString(1);
            String password=rs.getString(2);
            String role=rs.getString(3);
           
            jTextField3.setText(username);
            jPasswordField1.setText(password);
            jPasswordField2.setText(password);
            jComboBox1.setSelectedItem(role);
            
           }
      
          }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }}         // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
