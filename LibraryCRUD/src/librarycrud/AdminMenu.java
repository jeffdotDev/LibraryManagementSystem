/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarycrud;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminMenu extends javax.swing.JFrame {
    HashMap<String,String> userAndpass = new HashMap<>();
    
    public AdminMenu() {
        initComponents();
        connect();
        showStudent();
        deleteShowStudent();
        updateshowStudent();
    }
    
    Connection con=null;
    PreparedStatement ps;
    ResultSet rs;
    
    String drive = "com.mysql.cj.jdbc.Driver";

    public void connect(){
        
        try {
            Class.forName(drive);
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeffersondb?useSSL=false","root","jeffersonbsit123");
            
            if(con!=null){
                System.out.println("Connected successfully!!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showStudent(){
        
        try{
        DefaultTableModel det =  (DefaultTableModel) jTable1.getModel();
        det.setRowCount(0);
        
        Statement s = con.createStatement();
        rs = s.executeQuery("SELECT * FROM librarycrud");
        
        while(rs.next()){
            Vector vec = new Vector();
            
            vec.add(rs.getString(1));
            vec.add(rs.getString(2));
            vec.add(rs.getString(3));
            vec.add(rs.getString(4));
            vec.add(rs.getString(5));
            vec.add(rs.getString(6));
            vec.add(rs.getString(7));
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void deleteShowStudent(){
        
        try{
        DefaultTableModel det =  (DefaultTableModel) jTable2.getModel();
        det.setRowCount(0);
        
        Statement s = con.createStatement();
        rs = s.executeQuery("SELECT * FROM librarycrud");
        
        while(rs.next()){
            Vector vec = new Vector();
            
            vec.add(rs.getString(1));
            vec.add(rs.getString(2));
            vec.add(rs.getString(3));
            vec.add(rs.getString(4));
            vec.add(rs.getString(5));
            vec.add(rs.getString(6));
            vec.add(rs.getString(7));
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void updateshowStudent(){
        
        try{
        DefaultTableModel det =  (DefaultTableModel) jTable3.getModel();
        det.setRowCount(0);
        
        Statement s = con.createStatement();
        rs = s.executeQuery("SELECT * FROM librarycrud");
        
        while(rs.next()){
            Vector vec = new Vector();
            
            vec.add(rs.getString(1));
            vec.add(rs.getString(2));
            vec.add(rs.getString(3));
            vec.add(rs.getString(4));
            vec.add(rs.getString(5));
            vec.add(rs.getString(6));
            vec.add(rs.getString(7));
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        createBtn = new javax.swing.JToggleButton();
        showStudentBtn = new javax.swing.JToggleButton();
        deleteStudentBtn = new javax.swing.JToggleButton();
        updateStudentBtn = new javax.swing.JToggleButton();
        addBooksBtn = new javax.swing.JToggleButton();
        showBooksBtn = new javax.swing.JToggleButton();
        deleteBooksBtn = new javax.swing.JToggleButton();
        updateBooksBtn = new javax.swing.JToggleButton();
        homeBtn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        middleNameTxt = new javax.swing.JTextField();
        firstNameTxt1 = new javax.swing.JTextField();
        extensionTxt = new javax.swing.JTextField();
        yearAndSectionTxt = new javax.swing.JTextField();
        lastNameTxt2 = new javax.swing.JTextField();
        courseTxt1 = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        showBox = new javax.swing.JCheckBox();
        submitBtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchIdTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        deleteBookstxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        typeOfBooksTxt = new javax.swing.JTextField();
        titleUpTxt = new javax.swing.JTextField();
        idUpTxt2 = new javax.swing.JTextField();
        idUpTxt3 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        upMiddleNameTxt = new javax.swing.JTextField();
        upFirstNameTxt1 = new javax.swing.JTextField();
        upLastNameTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        upExtensionNameTxt = new javax.swing.JTextField();
        upYearAndSectionTxt = new javax.swing.JTextField();
        upCoursTxt1 = new javax.swing.JTextField();
        updateInfoBtn = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(createBtn);
        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createBtn.setText("Create Account");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(showStudentBtn);
        showStudentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showStudentBtn.setText("Show Student");
        showStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStudentBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(deleteStudentBtn);
        deleteStudentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteStudentBtn.setText("Delete Student");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(updateStudentBtn);
        updateStudentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateStudentBtn.setText("Update Student");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(addBooksBtn);
        addBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBooksBtn.setText("CICT");
        addBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBooksBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(showBooksBtn);
        showBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showBooksBtn.setText("HM");
        showBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBooksBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(deleteBooksBtn);
        deleteBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBooksBtn.setText("ED");
        deleteBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBooksBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(updateBooksBtn);
        updateBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBooksBtn.setText("BIT");
        updateBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBooksBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(homeBtn);
        homeBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("For Student");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Books");

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBooksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(homeBtn)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showStudentBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteStudentBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateStudentBtn)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBooksBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showBooksBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBooksBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateBooksBtn)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 8, -1, 490));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel30.setText("Library Management ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", jPanel3);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Create Account And add Student ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Username :");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Middle Name :");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Last name :");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Extension Name :");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Course :");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Year and Section :");

        addBtn.setBackground(new java.awt.Color(51, 51, 255));
        addBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addBtn.setText("Add to List");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Password :");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("First Name :");

        showBox.setText("Show Password");
        showBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBoxActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        submitBtn.setText("Sumbit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(firstNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(extensionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(yearAndSectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(courseTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(middleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lastNameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showBox)
                            .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(229, 229, 229))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(middleNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(extensionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(submitBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearAndSectionTxt)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add", jPanel6);

        jLabel7.setText("tab4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "FirstName", "MiddleName", "LastName", "ExtensionName", "Course", "Year&Section"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("show", jPanel8);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "FirstName", "MiddleName", "LastName", "ExtensionName", "Course", "Year&Section"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        deleteBtn.setBackground(new java.awt.Color(255, 0, 51));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete Student");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Search Id :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("delete", jPanel9);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Middlename", "LastName", "No.#", "Course", "YearAndSection"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        jLabel21.setText("FirstName : ");

        jLabel22.setText("MiddleName : ");

        jLabel23.setText("LastName:");

        jLabel31.setText("ID:");

        jLabel32.setText("Course:");

        jLabel33.setText("YearAndSection:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel31)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel33)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jTextField7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab6", jPanel2);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Types of Books", "Title", "Pages"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab7", jPanel4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Title of Books", "Title", "Pages"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jLabel24.setText("Search Id : ");

        jButton1.setText("Delete ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBookstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 289, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBookstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab8", jPanel5);

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Type of Books :");

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setText("Title :");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel28.setText("ID :");

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setText("Pages :");

        idUpTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUpTxt2ActionPerformed(evt);
            }
        });

        idUpTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUpTxt3ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Type of Books", "Title", "Pages"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeOfBooksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUpTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleUpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUpTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleUpTxt)
                            .addComponent(idUpTxt3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(typeOfBooksTxt)
                            .addComponent(idUpTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab9", jPanel10);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 810, 480));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "FirstName", "MiddleName", "LastName", "ExtensionName", "Course", "Year&Section"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("FirstName :");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("MiddleName :");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("LastName :");

        upFirstNameTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upFirstNameTxt1ActionPerformed(evt);
            }
        });

        upLastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upLastNameTxtActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Year&Section :");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("ExtensionName :");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("Course :");

        updateInfoBtn.setBackground(new java.awt.Color(51, 51, 255));
        updateInfoBtn.setText("Update Info.");
        updateInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoBtnActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("ID   :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(upFirstNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(upMiddleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(upLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upExtensionNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upYearAndSectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(upCoursTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(updateInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upFirstNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upExtensionNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upMiddleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upCoursTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upYearAndSectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 806, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStudentBtnActionPerformed
       jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_showStudentBtnActionPerformed

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void showBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBooksBtnActionPerformed
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_showBooksBtnActionPerformed

    private void updateBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBooksBtnActionPerformed
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_updateBooksBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_createBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void upLastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upLastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upLastNameTxtActionPerformed

    private void upFirstNameTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upFirstNameTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upFirstNameTxt1ActionPerformed

    private void showBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showBoxActionPerformed

    private void idUpTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUpTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUpTxt2ActionPerformed

    private void idUpTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUpTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUpTxt3ActionPerformed

    private void addBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBooksBtnActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_addBooksBtnActionPerformed

    private void deleteBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBooksBtnActionPerformed
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_deleteBooksBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try
        {
            String fname = firstNameTxt1.getText();
            String mname = middleNameTxt.getText();
            String lname = lastNameTxt2.getText();
            String extension = extensionTxt.getText();
            String course = courseTxt1.getText();
            String yearLevel = yearAndSectionTxt.getText();
            
            ps = con.prepareStatement("INSERT INTO librarycrud (firstName,middleName,lastName,extensionName,course,yearAndsection)VALUES(?,?,?,?,?,?)");
            ps.setString(1,fname);
            ps.setString(2,mname);
            ps.setString(3,lname);
            ps.setString(4,extension);
            ps.setString(5,course);
            ps.setString(6,yearLevel);
            
            int up = ps.executeUpdate();
            
            if(up == 1){
                JOptionPane.showMessageDialog(null,"Successfully added!!");
                
                firstNameTxt1.setText("");
                middleNameTxt.setText("");
                lastNameTxt2.setText("");
                extensionTxt.setText("");
                courseTxt1.setText("");
                yearAndSectionTxt.setText("");
            }
            

            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       try
       {
           String id = searchIdTxt.getText();
           ps = con.prepareStatement("DELETE FROM librarycrud WHERE firstName = ? ");
           ps.setString(1,id);
           
           int a = ps.executeUpdate();
           if(a == 1)
           {
               JOptionPane.showMessageDialog(null,"Successfully Deleted!!");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Not Deleted","Message",JOptionPane.ERROR_MESSAGE);
           }
           showStudent();
           deleteShowStudent();
           updateshowStudent();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoBtnActionPerformed
       try
       {
           String idUp = jTextField1.getText();
           String f = upFirstNameTxt1.getText();
           String m = upMiddleNameTxt.getText();
           String l = upLastNameTxt.getText();
           String e = upExtensionNameTxt.getText();
           String c = upCoursTxt1.getText();
           String y = upYearAndSectionTxt.getText();
           
           ps = con.prepareStatement("UPDATE librarycrud set firstname = ?,middleName = ?,lastName = ?,extensionName = ?,course = ?,yearAndsection = ? WHERE id = ?");
           
           ps.setString(1, f);
           ps.setString(2, m);
           ps.setString(3, l);
           ps.setString(4, e);
           ps.setString(5, c);
           ps.setString(6, y);
           ps.setString(7, idUp);
           
           int b = ps.executeUpdate();
           
           if(b == 1){
               JOptionPane.showMessageDialog(null,"Successfully Updated!!");
           }
           else{
               JOptionPane.showMessageDialog(null,"Not Updated!!");
           }
           
          
           showStudent();
           deleteShowStudent();
           
           
   
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_updateInfoBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        try
        {
            File file =  new File("D:\\jefferson\\bsit\\1c\\Filenew.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("username : " + "username1" + "\npassword : " + "password1" + "\nusername : " + "joemarie" + "\npassword : " + "joemarie123");
                
            JOptionPane.showMessageDialog(null,"Created");

            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
              
    }//GEN-LAST:event_submitBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       LibraryManagement lm = new LibraryManagement();
       lm.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addBooksBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField courseTxt1;
    private javax.swing.JToggleButton createBtn;
    private javax.swing.JToggleButton deleteBooksBtn;
    private javax.swing.JTextField deleteBookstxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JToggleButton deleteStudentBtn;
    private javax.swing.JTextField extensionTxt;
    private javax.swing.JTextField firstNameTxt1;
    private javax.swing.JToggleButton homeBtn;
    private javax.swing.JTextField idUpTxt2;
    private javax.swing.JTextField idUpTxt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField lastNameTxt2;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JToggleButton showBooksBtn;
    private javax.swing.JCheckBox showBox;
    private javax.swing.JToggleButton showStudentBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField titleUpTxt;
    private javax.swing.JTextField typeOfBooksTxt;
    private javax.swing.JTextField upCoursTxt1;
    private javax.swing.JTextField upExtensionNameTxt;
    private javax.swing.JTextField upFirstNameTxt1;
    private javax.swing.JTextField upLastNameTxt;
    private javax.swing.JTextField upMiddleNameTxt;
    private javax.swing.JTextField upYearAndSectionTxt;
    private javax.swing.JToggleButton updateBooksBtn;
    private javax.swing.JButton updateInfoBtn;
    private javax.swing.JToggleButton updateStudentBtn;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JTextField yearAndSectionTxt;
    // End of variables declaration//GEN-END:variables

    
}

