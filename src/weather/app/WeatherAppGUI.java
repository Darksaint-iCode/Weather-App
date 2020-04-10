/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;


import java.awt.Toolkit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;
/**
 *
 * @author Ibro Yusuf Ola
 */
public class WeatherAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form WeatherAppGUI
     */
    static String inpLoc, cityName, cityCountryCode, wInfo, wDetailedInfo;
    static double tempC, tempF, windSp, windDg, windGs;
    static Date cityDate;
    static Integer cityCloud;
    int teC;

    public WeatherAppGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(632,432);
        this.setResizable(false);        
//        this.setUndecorated(true);
//        this.setAlwaysOnTop(true);
        appIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather App ");
        setPreferredSize(new java.awt.Dimension(630, 404));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Vollkorn", 0, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("Input format <city/state, country.>");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel30.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("##");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 80));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/general informaion/sunrise.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 40, 30));

        jLabel29.setFont(new java.awt.Font("Vollkorn", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("00:00.");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 60, 20));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/general informaion/sunset.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 40, 30));

        jLabel27.setFont(new java.awt.Font("Vollkorn", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("00:00.");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 60, 20));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/general informaion/pressure.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 40, 30));

        jLabel25.setFont(new java.awt.Font("Vollkorn", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0 hPa");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 60, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/general informaion/humidity.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 40, 30));

        jLabel23.setFont(new java.awt.Font("Vollkorn", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("0'");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 60, 20));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/general informaion/latitude.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 40, 30));

        jLabel21.setFont(new java.awt.Font("Vollkorn", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("0.00");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 60, 20));

        jLabel19.setFont(new java.awt.Font("Vollkorn", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0.00");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 60, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/general informaion/longitude.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 40, 30));

        jLabel17.setFont(new java.awt.Font("Vollkorn", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0'");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, -1));

        jLabel16.setFont(new java.awt.Font("Vollkorn", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0 m");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 50, -1));

        jLabel15.setFont(new java.awt.Font("Vollkorn", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0 mps");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 100, 50, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/basic data/cloud.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 35, 35));

        jLabel14.setFont(new java.awt.Font("Vollkorn", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0%");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 380, 40, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/basic data/weather.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 35, 35));

        jLabel12.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("##");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Vollkorn", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0'F");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 380, 40, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/basic data/temperature.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 35, 35));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("##");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("##");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/locate.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 20, 30));

        jTextField1.setBackground(new java.awt.Color(94, 107, 140));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 190, 20));

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("##");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/weather icon/default.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 55, 55));

        jLabel4.setFont(new java.awt.Font("Vollkorn", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("0'C");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon/refresh_b.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg_img/bgimg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, "card2");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        jLabel3.setIcon(new ImageIcon("C:\\Users\\Ibro Yusuf Ola\\Documents\\NetBeansProjects\\Weather App\\src\\icons\\icon\\refresh_e.png"));
        inpLoc = jTextField1.getText();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        // TODO add your handling code here:
        jLabel3.setIcon(new ImageIcon("C:\\Users\\Ibro Yusuf Ola\\Documents\\NetBeansProjects\\Weather App\\src\\icons\\icon\\refresh_b.png"));
        jLabel31.setVisible(false);
         try {
            getWeatherInfo();
        } catch (APIException ex) {
            Logger.getLogger(WeatherAppGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        //Parsing all data into Labels.
        String a,b,c,d,e;
         
        jLabel4.setText(tempC + "'C");
        jLabel5.setText(wInfo);
        jLabel7.setText(cityName + ", " + cityCountryCode + ".");
//        a = cityDate.toString();
//        jLabel8.setText(a);
        jLabel10.setText(tempF + "'F");
        jLabel12.setText(wDetailedInfo);
        b = cityCloud.toString();
        jLabel14.setText(b + "%");
        
//        jLabel15.setText(windSp);
//        jLabel16.setText(windDg);
//        jLabel17.setText(windGs);
    }//GEN-LAST:event_jLabel3MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherAppGUI().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void appIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appIcon.png")));
        
    }
    
    private static void getWeatherInfo() throws APIException {
        OWM owm = new OWM("fba9f12b592bc739ef460d7125353aa1");
        owm.setAccuracy(OWM.Accuracy.ACCURATE);
        owm.setLanguage(OWM.Language.ENGLISH); 
        owm.setUnit(OWM.Unit.METRIC);
        
        CurrentWeather cwd = owm.currentWeatherByCityName(inpLoc);
        try{
        tempC = Math.round(cwd.getMainData().getTemp());
        wInfo = cwd.getWeatherList().get(0).getMainInfo();
        cityName = cwd.getCityName();
        cityCountryCode = cwd.getSystemData().getCountryCode();
        cityDate = cwd.getDateTime();
        tempF = Math.round((tempC * 9/5) + 32);
        wDetailedInfo = cwd.getWeatherList().get(0).getMoreInfo();
        cityCloud = cwd.getCloudData().getCloudiness();
        windSp = cwd.getWindData().getSpeed();
        windDg = cwd.getWindData().getDegree();
        windGs = cwd.getWindData().getGust();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
