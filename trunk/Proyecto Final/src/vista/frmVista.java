/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flor-PC
 */
public class frmVista extends javax.swing.JFrame {

    DefaultTableModel dtm;
    String qfila[];
    String xcolumna[];

    public frmVista() {
        initComponents();

    }
    CaracteresNoExistentes noextiste = new CaracteresNoExistentes();

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
        txtQ = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnReconcer = new javax.swing.JButton();
        txtReconoce = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProceso = new javax.swing.JTextArea();
        txtTIRA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQo = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        btnMatriz = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        matrizTranscion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PROYECTO DE MATE");

        jLabel2.setText("Q =");

        jLabel3.setText("X=");

        txtQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQKeyReleased(evt);
            }
        });

        txtX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtXKeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("RECONOCER TIRAS"));

        jLabel6.setText("Tira a reconocer:");

        btnReconcer.setText("RECONOCER");
        btnReconcer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReconcerActionPerformed(evt);
            }
        });

        txtProceso.setColumns(20);
        txtProceso.setRows(5);
        jScrollPane1.setViewportView(txtProceso);

        txtTIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIRAActionPerformed(evt);
            }
        });
        txtTIRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTIRAKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReconcer)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTIRA))
                        .addComponent(txtReconoce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReconcer)
                .addGap(18, 18, 18)
                .addComponent(txtReconoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel4.setText("Qo=");

        jLabel5.setText("F=");

        txtQo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQoKeyReleased(evt);
            }
        });

        txtFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFinalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFinalKeyReleased(evt);
            }
        });

        btnMatriz.setText("MATRIZ DE TRANSICION");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        matrizTranscion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C"
            }
        ));
        matrizTranscion.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                matrizTranscionComponentAdded(evt);
            }
        });
        matrizTranscion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                matrizTranscionFocusGained(evt);
            }
        });
        matrizTranscion.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                matrizTranscionCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                matrizTranscionInputMethodTextChanged(evt);
            }
        });
        matrizTranscion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matrizTranscionKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(matrizTranscion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtFinal))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtQo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMatriz)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQ, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtX))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnMatriz)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIRAActionPerformed

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        String estados = txtQ.getText();
        String lengu = txtX.getText();
        if (!estados.equals("") && !estados.equals(null) && !lengu.equals("") && !lengu.equals(null)) {

            String q = txtQ.getText();
            String x = txtX.getText();
            qfila = q.replaceAll(" ", "").split(",");
            xcolumna = ("," + x.replaceAll(" ", "")).split(",");
            DefaultTableModel dtm = (DefaultTableModel) matrizTranscion.getModel();
            dtm.setColumnCount(xcolumna.length + 1);
            dtm.setNumRows(qfila.length);
            dtm.setColumnIdentifiers(xcolumna);
            for (int i = 0; i < qfila.length; i++) {
                matrizTranscion.setValueAt(qfila[i], i, 0);
            }
            matrizTranscion.getColumnModel().getColumn(0).setCellRenderer(matrizTranscion.getTableHeader().getDefaultRenderer());
        } else {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS");
        }

    }//GEN-LAST:event_btnMatrizActionPerformed

    private void txtQoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQoKeyPressed
        String[] u = txtQ.getText().split(",");
        if (!noextiste.presionTecla(evt, u) && !evt.getKeyText(evt.getKeyCode()).equals("Coma") && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")) {
            JOptionPane.showMessageDialog(this, "El elemnto " + evt.getKeyText(evt.getKeyCode()) + " no pertenece al conjunto de estados");
            txtQo.setText(txtQo.getText().substring(0, txtQo.getText().length() - 1));
        }
    }//GEN-LAST:event_txtQoKeyPressed

    private void txtFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalKeyPressed
        String[] u = txtQ.getText().split(",");
        if (!noextiste.presionTecla(evt, u) && !evt.getKeyText(evt.getKeyCode()).equals("Coma") && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")) {
            JOptionPane.showMessageDialog(this, "El elemnto " + evt.getKeyText(evt.getKeyCode()) + " no pertenece al conjunto de estados");
            txtFinal.setText(txtFinal.getText().substring(0, txtFinal.getText().length() - 1));
        }
    }//GEN-LAST:event_txtFinalKeyPressed

    private void txtQKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQKeyReleased
        // TODO add your handling code here:
        try {
            String[] u = txtQ.getText().substring(0, txtQ.getText().length() - 1).split(",");
            if (!evt.getKeyText(evt.getKeyCode()).equals("Coma")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Intro")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Mayús")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Izquierda")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Derecha")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")) {
//                JOptionPane.showMessageDialog(this, txtQ.getText().substring(txtQ.getText().length() - 2, txtQ.getText().length() - 1));

                if (noextiste.presionTecla(evt, u)) {
                    txtQ.setText(txtQ.getText().substring(0, txtQ.getText().length() - 1));

                } else if (!evt.getKeyText(evt.getKeyCode()).equals(",")
                        && !txtQ.getText().substring(txtQ.getText().length() - 2, txtQ.getText().length() - 1).equals(",")
                        && !txtQ.getText().substring(0, txtQ.getText().length() - 1).equals("")) {
                    txtQ.setText(txtQ.getText().substring(0, txtQ.getText().length() - 1) + "," + txtQ.getText().substring(txtQ.getText().length() - 1, txtQ.getText().length()));
                }

            }
            if (txtQ.getText().substring(txtQ.getText().length() - 2, txtQ.getText().length() - 1).equals(evt.getKeyChar() + "")) {

                txtQ.setText(txtQ.getText().substring(0, txtQ.getText().length() - 1));


            }

        } catch (Exception e) {
        }
        txtQ.setText(txtQ.getText().toUpperCase());
    }//GEN-LAST:event_txtQKeyReleased

    private void txtXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXKeyReleased
        // TODO add your handling code here:
        try {
            String[] u = txtX.getText().substring(0, txtX.getText().length() - 1).split(",");
            if (!evt.getKeyText(evt.getKeyCode()).equals("Coma")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Intro")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Mayús")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Izquierda")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Derecha")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")) {


                if (noextiste.presionTecla(evt, u)) {


                    txtX.setText(txtX.getText().substring(0, txtX.getText().length() - 1));

                } else if (!evt.getKeyText(evt.getKeyCode()).equals(",")
                        && !txtX.getText().substring(txtX.getText().length() - 2, txtX.getText().length() - 1).equals(",")
                        && !txtX.getText().substring(0, txtX.getText().length() - 1).equals("")) {
                    txtX.setText(txtX.getText().substring(0, txtX.getText().length() - 1) + "," + txtX.getText().substring(txtX.getText().length() - 1, txtX.getText().length()));
                }

            }
            if (txtX.getText().substring(txtX.getText().length() - 2, txtX.getText().length() - 1).equals(evt.getKeyChar() + "")) {

                txtX.setText(txtX.getText().substring(0, txtX.getText().length() - 1));


            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtXKeyReleased

    private void txtQoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQoKeyReleased
        // TODO add your handling code here:
        try {
            String[] u = txtQo.getText().substring(0, txtQo.getText().length() - 1).split(",");
            if (!evt.getKeyText(evt.getKeyCode()).equals("Coma")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Intro")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Mayús")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Izquierda")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Derecha")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")) {


                if (noextiste.presionTecla(evt, u)) {
                    txtQo.setText(txtQo.getText().substring(0, txtQo.getText().length() - 1));

                } else if (!evt.getKeyText(evt.getKeyCode()).equals(",")
                        && !txtQo.getText().substring(txtQo.getText().length() - 2, txtQo.getText().length() - 1).equals(",")
                        && !txtQo.getText().substring(0, txtQo.getText().length() - 1).equals("")) {
                    txtQo.setText(txtQo.getText().substring(0, txtQo.getText().length() - 1) + "," + txtQo.getText().substring(txtQo.getText().length() - 1, txtQo.getText().length()));
                }

            }
            if (txtQo.getText().substring(txtQo.getText().length() - 2, txtQo.getText().length() - 1).equals(evt.getKeyChar() + "")) {

                txtQ.setText(txtQo.getText().substring(0, txtQo.getText().length() - 1));


            }

        } catch (Exception e) {
        }
        txtQo.setText(txtQo.getText().toUpperCase());
    }//GEN-LAST:event_txtQoKeyReleased

    private void txtFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalKeyReleased
        // TODO add your handling code here:
        try {
            String[] u = txtFinal.getText().substring(0, txtFinal.getText().length() - 1).split(",");
            if (!evt.getKeyText(evt.getKeyCode()).equals("Coma")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Intro")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Mayús")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Izquierda")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Derecha")
                    && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")) {
//                JOptionPane.showMessageDialog(this, txtQ.getText().substring(txtQ.getText().length() - 2, txtQ.getText().length() - 1));

                if (noextiste.presionTecla(evt, u)) {
                    txtFinal.setText(txtFinal.getText().substring(0, txtFinal.getText().length() - 1));

                } else if (!evt.getKeyText(evt.getKeyCode()).equals(",")
                        && !txtFinal.getText().substring(txtFinal.getText().length() - 2, txtFinal.getText().length() - 1).equals(",")
                        && !txtFinal.getText().substring(0, txtFinal.getText().length() - 1).equals("")) {
                    txtFinal.setText(txtFinal.getText().substring(0, txtFinal.getText().length() - 1) + "," + txtFinal.getText().substring(txtFinal.getText().length() - 1, txtFinal.getText().length()));
                }

            }
            if (txtFinal.getText().substring(txtFinal.getText().length() - 2, txtFinal.getText().length() - 1).equals(evt.getKeyChar() + "")) {

                txtFinal.setText(txtFinal.getText().substring(0, txtFinal.getText().length() - 1));


            }

        } catch (Exception e) {
        }
        txtFinal.setText(txtFinal.getText().toUpperCase());
    }//GEN-LAST:event_txtFinalKeyReleased

    private void matrizTranscionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matrizTranscionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizTranscionKeyPressed

    private void btnReconcerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReconcerActionPerformed
        // TODO add your handling code here:
        Automata a = new Automata(matriz(), txtQo.getText().split(","), txtFinal.getText().split(","), txtX.getText().split(","), txtQ.getText().split(","));
        a.iniciarTira(txtTIRA.getText());
        txtReconoce.setText(a.tv);
        a.cadenaPrecedencia(txtProceso);

    }//GEN-LAST:event_btnReconcerActionPerformed

    private void matrizTranscionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matrizTranscionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizTranscionFocusGained

    private void matrizTranscionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_matrizTranscionInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizTranscionInputMethodTextChanged

    private void matrizTranscionCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_matrizTranscionCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizTranscionCaretPositionChanged

    private void matrizTranscionComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_matrizTranscionComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizTranscionComponentAdded

    private void txtTIRAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTIRAKeyPressed
        // TODO add your handling code here:
        String[] u = txtX.getText().split(",");
        if (!noextiste.presionTecla(evt, u) && !evt.getKeyText(evt.getKeyCode()).equals("Coma")
                && !evt.getKeyText(evt.getKeyCode()).equals("Retroceso")
                && !evt.getKeyText(evt.getKeyCode()).equals("Mayús")) {
            JOptionPane.showMessageDialog(this, "El elemnto " + evt.getKeyText(evt.getKeyCode()) + " no pertenece al conjunto de estados");
            txtTIRA.setText(txtTIRA.getText().substring(0, txtTIRA.getText().length() - 1));
        }
    }//GEN-LAST:event_txtTIRAKeyPressed

    private String[][] matriz() {

        String[][] b = new String[matrizTranscion.getRowCount()][matrizTranscion.getColumnCount() - 1];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (matrizTranscion.getValueAt(i, j + 1) == null) {
//                    JOptionPane.showMessageDialog(this, "");
                    b[i][j] = "";

                } else {
//                    JOptionPane.showMessageDialog(this, String.valueOf(matrizTranscion.getValueAt(i, j + 1)));
                    b[i][j] = String.valueOf(matrizTranscion.getValueAt(i, j + 1));

                }

            }

        }
//        System.out.println(b.length+" "+b[0].length);
        return b;
    }

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
            java.util.logging.Logger.getLogger(frmVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnReconcer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable matrizTranscion;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextArea txtProceso;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtQo;
    private javax.swing.JTextField txtReconoce;
    private javax.swing.JTextField txtTIRA;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
