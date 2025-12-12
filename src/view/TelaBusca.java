/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class TelaBusca extends javax.swing.JFrame {

    /**
     * Creates new form TelaBusca
     */
    public TelaBusca() {
        initComponents();
    }

public ResultSet buscarJogo(String nome, String plataforma) {
    try {
        Connection con = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM jogos WHERE nome LIKE ? AND plataforma = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, "%" + nome + "%");
        stmt.setString(2, plataforma);

        return stmt.executeQuery();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro na busca: " + e.getMessage());
        return null;
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeJogo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbSteam = new javax.swing.JCheckBox();
        cbEpic = new javax.swing.JCheckBox();
        cbXbox = new javax.swing.JCheckBox();
        cbPlay = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        btnWishlist = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("archanjOS");

        jLabel2.setText("Game Name");

        txtNomeJogo.setText("ex: Detroit Become Human");
        txtNomeJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeJogoActionPerformed(evt);
            }
        });

        jLabel3.setText("Platforms");

        cbSteam.setText("Steam");
        cbSteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSteamActionPerformed(evt);
            }
        });

        cbEpic.setText("Switch");

        cbXbox.setText("Xbox");

        cbPlay.setText("Playstation");

        btnBuscar.setText("Search!");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnWishlist.setText("My Wishlist");
        btnWishlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWishlistActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnWishlist)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbSteam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbXbox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbEpic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPlay))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnWishlist)
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSteam)
                    .addComponent(cbXbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEpic)
                    .addComponent(cbPlay))
                .addGap(26, 26, 26)
                .addComponent(btnBuscar)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeJogoActionPerformed

    private void cbSteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSteamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSteamActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    String nome = txtNomeJogo.getText();
    String plataforma = null;

    if (cbSteam.isSelected()) plataforma = "Steam";
    if (cbXbox.isSelected()) plataforma = "Xbox";
    if (cbPlay.isSelected()) plataforma = "Playstation";
    if (cbEpic.isSelected()) plataforma = "Switch";

    // VERIFICAÇÃO IMPORTANTE
    if (plataforma == null) {
        JOptionPane.showMessageDialog(this, "Selecione uma plataforma.");
        return;
    }

    ResultSet rs = buscarJogo(nome, plataforma);

    try {
        if (rs != null && rs.next()) {

            String nomeJogo = rs.getString("nome");
            String preco = rs.getString("preco");
            String descricao = rs.getString("descricao");
            String plataf = rs.getString("plataforma");

            TelaDetalhes tela = new TelaDetalhes(nomeJogo, preco, descricao, plataf);
            tela.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Nenhum jogo encontrado.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao abrir detalhes: " + e.getMessage());
    }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnWishlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishlistActionPerformed
TelaWishlist tela = new TelaWishlist();
tela.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWishlistActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnWishlist;
    private javax.swing.JCheckBox cbEpic;
    private javax.swing.JCheckBox cbPlay;
    private javax.swing.JCheckBox cbSteam;
    private javax.swing.JCheckBox cbXbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNomeJogo;
    // End of variables declaration//GEN-END:variables
}
