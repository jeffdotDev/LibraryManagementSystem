/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarycrud;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
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
        showBookCICT();
        hm();
        ed();
        bit();
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
            vec.add(rs.getString(8));
            vec.add(rs.getString(9));
            
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
            vec.add(rs.getString(8));
            vec.add(rs.getString(9));
            
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
            vec.add(rs.getString(8));
            vec.add(rs.getString(9));
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void showBookCICT(){
        try{
        DefaultTableModel det =  (DefaultTableModel) tableCICT.getModel();
        det.setRowCount(0);
        
        Statement s = con.createStatement();
        rs = s.executeQuery("SELECT * FROM cictbooks");
        
        while(rs.next()){
            Vector vec = new Vector();
            
            vec.add(rs.getString(1));
            vec.add(rs.getString(2));
            vec.add(rs.getString(3));
            vec.add(rs.getString(4));
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void hm(){
        try
        {
          DefaultTableModel def = (DefaultTableModel) hmTable.getModel();
          def.setRowCount(0);
          
          Statement s = con.createStatement();
          rs = s.executeQuery("SELECT * FROM hmbooks");
          
          while(rs.next())
          {
              Vector vec = new Vector();
            
              vec.add(rs.getString(1));
              vec.add(rs.getString(2));
              vec.add(rs.getString(3));
              vec.add(rs.getString(4));
              
              def.addRow(vec);
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void ed(){
        try
        {
          DefaultTableModel def = (DefaultTableModel) edTable.getModel();
          def.setRowCount(0);
          
          Statement s = con.createStatement();
          rs = s.executeQuery("SELECT * FROM edbooks");
          
          while(rs.next())
          {
              Vector vec = new Vector();
            
              vec.add(rs.getInt(1));
              vec.add(rs.getString(2));
              vec.add(rs.getString(3));
              vec.add(rs.getInt(4));
              
              def.addRow(vec);
          }
        }
        catch(Exception e)
        {
            System.out.println("ERROR occured!!" + e.getMessage());
        }
    }
    public void bit()
    {
        try
        {
          DefaultTableModel def = (DefaultTableModel) bitTable.getModel();
          def.setRowCount(0);
          
          Statement s = con.createStatement();
          rs = s.executeQuery("SELECT * FROM bitbooks");
          
          while(rs.next())
          {
              Vector vec = new Vector();
            
              vec.add(rs.getInt(1));
              vec.add(rs.getString(2));
              vec.add(rs.getString(3));
              vec.add(rs.getInt(4));
              
              def.addRow(vec);
              
          }
        }
        catch(Exception e)
        {
            System.out.println("ERROR occured!!" + e.getMessage());
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
        jButton1 = new javax.swing.JButton();
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
        tableCICT = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        idCICT = new javax.swing.JTextField();
        titleCICT = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        authorCICT = new javax.swing.JTextField();
        pagesCICT = new javax.swing.JTextField();
        deleteCICTbtn = new javax.swing.JButton();
        addCICTbtn = new javax.swing.JButton();
        updateCICTbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        hmTable = new javax.swing.JTable();
        idHM = new javax.swing.JTextField();
        addHMbtn = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        titleHM = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        authorsHM = new javax.swing.JTextField();
        pagesHM = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        updateHMbtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        titleEdFld = new javax.swing.JTextField();
        authorsEdFld = new javax.swing.JTextField();
        pagesEdFld = new javax.swing.JTextField();
        idEdFld = new javax.swing.JTextField();
        addEd = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        edTable = new javax.swing.JTable();
        updateEd = new javax.swing.JButton();
        deleteEd = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        idBitFld = new javax.swing.JTextField();
        authorsBitFld = new javax.swing.JTextField();
        pagesBitFld = new javax.swing.JTextField();
        titleBitFld = new javax.swing.JTextField();
        addBit = new javax.swing.JButton();
        deleteBit = new javax.swing.JButton();
        updateBit = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        bitTable = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        firsnameLabel1 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        middlenameLabel1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        extensionNameLable = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        yearAndsectionLabel = new javax.swing.JLabel();
        courseLabel1 = new javax.swing.JLabel();
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

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("showProfile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
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
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extensionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "FirstName", "MiddleName", "LastName", "ExtensionName", "Course", "Year&Section", "username", "password"
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "FirstName", "MiddleName", "LastName", "ExtensionName", "Course", "Year&Section", "username", "password"
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

        tableCICT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Title", "Author", "Pages"
            }
        ));
        jScrollPane4.setViewportView(tableCICT);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("ID :");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Title :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Author :");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Pages :");

        deleteCICTbtn.setText("Delete Books");
        deleteCICTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCICTbtnActionPerformed(evt);
            }
        });

        addCICTbtn.setText("Add Books");
        addCICTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCICTbtnActionPerformed(evt);
            }
        });

        updateCICTbtn.setText("Update Books");
        updateCICTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCICTbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteCICTbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCICTbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateCICTbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idCICT, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(titleCICT))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagesCICT))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(authorCICT, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCICT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorCICT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagesCICT)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleCICT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(addCICTbtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCICTbtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateCICTbtn))))
        );

        jTabbedPane1.addTab("tab7", jPanel4);

        hmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Title ", "Authors", "Pages"
            }
        ));
        jScrollPane5.setViewportView(hmTable);

        addHMbtn.setText("Add Books");
        addHMbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHMbtnActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Id :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Title :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Pages :");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Authors :");

        jButton3.setText("Delete Books");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        updateHMbtn.setText("Update Books");
        updateHMbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHMbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(addHMbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleHM, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(idHM)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(updateHMbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagesHM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorsHM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idHM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorsHM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(titleHM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagesHM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(addHMbtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(updateHMbtn)
                        .addGap(139, 139, 139))))
        );

        jTabbedPane1.addTab("tab8", jPanel5);

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Title");

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setText("Authors :");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel28.setText("ID :");

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setText("Pages :");

        pagesEdFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagesEdFldActionPerformed(evt);
            }
        });

        idEdFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEdFldActionPerformed(evt);
            }
        });

        addEd.setText("Add");
        addEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEdActionPerformed(evt);
            }
        });

        edTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Title", "Authors", "Pages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(edTable);

        updateEd.setText("Update");
        updateEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEdActionPerformed(evt);
            }
        });

        deleteEd.setText("Delete");
        deleteEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEdActionPerformed(evt);
            }
        });

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
                    .addComponent(idEdFld, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleEdFld, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(pagesEdFld, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorsEdFld, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateEd, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(addEd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteEd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(138, 138, 138)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(authorsEdFld)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idEdFld)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(titleEdFld)
                            .addComponent(pagesEdFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addEd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteEd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateEd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );

        jTabbedPane1.addTab("tab9", jPanel10);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("ID :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Pages  :");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Title :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Authors : ");

        addBit.setText("Add books");
        addBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBitActionPerformed(evt);
            }
        });

        deleteBit.setText("Delete Books");
        deleteBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBitActionPerformed(evt);
            }
        });

        updateBit.setText("Update Books ");
        updateBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBitActionPerformed(evt);
            }
        });

        bitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Title ", "Authors", "Pages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(bitTable);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(idBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel44))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorsBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagesBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteBit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorsBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagesBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleBitFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(addBit)
                        .addGap(30, 30, 30)
                        .addComponent(deleteBit)
                        .addGap(26, 26, 26)
                        .addComponent(updateBit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("tab9", jPanel11);

        jLabel45.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel45.setText("Id :");

        jLabel46.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel46.setText("Firstname :");

        jLabel47.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel47.setText("LastName:");

        jLabel48.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel48.setText("MiddleName :");

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel49.setText("Course :");

        jLabel50.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel50.setText("ExtensionName:");

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel51.setText("yearAnd section");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel46)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firsnameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middlenameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extensionNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearAndsectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(idLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(firsnameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(middlenameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extensionNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearAndsectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab10", jPanel12);

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

    private void pagesEdFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagesEdFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagesEdFldActionPerformed

    private void idEdFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEdFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEdFldActionPerformed

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
            String uname = usernameTxt.getText();
            String pname = passwordTxt.getText();
            
            ps = con.prepareStatement("INSERT INTO librarycrud (firstName,middleName,lastName,extensionName,course,yearAndsection,username,password)VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1,fname);
            ps.setString(2,mname);
            ps.setString(3,lname);
            ps.setString(4,extension);
            ps.setString(5,course);
            ps.setString(6,yearLevel);
            ps.setString(7, uname);
            ps.setString(8,pname);
            
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       LibraryManagement lm = new LibraryManagement();
       lm.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addCICTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCICTbtnActionPerformed
        try
        {
          int idBkC = Integer.parseInt(idCICT.getText());
          String titleBkC = titleCICT.getText();
          String authorBkC = authorCICT.getText();
          int pagesBkC = Integer.parseInt(pagesCICT.getText());
          
          ps = con.prepareStatement("INSERT INTO cictbooks (Id,Title,Authors,Pages) VALUES(?,?,?,?)");
          ps.setInt(1,idBkC);
          ps.setString(2,titleBkC );
          ps.setString(3,authorBkC );
          ps.setInt(4,pagesBkC);
          
          int c = ps.executeUpdate();
          
          if(c == 1)
          {
              JOptionPane.showMessageDialog(null,"Successfully added books for CICT!!","Message",JOptionPane.PLAIN_MESSAGE);
          }
          else
          {
              JOptionPane.showMessageDialog(null,"Not added books for CICT!!","Message",JOptionPane.ERROR_MESSAGE);
          }
          showBookCICT();
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
    }//GEN-LAST:event_addCICTbtnActionPerformed

    private void deleteCICTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCICTbtnActionPerformed
        try
        {
            int idBkCDelete = Integer.parseInt(idCICT.getText());
            
            ps = con.prepareStatement("DELETE FROM cictbooks WHERE Id = ? ");
            
            ps.setString(1,Integer.toString(idBkCDelete));
            
            int d = ps.executeUpdate();
            
            if(d == 1)
            {
               JOptionPane.showMessageDialog(null,"Successfully deleted books from CICT!!","Message",JOptionPane.PLAIN_MESSAGE); 
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Not deleted books for CICT!!","Message",JOptionPane.PLAIN_MESSAGE); 
            }
            showBookCICT();
            
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
    }//GEN-LAST:event_deleteCICTbtnActionPerformed

    private void updateCICTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCICTbtnActionPerformed
        try
        {
          int idBkCUp = Integer.parseInt(idCICT.getText());
          String titleBkCUp = titleCICT.getText();
          String authorBkCUp = authorCICT.getText();
          int pagesBkCUp = Integer.parseInt(pagesCICT.getText());
          
          ps = con.prepareStatement("UPDATE cictbooks set Title = ?,Authors = ?,Pages = ? WHERE Id = ?");
          ps.setString(1, titleBkCUp);
          ps.setString(2, authorBkCUp);
          ps.setInt(3,pagesBkCUp);
          ps.setInt(4, idBkCUp);
          
          int u = ps.executeUpdate();
          
          if(u == 1)
          {
             JOptionPane.showMessageDialog(null,"Successfully updated books from CICT!!","Message",JOptionPane.PLAIN_MESSAGE); 
          }
          else
          {
             JOptionPane.showMessageDialog(null,"Successfully updated books from CICT!!","Message",JOptionPane.PLAIN_MESSAGE); 
          }
          showBookCICT();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateCICTbtnActionPerformed

    private void addHMbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHMbtnActionPerformed
        try
        {
          int idHMBks = Integer.parseInt(idHM.getText());
          String titleHMBks = titleHM.getText();
          String authorsHMBks = authorsHM.getText();
          int pagesHMBks = Integer.parseInt(pagesHM.getText());
          
          ps = con.prepareStatement("INSERT INTO hmbooks (Id,Title,Authors,Pages) VALUES(?,?,?,?)");
          ps.setInt(1,idHMBks);
          ps.setString(2,titleHMBks );
          ps.setString(3,authorsHMBks);
          ps.setInt(4, pagesHMBks);
          
          int h = ps.executeUpdate();
          
          if(h == 1)
          {
              JOptionPane.showMessageDialog(null, "Successfully Added!!","Message",JOptionPane.PLAIN_MESSAGE);
              idHM.setText("");
              titleHM.setText("");
              authorsHM.setText("");
              pagesHM.setText("");
          }
          else
          {
             JOptionPane.showMessageDialog(null, "Not Added!!","Message",JOptionPane.ERROR_MESSAGE); 
          }
          
          hm();
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
    }//GEN-LAST:event_addHMbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
          int idDeleteBooks = Integer.parseInt(idHM.getText());
          
          ps = con.prepareStatement("DELETE FROM hmbooks WHERE Id = ?");
          ps.setInt(1,idDeleteBooks);
          
          int d = ps.executeUpdate();
          
          if(d == 1)
          {
              JOptionPane.showMessageDialog(null, "Successfully deleted!!","Message",JOptionPane.PLAIN_MESSAGE);
          }
          else
          {
            JOptionPane.showMessageDialog(null,"Not deleted!!","Message",JOptionPane.ERROR_MESSAGE);
          }
          
          hm();
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateHMbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHMbtnActionPerformed
        try
        {
          int idHUp = Integer.parseInt(idHM.getText());
          String titleHMUp = titleHM.getText();
          String authorsHMUp = authorsHM.getText();
          int pagesHMUp = Integer.parseInt(pagesHM.getText());
          
          ps = con.prepareStatement("UPDATE hmbooks set Title = ?, Authors = ?, Pages = ? WHERE Id = ?");
          ps.setString(1, titleHMUp);
          ps.setString(2,authorsHMUp);
          ps.setInt(3, pagesHMUp);
          ps.setInt(4,idHUp);
          
          int u = ps.executeUpdate();
          
          if(u == 1)
          {
              JOptionPane.showMessageDialog(null,"Successfully Update!!","Message",JOptionPane.PLAIN_MESSAGE);
          }
          else
          {
              JOptionPane.showMessageDialog(null,"Not update!!","Message",JOptionPane.ERROR_MESSAGE);
          }
          
          hm();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateHMbtnActionPerformed

    private void addBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBitActionPerformed
        try
        {
           int idBit = Integer.parseInt(idBitFld.getText());
           String titleBit = titleBitFld.getText();
           String authorsBit = authorsBitFld.getText();
           int  pagesBit = Integer.parseInt(pagesBitFld.getText());
           
           ps = con.prepareStatement("INSERT INTO bitbooks (Id,Title,Authors,Pages) VALUES(?,?,?,?)");
           ps.setInt(1, idBit);
           ps.setString(2, titleBit);
           ps.setString(3,authorsBit);
           ps.setInt(4, pagesBit);
           
           int b = ps.executeUpdate();
           
           if(b == 1)
           {
             JOptionPane.showMessageDialog(null,"Successfully added!!","Message",JOptionPane.PLAIN_MESSAGE);
             idBitFld.setText("");
             titleBitFld.setText("");
             authorsBitFld.setText("");
             pagesBitFld.setText("");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Not Added!!","Message",JOptionPane.ERROR_MESSAGE);
           }
           
           bit();
        }
        catch(Exception e)
        {
           System.out.println("ERROR occured!!" + e.getMessage()); 
        }
    }//GEN-LAST:event_addBitActionPerformed

    private void addEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEdActionPerformed
         try
        {
           int idEd = Integer.parseInt(idEdFld.getText());
           String titleEd = titleEdFld.getText();
           String authorsEd = authorsEdFld.getText();
           int pagesEd = Integer.parseInt(pagesEdFld.getText());
           
           ps = con.prepareStatement("INSERT INTO edbooks (Id,Title,Authors,Pages) VALUES(?,?,?,?)");
           ps.setInt(1, idEd);
           ps.setString(2,titleEd);
           ps.setString(3,authorsEd);
           ps.setInt(4,pagesEd);
           
           int e = ps.executeUpdate();
            
           if(e == 1)
           {
               JOptionPane.showMessageDialog(null,"Successfully ADDED!!","Message",JOptionPane.PLAIN_MESSAGE);
               idEdFld.setText("");
               titleEdFld.setText("");
               authorsEdFld.setText("");
               pagesEdFld.setText("");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Not Added!!","Message",JOptionPane.ERROR_MESSAGE);
           }
           
           ed();
        }
        catch(Exception e)
        {
           System.out.println("ERROR occured!!" + e.getMessage()); 
        }
    }//GEN-LAST:event_addEdActionPerformed

    private void deleteEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEdActionPerformed
       try
       {
           int idDeleteEd = Integer.parseInt(idEdFld.getText());
           
           ps = con.prepareStatement("DELETE FROM edbooks WHERE Id = ?");
           ps.setInt(1,idDeleteEd);
           
           int de = ps.executeUpdate();
           
           if(de == 1)
           {
            JOptionPane.showMessageDialog(null,"Successfully Deleted!!","Message",JOptionPane.PLAIN_MESSAGE);
           }
           else
           {
            JOptionPane.showMessageDialog(null,"Not Deleted!!","Message",JOptionPane.PLAIN_MESSAGE);   
           }
           
           ed();
       }
       catch(Exception e)
       {
           System.out.println("ERROR occured!!" + e.getMessage());
       }
    }//GEN-LAST:event_deleteEdActionPerformed

    private void updateEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEdActionPerformed
        try
        {
           int upId = Integer.parseInt(idEdFld.getText());
           String upTitle = titleEdFld.getText();
           String upAuthors = authorsEdFld.getText();
           int upPages = Integer.parseInt(pagesEdFld.getText());
           
           ps = con.prepareStatement("UPDATE edbooks set Title = ?, Authors = ?, Pages = ? WHERE Id = ?");
           ps.setString(1,upTitle);
           ps.setString(2,upAuthors);
           ps.setInt(3,upPages);
           ps.setInt(4, upId);
           
           int up = ps.executeUpdate();
           
           if(up == 1)
           {
            JOptionPane.showMessageDialog(null,"Successfully update!!","Message",JOptionPane.PLAIN_MESSAGE);
            
           }
           else
           {
            JOptionPane.showMessageDialog(null,"Not Update!!","Message",JOptionPane.ERROR_MESSAGE);   
           }
           
           ed();
        }
        catch(Exception e){
            System.out.println("ERROR occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_updateEdActionPerformed

    private void deleteBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBitActionPerformed
       try
       {
           int deleteBit = Integer.parseInt(idBitFld.getText());
           
           ps = con.prepareStatement("DELETE FROM bitbooks WHERE Id = ?");
           ps.setInt(1,deleteBit);
           
           int de = ps.executeUpdate();
           
           if(de == 1)
           {
               JOptionPane.showMessageDialog(null, "Successfully deleted!!","Message",JOptionPane.PLAIN_MESSAGE);
           }
           else
           {
             JOptionPane.showMessageDialog(null,"Not deleted!!","Message",JOptionPane.ERROR_MESSAGE);
           }
           bit();
       }
       catch(Exception e)
       {
          System.out.println("ERROR occured!!" + e.getMessage()); 
       }
    }//GEN-LAST:event_deleteBitActionPerformed

    private void updateBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBitActionPerformed
        try
        {
            int upId = Integer.parseInt(idBitFld.getText());
            String upTitle = titleBitFld.getText();
            String upAuthors = authorsBitFld.getText();
            int upPages = Integer.parseInt(pagesBitFld.getText());
            
            ps = con.prepareStatement("UPDATE bitBooks set Title = ?, Authors = ?, Pages = ? WHERE Id = ?");
            ps.setString(1, upTitle);
            ps.setString(2, upAuthors);
            ps.setInt(3, upPages);
            ps.setInt(4, upId);
            
            int up = ps.executeUpdate();
            
            if(up == 1)
            {
               JOptionPane.showMessageDialog(null,"Successfully Added!!","Message",JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Not Added!!","Message",JOptionPane.ERROR_MESSAGE);
            }
            
            bit();
            
        }
        catch(Exception e)
        {
           System.out.println("ERROR occured!!" + e.getMessage()); 
        }
    }//GEN-LAST:event_updateBitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try
        {
              jTabbedPane1.setSelectedIndex(9);
              
              
          
        }
        catch(Exception e)
        {
            System.out.println("ERROR occured!!" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBit;
    private javax.swing.JToggleButton addBooksBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addCICTbtn;
    private javax.swing.JButton addEd;
    private javax.swing.JButton addHMbtn;
    private javax.swing.JTextField authorCICT;
    private javax.swing.JTextField authorsBitFld;
    private javax.swing.JTextField authorsEdFld;
    private javax.swing.JTextField authorsHM;
    private javax.swing.JTable bitTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel courseLabel1;
    private javax.swing.JTextField courseTxt1;
    private javax.swing.JToggleButton createBtn;
    private javax.swing.JButton deleteBit;
    private javax.swing.JToggleButton deleteBooksBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteCICTbtn;
    private javax.swing.JButton deleteEd;
    private javax.swing.JToggleButton deleteStudentBtn;
    private javax.swing.JTable edTable;
    private javax.swing.JLabel extensionNameLable;
    private javax.swing.JTextField extensionTxt;
    private javax.swing.JLabel firsnameLabel1;
    private javax.swing.JTextField firstNameTxt1;
    private javax.swing.JTable hmTable;
    private javax.swing.JToggleButton homeBtn;
    private javax.swing.JTextField idBitFld;
    private javax.swing.JTextField idCICT;
    private javax.swing.JTextField idEdFld;
    private javax.swing.JTextField idHM;
    public javax.swing.JLabel idLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField lastNameTxt2;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JLabel middlenameLabel1;
    private javax.swing.JTextField pagesBitFld;
    private javax.swing.JTextField pagesCICT;
    private javax.swing.JTextField pagesEdFld;
    private javax.swing.JTextField pagesHM;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JToggleButton showBooksBtn;
    private javax.swing.JToggleButton showStudentBtn;
    private javax.swing.JTable tableCICT;
    private javax.swing.JTextField titleBitFld;
    private javax.swing.JTextField titleCICT;
    private javax.swing.JTextField titleEdFld;
    private javax.swing.JTextField titleHM;
    private javax.swing.JTextField upCoursTxt1;
    private javax.swing.JTextField upExtensionNameTxt;
    private javax.swing.JTextField upFirstNameTxt1;
    private javax.swing.JTextField upLastNameTxt;
    private javax.swing.JTextField upMiddleNameTxt;
    private javax.swing.JTextField upYearAndSectionTxt;
    private javax.swing.JButton updateBit;
    private javax.swing.JToggleButton updateBooksBtn;
    private javax.swing.JButton updateCICTbtn;
    private javax.swing.JButton updateEd;
    private javax.swing.JButton updateHMbtn;
    private javax.swing.JButton updateInfoBtn;
    private javax.swing.JToggleButton updateStudentBtn;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JTextField yearAndSectionTxt;
    private javax.swing.JLabel yearAndsectionLabel;
    // End of variables declaration//GEN-END:variables

    
}

