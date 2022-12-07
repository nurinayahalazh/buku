package program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Penulis extends javax.swing.JFrame {

    DefaultTableModel table = new DefaultTableModel();
    
    public Penulis() {
        initComponents();
        table.addColumn("ID Penulis");
        table.addColumn("Nama Penulis");
        table.addColumn("Asal Penulis");
        tabel_penulis.setModel(table);
        tampiltabel();
        clear_form();
    }

    private void clear_form() {
        id_penulis.setText(null);
        nama_penulis.setText(null);
        asal_penulis.setText(null);
    }

    public void tampiltabel(){
        int row = tabel_penulis.getRowCount();
            for(int a = 0 ; a < row ; a++){
                table.removeRow(0);
        }
        
        String query = "SELECT * FROM `penulis`";
        
        try{
            Connection connect = program.Utama.getKoneksi();
            java.sql.Statement sttmnt = connect.createStatement();
            ResultSet rslt = sttmnt.executeQuery(query);
            
            while (rslt.next()){
                String idp = rslt.getString("id_penulis");
                String np = rslt.getString("nama_penulis");
                String ap = rslt.getString("asal_penulis");                 
                    
                String[] data = {idp,np,ap};
                
                table.addRow(data);
            }
                tabel_penulis.setModel(table);
            
        }catch(Exception e){
            System.out.println(e);
        }  
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambah_penulis = new javax.swing.JButton();
        ubah_penulis = new javax.swing.JButton();
        hapus_penulis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_penulis = new javax.swing.JTable();
        data_buku = new javax.swing.JButton();
        id_penulis = new javax.swing.JTextField();
        nama_penulis = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        asal_penulis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tambah_penulis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        tambah_penulis.setText("TAMBAH PENULIS");
        tambah_penulis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tambah_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(tambah_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, 30));

        ubah_penulis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        ubah_penulis.setText("UBAH PENULIS");
        ubah_penulis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ubah_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(ubah_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 120, 30));

        hapus_penulis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        hapus_penulis.setText("HAPUS PENULIS");
        hapus_penulis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hapus_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(hapus_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 130, 30));

        tabel_penulis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_penulis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_penulisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_penulis);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 364, 140));

        data_buku.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        data_buku.setText("KE DATA BUKU");
        data_buku.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        data_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(data_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, 40));

        id_penulis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(id_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 90, 30));

        nama_penulis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nama_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(nama_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 120, 30));

        keluar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        keluar.setText("KELUAR");
        keluar.setToolTipText("");
        keluar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 90, 40));

        asal_penulis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        asal_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asal_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(asal_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sumber/Penulis.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_penulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_penulisActionPerformed

    private void nama_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_penulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_penulisActionPerformed

    private void ubah_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_penulisActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE penulis SET id_penulis='"+id_penulis.getText()+"',nama_penulis='"+nama_penulis.getText()+"',asal_penulis='"+asal_penulis.getText()+"' WHERE id_penulis = '"+id_penulis.getText()+"'";
            java.sql.Connection con = (Connection)Utama.getKoneksi();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Ubah Penulis Berhasil");  
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampiltabel();
        clear_form();
    }//GEN-LAST:event_ubah_penulisActionPerformed

    private void tambah_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_penulisActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO penulis VALUES ('"+id_penulis.getText()+"','"+nama_penulis.getText()+"','"+asal_penulis.getText()+"')";
            java.sql.Connection con = (Connection)Utama.getKoneksi();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Tambah Penulis Berhasil");
            tampiltabel();
            clear_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tambah_penulisActionPerformed

    private void hapus_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_penulisActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM penulis WHERE id_penulis='"+id_penulis.getText()+"'";
            java.sql.Connection con = (Connection)Utama.getKoneksi();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Penulis Berhasil");
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampiltabel();
        clear_form();
    }//GEN-LAST:event_hapus_penulisActionPerformed

    private void tabel_penulisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_penulisMouseClicked
        // TODO add your handling code here:
        int row = tabel_penulis.getSelectedRow();
        
        String idp = tabel_penulis.getValueAt(row, 0).toString();
        id_penulis.setText(idp);
        
        String np = tabel_penulis.getValueAt(row, 1).toString();
        nama_penulis.setText(np);
        
        String ap = tabel_penulis.getValueAt(row, 2).toString();
        asal_penulis.setText(ap);
    }//GEN-LAST:event_tabel_penulisMouseClicked

    private void asal_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asal_penulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asal_penulisActionPerformed

    private void data_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_bukuActionPerformed
        // TODO add your handling code here:
        new Buku().show();
        this.dispose();
    }//GEN-LAST:event_data_bukuActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new Keluar().show();
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Penulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penulis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asal_penulis;
    private javax.swing.JButton data_buku;
    private javax.swing.JButton hapus_penulis;
    private javax.swing.JTextField id_penulis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama_penulis;
    private javax.swing.JTable tabel_penulis;
    private javax.swing.JButton tambah_penulis;
    private javax.swing.JButton ubah_penulis;
    // End of variables declaration//GEN-END:variables
}
