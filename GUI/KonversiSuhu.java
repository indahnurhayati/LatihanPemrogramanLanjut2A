/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author indah
 */
public class KonversiSuhu extends javax.swing.JFrame {
    double celcius;
    double fahrenheit;
    double kelvin;
    double reamur;
    
    public KonversiSuhu() {
        initComponents();
    }

    private void Celcius(){
        celcius = Double.parseDouble(txtSuhu.getText());
         fahrenheit = celcius * 1.8 + 32;
         kelvin = celcius + 273.15;
         reamur = celcius * 0.8;
        lblCelcius.setText(celcius+ "Celcius");
        lblFahrenheit.setText(fahrenheit+ "Fahrenheit");
        lblKelvin.setText(kelvin+ "Kelvin");
        lblReamur.setText(reamur+ "Reamur");
    }
    
    private void Fahrenheit(){
        fahrenheit = Double.parseDouble(txtSuhu.getText());
         celcius = (fahrenheit - 32) / 1.8;    
         reamur = (fahrenheit - 32) / 2.25;
         kelvin = (fahrenheit + 459.67) / 1.8;
        lblCelcius.setText(celcius+ "Celcius");
        lblFahrenheit.setText(fahrenheit+ "Fahrenheit");
        lblKelvin.setText(kelvin+ "Kelvin");
        lblReamur.setText(reamur+ "Reamur");
    }
    
    private void Kelvin(){
        kelvin = Double.parseDouble(txtSuhu.getText());
         celcius = kelvin - 273.15;
         fahrenheit = kelvin * 1.8 - 459.67;
         reamur = (kelvin - 273.15) * 0.8;
        lblCelcius.setText(celcius+ "Celcius");
        lblFahrenheit.setText(fahrenheit+ "Fahrenheit");
        lblKelvin.setText(kelvin+ "Kelvin");
        lblReamur.setText(reamur+ "Reamur");
    }
    
    private void Reamur(){
        reamur = Double.parseDouble(txtSuhu.getText());
         celcius = reamur / 0.8;
         fahrenheit = (reamur - 7.5) * 24 / 7 + 32;
         kelvin = reamur / 0.8 + 273.15;
        lblCelcius.setText(celcius+ "Celcius");
        lblFahrenheit.setText(fahrenheit+ "Fahrenheit");
        lblKelvin.setText(kelvin+ "Kelvin");
        lblReamur.setText(reamur+ "Reamur");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Konversi Suhu");

        rbCelcius.setBackground(new java.awt.Color(204, 102, 255));
        rbCelcius.setForeground(new java.awt.Color(255, 255, 255));
        rbCelcius.setText("Celcius");

        rbFahrenheit.setBackground(new java.awt.Color(204, 102, 255));
        rbFahrenheit.setForeground(new java.awt.Color(255, 255, 255));
        rbFahrenheit.setText("Fahrenheit");

        rbKelvin.setBackground(new java.awt.Color(204, 102, 255));
        rbKelvin.setForeground(new java.awt.Color(255, 255, 255));
        rbKelvin.setText("Kelvin");

        rbReamur.setBackground(new java.awt.Color(204, 102, 255));
        rbReamur.setForeground(new java.awt.Color(255, 255, 255));
        rbReamur.setText("Reamur");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Masukkan Suhu :");

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hasil Konversi :");

        lblCelcius.setBackground(new java.awt.Color(204, 102, 255));
        lblCelcius.setForeground(new java.awt.Color(255, 204, 204));
        lblCelcius.setText("Celcius");

        lblFahrenheit.setBackground(new java.awt.Color(204, 102, 255));
        lblFahrenheit.setForeground(new java.awt.Color(255, 204, 204));
        lblFahrenheit.setText("Fahrenheit");

        lblKelvin.setBackground(new java.awt.Color(204, 102, 255));
        lblKelvin.setForeground(new java.awt.Color(255, 204, 204));
        lblKelvin.setText("Kelvin");

        lblReamur.setBackground(new java.awt.Color(204, 102, 255));
        lblReamur.setForeground(new java.awt.Color(255, 204, 204));
        lblReamur.setText("Reamur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(rbCelcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbReamur))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKonversi)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addComponent(jLabel3)
                    .addComponent(lblCelcius)
                    .addComponent(lblFahrenheit)
                    .addComponent(lblKelvin)
                    .addComponent(lblReamur))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbFahrenheit)
                    .addComponent(rbKelvin)
                    .addComponent(rbReamur)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKonversi)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReamur)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        if (rbCelcius.isSelected()){
            Celcius();        
        }else if (rbFahrenheit.isSelected()){
            Fahrenheit();
        }else if (rbKelvin.isSelected()){
            Kelvin();
        }else if (rbReamur.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSuhu.setText("");
        lblCelcius.setText("Celcius");
        lblFahrenheit.setText("Fahrenheit");
        lblKelvin.setText("Kelvin");
        lblReamur.setText("Reamur");
        rbCelcius.setSelected(false);
        rbFahrenheit.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
