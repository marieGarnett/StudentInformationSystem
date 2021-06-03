
package Forms;

import AppPackage.AnimationClass;
import Classes.MyConnectionMSSQL;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

public class MainForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    AnimationClass ac = new AnimationClass();
    byte[] userPicture = null;
    int click = 0;
    
    public MainForm() {
        initComponents();
        conn = MyConnectionMSSQL.ConnectDB();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("Student Female_50px.png")).getImage());
        this.setTitle("Student Information System (SIS)");
        //setUserIcon();
        charts();
        comboBoxes();
        counters();
        currentDate();
        disabled();
        hidden();
        setUserInfo();
        tables();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCandidate = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        addCourse = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        addDepartment = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        checkUser = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        confirmExit = new javax.swing.JDialog();
        jPanel32 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        jLabel141 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        confirmLogout = new javax.swing.JDialog();
        jPanel30 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jButton35 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        editCandidate = new javax.swing.JDialog();
        jPanel42 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel44 = new javax.swing.JPanel();
        jTextField35 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel152 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jTextField44 = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel161 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLabel162 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jLabel163 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<>();
        jLabel164 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jTextField46 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        editCourse = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel84 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        editDepartment = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel62 = new javax.swing.JLabel();
        enrollCandidate = new javax.swing.JDialog();
        jPanel27 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        generalMessage = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        generalYesNo = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        loadBar = new javax.swing.JDialog();
        jPanel40 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        updateUsername = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        updatePassword = new javax.swing.JDialog();
        jPanel33 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        updatePicture = new javax.swing.JDialog();
        jPanel35 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        updateEmail = new javax.swing.JDialog();
        jPanel37 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PanelDashboard = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        PanelAdmissions = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jButton2 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jTextField24 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel47 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        PanelStudents = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jButton12 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel48 = new javax.swing.JPanel();
        PanelCourses = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jButton19 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jButton23 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jTextField25 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel49 = new javax.swing.JPanel();
        PanelUnits = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel146 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jTextField28 = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton45 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        } ;
        jPanel50 = new javax.swing.JPanel();
        PanelDepartments = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jButton11 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jTextField26 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel51 = new javax.swing.JPanel();
        PanelReports = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        PanelUser = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        PanelSettings = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();

        addCandidate.setAlwaysOnTop(true);
        addCandidate.setMinimumSize(new java.awt.Dimension(850, 600));
        addCandidate.setUndecorated(true);
        addCandidate.setResizable(false);
        addCandidate.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 102, 153));

        jLabel63.setBackground(new java.awt.Color(0, 102, 153));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel63.setOpaque(true);
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel63MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel63MouseExited(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Add Candidate");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addCandidate.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 102, 153));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton16.setText("Close");
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setOpaque(true);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 102, 153));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton17.setText("Save");
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setOpaque(true);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField1.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Surname*");

        jTextField2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField2.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 153));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Firstname*");

        jTextField3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField3.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 153));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Middlename*");

        jTextField4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField4.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 102, 153));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Birthplace*");

        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jDateChooser1.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jDateChooser1.setIcon(null);
        jDateChooser1.setMaxSelectableDate(new java.util.Date(-631175301000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(978282099000L));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 102, 153));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Birthdate*");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 102, 102));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField5.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 102, 153));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Age");

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setMaximumRowCount(3);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Male", "Female" }));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 102, 153));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Gender*");

        jTextField6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 102, 102));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField6.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 102, 153));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Street Address*");

        jTextField7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField7.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel43.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 102, 153));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("City/Municipality*");

        jTextField8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(102, 102, 102));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField8.setSelectionColor(new java.awt.Color(102, 102, 102));

        jTextField9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(102, 102, 102));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField9.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel44.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 102, 153));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Phone Number*");

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 102, 153));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("E-mail Address");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField8)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(92, 92, 92))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personal Information", jPanel18);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jTextField13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(102, 102, 102));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField13.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel65.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 102, 153));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Previous School Name*");

        jLabel66.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 102, 153));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("School Address");

        jTextField14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(102, 102, 102));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField14.setSelectionColor(new java.awt.Color(102, 102, 102));

        jComboBox8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox8.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006" }));

        jLabel67.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 102, 153));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Year Attended*");

        jComboBox9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox9.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006" }));

        jLabel69.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 102, 153));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("to");

        jComboBox2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jLabel47.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 102, 153));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Desired Course");

        jComboBox3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jLabel48.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 102, 153));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Year Level (?)");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField13)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField14)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(96, 96, 96))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Educational Background", jPanel14);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jTextField15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(102, 102, 102));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField15.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel68.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 102, 153));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Mothers' Name");

        jTextField16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(102, 102, 102));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField16.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel70.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 102, 153));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Fathers' Name");

        jTextField17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(102, 102, 102));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField17.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel71.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 102, 153));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Sibling/s (separated by comma/s)");

        jTextField18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(102, 102, 102));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField18.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel72.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 102, 153));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Guardian's Name*");

        jTextField19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(102, 102, 102));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField19.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel73.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 102, 153));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Address*");

        jTextField20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(102, 102, 102));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField20.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel74.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 102, 153));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Contact Number*");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField19)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField15)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addGap(18, 18, 18)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Family Background", jPanel19);

        jLabel149.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 102, 153));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setText("Please fill out the required fields marked with *.");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton17)
                        .addComponent(jLabel149)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addCandidate.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 850, 570));

        addCourse.setUndecorated(true);
        addCourse.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(0, 102, 153));

        jLabel75.setBackground(new java.awt.Color(0, 102, 153));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel75.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel75.setOpaque(true);
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel75MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel75MouseExited(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Add Course");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addCourse.getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 102, 153));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton20.setText("Close");
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setOpaque(true);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 102, 153));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton21.setText("Save");
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setOpaque(true);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 102, 153));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Department");

        jComboBox11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox11.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextArea3.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextArea3.setVerifyInputWhenFocusTarget(false);
        jScrollPane7.setViewportView(jTextArea3);

        jLabel78.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 102, 153));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("Description");

        jLabel77.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 102, 153));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Course Name");

        jTextField21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(102, 102, 102));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField21.setSelectionColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton20))
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap())
        );

        addCourse.getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, -1));

        addDepartment.setBackground(new java.awt.Color(255, 255, 255));
        addDepartment.setMinimumSize(new java.awt.Dimension(440, 250));
        addDepartment.setUndecorated(true);
        addDepartment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));

        jLabel46.setBackground(new java.awt.Color(0, 102, 153));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel46.setOpaque(true);
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Add Department");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addDepartment.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton5.setText("Save");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 102, 153));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Department Name");

        jTextField10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(102, 102, 102));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField10.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel51.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 102, 153));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextArea1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        addDepartment.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 240));

        checkUser.setUndecorated(true);
        checkUser.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Security check");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        checkUser.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 102));
        jButton7.setText("Close");
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 102, 153));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Please provide Administrator's Password");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 102, 102));
        jButton8.setText("OK");
        jButton8.setContentAreaFilled(false);
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPasswordField1.setSelectionColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        checkUser.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 270));

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

        confirmLogout.setUndecorated(true);
        confirmLogout.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(0, 102, 153));

        jLabel123.setBackground(new java.awt.Color(0, 102, 153));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel123.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel123.setOpaque(true);
        jLabel123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel123MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel123MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel123MouseExited(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Title");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        confirmLogout.getContentPane().add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton35.setBackground(new java.awt.Color(255, 255, 255));
        jButton35.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(10, 102, 153));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton35.setText("Yes");
        jButton35.setContentAreaFilled(false);
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.setOpaque(true);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(0, 102, 153));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("Text goes here.");

        jButton37.setBackground(new java.awt.Color(255, 255, 255));
        jButton37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton37.setForeground(new java.awt.Color(10, 102, 153));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton37.setText("No");
        jButton37.setContentAreaFilled(false);
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton37.setOpaque(true);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton35)
                .addGap(18, 18, 18)
                .addComponent(jButton37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel125)
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton35)
                    .addComponent(jButton37))
                .addGap(53, 53, 53))
        );

        confirmLogout.getContentPane().add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        editCandidate.setAlwaysOnTop(true);
        editCandidate.setUndecorated(true);
        editCandidate.setResizable(false);
        editCandidate.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(0, 102, 153));

        jLabel147.setBackground(new java.awt.Color(0, 102, 153));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel147.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel147.setOpaque(true);
        jLabel147.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel147MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel147MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel147MouseExited(evt);
            }
        });

        jLabel148.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Edit Candidate");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        editCandidate.getContentPane().add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 102, 153));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton18.setText("Close");
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setOpaque(true);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(255, 255, 255));
        jButton46.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton46.setForeground(new java.awt.Color(0, 102, 153));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton46.setText("Save");
        jButton46.setContentAreaFilled(false);
        jButton46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton46.setOpaque(true);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 102, 153));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jTextField35.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(102, 102, 102));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField35.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 153));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Fullname");

        jTextField38.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(102, 102, 102));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField38.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel151.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(0, 102, 153));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("Birthplace");

        jDateChooser2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jDateChooser2.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jDateChooser2.setIcon(null);
        jDateChooser2.setMaxSelectableDate(new java.util.Date(-631175301000L));
        jDateChooser2.setMinSelectableDate(new java.util.Date(978282099000L));

        jLabel152.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(0, 102, 153));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("Birthdate");

        jTextField39.setEditable(false);
        jTextField39.setBackground(new java.awt.Color(255, 255, 255));
        jTextField39.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(102, 102, 102));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField39.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel153.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(0, 102, 153));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("Age");

        jTextField40.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(102, 102, 102));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField40.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel155.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(0, 102, 153));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("Address");

        jTextField42.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(102, 102, 102));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField42.setSelectionColor(new java.awt.Color(102, 102, 102));

        jTextField43.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(102, 102, 102));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField43.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel157.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(0, 102, 153));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("Phone Number");

        jLabel158.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(0, 102, 153));
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel158.setText("E-mail Address");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField38)
                            .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(296, 296, 296))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField43)
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField42)
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151)
                    .addComponent(jLabel152))
                .addGap(18, 18, 18)
                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel153)
                .addGap(18, 18, 18)
                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel157)
                .addGap(18, 18, 18)
                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel158)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Personal Information", jPanel44);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        jTextField44.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(102, 102, 102));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField44.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel159.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(0, 102, 153));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setText("Previous School Name");

        jLabel160.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(0, 102, 153));
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setText("School Adress");

        jTextField45.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(102, 102, 102));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField45.setSelectionColor(new java.awt.Color(102, 102, 102));

        jComboBox18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006" }));

        jLabel161.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(0, 102, 153));
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("Year Attended");

        jComboBox19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox19.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006" }));

        jLabel162.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(0, 102, 153));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("to");

        jComboBox20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox20.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jLabel163.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(0, 102, 153));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("Desired Course");

        jComboBox21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox21.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jLabel164.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(0, 102, 153));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setText("Year Level");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox20, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField44)
                        .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField45)
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(100, 100, 100))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel159)
                .addGap(18, 18, 18)
                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel160)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel162))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel161)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel164))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel163)))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Education", jPanel45);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        jTextField46.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(102, 102, 102));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField46.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel165.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(0, 102, 153));
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("Mother's Name");

        jTextField47.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(102, 102, 102));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField47.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel166.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(0, 102, 153));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("Father's Name");

        jTextField48.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(102, 102, 102));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField48.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel167.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(0, 102, 153));
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("Sibling/s (separated by comma/s)");

        jTextField49.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(102, 102, 102));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField49.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel168.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(0, 102, 153));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("Guardian's Name");

        jTextField50.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(102, 102, 102));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField50.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel169.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(0, 102, 153));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("Guardian's Address");

        jTextField51.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(102, 102, 102));
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField51.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel170.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(0, 102, 153));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("Guardian's Contact Number");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField50)
                        .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField46)
                                .addComponent(jLabel165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField47)
                                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(98, 98, 98))
                        .addGroup(jPanel46Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel46Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField51)
                                .addComponent(jLabel170, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField48)
                            .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel165)
                .addGap(18, 18, 18)
                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel166)
                .addGap(18, 18, 18)
                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel167)
                .addGap(18, 18, 18)
                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel168)
                .addGap(18, 18, 18)
                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel169)
                .addGap(18, 18, 18)
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel170)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Family Background", jPanel46);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jButton46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton18)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18)
                    .addComponent(jButton46))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editCandidate.getContentPane().add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 850, 570));

        editCourse.setUndecorated(true);
        editCourse.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(0, 102, 153));

        jLabel80.setBackground(new java.awt.Color(0, 102, 153));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel80.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel80.setOpaque(true);
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel80MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel80MouseExited(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Edit Course");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        editCourse.getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 102, 153));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton24.setText("Close");
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setOpaque(true);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 102, 153));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton25.setText("Save");
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.setOpaque(true);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 102, 153));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Course Name");

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(102, 102, 102));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel83.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 102, 153));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Description");

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setBorder(null);
        jTextArea4.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextArea4.setVerifyInputWhenFocusTarget(false);
        jScrollPane8.setViewportView(jTextArea4);

        jLabel84.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 102, 153));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Department");

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(102, 102, 102));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setSelectionColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addComponent(jButton24))
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addGap(18, 18, 18)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editCourse.getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 340));

        editDepartment.setUndecorated(true);
        editDepartment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 102, 153));

        jLabel59.setBackground(new java.awt.Color(0, 102, 153));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel59.setOpaque(true);
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel59MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel59MouseExited(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Edit Department");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        editDepartment.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 102, 153));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton13.setText("Close");
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setOpaque(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 102, 153));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton14.setText("Save");
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setOpaque(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 102, 153));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Department Name");

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(102, 102, 102));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField12.setSelectionColor(new java.awt.Color(102, 102, 102));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextArea2.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextArea2.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel62.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 102, 153));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Description");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addComponent(jButton13))
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(33, 33, 33))
        );

        editDepartment.getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 270));

        enrollCandidate.setAlwaysOnTop(true);
        enrollCandidate.setUndecorated(true);
        enrollCandidate.setResizable(false);
        enrollCandidate.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(0, 102, 153));

        jLabel100.setBackground(new java.awt.Color(0, 102, 153));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel100.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel100.setOpaque(true);
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel100MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel100MouseExited(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Enroll Candidate");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 703, Short.MAX_VALUE)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        enrollCandidate.getContentPane().add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton30.setBackground(new java.awt.Color(255, 255, 255));
        jButton30.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(51, 51, 51));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton30.setText("Close");
        jButton30.setContentAreaFilled(false);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.setOpaque(true);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(51, 51, 51));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton31.setText("Save");
        jButton31.setContentAreaFilled(false);
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.setOpaque(true);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel102.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 102, 153));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Candidate Information");

        jLabel103.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 102, 153));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Name:");

        jLabel104.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("jLabel104");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel102))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel104)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102)
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel104))
                .addContainerGap(444, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jButton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 674, Short.MAX_VALUE)
                        .addComponent(jButton30))
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jButton31))
                .addContainerGap())
        );

        enrollCandidate.getContentPane().add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 850, 570));

        generalMessage.setAlwaysOnTop(true);
        generalMessage.setBackground(new java.awt.Color(255, 255, 255));
        generalMessage.setModal(true);
        generalMessage.setUndecorated(true);
        generalMessage.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 102, 153));

        jLabel55.setBackground(new java.awt.Color(0, 102, 153));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel55.setOpaque(true);
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel55MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel55MouseExited(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Title");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        generalMessage.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(10, 102, 153));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton9.setText("Close");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 102, 153));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Message goes here.");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton9)
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(53, 53, 53))
        );

        generalMessage.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        generalYesNo.setUndecorated(true);
        generalYesNo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 102, 153));

        jLabel117.setBackground(new java.awt.Color(0, 102, 153));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel117.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel117.setOpaque(true);
        jLabel117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel117MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel117MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel117MouseExited(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("Title");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        generalYesNo.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(10, 102, 153));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton22.setText("Yes");
        jButton22.setContentAreaFilled(false);
        jButton22.setOpaque(true);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 102, 153));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Text goes here.");

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton34.setForeground(new java.awt.Color(10, 102, 153));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Multiply_15px.png"))); // NOI18N
        jButton34.setText("No");
        jButton34.setContentAreaFilled(false);
        jButton34.setOpaque(true);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton22)
                .addGap(18, 18, 18)
                .addComponent(jButton34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel119)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(jButton34))
                .addGap(53, 53, 53))
        );

        generalYesNo.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        loadBar.setAlwaysOnTop(true);
        loadBar.setUndecorated(true);
        loadBar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(0, 102, 153));

        jLabel142.setBackground(new java.awt.Color(0, 102, 153));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel142.setEnabled(false);
        jLabel142.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel142.setOpaque(true);

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("Title");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loadBar.getContentPane().add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel144.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(0, 102, 153));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Text goes here.");

        jProgressBar1.setForeground(new java.awt.Color(51, 51, 51));
        jProgressBar1.setValue(70);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel144)
                .addGap(63, 63, 63))
        );

        loadBar.getContentPane().add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        updateUsername.setUndecorated(true);
        updateUsername.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(0, 102, 153));

        jLabel120.setBackground(new java.awt.Color(0, 102, 153));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel120.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel120.setOpaque(true);
        jLabel120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel120MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel120MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel120MouseExited(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Title");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        updateUsername.getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel122.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 102, 153));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("Text goes here.");

        jButton36.setBackground(new java.awt.Color(255, 255, 255));
        jButton36.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton36.setForeground(new java.awt.Color(10, 102, 153));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton36.setText("Ok");
        jButton36.setContentAreaFilled(false);
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton36.setOpaque(true);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jTextField27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(51, 51, 51));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField27.setSelectionColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122)
                .addGap(18, 18, 18)
                .addComponent(jButton36)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        updateUsername.getContentPane().add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 170));

        updatePassword.setUndecorated(true);
        updatePassword.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(0, 102, 153));

        jLabel126.setBackground(new java.awt.Color(0, 102, 153));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel126.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel126.setOpaque(true);
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel126MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel126MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel126MouseExited(evt);
            }
        });

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("Title");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        updatePassword.getContentPane().add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel128.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 102, 153));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("Text goes here.");

        jButton38.setBackground(new java.awt.Color(255, 255, 255));
        jButton38.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton38.setForeground(new java.awt.Color(10, 102, 153));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton38.setText("Ok");
        jButton38.setContentAreaFilled(false);
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.setOpaque(true);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jTextField29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(51, 51, 51));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField29.setSelectionColor(new java.awt.Color(102, 102, 102));

        jTextField30.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(51, 51, 51));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField30.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel129.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 102, 153));
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("Another text goes here.");

        jTextField31.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(51, 51, 51));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField31.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel130.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 102, 153));
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("Another text goes here.");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addComponent(jButton38)
                        .addGap(169, 169, 169))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel130)
                .addGap(18, 18, 18)
                .addComponent(jButton38)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        updatePassword.getContentPane().add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 300));

        updatePicture.setUndecorated(true);
        updatePicture.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(0, 102, 153));

        jLabel131.setBackground(new java.awt.Color(0, 102, 153));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel131.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel131.setOpaque(true);
        jLabel131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel131MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel131MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel131MouseExited(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Title");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        updatePicture.getContentPane().add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel133.setBackground(new java.awt.Color(204, 204, 204));
        jLabel133.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(51, 51, 51));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("Browse...");
        jLabel133.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel133.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel133MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel133MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel133MouseExited(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(255, 255, 255));
        jButton39.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton39.setForeground(new java.awt.Color(10, 102, 153));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton39.setText("Save");
        jButton39.setContentAreaFilled(false);
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton39.setOpaque(true);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(255, 255, 255));
        jButton40.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton40.setForeground(new java.awt.Color(10, 102, 153));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Erase_15px.png"))); // NOI18N
        jButton40.setText("Cancel");
        jButton40.setContentAreaFilled(false);
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton40.setOpaque(true);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(104, Short.MAX_VALUE))))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton39)
                    .addComponent(jButton40))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        updatePicture.getContentPane().add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 300));

        updateEmail.setUndecorated(true);
        updateEmail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(0, 102, 153));

        jLabel134.setBackground(new java.awt.Color(0, 102, 153));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete_20px.png"))); // NOI18N
        jLabel134.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel134.setOpaque(true);
        jLabel134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel134MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel134MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel134MouseExited(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Title");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        updateEmail.getContentPane().add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel136.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(0, 102, 153));
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("Text goes here.");

        jButton41.setBackground(new java.awt.Color(255, 255, 255));
        jButton41.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(10, 102, 153));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Checkmark_15px.png"))); // NOI18N
        jButton41.setText("Ok");
        jButton41.setContentAreaFilled(false);
        jButton41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton41.setOpaque(true);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jTextField32.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(51, 51, 51));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField32.setSelectionColor(new java.awt.Color(102, 102, 102));

        jTextField33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(51, 51, 51));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField33.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel137.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(0, 102, 153));
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("Another text goes here.");

        jTextField34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(51, 51, 51));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jTextField34.setSelectionColor(new java.awt.Color(102, 102, 102));

        jLabel138.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(0, 102, 153));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("Another text goes here.");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addComponent(jButton41)
                        .addGap(169, 169, 169))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel138)
                .addGap(18, 18, 18)
                .addComponent(jButton41)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        updateEmail.getContentPane().add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

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

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minus_20px.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Student Female_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("Student Information System (SIS)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu_25px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Combo Chart_30px.png"))); // NOI18N
        jLabel5.setToolTipText("Dashboard");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add Property_30px.png"))); // NOI18N
        jLabel8.setToolTipText("Admissions");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Person Male_30px.png"))); // NOI18N
        jLabel10.setToolTipText("Student Information");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 40, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Check_30px.png"))); // NOI18N
        jLabel11.setToolTipText("Degree Courses");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Return Book_30px.png"))); // NOI18N
        jLabel13.setToolTipText("Subject Units");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 40, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Org Unit_30px.png"))); // NOI18N
        jLabel15.setToolTipText("Departments");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search Property_30px.png"))); // NOI18N
        jLabel17.setToolTipText("Reports");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 40, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Happy_30px.png"))); // NOI18N
        jLabel19.setToolTipText("Me");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 40, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Settings 3_30px.png"))); // NOI18N
        jLabel21.setToolTipText("Settings");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 40, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 680));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Dashboard");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Admissions");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Student Information");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, 50));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Degree Courses");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 130, 50));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Subject Units");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 130, 50));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Departments");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 130, 50));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("System Reports");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 130, 50));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 130, 50));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Settings");
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 130, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());

        PanelDashboard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 153));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Snapshots");

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("00");
        jLabel85.setOpaque(true);

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 102, 153));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Candidates");
        jLabel86.setOpaque(true);

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(102, 102, 102));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("00");
        jLabel87.setOpaque(true);

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 102, 153));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Students");
        jLabel88.setOpaque(true);

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 102, 102));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("00");
        jLabel89.setOpaque(true);

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 102, 153));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Short Courses");
        jLabel90.setOpaque(true);

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 102, 153));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Bachelors' Degree");
        jLabel91.setOpaque(true);

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(102, 102, 102));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("00");
        jLabel92.setOpaque(true);

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("00");
        jLabel93.setOpaque(true);

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 102, 153));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Description");
        jLabel94.setOpaque(true);

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(102, 102, 102));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("00");
        jLabel95.setOpaque(true);

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 102, 153));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Description");
        jLabel96.setOpaque(true);

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(null);
        jScrollPane9.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setForeground(new java.awt.Color(102, 102, 102));
        jPanel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jPanel52.setPreferredSize(new java.awt.Dimension(350, 300));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel54.setPreferredSize(new java.awt.Dimension(350, 300));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel55.setPreferredSize(new java.awt.Dimension(350, 300));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel26);

        javax.swing.GroupLayout PanelDashboardLayout = new javax.swing.GroupLayout(PanelDashboard);
        PanelDashboard.setLayout(PanelDashboardLayout);
        PanelDashboardLayout.setHorizontalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelDashboardLayout.setVerticalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel86)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(PanelDashboard, "card2");

        PanelAdmissions.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus Math_15px.png"))); // NOI18N
        jButton1.setText("Add new");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 153));
        jLabel35.setText("Select Candidate:");

        jComboBox7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTable3.setForeground(new java.awt.Color(51, 51, 51));
        jTable3.getTableHeader().setOpaque(false);
        jTable3.getTableHeader().setBackground(new java.awt.Color(0, 102, 153));
        jTable3.getTableHeader().setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
        jTable3.getTableHeader().setForeground(Color.white);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(204, 204, 204));
        jTable3.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_15px.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 102, 153));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Process_15px.png"))); // NOI18N
        jButton15.setText("Process");
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setEnabled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 102, 153));
        jLabel97.setText("Search by:");

        jComboBox12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Student No.", "Lastname", "Firstname", "Middlename", "Gender", "Desired Course" }));

        jTextField24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(51, 51, 51));

        jButton26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 102, 153));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_15px.png"))); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admission Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        jLabel150.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(0, 102, 153));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel150.setText("Name:");

        jLabel154.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(51, 51, 51));

        jLabel156.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(0, 102, 153));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel156.setText("Birth Date:");

        jLabel171.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(51, 51, 51));
        jLabel171.setText("jLabel171");

        jLabel172.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(0, 102, 153));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel172.setText("Birthplace:");

        jLabel173.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(51, 51, 51));
        jLabel173.setText("jLabel173");

        jLabel174.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(0, 102, 153));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel174.setText("Age:");

        jLabel175.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(51, 51, 51));
        jLabel175.setText("jLabel175");

        jLabel176.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(0, 102, 153));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel176.setText("Gender:");

        jLabel177.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(51, 51, 51));
        jLabel177.setText("jLabel177");

        jLabel178.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(0, 102, 153));
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel178.setText("Full Address:");

        jLabel179.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(51, 51, 51));
        jLabel179.setText("jLabel179");

        jLabel180.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(0, 102, 153));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel180.setText("Phone Number:");

        jLabel181.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(51, 51, 51));
        jLabel181.setText("jLabel181");

        jLabel182.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(0, 102, 153));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel182.setText("E-mail Address:");

        jLabel183.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(51, 51, 51));
        jLabel183.setText("jLabel183");

        jLabel184.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(0, 102, 153));
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel184.setText("Previous School:");

        jLabel185.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(51, 51, 51));
        jLabel185.setText("jLabel185");

        jLabel186.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(0, 102, 153));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel186.setText("School Address:");

        jLabel187.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(51, 51, 51));
        jLabel187.setText("jLabel187");

        jLabel188.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(0, 102, 153));
        jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel188.setText("Year Attended:");

        jLabel189.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(51, 51, 51));
        jLabel189.setText("jLabel189");

        jLabel190.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(0, 102, 153));
        jLabel190.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel190.setText("Mother's Name:");

        jLabel191.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(51, 51, 51));
        jLabel191.setText("jLabel191");

        jLabel192.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(0, 102, 153));
        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel192.setText("Father's Name:");

        jLabel193.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(51, 51, 51));
        jLabel193.setText("jLabel193");

        jLabel194.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(0, 102, 153));
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel194.setText("Sibling/s:");

        jLabel195.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(51, 51, 51));
        jLabel195.setText("jLabel195");

        jLabel196.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(0, 102, 153));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel196.setText("Guardian's Name:");

        jLabel197.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(51, 51, 51));
        jLabel197.setText("jLabel197");

        jLabel198.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(0, 102, 153));
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel198.setText("Address:");

        jLabel199.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(51, 51, 51));
        jLabel199.setText("jLabel199");

        jLabel200.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(0, 102, 153));
        jLabel200.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel200.setText("Contact Number:");

        jLabel201.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(51, 51, 51));
        jLabel201.setText("jLabel201");

        jLabel202.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(0, 102, 153));
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel202.setText("Desired Course:");

        jLabel203.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(51, 51, 51));

        jLabel204.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(0, 102, 153));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel204.setText("Year Level:");

        jLabel205.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(51, 51, 51));
        jLabel205.setText("jLabel205");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel191)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel196, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel192, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel194, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel47Layout.createSequentialGroup()
                                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel47Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel199)
                                                        .addComponent(jLabel195)
                                                        .addComponent(jLabel193)
                                                        .addComponent(jLabel197)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                                                    .addGap(7, 7, 7)
                                                    .addComponent(jLabel201)))
                                            .addGroup(jPanel47Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabel205)))
                                        .addGap(0, 191, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel186, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel184, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel156, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel172, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel174, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel176, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel180, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel150, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel182, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel189)
                                    .addComponent(jLabel187)
                                    .addComponent(jLabel185)
                                    .addComponent(jLabel183)
                                    .addComponent(jLabel181)
                                    .addComponent(jLabel179)
                                    .addComponent(jLabel177)
                                    .addComponent(jLabel175)
                                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
                        .addGap(103, 103, 103))))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel150)
                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel156)
                    .addComponent(jLabel171))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel172)
                    .addComponent(jLabel173))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel174)
                    .addComponent(jLabel175))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel176)
                    .addComponent(jLabel177))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel178)
                    .addComponent(jLabel179))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel180)
                    .addComponent(jLabel181))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel182)
                    .addComponent(jLabel183))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel184)
                    .addComponent(jLabel185))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel186)
                    .addComponent(jLabel187))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel188)
                    .addComponent(jLabel189))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel190)
                    .addComponent(jLabel191))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel192)
                    .addComponent(jLabel193))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel194)
                    .addComponent(jLabel195))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel196)
                    .addComponent(jLabel197))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel198)
                    .addComponent(jLabel199))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel200)
                    .addComponent(jLabel201))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel204)
                    .addComponent(jLabel205))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAdmissionsLayout = new javax.swing.GroupLayout(PanelAdmissions);
        PanelAdmissions.setLayout(PanelAdmissionsLayout);
        PanelAdmissionsLayout.setHorizontalGroup(
            PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdmissionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdmissionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdmissionsLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26))
                    .addGroup(PanelAdmissionsLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelAdmissionsLayout.setVerticalGroup(
            PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdmissionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel97)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdmissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton15))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        jPanel4.add(PanelAdmissions, "card3");

        PanelStudents.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 153));
        jLabel28.setText("Select Student:");

        jComboBox5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jLabel58.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 102, 153));
        jLabel58.setText("Search by:");

        jComboBox6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Student No.", "Lastname", "Firstname" }));

        jTextField11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 51, 51));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 102, 153));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus Math_15px.png"))); // NOI18N
        jButton10.setText("Add new");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setOpaque(true);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new java.awt.Color(0, 102, 153));
        jTable2.getTableHeader().setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
        jTable2.getTableHeader().setForeground(Color.white);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 102, 153));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_15px.png"))); // NOI18N
        jButton12.setText("Edit");
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setOpaque(true);

        jButton27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 102, 153));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_15px.png"))); // NOI18N

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelStudentsLayout = new javax.swing.GroupLayout(PanelStudents);
        PanelStudents.setLayout(PanelStudentsLayout);
        PanelStudentsLayout.setHorizontalGroup(
            PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStudentsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelStudentsLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27))
                    .addGroup(PanelStudentsLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelStudentsLayout.setVerticalGroup(
            PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField11)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12)
                    .addComponent(jButton10)
                    .addComponent(jSeparator3))
                .addContainerGap())
        );

        jPanel4.add(PanelStudents, "card4");

        PanelCourses.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 153));
        jLabel29.setText("Select Course:");

        jComboBox10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 102, 153));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus Math_15px.png"))); // NOI18N
        jButton19.setText("Add new");
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setOpaque(true);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTable4.setForeground(new java.awt.Color(51, 51, 51));
        jTable4.getTableHeader().setOpaque(false);
        jTable4.getTableHeader().setBackground(new java.awt.Color(0, 102, 153));
        jTable4.getTableHeader().setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
        jTable4.getTableHeader().setForeground(Color.white
        );
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setGridColor(new java.awt.Color(204, 204, 204));
        jTable4.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 102, 153));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_15px.png"))); // NOI18N
        jButton23.setText("Edit");
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.setEnabled(false);
        jButton23.setOpaque(true);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 102, 153));
        jLabel98.setText("Search by:");

        jComboBox13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Student No.", "Lastname", "Firstname" }));

        jTextField25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(51, 51, 51));

        jButton28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 102, 153));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_15px.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCoursesLayout = new javax.swing.GroupLayout(PanelCourses);
        PanelCourses.setLayout(PanelCoursesLayout);
        PanelCoursesLayout.setHorizontalGroup(
            PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoursesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCoursesLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCoursesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCoursesLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelCoursesLayout.setVerticalGroup(
            PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoursesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel98)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton23)
                    .addComponent(jButton19)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        jPanel4.add(PanelCourses, "card5");

        PanelUnits.setBackground(new java.awt.Color(255, 255, 255));

        jLabel145.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(0, 102, 153));
        jLabel145.setText("Select Subject:");

        jComboBox15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox15.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jLabel146.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(0, 102, 153));
        jLabel146.setText("Search by:");

        jComboBox16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Student No.", "Lastname", "Firstname" }));

        jTextField28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(51, 51, 51));

        jButton32.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 102, 153));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_15px.png"))); // NOI18N

        jButton44.setBackground(new java.awt.Color(255, 255, 255));
        jButton44.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(0, 102, 153));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_15px.png"))); // NOI18N
        jButton44.setText("Edit");
        jButton44.setContentAreaFilled(false);
        jButton44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton44.setEnabled(false);
        jButton44.setOpaque(true);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton45.setBackground(new java.awt.Color(255, 255, 255));
        jButton45.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton45.setForeground(new java.awt.Color(0, 102, 153));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus Math_15px.png"))); // NOI18N
        jButton45.setText("Add new");
        jButton45.setContentAreaFilled(false);
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.setOpaque(true);

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.setGridColor(new java.awt.Color(204, 204, 204));

        jTable5.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane11.setViewportView(jTable5);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelUnitsLayout = new javax.swing.GroupLayout(PanelUnits);
        PanelUnits.setLayout(PanelUnitsLayout);
        PanelUnitsLayout.setHorizontalGroup(
            PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUnitsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUnitsLayout.createSequentialGroup()
                        .addComponent(jLabel145)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addComponent(jLabel146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUnitsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelUnitsLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelUnitsLayout.setVerticalGroup(
            PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUnitsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel145)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel146)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45)
                    .addGroup(PanelUnitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton44)
                        .addComponent(jSeparator5)))
                .addContainerGap())
        );

        jPanel4.add(PanelUnits, "card6");

        PanelDepartments.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 153));
        jLabel31.setText("Select Department:");

        jComboBox4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus Math_15px.png"))); // NOI18N
        jButton3.setText("Add new");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(0, 102, 153));
        jTable1.getTableHeader().setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
        jTable1.getTableHeader().setForeground(Color.white);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 153));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_15px.png"))); // NOI18N
        jButton11.setText("Edit");
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setEnabled(false);
        jButton11.setMaximumSize(new java.awt.Dimension(55, 29));
        jButton11.setMinimumSize(new java.awt.Dimension(55, 29));
        jButton11.setOpaque(true);
        jButton11.setPreferredSize(new java.awt.Dimension(99, 29));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 102, 153));
        jLabel99.setText("Search by:");

        jComboBox14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Student No.", "Lastname", "Firstname" }));

        jTextField26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(51, 51, 51));

        jButton29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 102, 153));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_15px.png"))); // NOI18N

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelDepartmentsLayout = new javax.swing.GroupLayout(PanelDepartments);
        PanelDepartments.setLayout(PanelDepartmentsLayout);
        PanelDepartmentsLayout.setHorizontalGroup(
            PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDepartmentsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDepartmentsLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29))
                    .addGroup(PanelDepartmentsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDepartmentsLayout.setVerticalGroup(
            PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel99)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );

        jPanel4.add(PanelDepartments, "card7");

        PanelReports.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setText("Reports");

        javax.swing.GroupLayout PanelReportsLayout = new javax.swing.GroupLayout(PanelReports);
        PanelReports.setLayout(PanelReportsLayout);
        PanelReportsLayout.setHorizontalGroup(
            PanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelReportsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelReportsLayout.setVerticalGroup(
            PanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelReportsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(PanelReports, "card8");

        PanelUser.setBackground(new java.awt.Color(255, 255, 255));

        jLabel108.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(10, 102, 153));
        jLabel108.setText("Fullname");

        jLabel109.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Email");

        jLabel110.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(51, 51, 51));
        jLabel110.setText("User Type");

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(10, 102, 153));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit_15px.png"))); // NOI18N
        jButton33.setText("Logout");
        jButton33.setBorder(null);
        jButton33.setContentAreaFilled(false);
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(10, 102, 153));
        jLabel33.setText("Tasks:");

        jLabel111.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(51, 51, 51));
        jLabel111.setText("Change your Username");
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel111MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel111MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel111MouseExited(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
        jLabel112.setText("Change/Add Profile Picture");
        jLabel112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel112MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel112MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel112MouseExited(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
        jLabel113.setText("Change your Password");
        jLabel113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel113MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel113MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel113MouseExited(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
        jLabel114.setText("Change your Email");
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel114MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel114MouseExited(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(51, 51, 51));
        jLabel115.setText("Change Priviledges");
        jLabel115.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel115.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel115MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel115MouseExited(evt);
            }
        });

        jLabel116.setBackground(new java.awt.Color(255, 255, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add Image_50px.png"))); // NOI18N
        jLabel116.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel116.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel116.setOpaque(true);

        javax.swing.GroupLayout PanelUserLayout = new javax.swing.GroupLayout(PanelUser);
        PanelUser.setLayout(PanelUserLayout);
        PanelUserLayout.setHorizontalGroup(
            PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 765, Short.MAX_VALUE)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        PanelUserLayout.setVerticalGroup(
            PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addGap(47, 47, 47)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel111)
                .addGap(18, 18, 18)
                .addComponent(jLabel112)
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addGap(18, 18, 18)
                .addComponent(jLabel114)
                .addGap(18, 18, 18)
                .addComponent(jLabel115)
                .addGap(86, 86, 86))
        );

        jPanel4.add(PanelUser, "card9");

        PanelSettings.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setText("Settings");

        javax.swing.GroupLayout PanelSettingsLayout = new javax.swing.GroupLayout(PanelSettings);
        PanelSettings.setLayout(PanelSettingsLayout);
        PanelSettingsLayout.setHorizontalGroup(
            PanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSettingsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel34)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelSettingsLayout.setVerticalGroup(
            PanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSettingsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel34)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(PanelSettings, "card10");
        jPanel4.add(jScrollPane10, "card11");

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1310, 680));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Forward_15px.png"))); // NOI18N
        jLabel23.setText("Dashboard");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Forward_15px.png"))); // NOI18N
        jLabel24.setText("Navigation 1");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 140, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Forward_15px.png"))); // NOI18N
        jLabel25.setText("Navigation 2");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 100, 40));

        jLabel105.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 102, 102));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Overtime_15px.png"))); // NOI18N
        jLabel105.setText("September 30, 2000");
        jLabel105.setToolTipText("");
        jLabel105.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel105.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 140, 40));

        jLabel106.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(102, 102, 102));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel106.setText("00:00 AM");
        jLabel106.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 60, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addDepartment() {
        String department = jTextField10.getText();
        String description = jTextArea1.getText();
        String username = jLabel20.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        if("".equals(department) || "".equals(description)){
            generalMessage.pack();
            generalMessage.setLocationRelativeTo(this);
            generalMessage.setVisible(true);
            
            jLabel56.setText("Attention!");
            jLabel57.setText("Please complete and enter valid entries.");
        }else{
            try{
                String sql = "EXECUTE spAddDepartment '"+department+"', '"+description+"'";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                
                jLabel56.setText("Success");
                jLabel57.setText("Saved!");
                showMessage();
                
                jTextField10.setText("");
                jTextArea1.setText("");
                
                addDepartment.setVisible(false);
                systemRefresh();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    String sql = "EXECUTE spAuditDepartment '"+username+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'added',"
                            + "'"+department+"'";
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }
    
    public void addCandidate() { //Add checking weather all necessary fields has value... (Might be too hard...)
        String surname = jTextField1.getText();        String firstname = jTextField2.getText();
        String middlename = jTextField3.getText();
        String birthdate = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String birthplace = jTextField4.getText();        String gender = jComboBox1.getSelectedItem().toString();
        String streetAdd = jTextField6.getText();        String cityAdd = jTextField7.getText();
        String phone = jTextField8.getText();        String email = jTextField9.getText();
        String prevSchool = jTextField13.getText();        String schoolAdd = jTextField14.getText();
        String desiredCourse =  jComboBox2.getSelectedItem().toString();
        String yearFrom = jComboBox8.getSelectedItem().toString();
        String yearTo = jComboBox9.getSelectedItem().toString();
        String yearLevel = jComboBox3.getSelectedItem().toString();
        String mother = jTextField15.getText();        String father = jTextField16.getText();
        String sibling = jTextField17.getText();        String guardian = jTextField18.getText();
        String guardianAdd = jTextField19.getText();        String guardianPhone = jTextField20.getText();
        String username = jLabel20.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        try{
            String sql = "EXECUTE spAddCandidate '"+surname+"', '"+firstname+"', '"+middlename+"', '"+birthdate+"',"
                    + "'"+birthplace+"', '"+gender+"', '"+streetAdd+"', '"+cityAdd+"', '"+phone+"', '"+email+"', '"+prevSchool+"',"
                    + "'"+schoolAdd+"', '"+desiredCourse+"', '"+yearFrom+"', '"+yearTo+"', '"+yearLevel+"', '"+mother+"',"
                    + "'"+father+"', '"+sibling+"', '"+guardian+"', '"+guardianAdd+"', '"+guardianPhone+"'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            jLabel56.setText("Success");
            jLabel57.setText("Saved!");
            showMessage();
            addCandidate.setVisible(false);
            clearAddCandidate();
            systemRefresh();
            try{
                String sql1 = "EXECUTE spAuditCandidate '"+username+"', '"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                        + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'added', '"+surname+"', '"+firstname+"'";
                pst = conn.prepareStatement(sql1);
                pst.executeUpdate();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addCourse() {
        String course = jTextField21.getText();
        String description = jTextArea3.getText();
        String department = jComboBox11.getSelectedItem().toString();
        String username = jLabel20.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        if("".equals(course) || "".equals(description) || "Choose...".equals(department)){
            generalMessage.pack();
            generalMessage.setLocationRelativeTo(this);
            generalMessage.setVisible(true);
            
            jLabel56.setText("Attention!");
            jLabel57.setText("Please complete and enter valid entries.");
        }else{
            try{
                String sql = "EXECUTE spAddCourse '"+department+"', '"+course+"', '"+description+"'";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                
                jLabel56.setText("Success");
                jLabel57.setText("Saved!");
                showMessage();
                
                addCourse.setVisible(false);
                clearAddCourse();
                systemRefresh();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    String sql = "EXECUTE spAuditCourse '"+username+"', '"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                            + " '"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'added', '"+course+"'";
                    pst = conn.prepareCall(sql);
                    pst.executeUpdate();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }
    
    public void auditAppClosed(){
        String fullname = jLabel108.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        try{
            String sql = "EXECUTE spAuditAppClosed '"+fullname+"', '"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'closed the app.'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void browsePicture() {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel133.getWidth(), jLabel133.getHeight(), Image.SCALE_DEFAULT));
        jLabel133.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int number;(number = fix.read(buf))!= -1;){
                bos.write(buf,0,number);
            }
            userPicture = bos.toByteArray();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void charts() {
        pieChartAdmissions();
        pieChartStudents();
    }
    
    public void clearAddCandidate() {
        jTextField1.setText("");        jTextField2.setText("");
        jTextField3.setText("");
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
        jTextField4.setText("");        jComboBox1.setSelectedIndex(0);
        jTextField6.setText("");        jTextField7.setText("");
        jTextField8.setText("");        jTextField9.setText("");
        jTextField13.setText("");        jTextField14.setText("");
        jComboBox2.setSelectedIndex(0);        jComboBox8.setSelectedIndex(0);
        jComboBox9.setSelectedIndex(0);        jComboBox3.setSelectedIndex(0);
        jTextField15.setText("");        jTextField16.setText("");
        jTextField17.setText("");        jTextField18.setText("");
        jTextField19.setText("");        jTextField20.setText("");
    }
    
    public void clearAddCourse() {
        jTextField21.setText("");
        jTextArea3.setText("");
        jComboBox11.setSelectedIndex(0);
    }
    
    public void clearEditCandidate(){
        jTextField35.setText("");        jTextField38.setText("");
        jTextField39.setText("");        jTextField40.setText("");
        jTextField42.setText("");        jTextField43.setText("");
        jTextField44.setText("");        jTextField45.setText("");
        jTextField46.setText("");        jTextField47.setText("");
        jTextField48.setText("");        jTextField49.setText("");
        jTextField50.setText("");        jTextField51.setText("");
        
        jDateChooser2.setDate(null);
        jComboBox18.setSelectedIndex(0);
        jComboBox19.setSelectedIndex(0);
        jComboBox20.setSelectedIndex(0);
        jComboBox21.setSelectedIndex(0);
    }
    
    public final void comboBoxes() {
        showDepartmentList();
        showCourseList();
        showCandidateList();
    }
    
    public final void counters() {
        countCandidates();
        countShortCourses();
        countBachelorCourses();
        countStudents();
    }
    
    public void countCandidates() {
        try{
            //String sql = "EXECUTE fnCountAdmissions";
            String sql = "SELECT COUNT(Admission_ID) FROM admission WHERE IsEnrolled = CONVERT(bit, 0)";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int admission = rs.getInt(1);
                if(admission==1){
                    jLabel85.setText(Integer.toString(admission));
                    jLabel86.setText("Candidate");
                }else{
                    jLabel85.setText(Integer.toString(admission));
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void countStudents() {
        try{
            String sql = "SELECT COUNT(Student_ID) FROM student WHERE IsActive = CONVERT(bit, 1)";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int students = rs.getInt(1);
                if(students==1){
                    jLabel87.setText(Integer.toString(students));
                    jLabel88.setText("Student");
                }else{
                    jLabel87.setText(Integer.toString(students));
                }
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void countShortCourses() {
        try{
            String sql = "SELECT COUNT(Course_ID) FROM course WHERE Interval = 2";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String shortCourse = rs.getString(1);
                jLabel89.setText(shortCourse);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void countBachelorCourses() {
        try{
            String sql = "SELECT COUNT(Course_ID) FROM course WHERE Interval = 4";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String shortCourse = rs.getString(1);
                jLabel92.setText(shortCourse);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public final void currentDate() {
        Thread c = new Thread(){
            @Override
            public void run(){
                for(;;){
                    String dpattern = "MMMM dd, YYYY";
                    SimpleDateFormat dsdf = new SimpleDateFormat (dpattern);
                    jLabel105.setText(dsdf.format(new Date()));
                    String tpattern = "hh:mm a";
                    SimpleDateFormat sdf = new SimpleDateFormat (tpattern);
                    jLabel106.setText(sdf.format(new Date()));
                    try {
                        sleep(1000);
                    }
                    catch(InterruptedException ex){
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        c.start();
    }

    public void disabled(){
        //for editCandidate Dialogue box
        jTextField35.setEnabled(false);        jTextField44.setEnabled(false);
        jTextField45.setEnabled(false);        jTextField46.setEnabled(false);
        jTextField47.setEnabled(false);        jTextField48.setEnabled(false);
        jDateChooser2.setEnabled(false);
        jComboBox18.setEnabled(false);
        jComboBox19.setEnabled(false);
    }
    
    public void enrollCandidate(){
        String fullname = jLabel104.getText();
        try{
            String sql = "EXECUTE spAddStudent '"+fullname+"'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
            jLabel56.setText("Success");
            jLabel57.setText("Saved!");
            showMessage();
            
            enrollCandidate.setVisible(false);
            systemRefresh();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void hidden() {
        jLabel6.setVisible(false);        jLabel7.setVisible(false);
        jLabel9.setVisible(false);        jLabel12.setVisible(false);
        jLabel14.setVisible(false);        jLabel16.setVisible(false);
        jLabel18.setVisible(false);        jLabel20.setVisible(false);
        jLabel22.setVisible(false);        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
    }
    
    public final void loadProgressBar() {
        Thread c = new Thread(){
            @Override
            public void run(){
                for(int i = 70; i <=100; i++){
                    jProgressBar1.setValue(i);
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException ex){
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                loadBar.setVisible(false);
                confirmLogout.setVisible(false);
            
                SignInForm sf = new SignInForm();
                sf.setVisible(true);
            }
        };
        c.start();
    }
    
    public void logoutUser() {
        LocalDateTime dateTime = LocalDateTime.now();
        String operation = "Successfully logged out.";
        try{
            String sql = "EXECUTE spAuditLogOut '"+jLabel20.getText()+"',"
                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', '"+operation+"'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        showLoadBar();
    }
    
    public void minimize() {
        ac.jLabelXLeft(51, 0, 5, 1, jLabel6);        ac.jLabelXLeft(51, 0, 5, 1, jLabel7);
        ac.jLabelXLeft(51, 0, 5, 1, jLabel9);        ac.jLabelXLeft(51, 0, 5, 1, jLabel12);
        ac.jLabelXLeft(51, 0, 5, 1, jLabel14);        ac.jLabelXLeft(51, 0, 5, 1, jLabel16);
        ac.jLabelXLeft(51, 0, 5, 1, jLabel18);        ac.jLabelXLeft(51, 0, 5, 1, jLabel20);
        ac.jLabelXLeft(51, 0, 5, 1, jLabel22);

        jLabel6.setVisible(false);        jLabel7.setVisible(false);
        jLabel9.setVisible(false);        jLabel12.setVisible(false);
        jLabel14.setVisible(false);        jLabel16.setVisible(false);
        jLabel18.setVisible(false);        jLabel20.setVisible(false);
        jLabel22.setVisible(false);
        click=0;
    }

    public void pieChartAdmissions(){ //Convert SQL Strings to Stored Procedure
        LocalDateTime date = LocalDateTime.now();
        int year = date.getYear();
        DefaultPieDataset dataset = new DefaultPieDataset();
        try{
            String sql = "SELECT COUNT(Admission_ID) AS Candidate FROM admission WHERE Gender = 'Female' AND IsEnrolled = CONVERT(bit, 1)";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int femaleCandidates= rs.getInt("Candidate");
                dataset.setValue("Female", femaleCandidates);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "SELECT COUNT(Admission_ID) AS Candidate FROM admission WHERE Gender = 'Male' AND IsEnrolled = CONVERT(bit, 1)";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int maleCandidates= rs.getInt("Candidate");
                dataset.setValue("Male", maleCandidates);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        JFreeChart chart = ChartFactory.createPieChart3D(null, dataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setCircular(true);
        plot.setForegroundAlpha(0.60f); //for transparent effect
        plot.setLabelBackgroundPaint(Color.WHITE);
        plot.setLabelFont(new java.awt.Font("Segoe UI Semilight", 0, 11));
        plot.setLabelLinksVisible(false); //removes the line connecting to the Pie.
        plot.setNoDataMessage("No data available.");
        plot.setOutlineVisible(true);
        
        plot.setSectionPaint("Female", new java.awt.Color(30, 144, 255));
        plot.setSectionPaint("Male", new java.awt.Color(0, 191, 255));
        
        ChartPanel panel = new ChartPanel(chart);
        jPanel52.setLayout(new java.awt.BorderLayout());
        jPanel52.add(panel);
        jPanel52.validate();
    }
    
    public void pieChartStudents(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Female", 2);
        dataset.setValue("Male", 7);
        JFreeChart chart = ChartFactory.createPieChart3D(null, dataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setCircular(true);
        plot.setForegroundAlpha(0.60f);
        plot.setLabelBackgroundPaint(Color.WHITE);
        plot.setLabelFont(new java.awt.Font("Segoe UI Semilight", 0, 11));
        plot.setLabelLinksVisible(false);
        plot.setNoDataMessage("No data available.");
        plot.setOutlineVisible(true);
        ChartPanel panel = new ChartPanel(chart);
        jPanel54.setLayout(new java.awt.BorderLayout());
        jPanel54.add(panel);
        jPanel54.validate();
    }
    
    public void setUserIcon() {
        try{
            String sql = "SELECT Employee_ID FROM dbo.[user] WHERE Username = '"+jLabel20.getText()+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int id = rs.getInt("Employee_ID");
                try{
                    String sql2 = "SELECT Gender FROM dbo.[employee] WHERE Employee_ID = '"+id+"'";
                    pst = conn.prepareStatement(sql2);
                    rs = pst.executeQuery();
                    if(rs.next()){
                        String gender = rs.getString("Gender");
                        if(gender=="Female"){
                            jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Female_30px.png")));
                        }else{
                            jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Male_30px.png")));
                        }
                    }
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void setUserInfo() {
        String user = jLabel20.getText();
        try{
            String sql = "EXECUTE spViewUser '"+user+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String name = rs.getString("Fullname");
                jLabel108.setText(name);
                String email = rs.getString("Email");
                jLabel109.setText(email);
                String type = rs.getString("UserType");
                jLabel110.setText(type);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showAddCandidateDialog() {
        showAdmissionTable();
        
        addCandidate.pack();
        addCandidate.setLocationRelativeTo(this);
        addCandidate.setVisible(true);
    }

    public void showAdmissionTable() {
        try{
            String sql = "SELECT * FROM viewAdmissions";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showCandidate() {
        int row = jComboBox7.getSelectedIndex();
        if(row == 0){
            showAdmissionTable();
        }else{
            String name = jComboBox7.getItemAt(row);
            try{
                String sql = "EXECUTE spViewSpecificCandidate '"+name+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public void showCandidateList() {
        try{
            String sql = "EXECUTE spViewCandidates";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String candidate = rs.getString("Surname") + ", " + rs.getString("Firstname") + " " + rs.getString("Middlename");
                jComboBox7.addItem(candidate);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showChangeUsernameDialog() {
        jLabel121.setText("Change Username");
        jLabel122.setText("Enter your new Username.");
        
        updateUsername.pack();
        updateUsername.setLocationRelativeTo(this);
        updateUsername.setVisible(true);
    }
    
    public void showChangePasswordDialog() {
        updatePassword.pack();
        updatePassword.setLocationRelativeTo(this);
        updatePassword.setVisible(true);

        jLabel127.setText("Change Password");
        jLabel128.setText("Enter Old password *");
        jLabel129.setText("Enter New Password *");
        jLabel130.setText("Verify New Password *");
    }
    
    public void showChangePictureDialog() {
        updatePicture.pack();
        updatePicture.setLocationRelativeTo(this);
        updatePicture.setVisible(true);
        
        jLabel132.setText("Change User Picture");
    }
    
    public void showChangeEmailDialog() {
        updateEmail.pack();
        updateEmail.setLocationRelativeTo(this);
        updateEmail.setVisible(true);
        
        jLabel135.setText("Change User Email");
        jLabel136.setText("Enter Old Email *");
        jLabel137.setText("Enter New Email *");
        jLabel138.setText("Verify New Email *");
    }
    
    public void showConfirmExit() {
        confirmExit.pack();
        confirmExit.setLocationRelativeTo(this);
        confirmExit.setVisible(true);
        
        jLabel140.setText("Confirm");
        jLabel141.setText("Are you sure you want to quit?");
    }
    
    public void showConfirmLogout() {
        confirmLogout.pack();
        confirmLogout.setLocationRelativeTo(this);
        confirmLogout.setVisible(true);
        
        jLabel124.setText("Confirm Logout");
        jLabel125.setText("Are you sure you want to logout?");
    }
    
    public void showCourseList() {
        try{
            String sql = "SELECT CourseName FROM course";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String course = rs.getString("CourseName");
                jComboBox2.addItem(course);
                jComboBox10.addItem(course);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showCourseTable() {
        try{
            String sql = "SELECT * FROM viewCourses";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showDepartmentList() {
        try{
            String sql = "SELECT Department FROM department";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String department = rs.getString("Department");
                jComboBox4.addItem(department);
                jComboBox11.addItem(department);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showDepartmentCombo() {
        int index = jComboBox4.getSelectedIndex();
        if(index == 0 ){
            //do nothing...
        }else{
            //Should be used for viewing...
        }
    }
    
    public void showDepartmentTable() {
        try{
            String sql = "SELECT * FROM viewDepartments";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showEditCourseDialog() {
        int row = jTable4.getSelectedRow();
        String course = jTable4.getModel().getValueAt(row, 0).toString();
        jTextField22.setText(course);
        try{
            String sql = "EXECUTE spViewCourseDescription '"+course+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String description = rs.getString("Description");
                String department = rs.getString("Department");
                jTextArea4.setText(description);
                jTextField23.setText(department);
                
                editCourse.pack();
                editCourse.setLocationRelativeTo(this);
                editCourse.setVisible(true);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showEditDepartmentDialog() {
        int row = jTable1.getSelectedRow();
        String department = jTable1.getModel().getValueAt(row, 1).toString();
        jTextField12.setText(department);
        try{
            String sql = "EXECUTE spViewDepartmentDescription '"+department+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String description = rs.getString("Description");
                jTextArea2.setText(description);       
                
                editDepartment.pack();
                editDepartment.setLocationRelativeTo(this);
                editDepartment.setVisible(true);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showEditCandidateDialog(){
        editCandidate.pack();
        editCandidate.setLocationRelativeTo(this);
        editCandidate.setVisible(true);
    }
    
    public void showEnrollCandidateDialog() {
        int row = jTable3.getSelectedRow();
        String name = jTable3.getModel().getValueAt(row, 1).toString();
        jLabel104.setText(name);
        jTextField35.setText(name);
        
        enrollCandidate.pack();
        enrollCandidate.setLocationRelativeTo(this);
        enrollCandidate.setVisible(true);
    }
    
    public void showLoadBar() {
        loadBar.pack();
        loadBar.setLocationRelativeTo(this);
        loadBar.setVisible(true);
        
        loadProgressBar();
        
        jLabel143.setText("Logged Out");
        jLabel144.setText("Logging you out...");
        
        this.dispose();
    }
    
    public void showMessage() {
        generalMessage.pack();
        generalMessage.setLocationRelativeTo(this);
        generalMessage.setVisible(true);
    }
    
    public void showStudents(){
        try{
            String sql = "SELECT * FROM viewStudents";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void showSubjectTable() { //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! See screenshot: C:\Users\Marie\Documents\Lightshot\table
        try{
            String sql = "SELECT * FROM viewSubjects";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable5.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void systemRefresh() { //Update tables and combo boxes when clicking buttons (mostly, save and update buttons).
        tables();
        counters();
        comboBoxes();
    }
    
    public final void tables() {
        showAdmissionTable();
        showCourseTable();
        showDepartmentTable();
        showStudents();
        showSubjectTable();
    }
    
    public void updateCourse() {
        String course = jTextField22.getText();
        String description = jTextArea4.getText();
        String username = jLabel20.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        if("".equals(course) || "".equals(description)){
            jLabel56.setText("Attention");
            jLabel57.setText("Please complete and enter valid entries.");
            showMessage();
        }else{
            try{
                String sql = "EXECUTE spUpdateCourse '"+course+"', '"+description+"'";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                
                jLabel56.setText("Success");
                jLabel57.setText("Saved!");
                showMessage();
                
                jTextField22.setText("");
                jTextArea4.setText("");
                jTextField23.setText("");
        
                editCourse.setVisible(false);
                systemRefresh();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    String sql = "EXECUTE spAuditCourse '"+username+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'updated', '"+course+"'";
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }
    
    public void updateDepartment() {
        String department = jTextField12.getText();
        String description = jTextArea2.getText();
        String username = jLabel20.getText(); 
        LocalDateTime dateTime = LocalDateTime.now();
        if("".equals(description)){ // OR description.isEmpty()){
            jLabel56.setText("Attention");
            jLabel57.setText("Please complete and enter valid entries.");
            showMessage();
        }else{
            try{
                String sql = "EXECUTE spUpdateDepartment '"+department+"', '"+description+"'";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                
                jLabel56.setText("Success");
                jLabel57.setText("Saved!");
                showMessage();
                
                jTextField12.setText("");
                jTextArea2.setText("");
        
                editDepartment.setVisible(false);
                systemRefresh();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    String sql = "EXECUTE spAuditDepartment '"+username+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'updated', '"+department+"'";
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }   
    
    public void updateEmail() {
        String user = jLabel20.getText();
        String oldEmail = jTextField32.getText();
        String newEmail1 = jTextField33.getText();
        String newEmail2 = jTextField34.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        try{
            String sql = "EXECUTE spCheckEmail '"+user+"', '"+oldEmail+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                if("".equals(newEmail1) || "".equals(newEmail2)){
                    showMessage();
                    jLabel56.setText("New Email Verification");
                    jLabel57.setText("Please fill out required fields!");
                }else if(!newEmail1.equals(newEmail2)){
                    showMessage();
                    jLabel56.setText("New Email Verification");
                    jLabel57.setText("Check your email and try again.");
                }else if(newEmail1.equals(newEmail2)){
                    if(newEmail1.contains("@") && newEmail2.contains("@")){
                        try{
                            String sql1 = "EXECUTE spAddNewEmail '"+user+"', '"+oldEmail+"', '"+newEmail1+"'";
                            pst = conn.prepareStatement(sql1);
                            pst.executeUpdate();
                            
                            jLabel109.setText(newEmail1);
                            
                            updateEmail.setVisible(false);
                            
                            showMessage();
                            jLabel56.setText("Success");
                            jLabel57.setText("Saved!");
                                                        
                            jTextField32.setText("");
                            jTextField33.setText("");
                            jTextField34.setText("");
                        }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e);
                        }finally{
                            try{
                                String sql1 = "EXECUTE spAuditEmail '"+user+"',"
                                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                                    + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'updated email for'";
                                pst = conn.prepareStatement(sql1);
                                pst.executeUpdate();
                            }catch(SQLException e){
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }else{
                        showMessage();
                        jLabel56.setText("Attention");
                        jLabel57.setText("Not a valid Email address.");
                    }
                }
            }else{
                jLabel56.setText("Old Email Verification");
                jLabel57.setText("Check your email and try again.");
                showMessage();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    public void updatePassword() {
        String user = jLabel20.getText();
        String oldPassword = jTextField29.getText();
        String newPassword1 = jTextField30.getText();
        String newPassword2 = jTextField31.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        try{
            String sql = "EXECUTE spCheckPassword '"+user+"', '"+oldPassword+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                if("".equals(newPassword1) || "".equals(newPassword2)){
                    jLabel56.setText("New Password Verification");
                    jLabel57.setText("Please fill out required fields!");
                    showMessage();
                }else if(!newPassword1.equals(newPassword2)){
                    jLabel56.setText("New Password Verification");
                    jLabel57.setText("Check your password and try again.");
                    showMessage();
                }else if(newPassword1.equals(newPassword2)){
                    try{
                        String sql1 = "EXECUTE spAddNewPassword '"+user+"', '"+oldPassword+"', '"+newPassword1+"'";
                        pst = conn.prepareStatement(sql1);
                        pst.executeUpdate();
                        updatePassword.setVisible(false);
                        
                        jLabel56.setText("Success");
                        jLabel57.setText("Saved!");
                        showMessage();
                        
                        jTextField29.setText("");
                        jTextField30.setText("");
                        jTextField31.setText("");
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }finally{
                        try{
                            String sql1 = "EXECUTE spAuditPassword '"+user+"',"
                                + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                                + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'updated password for'";
                            pst = conn.prepareStatement(sql1);
                            pst.executeUpdate();
                        }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }
            }else{
                jLabel56.setText("Old Password Verification");
                jLabel57.setText("Check your password and try again.");
                showMessage();
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void updateUsername() {
        String newUsername = jTextField27.getText();
        String oldUsername = jLabel20.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        if("".equals(newUsername)){
            jLabel56.setText("Attention");
            jLabel57.setText("Please complete and enter valid entries.");
            showMessage();
        }else{
            try{
                String sql = "EXECUTE spUpdateUsername '"+oldUsername+"', '"+newUsername+"'";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                updateUsername.setVisible(false);
                
                jLabel56.setText("Success");
                jLabel57.setText("Saved!");
                showMessage();
                
                jTextField27.setText("");
                jLabel20.setText(newUsername);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{
                    String sql = "EXECUTE spAuditUsername '"+newUsername+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)+"',"
                            + "'"+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)+"', 'updated'";
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }
    
    public void updateUserPicture() { //Transfer query as Stored Procedure. Verify if image is stored. Error exist. Re-work.
        String user = jLabel20.getText();
        if(userPicture == null){
            jLabel56.setText("Attention");
            jLabel57.setText("No picture is attached for saving.");
            showMessage();
        }else{
            try{
                String sql = "EXECUTE spAddUserPicture ?, ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, user);
                pst.setBytes(2, userPicture);
                pst.executeUpdate();
                
                jLabel133.setIcon(null);
                
                jLabel56.setText("Success");
                jLabel57.setText("Saved!");
                showMessage();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (click==0){
            jLabel6.setVisible(true);            jLabel7.setVisible(true);
            jLabel9.setVisible(true);            jLabel12.setVisible(true);
            jLabel14.setVisible(true);            jLabel16.setVisible(true);
            jLabel18.setVisible(true);            jLabel20.setVisible(true);
            jLabel22.setVisible(true);
            ac.jLabelXRight(0, 51, 5, 1, jLabel6);            ac.jLabelXRight(0, 51, 5, 1, jLabel7);
            ac.jLabelXRight(0, 51, 5, 1, jLabel9);            ac.jLabelXRight(0, 51, 5, 1, jLabel12);
            ac.jLabelXRight(0, 51, 5, 1, jLabel14);            ac.jLabelXRight(0, 51, 5, 1, jLabel16);
            ac.jLabelXRight(0, 51, 5, 1, jLabel18);            ac.jLabelXRight(0, 51, 5, 1, jLabel20);
            ac.jLabelXRight(0, 51, 5, 1, jLabel22);
            click=1;
        }
        else{
            minimize();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jLabel24.setText("Admissions");
        jLabel24.setVisible(true);
        minimize();
        
        jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(PanelAdmissions);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel24.setVisible(false);
        minimize();
        
        jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(PanelDashboard);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jLabel24.setText("Student Information");
        jLabel24.setVisible(true);
        minimize();
        
        jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(PanelStudents);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jLabel24.setText("Degree Courses");
        jLabel24.setVisible(true);
        minimize();
        
        jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(PanelCourses);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
         jLabel24.setText("Subject Units");
         jLabel24.setVisible(true);
         minimize();
        
         jPanel4.removeAll();
         jPanel4.repaint();
         jPanel4.revalidate();
         jPanel4.add(PanelUnits);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
         jLabel24.setText("Departments");
         jLabel24.setVisible(true);
         minimize();
         
         jPanel4.removeAll();
         jPanel4.repaint();
         jPanel4.revalidate();
         jPanel4.add(PanelDepartments);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
         jLabel24.setText("Reports");  
         jLabel24.setVisible(true);
         minimize();
         
         jPanel4.removeAll();
         jPanel4.repaint();
         jPanel4.revalidate();
         jPanel4.add(PanelReports);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         jLabel24.setText("My Profile");
         jLabel24.setVisible(true);
         minimize();
         
         jPanel4.removeAll();
         jPanel4.repaint();
         jPanel4.revalidate();
         jPanel4.add(PanelUser);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
         jLabel24.setText("Settings");
         jLabel24.setVisible(true);
         minimize();
         
         jPanel4.removeAll();
         jPanel4.repaint();
         jPanel4.revalidate();
         jPanel4.add(PanelSettings);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        showConfirmExit();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        minimize();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel6.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel6.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel7.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel7.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel9.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel9.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel12.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel12.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel14.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel14.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel16.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel16.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel18.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel18.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jLabel20.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jLabel20.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jLabel22.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jLabel22.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jLabel18.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jLabel18.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        jLabel20.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        jLabel20.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jLabel22.setForeground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jLabel22.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addDepartment.pack();
        addDepartment.setLocationRelativeTo(this);
        addDepartment.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addDepartment.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        addDepartment.setVisible(false);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addDepartment();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // to close Security Check DIalog Box...
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        checkUser.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //to check for wether the Administrator's password is submitted for verification..
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        generalMessage.setVisible(false);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        generalMessage.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel55MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseEntered
        jLabel55.setBackground(Color.red);
    }//GEN-LAST:event_jLabel55MouseEntered

    private void jLabel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseEntered
        jLabel46.setBackground(Color.red);
    }//GEN-LAST:event_jLabel46MouseEntered

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
        jLabel46.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel46MouseExited

    private void jLabel55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseExited
        jLabel55.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel55MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButton11.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        editDepartment.setVisible(false);
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseEntered
        jLabel59.setBackground(Color.red);
    }//GEN-LAST:event_jLabel59MouseEntered

    private void jLabel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseExited
        jLabel59.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel59MouseExited

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        editDepartment.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        updateDepartment();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        showEditDepartmentDialog();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        addCandidate.setVisible(false);
        
        clearAddCandidate();
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel63MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseEntered
        jLabel63.setBackground(Color.red);
    }//GEN-LAST:event_jLabel63MouseEntered

    private void jLabel63MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseExited
        jLabel63.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel63MouseExited

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        addCandidate.setVisible(false);
        
        clearAddCandidate();
        showAdmissionTable();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showAddCandidateDialog();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = jTable3.getSelectedRow();
        String name = jTable3.getModel().getValueAt(row, 1).toString();
        String course = jTable3.getModel().getValueAt(row, 2).toString();
        jLabel154.setText(name);
        jLabel203.setText(course);
        jTextField35.setText(name);
        try{
            String sql = "SELECT Birthdate, Birthplace, Gender, CONCAT(StreetAddress, ' ', City) AS 'Full Address', "
                        + "PhoneNumber, EmailAdress, PrevSchoolName, SchoolAdress,"
                        + "CONCAT(YearFrom, ' ', 'YearTo') AS 'YearAttended', MotherName, FatherName, Siblings,"
                        + "GuardianName, GuardianAdress, GuardianNumber"
                    + "FROM admission JOIN course"
                    + "ON course.CourseID = admission.courseID"
                    + "WHERE CONCAT(Surname, ', ', Firstname, ' ', Middlename) = '"+name+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                Date birthDate = rs.getDate("Birthdate");
                String birthPlace = rs.getString("Birthplace");
                String gender = rs.getString("Gender");
                String address = rs.getString("Full Address");
                String number = rs.getString("PhoneNumber");
                String email = rs.getString("EmailAdress");
                String previous = rs.getString("PrevSchoolName");
                String schoolAdd = rs.getString("SchooldAdress");
                String attended = rs.getString("YearAttended");
                String mother = rs.getString("MotherName");
                String father = rs.getString("FatherName");
                String siblings = rs.getString("Siblings");
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        jButton2.setEnabled(true);
        jButton15.setEnabled(true);        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        addCourse.setVisible(false);
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseEntered
        jLabel75.setBackground(Color.red);
    }//GEN-LAST:event_jLabel75MouseEntered

    private void jLabel75MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseExited
        jLabel75.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel75MouseExited

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        addCourse.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        addCourse();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        addCourse.pack();
        addCourse.setLocationRelativeTo(this);
        addCourse.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        showEditCourseDialog();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        editCourse.setVisible(false);
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseEntered
        jLabel80.setBackground(Color.red);
    }//GEN-LAST:event_jLabel80MouseEntered

    private void jLabel80MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseExited
        jLabel80.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel80MouseExited

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        editCourse.setVisible(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        updateCourse();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        jButton23.setEnabled(true);
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        addCandidate();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
        enrollCandidate.setVisible(false);
    }//GEN-LAST:event_jLabel100MouseClicked

    private void jLabel100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseEntered
        jLabel100.setBackground(Color.red);
    }//GEN-LAST:event_jLabel100MouseEntered

    private void jLabel100MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseExited
        jLabel100.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel100MouseExited

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        enrollCandidate.setVisible(false);
        jButton2.setEnabled(false);
        jButton15.setEnabled(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jButton2.setEnabled(true);
        jButton15.setEnabled(true);
        
        enrollCandidate();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        showEnrollCandidateDialog();
        
        jTable3.clearSelection();
        jButton2.setEnabled(false);
        jButton15.setEnabled(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(MainForm.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //jLabel3.add(windowEvent); NOT WORKING!!!!!!!!!!!!!!!!!!!!!!!!!
        //jLabel3.setComponentPopupMenu(windowEvent);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        showCandidate();
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jLabel111MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseEntered
        jLabel111.setForeground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel111MouseEntered

    private void jLabel111MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseExited
        jLabel111.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jLabel111MouseExited

    private void jLabel112MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseEntered
        jLabel112.setForeground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel112MouseEntered

    private void jLabel112MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseExited
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jLabel112MouseExited

    private void jLabel113MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseEntered
        jLabel113.setForeground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel113MouseEntered

    private void jLabel113MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseExited
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jLabel113MouseExited

    private void jLabel114MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseEntered
        jLabel114.setForeground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel114MouseEntered

    private void jLabel114MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseExited
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jLabel114MouseExited

    private void jLabel115MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseEntered
        jLabel115.setForeground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel115MouseEntered

    private void jLabel115MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseExited
        jLabel115.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jLabel115MouseExited

    private void jLabel117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel117MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel117MouseClicked

    private void jLabel117MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel117MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel117MouseEntered

    private void jLabel117MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel117MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel117MouseExited

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
        showChangeUsernameDialog();
    }//GEN-LAST:event_jLabel111MouseClicked

    private void jLabel120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseClicked
        jTextField27.setText("");
        updateUsername.setVisible(false);
    }//GEN-LAST:event_jLabel120MouseClicked

    private void jLabel120MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseEntered
        jLabel120.setBackground(Color.red);
    }//GEN-LAST:event_jLabel120MouseEntered

    private void jLabel120MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel120MouseExited
        jLabel120.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel120MouseExited

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        updateUsername();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jLabel126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseClicked
        updatePassword.setVisible(false);
        
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
    }//GEN-LAST:event_jLabel126MouseClicked

    private void jLabel126MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseEntered
        jLabel126.setBackground(Color.red);
    }//GEN-LAST:event_jLabel126MouseEntered

    private void jLabel126MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseExited
        jLabel126.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel126MouseExited

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        updatePassword();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jLabel113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseClicked
        showChangePasswordDialog();
    }//GEN-LAST:event_jLabel113MouseClicked

    private void jLabel112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseClicked
        showChangePictureDialog();
    }//GEN-LAST:event_jLabel112MouseClicked

    private void jLabel131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel131MouseClicked
        updatePicture.setVisible(false);
        
        jLabel133.setIcon(null);
    }//GEN-LAST:event_jLabel131MouseClicked

    private void jLabel131MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel131MouseEntered
        jLabel131.setBackground(Color.red);
    }//GEN-LAST:event_jLabel131MouseEntered

    private void jLabel131MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel131MouseExited
        jLabel131.setBackground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel131MouseExited

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        updateUserPicture();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jLabel133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseClicked
        browsePicture();
    }//GEN-LAST:event_jLabel133MouseClicked

    private void jLabel133MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseEntered
        jLabel133.setForeground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel133MouseEntered

    private void jLabel133MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseExited
        jLabel133.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jLabel133MouseExited

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jLabel133.setIcon(null);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jLabel123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseClicked
        confirmLogout.setVisible(false);
    }//GEN-LAST:event_jLabel123MouseClicked

    private void jLabel123MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseEntered
        jLabel123.setBackground(Color.red);
    }//GEN-LAST:event_jLabel123MouseEntered

    private void jLabel123MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseExited
        jLabel123.setBackground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel123MouseExited

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        logoutUser();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        confirmLogout.setVisible(false);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jLabel134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseClicked
        updateEmail.setVisible(false);
        
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
    }//GEN-LAST:event_jLabel134MouseClicked

    private void jLabel134MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseEntered
        jLabel134.setBackground(Color.red);
    }//GEN-LAST:event_jLabel134MouseEntered

    private void jLabel134MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseExited
        jLabel134.setBackground(new java.awt.Color(10, 102, 153));
    }//GEN-LAST:event_jLabel134MouseExited

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        updateEmail();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        showChangeEmailDialog();
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        showConfirmLogout();
    }//GEN-LAST:event_jButton33ActionPerformed

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
        auditAppClosed();
        confirmExit.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        confirmExit.setVisible(false);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jLabel147MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseClicked
        editCandidate.setVisible(false);
        
        clearEditCandidate();
    }//GEN-LAST:event_jLabel147MouseClicked

    private void jLabel147MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseEntered
        jLabel147.setBackground(Color.red);
    }//GEN-LAST:event_jLabel147MouseEntered

    private void jLabel147MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseExited
        jLabel147.setBackground(new java.awt.Color(0, 102, 153));
    }//GEN-LAST:event_jLabel147MouseExited

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        editCandidate.setVisible(false);
        
        clearEditCandidate();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        editCandidate.setVisible(false); //exit window after saving. Add saved dialogue.
        
        clearEditCandidate();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showEditCandidateDialog();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        int row = jComboBox10.getSelectedIndex();
        if(row == 0){
            showCourseTable();
        }else{
            String name = jComboBox10.getItemAt(row);
            try{
                String sql = "EXECUTE spViewSpecificCourse '"+name+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdmissions;
    private javax.swing.JPanel PanelCourses;
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelDepartments;
    private javax.swing.JPanel PanelReports;
    private javax.swing.JPanel PanelSettings;
    private javax.swing.JPanel PanelStudents;
    private javax.swing.JPanel PanelUnits;
    private javax.swing.JPanel PanelUser;
    private javax.swing.JDialog addCandidate;
    private javax.swing.JDialog addCourse;
    private javax.swing.JDialog addDepartment;
    private javax.swing.JDialog checkUser;
    private javax.swing.JDialog confirmExit;
    private javax.swing.JDialog confirmLogout;
    private javax.swing.JDialog editCandidate;
    private javax.swing.JDialog editCourse;
    private javax.swing.JDialog editDepartment;
    private javax.swing.JDialog enrollCandidate;
    private javax.swing.JDialog generalMessage;
    private javax.swing.JDialog generalYesNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    public static final javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JDialog loadBar;
    private javax.swing.JDialog updateEmail;
    private javax.swing.JDialog updatePassword;
    private javax.swing.JDialog updatePicture;
    private javax.swing.JDialog updateUsername;
    // End of variables declaration//GEN-END:variables
}
