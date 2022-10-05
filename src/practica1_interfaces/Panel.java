/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica1_interfaces;

import javax.swing.JFrame;

/**
 *
 * @author Ismael
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
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

        capa0 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        capaMenu = new javax.swing.JPanel();
        jbAnimals = new javax.swing.JButton();
        jbCuidadores = new javax.swing.JButton();
        jbCares = new javax.swing.JButton();
        jbEspecialidad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMenu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zoolandia");

        jbAnimals.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbAnimals.setText("Animales");
        jbAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnimalsActionPerformed(evt);
            }
        });

        jbCuidadores.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbCuidadores.setText("Cuidadores");
        jbCuidadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCuidadoresActionPerformed(evt);
            }
        });

        jbCares.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbCares.setText("Cuidadores");
        jbCares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCaresActionPerformed(evt);
            }
        });

        jbEspecialidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbEspecialidad.setText("Especialidad");
        jbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout capaMenuLayout = new javax.swing.GroupLayout(capaMenu);
        capaMenu.setLayout(capaMenuLayout);
        capaMenuLayout.setHorizontalGroup(
            capaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capaMenuLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbAnimals)
                .addGap(58, 58, 58)
                .addComponent(jbCuidadores)
                .addGap(58, 58, 58)
                .addComponent(jbCares)
                .addGap(58, 58, 58)
                .addComponent(jbEspecialidad)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        capaMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAnimals, jbCares, jbCuidadores, jbEspecialidad});

        capaMenuLayout.setVerticalGroup(
            capaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capaMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(capaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnimals)
                    .addComponent(jbCuidadores)
                    .addComponent(jbCares)
                    .addComponent(jbEspecialidad))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Animal", "Cuidador", "Cuidados", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTableMenu);

        javax.swing.GroupLayout capa0Layout = new javax.swing.GroupLayout(capa0);
        capa0.setLayout(capa0Layout);
        capa0Layout.setHorizontalGroup(
            capa0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(capaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        capa0Layout.setVerticalGroup(
            capa0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capa0Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(capaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capa0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capa0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnimalsActionPerformed

        addAnimals open = new addAnimals();
        open.setVisible(true);

    }//GEN-LAST:event_jbAnimalsActionPerformed

    private void jbCuidadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCuidadoresActionPerformed
        
        addcuidadores open = new addcuidadores();
        open.setVisible(true);
        
    }//GEN-LAST:event_jbCuidadoresActionPerformed

    private void jbCaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCaresActionPerformed

        addCuidados open = new addCuidados();
        open.setVisible(true);
        
    }//GEN-LAST:event_jbCaresActionPerformed

    private void jbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEspecialidadActionPerformed
        
        addEspecialidad open = new addEspecialidad();
        open.setVisible(true);
        
    }//GEN-LAST:event_jbEspecialidadActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel capa0;
    private javax.swing.JPanel capaMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMenu;
    private javax.swing.JButton jbAnimals;
    private javax.swing.JButton jbCares;
    private javax.swing.JButton jbCuidadores;
    private javax.swing.JButton jbEspecialidad;
    // End of variables declaration//GEN-END:variables
}
