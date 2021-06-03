
package Forms;

import Classes.MyConnectionMSSQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SignInForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public SignInForm() {
        initComponents();
        conn = MyConnectionMSSQL.ConnectDB();
        this.setIconImage(new ImageIcon(getClass().getResource("Student Female_50px.png")).getImage());
        jLabel6.setVisible(false);
        showSystemVersion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmExit = new javax.swing.JDialog();
        jPanel32 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        jLabel141 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        startup = new javax.swing.JDialog();
        jPanel33 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        confirmExit.setUndecorated(true);
        confirmExit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(0, 102, 153));

        jLabel139.setBackground(new java.awt.Color(0, 102, 153));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel139.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel139.setOpaque(true);
        jLabel139.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel139MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel139MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel139MouseExited(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("Title");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        confirmExit.getContentPane().add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton42.setBackground(new java.awt.Color(255, 255, 255));
        jButton42.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton42.setForeground(new java.awt.Color(10, 102, 153));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton42.setText("Yes");
        jButton42.setContentAreaFilled(false);
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton42.setOpaque(true);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(0, 102, 153));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("Text goes here.");

        jButton43.setBackground(new java.awt.Color(255, 255, 255));
        jButton43.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton43.setForeground(new java.awt.Color(10, 102, 153));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton43.setText("No");
        jButton43.setContentAreaFilled(false);
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.setOpaque(true);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton42)
                .addGap(18, 18, 18)
                .addComponent(jButton43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel141)
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton42)
                    .addComponent(jButton43))
                .addGap(53, 53, 53))
        );

        confirmExit.getContentPane().add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        startup.setAlwaysOnTop(true);
        startup.setUndecorated(true);
        startup.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(0, 102, 153));

        jLabel142.setBackground(new java.awt.Color(0, 102, 153));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel142.setEnabled(false);
        jLabel142.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel142.setOpaque(true);

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("Title");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        startup.getContentPane().add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel144.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(0, 102, 153));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Text goes here.");

        jProgressBar1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel144)
                .addGap(63, 63, 63))
        );

        startup.getContentPane().add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hi there! :)");

        jTextField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField1.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username or Email Address");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPasswordField1.setCaretColor(new java.awt.Color(51, 51, 51));
        jPasswordField1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Right_25px.png"))); // NOI18N
        jButton1.setText("Log In");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Twitter_20px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 102, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Facebook_20px.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(10, 102, 153));
        jLabel11.setText("System Version:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("00.00.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 470));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Student Female_20px.png"))); // NOI18N
        jLabel3.setText("Student Information System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void auditLogIn() {
        try{
            LocalDateTime dateTime = LocalDateTime.now();
            String operation = "Successfully logged in.";
            String sql = "EXECUTE spAuditLogIn '"+jTextField1.getText()+"',"
                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', '"+operation+"'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public final void currentDateTime() {
        Thread c = new Thread(){
        @Override
            public void run(){
                for(;;){
//            String ttpattern = "HH:mm:ss";
//            SimpleDateFormat sdff = new SimpleDateFormat (ttpattern);
//            jLabel45.setText(sdff.format(new Date()));
                    try{
                        sleep(1000);
                    }catch(InterruptedException ex){
                        Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        c.start();
    }
    
    public void getUser() {
        try{
            String sql = "EXECUTE spLogIn '"+jTextField1.getText()+"', '"+jPasswordField1.getText()+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                showProgressBar();
                
                String username = rs.getString("Username");
                MainForm.jLabel20.setText(username);
                MainForm mf = new MainForm();
                mf.setVisible(true);
                this.dispose();
                auditLogIn();
                
                jTextField1.setText("");
                jPasswordField1.setText("");
            }else{
                jTextField1.setText("");
                jPasswordField1.setText("");
                
                jLabel6.setVisible(true);
                jLabel6.setText("Try again.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public final void loadProgressBar() {
        Thread c = new Thread(){
        @Override
        public void run(){
            for(int i = 20; i <=100; i++){
                    jProgressBar1.setValue(i);
                    try{
                        Thread.sleep(15);
                    }catch(InterruptedException ex){
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            startup.setVisible(false);
            }
        };
        c.start();
    }
    
    public void showConfirmExit() {
        confirmExit.pack();
        confirmExit.setLocationRelativeTo(this);
        confirmExit.setVisible(true);
        
        jLabel140.setText("Confirm Exit");
        jLabel141.setText("Are you sure you want to exit?");
    }
    
    public void showProgressBar() {
        MainForm mf = new MainForm();
        
        startup.pack();
        startup.setLocationRelativeTo(mf);
        startup.setVisible(true);
        
        jLabel143.setText("Startup");
        jLabel144.setText("Preparing your workstation...");
        
        loadProgressBar();
    }
    
    public void showSystemVersion(){
        try{
            String sql = "EXECUTE spViewSystemVersion";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String version = rs.getString(1);
                jLabel12.setText(version);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        showConfirmExit();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getUser();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jLabel6.setVisible(false);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        jLabel6.setVisible(false);
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel139MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel139MouseClicked
        confirmExit.setVisible(false);
    }//GEN-LAST:event_jLabel139MouseClicked

    private void jLabel139MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel139MouseEntered
        jLabel139.setBackground(Color.red);
    }//GEN-LAST:event_jLabel139MouseEntered

    private void jLabel139MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel139MouseExited
        jLabel139.setBackground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel139MouseExited

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        confirmExit.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        confirmExit.setVisible(false);
    }//GEN-LAST:event_jButton43ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog confirmExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog startup;
    // End of variables declaration//GEN-END:variables
}
