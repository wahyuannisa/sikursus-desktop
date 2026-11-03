
package View;

/**
 *
 * @author USER
 */
public class formpendaftaran extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(formpendaftaran.class.getName());

    /**
     * Creates new form formpendaftaran
     */
   public formpendaftaran() {
    setContentPane(new BackgroundPanel());
    initComponents();

    setTitle("Form Pendaftaran Kursus");
    setLocationRelativeTo(null);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbKursus = new javax.swing.JComboBox<>();
        cmbLevel = new javax.swing.JComboBox<>();
        txtBiaya = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        txtKodeKursus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        btnproses = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        cmbKursus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAVA", "DATA SCIENCE", "UIUX" }));

        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC", "INTERMEDIATE" }));

        txtBiaya.addActionListener(this::txtBiayaActionPerformed);

        txtDiskon.addActionListener(this::txtDiskonActionPerformed);

        jLabel1.setText("Kode Kursus");

        jLabel2.setText("Nama Kursus");

        jLabel3.setText("Level");

        jLabel4.setText("Biaya Kursus");

        jLabel5.setText("Diskon %");

        btnreset.setText("Reset");
        btnreset.addActionListener(this::btnresetActionPerformed);

        btnproses.setText("Proses");
        btnproses.addActionListener(this::btnprosesActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Form Pendaftaran");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnproses)
                .addGap(74, 74, 74)
                .addComponent(btnreset)
                .addGap(276, 276, 276))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel6)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproses)
                    .addComponent(btnreset))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprosesActionPerformed
        try {
            String kodeKursus = txtKodeKursus.getText();
            String namaKursus = cmbKursus.getSelectedItem().toString();
            double biaya = Double.parseDouble(txtBiaya.getText());
            double diskon = Double.parseDouble(txtDiskon.getText());
            double nominalDiskon = biaya * (diskon / 100);
            double totalBiaya = biaya - nominalDiskon;

            String hasil = "HASIL PENDAFTARAN KURSUS\n"
            + "============================\n"
            + "Kode Kursus  : " + kodeKursus + "\n"
            + "Nama Kursus  : " + namaKursus + "\n"
            + "Level: INTERMEDIATE\n"
            + "Biaya Kursus : Rp " + biaya + "\n"
            + "Diskon (%)   : " + diskon + "%\n"
            + "Biaya akhir  : Rp " + totalBiaya;

            javax.swing.JOptionPane.showMessageDialog(this, hasil, "Hasil Pendaftaran Kursus", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Biaya dan Diskon harus diisi dengan angka!",
                "Input Tidak Valid",
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnprosesActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtKodeKursus.setText("");
        txtBiaya.setText("");
        txtDiskon.setText("");
        cmbKursus.setSelectedIndex(0);
        txtKodeKursus.requestFocus();
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void txtBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiayaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new formpendaftaran().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnproses;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox<String> cmbKursus;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtKodeKursus;
    // End of variables declaration//GEN-END:variables
private class BackgroundPanel extends javax.swing.JPanel {

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        java.awt.Graphics2D g2 =
                (java.awt.Graphics2D) g.create();

        int lebar = getWidth();
        int tinggi = getHeight();

        // GRADASI PINK -> BIRU
        java.awt.GradientPaint gradasi =
                new java.awt.GradientPaint(
                        0, 0,
                        new java.awt.Color(255, 190, 225),
                        lebar, tinggi,
                        new java.awt.Color(170, 215, 255)
                );

        g2.setPaint(gradasi);
        g2.fillRect(0, 0, lebar, tinggi);

        // 🦋 KUPU-KUPU
        gambarKupu(g2, lebar - 60, 70, 1.0);
        gambarKupu(g2, lebar - 60, 150, 0.8);
        gambarKupu(g2, lebar - 60, 230, 1.0);
        gambarKupu(g2, lebar - 60, 310, 0.8);

        g2.dispose();
    }

    private void gambarKupu(
            java.awt.Graphics2D g2,
            int x,
            int y,
            double ukuran) {

        int a = (int)(25 * ukuran);
        int b = (int)(30 * ukuran);

        // Sayap kiri
        g2.setColor(new java.awt.Color(255, 100, 180));
        g2.fillOval(x - a, y - b / 2, a, b);

        // Sayap kanan
        g2.setColor(new java.awt.Color(100, 160, 255));
        g2.fillOval(x, y - b / 2, a, b);

        // Sayap bawah kiri
        g2.setColor(new java.awt.Color(255, 170, 220));
        g2.fillOval(x - a + 5, y + 3, a - 8, b - 10);

        // Sayap bawah kanan
        g2.setColor(new java.awt.Color(160, 200, 255));
        g2.fillOval(x + 3, y + 3, a - 8, b - 10);

        // Badan
        g2.setColor(new java.awt.Color(80, 60, 110));
        g2.fillOval(x - 3, y - 8, 6, 23);

        // Kepala
        g2.fillOval(x - 4, y - 14, 8, 8);

        // Antena
        g2.setStroke(new java.awt.BasicStroke(1.5f));
        g2.drawArc(x - 13, y - 22, 13, 13, 20, 100);
        g2.drawArc(x, y - 22, 13, 13, 60, 100);
    }
}
}
