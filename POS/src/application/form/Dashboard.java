package raven.application.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Raven
 */
public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
       
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setColumnSelectionAllowed(true);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        setPreferredSize(new java.awt.Dimension(907, 650));

        DefaultTableCellRenderer cr=new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);cr.setVerticalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(String.class, cr);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product-Id", "Product-Name", "Quantity", "P-MIN-Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT P_Id, P_Name,P_Quantity, P_Min_Stock FROM Stock WHERE P_Quantity<=P_Min_Stock";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(LowStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Low Stock");

        jSeparator5.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator6.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator7.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator8.setForeground(new java.awt.Color(0, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Expire-Quantity", "P-Exp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable2.setColumnSelectionAllowed(true);
        DefaultTableCellRenderer cr1=new DefaultTableCellRenderer();
        cr1.setHorizontalAlignment(JLabel.CENTER);cr1.setVerticalAlignment(JLabel.CENTER);
        jTable2.setDefaultRenderer(String.class, cr1);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            LocalDate d=LocalDate.now();

            //        Selection of all existing products in system by their Id;

            List<Integer> aa;
            aa = new ArrayList<>();
            Statement stt=connection.createStatement();
            ResultSet rsst=stt.executeQuery("SELECT Product_Id FROM Products");
            while(rsst.next()){
                aa.add(rsst.getInt(1));
            }
            System.out.println("These are Products"+aa);

            //          Expiary finding Started
            DefaultTableModel tbm =(DefaultTableModel)jTable2.getModel();
            tbm.setRowCount(0);
            for(int i=0;i<aa.size();i++){

                //               Getting all the data added in StockAdded Table are Selected by their primary key;

                int pid=aa.get(i);
                List<Integer> ss;
                ss = new ArrayList<>();

                Statement st1=connection.createStatement();
                ResultSet rs1=st1.executeQuery("SELECT Added_Number FROM StockAdded WHERE P_Id='"+pid+"'");

                while(rs1.next()){
                    ss.add(rs1.getInt(1));
                }
                System.out.println("This is The indexed number of some product no  "+pid+" ;  "+ss);

                //        Now Starting the sort on the basis of the expiary Date;

                for(int p=ss.size()-1;p>=0;p--){
                    for(int s=0;s<p;s++){

                        //                Getting an Expiary Date for the selected indexes

                        Statement st2=connection.createStatement();
                        ResultSet rs2=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
                        ResultSet rs3=st2.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(p)+"'");

                        Date exs=null;
                        Date exp=null;
                        while(rs2.next()){
                            exs=rs2.getDate(1);
                        }
                        while(rs3.next()){
                            exp=rs3.getDate(1);
                        }

                        if((exs.compareTo(exp))<0){
                            int sw=ss.get(s);
                            ss.set(s, ss.get(p));
                            ss.set(p, sw);
                        }

                    }
                }
                System.out.println("FINAL  This is the Sorted Array by Date for product "+pid+":  "+ss);

                //        Getting Quantity and adding it up from stock added table;
                ResultSet rs01=st1.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id='"+pid+"'");
                int P_Qty=0;
                while(rs01.next()){
                    P_Qty+=rs01.getInt(1);
                }
                System.out.println("product total quantity"+P_Qty);
                //Adding if statement here that if stock quantity of a particular product is zero how can be it expire

                if(P_Qty!=0){
                    int Add_Qty=0;
                    int break_index=0;
                    for(int y=0;y<ss.size();y++){
                        if(Add_Qty>=P_Qty){

                            break;
                        }else{

                            ResultSet rs0=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(y)+"'");
                            while(rs0.next()){
                                Add_Qty+=(rs0.getInt(1));
                            }
                            break_index=y;

                        }
                    }

                    System.out.println("product Added quantity"+Add_Qty);
                    System.out.println(break_index);

                    int k=break_index;

                    System.out.println(k);
                    ResultSet rs02=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
                    LocalDate ex=null;
                    while(rs02.next()){
                        ex=(rs02.getDate(1).toLocalDate());
                    }
                    System.out.println(ex);
                    System.out.println(d);

                    if(ex.isBefore(d)){
                        System.out.println("yesss");
                        ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(k)+"'");
                        int exxqty=0;
                        while(rs03.next()){
                            exxqty=rs03.getInt(1);
                        }

                        int nonexpiryqty=Add_Qty-exxqty;
                        int expireStock=P_Qty-nonexpiryqty;

                        Statement st= connection.createStatement();
                        String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
                        ResultSet rs =st.executeQuery(sql1);
                        while(rs.next()){
                            tbm.addRow(new Object[]{pid,rs.getString(1),expireStock,ex});
                        }

                    }

                    //            Includeing all of the indexes that are left behind the broken one
                    for(int s=(break_index-1);s>=0;s--){
                        ResultSet rs05=st1.executeQuery("SELECT P_Expiry FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
                        LocalDate exx=null;
                        while(rs05.next()){
                            exx=(rs05.getDate(1).toLocalDate());
                        }
                        if(exx.isBefore(d)){
                            System.out.println("yesss");
                            //                Expire quantity is taking
                            ResultSet rs03=st1.executeQuery("SELECT P_Quantity FROM StockAdded WHERE Added_Number='"+ss.get(s)+"'");
                            int exxqty1=0;
                            while(rs03.next()){
                                exxqty1=rs03.getInt(1);
                            }

                            //                        Adding into row

                            String sql1="SELECT Product_Name FROM Products WHERE Product_Id='"+pid+"'";
                            ResultSet rs =st1.executeQuery(sql1);
                            while(rs.next()){
                                tbm.addRow(new Object[]{pid,rs.getString(1),exxqty1,exx});
                            }

                        }

                    }
                }

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ExpiredStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        jSeparator9.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator10.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator11.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator12.setForeground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Expired Stock");

        jSeparator13.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator14.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator13)
            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
