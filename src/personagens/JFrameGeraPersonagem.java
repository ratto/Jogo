package personagens;


import javax.annotation.Resource;
import javax.swing.JOptionPane;

/*
 * Copyright (C) 2015 PedroRatto
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author PedroRatto
 */
public class JFrameGeraPersonagem extends javax.swing.JFrame {
    
    Personagem escolhido = new Personagem() {

        @Override
        public int atacar() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int defender() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    /**
     * Creates new form JFrameGeraPersonagem
     */
    public JFrameGeraPersonagem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextHp = new javax.swing.JTextField();
        jTextArmadura = new javax.swing.JTextField();
        jTextForca = new javax.swing.JTextField();
        jTextDestreza = new javax.swing.JTextField();
        jTextInteligencia = new javax.swing.JTextField();
        jBtnGerarPersonagem = new javax.swing.JButton();
        jComboEspecializacao = new javax.swing.JComboBox();
        jBtnLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBtnGravar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelGravados = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("HP:");

        jLabel3.setText("Armadura:");

        jLabel4.setText("Força:");

        jLabel5.setText("Destreza:");

        jLabel6.setText("Inteligencia:");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextHp.setEditable(false);
        jTextHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHpActionPerformed(evt);
            }
        });

        jTextArmadura.setEditable(false);

        jTextForca.setEditable(false);

        jTextDestreza.setEditable(false);

        jTextInteligencia.setEditable(false);

        jBtnGerarPersonagem.setText("Gerar Personagem");
        jBtnGerarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGerarPersonagemActionPerformed(evt);
            }
        });

        jComboEspecializacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guerreiro", "Ranger", "Mago", "Defensor" }));
        jComboEspecializacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEspecializacaoActionPerformed(evt);
            }
        });

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Gerador de Personagens");

        jBtnGravar.setText("Gravar");
        jBtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGravarActionPerformed(evt);
            }
        });

        jButton2.setText("Combate até a morte!");

        jLabel8.setText("Combatentes:");

        jLabel9.setText("/ 10");

        jLabelGravados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGravados.setText("0");

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextNome)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextForca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextHp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnGerarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelGravados, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jBtnLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBtnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jTextInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGerarPersonagem))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpar)
                    .addComponent(jBtnGravar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabelGravados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHpActionPerformed

    private void jBtnGerarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGerarPersonagemActionPerformed
        // TODO add your handling code here:
        
        jTextHp.setText(null);
        jTextArmadura.setText(null);
        jTextForca.setText(null);
        jTextDestreza.setText(null);
        jTextInteligencia.setText(null);
        
        if(jComboEspecializacao.getSelectedItem()=="Guerreiro") {
            Guerreiro guerreiro = new Guerreiro();
            guerreiro.geraPersonagem();
            guerreiro.setNome(jTextNome.getText());
            jTextHp.setText(String.valueOf(guerreiro.getHp()));
            jTextArmadura.setText(String.valueOf(guerreiro.getArmadura()));
            jTextForca.setText(String.valueOf(guerreiro.getForca()));
            jTextDestreza.setText(String.valueOf(guerreiro.getDestreza()));
            jTextInteligencia.setText(String.valueOf(guerreiro.getInteligencia()));
            this.escolhido = guerreiro;
        } else if (jComboEspecializacao.getSelectedItem()=="Ranger") {
            Ranger ranger = new Ranger();
            ranger.geraPersonagem();
            ranger.setNome(jTextNome.getText());
            jTextHp.setText(String.valueOf(ranger.getHp()));
            jTextArmadura.setText(String.valueOf(ranger.getArmadura()));
            jTextForca.setText(String.valueOf(ranger.getForca()));
            jTextDestreza.setText(String.valueOf(ranger.getDestreza()));
            jTextInteligencia.setText(String.valueOf(ranger.getInteligencia()));
            this.escolhido = ranger;
        } else if (jComboEspecializacao.getSelectedItem()=="Mago") {
            Mago mago = new Mago();
            mago.geraPersonagem();
            mago.setNome(jTextNome.getText());
            jTextHp.setText(String.valueOf(mago.getHp()));
            jTextArmadura.setText(String.valueOf(mago.getArmadura()));
            jTextForca.setText(String.valueOf(mago.getForca()));
            jTextDestreza.setText(String.valueOf(mago.getDestreza()));
            jTextInteligencia.setText(String.valueOf(mago.getInteligencia()));
            this.escolhido = mago;
        } else if (jComboEspecializacao.getSelectedItem()=="Defensor") {
            Defensor defensor = new Defensor();
            defensor.geraPersonagem();
            defensor.setNome(jTextNome.getText());
            jTextHp.setText(String.valueOf(defensor.getHp()));
            jTextArmadura.setText(String.valueOf(defensor.getArmadura()));
            jTextForca.setText(String.valueOf(defensor.getForca()));
            jTextDestreza.setText(String.valueOf(defensor.getDestreza()));
            jTextInteligencia.setText(String.valueOf(defensor.getInteligencia()));
            this.escolhido = defensor;
        }
    }//GEN-LAST:event_jBtnGerarPersonagemActionPerformed

    private void jComboEspecializacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEspecializacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEspecializacaoActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        // TODO add your handling code here:
        jTextHp.setText(null);
        jTextArmadura.setText(null);
        jTextForca.setText(null);
        jTextDestreza.setText(null);
        jTextInteligencia.setText(null);
    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGravarActionPerformed
        // TODO add your handling code here:
        if (jTextNome.getText() == null){
            JOptionPane.showMessageDialog(null, "Nomeie o seu campeão!");
        } else {
            Vestiario.combatente.add(this.escolhido);
            jLabelGravados.setText(String.valueOf(Vestiario.getCombatentes()));
            jTextNome.setText(null);
            jTextHp.setText(null);
            jTextArmadura.setText(null);
            jTextForca.setText(null);
            jTextDestreza.setText(null);
            jTextInteligencia.setText(null);
        }
    }//GEN-LAST:event_jBtnGravarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameGeraPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGeraPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGeraPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGeraPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGeraPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGerarPersonagem;
    private javax.swing.JButton jBtnGravar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboEspecializacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGravados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextArmadura;
    private javax.swing.JTextField jTextDestreza;
    private javax.swing.JTextField jTextForca;
    private javax.swing.JTextField jTextHp;
    private javax.swing.JTextField jTextInteligencia;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
