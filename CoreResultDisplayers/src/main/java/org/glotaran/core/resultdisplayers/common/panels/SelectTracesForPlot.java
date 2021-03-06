package org.glotaran.core.resultdisplayers.common.panels;

import java.util.Formatter;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.NbBundle;

/**
 *
 * @author Sergey
 */
public class SelectTracesForPlot extends java.awt.Panel {

    private int numXCh, numYCh;

    public SelectTracesForPlot() {
        initComponents();
    }
    
    public SelectTracesForPlot(double timeStart, double timeEnd, double waveStart, double waveEnd) {
        initComponents();
        jTXCollectionStart.setText(String.format("%6.2f",timeStart));
        jTXCollectionEnd.setText(String.format("%6.2f",timeEnd));
        jTYCollectionStart.setText(String.format("%6.4f",waveStart));
        jTYCollectionEnd.setText(String.format("%6.4g",waveEnd));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jCbTraceColY = new javax.swing.JCheckBox();
        jCbTraceColX = new javax.swing.JCheckBox();
        jPWaveColection = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTXnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTXCollectionStart = new javax.swing.JTextField();
        jTXCollectionEnd = new javax.swing.JTextField();
        jCBAppendXCollection = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPTimeColection = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTYCollectionStart = new javax.swing.JTextField();
        jTYCollectionEnd = new javax.swing.JTextField();
        jCBAppendYCollection = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTYnum = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        jCbTraceColY.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jCbTraceColY.text")); // NOI18N
        jCbTraceColY.setActionCommand(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jCbTraceColY.actionCommand")); // NOI18N
        jCbTraceColY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTraceColYActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCbTraceColY, gridBagConstraints);

        jCbTraceColX.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jCbTraceColX.text")); // NOI18N
        jCbTraceColX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTraceColXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCbTraceColX, gridBagConstraints);

        jPWaveColection.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel2.text")); // NOI18N
        jLabel2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPWaveColection.add(jLabel2, gridBagConstraints);

        jTXnum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTXnum.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jTXnum.text")); // NOI18N
        jTXnum.setEnabled(false);
        jTXnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTXnumKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPWaveColection.add(jTXnum, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel3.text")); // NOI18N
        jLabel3.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPWaveColection.add(jLabel3, gridBagConstraints);

        jTXCollectionStart.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTXCollectionStart.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jTXCollectionStart.text")); // NOI18N
        jTXCollectionStart.setEnabled(false);
        jTXCollectionStart.setMinimumSize(new java.awt.Dimension(80, 20));
        jTXCollectionStart.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPWaveColection.add(jTXCollectionStart, gridBagConstraints);

        jTXCollectionEnd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTXCollectionEnd.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jTXCollectionEnd.text")); // NOI18N
        jTXCollectionEnd.setEnabled(false);
        jTXCollectionEnd.setMinimumSize(new java.awt.Dimension(80, 20));
        jTXCollectionEnd.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPWaveColection.add(jTXCollectionEnd, gridBagConstraints);

        jCBAppendXCollection.setSelected(true);
        jCBAppendXCollection.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jCBAppendXCollection.text")); // NOI18N
        jCBAppendXCollection.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPWaveColection.add(jCBAppendXCollection, gridBagConstraints);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel5.text")); // NOI18N
        jLabel5.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPWaveColection.add(jLabel5, gridBagConstraints);

        jLabel6.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel6.text")); // NOI18N
        jLabel6.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPWaveColection.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 5);
        add(jPWaveColection, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(jSeparator1, gridBagConstraints);

        jPTimeColection.setLayout(new java.awt.GridBagLayout());

        jLabel8.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel8.text")); // NOI18N
        jLabel8.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPTimeColection.add(jLabel8, gridBagConstraints);

        jTYCollectionStart.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTYCollectionStart.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jTYCollectionStart.text")); // NOI18N
        jTYCollectionStart.setEnabled(false);
        jTYCollectionStart.setMinimumSize(new java.awt.Dimension(80, 20));
        jTYCollectionStart.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPTimeColection.add(jTYCollectionStart, gridBagConstraints);

        jTYCollectionEnd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTYCollectionEnd.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jTYCollectionEnd.text")); // NOI18N
        jTYCollectionEnd.setEnabled(false);
        jTYCollectionEnd.setMinimumSize(new java.awt.Dimension(80, 20));
        jTYCollectionEnd.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPTimeColection.add(jTYCollectionEnd, gridBagConstraints);

        jCBAppendYCollection.setSelected(true);
        jCBAppendYCollection.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jCBAppendYCollection.text")); // NOI18N
        jCBAppendYCollection.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPTimeColection.add(jCBAppendYCollection, gridBagConstraints);

        jLabel9.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel9.text")); // NOI18N
        jLabel9.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPTimeColection.add(jLabel9, gridBagConstraints);

        jLabel10.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel10.text")); // NOI18N
        jLabel10.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPTimeColection.add(jLabel10, gridBagConstraints);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jLabel1.text")); // NOI18N
        jLabel1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPTimeColection.add(jLabel1, gridBagConstraints);

        jTYnum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTYnum.setText(org.openide.util.NbBundle.getMessage(SelectTracesForPlot.class, "SelectTracesForPlot.jTYnum.text")); // NOI18N
        jTYnum.setEnabled(false);
        jTYnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTYnumKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPTimeColection.add(jTYnum, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 5);
        add(jPTimeColection, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jCbTraceColXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTraceColXActionPerformed
        for (int i = 0; i<jPWaveColection.getComponents().length; i++){
            jPWaveColection.getComponents()[i].setEnabled(jCbTraceColX.isSelected());
//        jTXnum.setEnabled(jCbTraceColX.isSelected());
//        jLabel2.setEnabled(jCbTraceColX.isSelected());
        }
    }//GEN-LAST:event_jCbTraceColXActionPerformed

    private void jCbTraceColYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTraceColYActionPerformed
        for (int i = 0; i<jPTimeColection.getComponents().length; i++){
            jPTimeColection.getComponents()[i].setEnabled(jCbTraceColY.isSelected());
        }
//        jTYnum.setEnabled(jCbTraceColY.isSelected());
//        jLabel1.setEnabled(jCbTraceColY.isSelected());
    }//GEN-LAST:event_jCbTraceColYActionPerformed

    private void jTXnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTXnumKeyReleased
        if (Integer.parseInt(jTXnum.getText()) > numXCh) {
            NotifyDescriptor errorMessage = new NotifyDescriptor.Exception(
                    new Exception(NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("set_correct_chanNum")
                    + NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("setLess") + String.valueOf(numXCh)));
            DialogDisplayer.getDefault().notify(errorMessage);
            jTXnum.setText(String.valueOf(numXCh));
        }
    }//GEN-LAST:event_jTXnumKeyReleased

    private void jTYnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTYnumKeyReleased
        if (Integer.parseInt(jTYnum.getText()) > numYCh) {
            NotifyDescriptor errorMessage = new NotifyDescriptor.Exception(
                    new Exception(NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("set_correct_chanNum")
                    + NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("setLess") + String.valueOf(numYCh)));
            DialogDisplayer.getDefault().notify(errorMessage);
            jTYnum.setText(String.valueOf(numYCh));
        }

    }//GEN-LAST:event_jTYnumKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCBAppendXCollection;
    private javax.swing.JCheckBox jCBAppendYCollection;
    private javax.swing.JCheckBox jCbTraceColX;
    private javax.swing.JCheckBox jCbTraceColY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPTimeColection;
    private javax.swing.JPanel jPWaveColection;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTXCollectionEnd;
    private javax.swing.JTextField jTXCollectionStart;
    private javax.swing.JTextField jTXnum;
    private javax.swing.JTextField jTYCollectionEnd;
    private javax.swing.JTextField jTYCollectionStart;
    private javax.swing.JTextField jTYnum;
    // End of variables declaration//GEN-END:variables

    public void setMaxNumbers(int x, int y) {
        numXCh = x;
        numYCh = y;
    }

    public boolean getSelectXState() {
        return jCbTraceColX.isSelected();
    }

    public boolean getSelectYState() {
        return jCbTraceColY.isSelected();
    }

    public int getSelectXNum() {
        return Integer.parseInt(jTXnum.getText());
    }

    public int getSelectYNum() {
        return Integer.parseInt(jTYnum.getText());
    }

    public void setEnabledXDimension(boolean state) {
        jCbTraceColX.setEnabled(state);
    }

    public void setEnabledYDimension(boolean state) {
        jCbTraceColY.setEnabled(state);
    }
    public double getSelectXStart(){
        return Double.parseDouble(jTXCollectionStart.getText());
    }
    
    public double getSelectXEnd(){
        return Double.parseDouble(jTXCollectionEnd.getText());
    }
    
    public double getSelectYStart(){
        return Double.parseDouble(jTYCollectionStart.getText());
    }
    
    public double getSelectYEnd(){
        return Double.parseDouble(jTYCollectionEnd.getText());
    }
    
    public boolean isXCollectionAppend(){
        return jCBAppendXCollection.isSelected();
    }
    
    public boolean isYCollectionAppend(){
        return jCBAppendYCollection.isSelected();
    }
}
