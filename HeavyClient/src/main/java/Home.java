/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java;

import java.util.List;
import javax.swing.JLabel;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author Badr
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        soapClient = new SoapClient(USER_NAME, QUEUE_NAME,this);
        initComponents();
        this.Map.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FindBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        OriginAddressTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DestinationAddressTxt = new javax.swing.JTextField();
        Map = new main.java.Map();
        MsgLabel = new javax.swing.JLabel();
        DirectionsBtn = new javax.swing.JButton();
        StepLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FindBtn.setText("Find");
        FindBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        OriginAddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginAddressTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Origin Address");

        jLabel2.setText("Destination Address");

        javax.swing.GroupLayout MapLayout = new javax.swing.GroupLayout(Map);
        Map.setLayout(MapLayout);
        MapLayout.setHorizontalGroup(
            MapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        MapLayout.setVerticalGroup(
            MapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MsgLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MsgLabel.setForeground(new java.awt.Color(255, 0, 0));

        DirectionsBtn.setText("Get Directions");
        DirectionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectionsBtnActionPerformed(evt);
            }
        });

        StepLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Lets Go? Biking?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(604, 604, 604)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DirectionsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FindBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DestinationAddressTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OriginAddressTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(MsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(StepLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(MsgLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(OriginAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DestinationAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(StepLbl)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FindBtn)
                    .addComponent(ResetBtn))
                .addGap(18, 18, 18)
                .addComponent(DirectionsBtn)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        this.Map.reset();
        this.DirectionsBtn.show(true);
        this.FindBtn.setText("Find");
        this.StepLbl.setText("");
        this.MsgLabel.setText("");
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void OriginAddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriginAddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OriginAddressTxtActionPerformed

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBtnActionPerformed
        // TODO add your handling code here:
        if(FindBtn.getText().equals("Find")){
            if(this.OriginAddressTxt.getText().isBlank()||this.DestinationAddressTxt.getText().isBlank()){
                this.MsgLabel.setText("Please fill in the address");
            }else{
                List<GeoPosition> route =
                        soapClient.getRoute(this.OriginAddressTxt.getText(),
                        this.DestinationAddressTxt.getText());
                if(!route.isEmpty()){
                    this.Map.drawRoute(route);
                    this.MsgLabel.setText(soapClient.getMsg());
                }else{
                    this.MsgLabel.setText("No route found for the given itinerary");

                }
            }
        }else if(FindBtn.getText().equals("Next")){
                List<GeoPosition> route = soapClient.getNextRoute();
            if(!route.isEmpty()){
                this.Map.drawRoute(route);
                this.MsgLabel.setText(soapClient.getMsg());
            }else{
                this.MsgLabel.setText("No route found for the given itinerary");

            }
        }
    }//GEN-LAST:event_FindBtnActionPerformed

    private void DirectionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectionsBtnActionPerformed
        // TODO add your handling code here:
        if(this.OriginAddressTxt.getText().isBlank()||this.DestinationAddressTxt.getText().isBlank()){
            this.MsgLabel.setText("Please fill in the address");
        }else{
            List<GeoPosition> route =
                    soapClient.getRouteV2(this.OriginAddressTxt.getText(),
                    this.DestinationAddressTxt.getText());

            if(!route.isEmpty()){
                this.Map.drawRoute(route);
                this.DirectionsBtn.show(false);
                this.FindBtn.setText("Next");
                this.MsgLabel.setText(soapClient.getMsg());
                
            }else{
                this.MsgLabel.setText("No route found for the given itinerary");
                
            }
        }
    }//GEN-LAST:event_DirectionsBtnActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    public JLabel getStepLbl() {
        return StepLbl;
    }

    public void setStepLbl(JLabel StepLbl) {
        this.StepLbl = StepLbl;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DestinationAddressTxt;
    private javax.swing.JButton DirectionsBtn;
    private javax.swing.JButton FindBtn;
    private main.java.Map Map;
    private javax.swing.JLabel MsgLabel;
    private javax.swing.JTextField OriginAddressTxt;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel StepLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private SoapClient soapClient;
    
    private final String QUEUE_NAME = "APP_QUEUE";
    private final String USER_NAME = "USERNAME";
}
