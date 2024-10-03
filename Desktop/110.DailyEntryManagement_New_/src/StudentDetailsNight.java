
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class StudentDetailsNight extends javax.swing.JFrame 
{
   private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    String reg="";
    public StudentDetailsNight( String regNo) 
    {
        reg=regNo;
        System.out.println(reg);
        
        initComponents();
      //  wait(2);
        initialize();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlblRegNo = new javax.swing.JLabel();
        JtxtRegNo = new javax.swing.JTextField();
        JlblName = new javax.swing.JLabel();
        JtxtName = new javax.swing.JTextField();
        JlblRoomNo = new javax.swing.JLabel();
        JtxtRoomNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtxtBranch = new javax.swing.JTextField();
        jlblYear = new javax.swing.JLabel();
        JtxtYear = new javax.swing.JTextField();
        JlblContactNo = new javax.swing.JLabel();
        JtxtContactNo = new javax.swing.JTextField();
        jCheckBoxPresent = new javax.swing.JCheckBox();
        jBtnDone = new javax.swing.JButton();
        JlblPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlblRegNo.setText("Registration No");

        JlblName.setText("Name");

        JlblRoomNo.setText("Room Number");

        jLabel4.setText("Branch");

        jlblYear.setText("Year");

        JlblContactNo.setText("Contact No");

        jCheckBoxPresent.setText("Mark As Present");

        jBtnDone.setText("Done");
        jBtnDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnDoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JlblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlblRoomNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlblRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtxtRoomNo)
                            .addComponent(JtxtBranch, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jlblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JlblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JtxtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(JtxtRegNo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JtxtYear, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(JtxtContactNo)
                    .addComponent(JlblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jCheckBoxPresent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jBtnDone)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlblRegNo)
                            .addComponent(JtxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlblName)
                            .addComponent(JtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JlblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlblRoomNo)
                    .addComponent(JtxtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblYear)
                    .addComponent(JtxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JtxtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlblContactNo)
                    .addComponent(JtxtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jCheckBoxPresent)
                .addGap(18, 18, 18)
                .addComponent(jBtnDone)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDoneMouseClicked
          try{
              
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dailyentrymgmtproject","root","password");
        String registerUser = "insert into nightentry(regNo,time,status) VALUES(?,?,?)";
                        pst = con.prepareStatement(registerUser);
                           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                           LocalDateTime now = LocalDateTime.now();  
  
                        java.util.Date date= new java.util.Date();
                     
                       
                        pst.setString(1, reg);
                        pst.setTimestamp(2, new Timestamp(date.getTime()));
                     
                        pst.setString(3, "Present");
                        pst.execute();
                        
          }catch(Exception e){
              System.out.println("Error in \"Done\" execution");
                            e.printStackTrace();
            }
    }//GEN-LAST:event_jBtnDoneMouseClicked
    
    void initialize() {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DailyEntryMgmtProject","root","password");
        pst = con.prepareStatement("SELECT * from StudentsDetails where regNo=?");//table details
        pst.setString(1, reg);
        rs = pst.executeQuery();
        //regNo name roomno branch year phone photo
        rs.next();
        JtxtRegNo.setText(rs.getString(1));
        JtxtName.setText(rs.getString(2));
        JtxtRoomNo.setText(rs.getString(3));
        JtxtBranch.setText(rs.getString(4)); 
        JtxtYear.setText(rs.getString(5));
        JtxtContactNo.setText(rs.getString(6));
        String link = rs.getString(7); 
        System.out.println(link);
        
        ImageIcon img = new ImageIcon(new ImageIcon(link).getImage().getScaledInstance(125, 121, Image.SCALE_DEFAULT));
        JlblPhoto.setIcon(img);
       
    }
      catch (Exception e) {
                 
                e.printStackTrace();
            }
                
    }
    
  /*  public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new StudentDetailsNight().setVisible(true);
            }
        });
    }
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblContactNo;
    private javax.swing.JLabel JlblName;
    private javax.swing.JLabel JlblPhoto;
    private javax.swing.JLabel JlblRegNo;
    private javax.swing.JLabel JlblRoomNo;
    private javax.swing.JTextField JtxtBranch;
    private javax.swing.JTextField JtxtContactNo;
    private javax.swing.JTextField JtxtName;
    private javax.swing.JTextField JtxtRegNo;
    private javax.swing.JTextField JtxtRoomNo;
    private javax.swing.JTextField JtxtYear;
    private javax.swing.JButton jBtnDone;
    private javax.swing.JCheckBox jCheckBoxPresent;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlblYear;
    // End of variables declaration//GEN-END:variables
}
