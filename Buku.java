package program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buku extends javax.swing.JFrame {

    DefaultTableModel table = new DefaultTableModel();
    
    public Buku() {
        initComponents();
        table.addColumn("Kode Buku");
        table.addColumn("Judul Buku");
        table.addColumn("ID Penulis");
        table.addColumn("Publis Buku");
        table.addColumn("Genre Buku");
        tabel_buku.setModel(table);
        tampiltabel();
        clear_form();
    }
    
    private void clear_form() {
        kode_buku.setText(null);
        judul_buku.setText(null);
        id_penulis.setText(null);
        publis_buku.setText(null);
        genre_buku.setText(null);
    }
    
    public void tampiltabel(){
        int row = tabel_buku.getRowCount();
            for(int a = 0 ; a < row ; a++){
                table.removeRow(0);
        }
        
        String query = "SELECT * FROM `buku`";
        
        try{
            Connection connect = program.Utama.getKoneksi();
            java.sql.Statement sttmnt = connect.createStatement();
            ResultSet rslt = sttmnt.executeQuery(query);
            
            while (rslt.next()){
                String kb = rslt.getString("kode_buku");
                String jb = rslt.getString("judul_buku");
                String idp = rslt.getString("id_penulis");
                String pb = rslt.getString("publis_buku");
                String gb = rslt.getString("genre_buku");                 
                    
                String[] data = {kb,jb,idp,pb,gb};
                
                table.addRow(data);
            }
                tabel_buku.setModel(table);
            
        }catch(Exception e){
            System.out.println(e);
        }  
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        kode_buku = new javax.swing.JTextField();
        judul_buku = new javax.swing.JTextField();
        publis_buku = new javax.swing.JTextField();
        genre_buku = new javax.swing.JTextField();
        tambah_buku = new javax.swing.JButton();
        ubah_buku = new javax.swing.JButton();
        hapus_buku = new javax.swing.JButton();
        data_penulis = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        id_penulis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_buku.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabel_buku.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_buku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 420, 140));

        kode_buku.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        kode_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(kode_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 100, 30));

        judul_buku.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        judul_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judul_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(judul_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 100, 30));

        publis_buku.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        publis_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publis_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(publis_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 100, 30));

        genre_buku.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        genre_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genre_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(genre_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 100, 30));

        tambah_buku.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        tambah_buku.setText("TAMBAH BUKU");
        tambah_buku.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tambah_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(tambah_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, 30));

        ubah_buku.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        ubah_buku.setText("UBAH BUKU");
        ubah_buku.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ubah_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(ubah_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, 30));

        hapus_buku.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        hapus_buku.setText("HAPUS BUKU");
        hapus_buku.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hapus_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(hapus_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 120, 30));

        data_penulis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        data_penulis.setText("KE DATA PENULIS");
        data_penulis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        data_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(data_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 150, 40));

        keluar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        keluar.setText("KELUAR");
        keluar.setToolTipText("");
        keluar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 100, 40));

        id_penulis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id_penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_penulisActionPerformed(evt);
            }
        });
        getContentPane().add(id_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sumber/Buku.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kode_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_bukuActionPerformed

    private void judul_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judul_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judul_bukuActionPerformed

    private void tambah_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_bukuActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO buku VALUES ('"+kode_buku.getText()+"','"+judul_buku.getText()+"','"+id_penulis.getText()+"','"+publis_buku.getText()+"','"+genre_buku.getText()+"')";
            java.sql.Connection con = (Connection)Utama.getKoneksi();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Tambah Buku Berhasil");
            tampiltabel();
            clear_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tambah_bukuActionPerformed

    private void tabel_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_bukuMouseClicked
        // TODO add your handling code here:
        int row = tabel_buku.getSelectedRow();
        
        String kb = tabel_buku.getValueAt(row, 0).toString();
        kode_buku.setText(kb);
        
        String jb = tabel_buku.getValueAt(row, 1).toString();
        judul_buku.setText(jb);
        
        String idp = tabel_buku.getValueAt(row, 2).toString();
        id_penulis.setText(idp);
        
        String pb = tabel_buku.getValueAt(row, 3).toString();
        publis_buku.setText(pb);
        
        String gb = tabel_buku.getValueAt(row, 4).toString();
        genre_buku.setText(gb);
      
    }//GEN-LAST:event_tabel_bukuMouseClicked
    
    private void ubah_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_bukuActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE buku SET kode_buku='"+kode_buku.getText()+"',judul_buku='"+judul_buku.getText()+"',id_penulis='"+id_penulis.getText()+"',publis_buku='"+publis_buku.getText()+"',genre_buku='"+genre_buku.getText()+"' WHERE kode_buku = '"+kode_buku.getText()+"'";
            java.sql.Connection con = (Connection)Utama.getKoneksi();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Ubah Buku Berhasil");  
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampiltabel();
        clear_form();
    }//GEN-LAST:event_ubah_bukuActionPerformed

    private void hapus_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_bukuActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM buku WHERE kode_buku='"+kode_buku.getText()+"'";
            java.sql.Connection con = (Connection)Utama.getKoneksi();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Buku Berhasil");
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampiltabel();
        clear_form();
    }//GEN-LAST:event_hapus_bukuActionPerformed

    private void data_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_penulisActionPerformed
        // TODO add your handling code here:
        new Penulis().show();
        this.dispose();
    }//GEN-LAST:event_data_penulisActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new Keluar().show();
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void publis_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publis_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publis_bukuActionPerformed

    private void genre_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genre_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genre_bukuActionPerformed

    private void id_penulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_penulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_penulisActionPerformed

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
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton data_penulis;
    private javax.swing.JTextField genre_buku;
    private javax.swing.JButton hapus_buku;
    private javax.swing.JTextField id_penulis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul_buku;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kode_buku;
    private javax.swing.JTextField publis_buku;
    private javax.swing.JTable tabel_buku;
    private javax.swing.JButton tambah_buku;
    private javax.swing.JButton ubah_buku;
    // End of variables declaration//GEN-END:variables
}
