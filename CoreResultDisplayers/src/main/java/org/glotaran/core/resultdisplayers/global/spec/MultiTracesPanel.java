/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MultiTracesPanel.java
 *
 * Created on Mar 18, 2010, 9:40:41 AM
 */
package org.glotaran.core.resultdisplayers.global.spec;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.glotaran.core.messages.CoreErrorMessages;
import org.glotaran.core.models.structures.TimpResultDataset;
import org.glotaran.core.resultdisplayers.common.panels.CommonResDispTools;
import org.glotaran.core.resultdisplayers.common.panels.RelationFrom;
import org.glotaran.core.resultdisplayers.common.panels.SelectTracesForPlot;
import org.glotaran.jfreechartcustom.GraphPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.panel.CrosshairOverlay;
import org.jfree.chart.plot.Crosshair;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.YIntervalSeries;
import org.jfree.data.xy.YIntervalSeriesCollection;
import org.jfree.ui.RectangleAnchor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.NbBundle;
import static java.lang.Math.abs;

/**
 *
 * @author slapten
 */
public class MultiTracesPanel extends javax.swing.JPanel {

    private final static long serialVersionUID = 1L;
    private RelationFrom relation = null;
    private List<TimpResultDataset> resultDatasets = null;
    private GraphPanel spectraImage;
    private Crosshair crosshair;
    private TimpResultDataset fromDataset;
    private double[] t0curveFrom = null;
    private double threshhold = 0;
    private ArrayList<double[]> t0curvesTo = new ArrayList<double[]>();
    private ArrayList<double[]> toValues = new ArrayList<double[]>();
    private boolean scalingEnabeled = true;
    int numberOfComponents;
    ArrayList<Integer> selectedTimeTraces = new ArrayList<Integer>();
    ArrayList<Integer> selectedWaveTraces = new ArrayList<Integer>();

    /** Creates new form MultiTracesPanel */
    public MultiTracesPanel() {
        initComponents();
    }

    public MultiTracesPanel(RelationFrom relations, List<TimpResultDataset> results, Double thresh) {
        initComponents();
        relation = relations;
        resultDatasets = results;
        
        if (thresh != null) {
            threshhold = thresh;
        }
        if (relation != null) {
            fromDataset = results.get(relations.indexFrom);
            t0curveFrom = CommonResDispTools.calculateDispersionTrace(fromDataset);
            for (int i = 0; i < relation.scaledDatasets.size(); i++) {
                t0curvesTo.add(CommonResDispTools.calculateDispersionTrace(resultDatasets.get(relation.scaledDatasets.get(i).indexTo)));
            }
        } else {
            fromDataset = results.get(0);
            t0curveFrom = CommonResDispTools.calculateDispersionTrace(resultDatasets.get(0));
            for (int i = 1; i < resultDatasets.size(); i++) {
                t0curvesTo.add(CommonResDispTools.calculateDispersionTrace(resultDatasets.get(i)));
            }
            calculateToValues();
        }

        numberOfComponents = fromDataset.getJvec() != null ? fromDataset.getJvec().length / 2 : fromDataset.getKineticParameters().length / 2;
        if (fromDataset.getSpectra().getRowDimension() > numberOfComponents * 2) {
            jTBShowChohSpec.setEnabled(true);
        }
        createCroshair();
//create spectra plot form "from dataset"
        jPSpectra.removeAll();
        spectraImage = createSpectraPlot(fromDataset);

        spectraImage.getChart().getXYPlot().getDomainAxis().setLowerMargin(0.0);
        spectraImage.getChart().getXYPlot().getDomainAxis().setUpperMargin(0.0);

        jPSpectra.add(spectraImage);
//create plot with curves from "from dataset";
        updateTrace(0);

//initialise slider from "from dataset"
        jSWavelengths.getModel().setRangeProperties(0, 1, 0, fromDataset.getX2().length - 1, true);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPSpectra = new javax.swing.JPanel();
        jPTraces = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSWavelengths = new javax.swing.JSlider();
        jToolBar1 = new javax.swing.JToolBar();
        jTBLinLog = new javax.swing.JToggleButton();
        jTFLinPart = new javax.swing.JTextField();
        jBUpdLinLog = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jTBShowChohSpec = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setLayout(new java.awt.GridBagLayout());

        jPSpectra.setBackground(new java.awt.Color(255, 255, 255));
        jPSpectra.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.6;
        add(jPSpectra, gridBagConstraints);

        jPTraces.setBackground(new java.awt.Color(255, 255, 255));
        jPTraces.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(jPTraces, gridBagConstraints);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jSWavelengths.setValue(0);
        jSWavelengths.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSWavelengthsStateChanged(evt);
            }
        });
        jPanel10.add(jSWavelengths, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        add(jPanel10, gridBagConstraints);

        jToolBar1.setRollover(true);

        jTBLinLog.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jTBLinLog.text")); // NOI18N
        jTBLinLog.setFocusable(false);
        jTBLinLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jTBLinLog.setMaximumSize(new java.awt.Dimension(59, 21));
        jTBLinLog.setMinimumSize(new java.awt.Dimension(59, 21));
        jTBLinLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBLinLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBLinLogActionPerformed(evt);
            }
        });
        jToolBar1.add(jTBLinLog);

        jTFLinPart.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFLinPart.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jTFLinPart.text")); // NOI18N
        jTFLinPart.setMaximumSize(new java.awt.Dimension(70, 21));
        jTFLinPart.setMinimumSize(new java.awt.Dimension(4, 21));
        jToolBar1.add(jTFLinPart);

        jBUpdLinLog.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jBUpdLinLog.text")); // NOI18N
        jBUpdLinLog.setEnabled(false);
        jBUpdLinLog.setFocusable(false);
        jBUpdLinLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBUpdLinLog.setMaximumSize(new java.awt.Dimension(64, 21));
        jBUpdLinLog.setMinimumSize(new java.awt.Dimension(64, 21));
        jBUpdLinLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBUpdLinLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdLinLogActionPerformed(evt);
            }
        });
        jToolBar1.add(jBUpdLinLog);
        jToolBar1.add(jSeparator1);

        jTBShowChohSpec.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jTBShowChohSpec.text")); // NOI18N
        jTBShowChohSpec.setEnabled(false);
        jTBShowChohSpec.setFocusable(false);
        jTBShowChohSpec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jTBShowChohSpec.setMaximumSize(new java.awt.Dimension(112, 21));
        jTBShowChohSpec.setMinimumSize(new java.awt.Dimension(112, 21));
        jTBShowChohSpec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBShowChohSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBShowChohSpecActionPerformed(evt);
            }
        });
        jToolBar1.add(jTBShowChohSpec);

        jButton1.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jButton1.text")); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jButton2.text")); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jLabel1.text")); // NOI18N
        jToolBar1.add(jLabel1);

        jToggleButton1.setText(org.openide.util.NbBundle.getMessage(MultiTracesPanel.class, "MultiTracesPanel.jToggleButton1.text")); // NOI18N
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        add(jToolBar1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jSWavelengthsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSWavelengthsStateChanged
        crosshair.setValue(fromDataset.getX2()[jSWavelengths.getValue()]);
        updateTrace(jSWavelengths.getValue());
    }//GEN-LAST:event_jSWavelengthsStateChanged

    private void jTBLinLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBLinLogActionPerformed
        if (jTBLinLog.isSelected()) {
            try {
                updateTrace(jSWavelengths.getValue());
                jBUpdLinLog.setEnabled(true);
            } catch (Exception e) {
                CoreErrorMessages.updLinLogException();
                jTBLinLog.setSelected(false);
            }
        } else {
            updateTrace(jSWavelengths.getValue());
            jBUpdLinLog.setEnabled(false);
        }
    }//GEN-LAST:event_jTBLinLogActionPerformed

    private void jBUpdLinLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdLinLogActionPerformed
        try {
            updateTrace(jSWavelengths.getValue());
        } catch (Exception e) {
            CoreErrorMessages.updLinLogException();
        }
    }//GEN-LAST:event_jBUpdLinLogActionPerformed

    private void jTBShowChohSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBShowChohSpecActionPerformed
        jPSpectra.removeAll();
        spectraImage = createSpectraPlot(fromDataset);
        jPSpectra.add(spectraImage);
        jPSpectra.validate();
    }//GEN-LAST:event_jTBShowChohSpecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //create dialog
        SelectedMultiTracesPanel selectedMultiTracesPanel = new SelectedMultiTracesPanel();
        JPanel jPSelTimeTrCollection = selectedMultiTracesPanel.getjPSelectedTracesContainer();
                
        CommonResDispTools.restorePanelSize(jPSelTimeTrCollection);

        SelectTracesForPlot selTracePanel = new SelectTracesForPlot();
        //TODO now the first dataset (fromDataset) is used as the 'base' for all
        //plots, in the future we might want to be able to select tracers from
        //all datasets rather than the first one:
        selTracePanel.setMaxNumbers(fromDataset.getX().length, fromDataset.getX2().length);
        NotifyDescriptor selTracesDialog = new NotifyDescriptor(
                selTracePanel,
                NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("selTracesForReport"),
                NotifyDescriptor.OK_CANCEL_OPTION,
                NotifyDescriptor.PLAIN_MESSAGE,
                null,
                NotifyDescriptor.OK_OPTION);
        //show dialog
        if (DialogDisplayer.getDefault().notify(selTracesDialog).equals(NotifyDescriptor.OK_OPTION)) {
            //create time traces collection
            if (selTracePanel.getSelectXState()) {
                int numSelTraces = selTracePanel.getSelectXNum();
                int w = fromDataset.getX2().length / numSelTraces;
                int xIndex = 0;
                selectedTimeTraces.clear();
                jPSelTimeTrCollection.removeAll();
                                
                for (int i = 0; i < numSelTraces; i++) {
                    xIndex = i * w;                    
                    //Add index ot selected trace into list
                    jPSelTimeTrCollection.add(getChartForTrace(xIndex));
                }
                CommonResDispTools.checkPanelSize(jPSelTimeTrCollection, numSelTraces);
            }

        }
        ((JTabbedPane)getParent()).addTab("Time Traces", jPSelTimeTrCollection);
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

}//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
         if(scalingEnabeled) {
        jToggleButton1.setText("Off");
            scalingEnabeled =false;
        } else {
        jToggleButton1.setText("On");  
            scalingEnabeled =true;
        }        
        updateTrace(jSWavelengths.getValue());   
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBUpdLinLog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPSpectra;
    private javax.swing.JPanel jPTraces;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JSlider jSWavelengths;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToggleButton jTBLinLog;
    private javax.swing.JToggleButton jTBShowChohSpec;
    private javax.swing.JTextField jTFLinPart;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private GraphPanel createSpectraPlot(TimpResultDataset dataset) {
        String specName = dataset.getJvec() != null ? "SAS" : "EAS";
        boolean errorBars = dataset.getSpectraErr() != null ? true : false;
        int numComp = jTBShowChohSpec.isSelected() ? numberOfComponents + 1 : numberOfComponents;

        YIntervalSeriesCollection realSasCollection = new YIntervalSeriesCollection();
        YIntervalSeries seria;

//create collection of sas(eas)
        for (int j = 0; j < numComp; j++) {
            seria = new YIntervalSeries(specName + (j + 1));// new XYSeries(specName + (j + 1));
            for (int i = 0; i < dataset.getX2().length; i++) {
                if (errorBars) {
                    seria.add(dataset.getX2()[i], dataset.getSpectra().get(j, i),
                            dataset.getSpectra().get(j, i) - dataset.getSpectraErr().get(j, i),
                            dataset.getSpectra().get(j, i) + dataset.getSpectraErr().get(j, i));
                } else {
                    seria.add(dataset.getX2()[i], dataset.getSpectra().get(j, i),
                            dataset.getSpectra().get(j, i),
                            dataset.getSpectra().get(j, i));
                }
            }
            realSasCollection.addSeries(seria);
        }
        GraphPanel chartPanel = CommonResDispTools.createGraphPanel(realSasCollection, specName, "Wavelength (nm)", errorBars);
        CrosshairOverlay overlay = new CrosshairOverlay();
        overlay.addDomainCrosshair(crosshair);
        chartPanel.addOverlay(overlay);
        chartPanel.getChart().getXYPlot().getDomainAxis().setLowerMargin(0.0);
        chartPanel.getChart().getXYPlot().getDomainAxis().setUpperMargin(0.0);
        return chartPanel;
    }

    public void createCroshair() {
        crosshair = new Crosshair(fromDataset.getX2()[jSWavelengths.getValue()]);
        crosshair.setPaint(Color.red);
        crosshair.setLabelVisible(true);
        crosshair.setLabelAnchor(RectangleAnchor.BOTTOM_RIGHT);
    }

    private void updateTrace(int xIndex) {
        jPTraces.removeAll();
        jPTraces.add(getChartForTrace(xIndex));
        jPTraces.validate();
    }

    private ChartPanel getChartForTrace(int xIndex) {
        boolean linlog = jTBLinLog.isSelected();
        double portion = Double.valueOf(jTFLinPart.getText());

        XYSeriesCollection trace = null;
        XYSeriesCollection resid = null;
        XYSeriesCollection traceTo = null;
        XYSeriesCollection residTo = null;

        XYSeries emptySer = new XYSeries("");
        emptySer.add(0.0, 0.0);
        XYSeries emptySer2 = new XYSeries("");
        emptySer2.add(fromDataset.getX2()[fromDataset.getX2().length-1], 0.0);
        TimpResultDataset toDataset = null;
        int indexTo = 0;
        double toValue = 1;
        int toIndex = 0;


        if (!linlog) {
            trace = CommonResDispTools.createFitRawTraceCollection(xIndex, 0, fromDataset.getX().length, fromDataset, t0curveFrom[xIndex], "From");
            resid = CommonResDispTools.createResidTraceCollection(xIndex, 0, fromDataset.getX().length, fromDataset, t0curveFrom[xIndex], "From");
        } else {
            
            int index = 0;
            while (fromDataset.getX()[index] < t0curveFrom[xIndex] + portion) {
                index++;
            }
            if (index == 0) {
                index = 1;
            }

            trace = CommonResDispTools.createFitRawTraceCollection(xIndex, 0, fromDataset.getX().length, fromDataset,t0curveFrom[xIndex],"From",1);
            resid = CommonResDispTools.createResidTraceCollection(xIndex, 0, fromDataset.getX().length, fromDataset,t0curveFrom[xIndex],"From",1);
        }
        int curvenum;
        if (relation != null){
        curvenum = relation.scaledDatasets.size();
        } else {
            curvenum = resultDatasets.size()-1;
        }
            
        
        for (int i = 0; i < curvenum; i++) {
            if (relation != null){
                indexTo = relation.scaledDatasets.get(i).indexTo;
                toDataset = resultDatasets.get(indexTo);
                 if(scalingEnabeled) {
                toValue = relation.scaledDatasets.get(i).valueTo;
                 } else {
                     toValue = 1;
                 }
            } else {
                indexTo = i+1;
                toDataset = resultDatasets.get(i+1);
            }
            if (toDataset.getX2().length > xIndex) {
                toIndex = CommonResDispTools.findIndexForWave(fromDataset.getX2()[xIndex], threshhold, toDataset);
                if (toIndex != -1) {
                    if(relation == null){
                        if(scalingEnabeled) {
                       toValue = toValues.get(i)[toIndex]; 
                        } else {
                        toValue =1;
                        }
                    }
                    if (!linlog) {                                                
                        traceTo = CommonResDispTools.createFitRawTraceCollection(toIndex, 0, toDataset.getX().length, toDataset, t0curvesTo.get(i)[toIndex], ("to" + i), toValue);
                        residTo = CommonResDispTools.createResidTraceCollection(toIndex, 0, toDataset.getX().length, toDataset, t0curvesTo.get(i)[toIndex], ("to" + i), toValue);                        
                        trace.addSeries(traceTo.getSeries(0));
                        trace.addSeries(traceTo.getSeries(1));
                        resid.addSeries(residTo.getSeries(0));
                    } else {
                        int index = 0;
                        while (toDataset.getX()[index] < t0curvesTo.get(i)[toIndex] + portion) {
                            index++;
                        }
                        if (index == 0) {
                            index = 1;
                        }

                        traceTo = CommonResDispTools.createFitRawTraceCollection(toIndex, 0, toDataset.getX().length, toDataset, t0curvesTo.get(i)[toIndex], ("to" + i), toValue);
                        residTo = CommonResDispTools.createResidTraceCollection(toIndex, 0, toDataset.getX().length, toDataset, t0curvesTo.get(i)[toIndex], ("to" + i), toValue);

                        trace.addSeries(traceTo.getSeries(0));
                        trace.addSeries(traceTo.getSeries(1));
                        resid.addSeries(residTo.getSeries(0));
                  }
                } else {
                    emptySer = new XYSeries("EmptyTrace" +String.valueOf(i));
//                    emptySer.setKey("EmptyTrace" +String.valueOf(i));
                    trace.addSeries(emptySer);
                    emptySer = new XYSeries("EmptyFit" +String.valueOf(i));
//                    emptySer.setKey("EmptyFit" + String.valueOf(i));
                    trace.addSeries(emptySer);
                    emptySer = new XYSeries("EmptyResid" +String.valueOf(i));
//                    emptySer.setKey("EmptyResid" + String.valueOf(i));
                    resid.addSeries(emptySer);

                }
            } else {
                emptySer = new XYSeries("EmptyTrace" + String.valueOf(i));
//                    emptySer.setKey("EmptyTrace" +String.valueOf(i));
                trace.addSeries(emptySer);
                emptySer = new XYSeries("EmptyFit" + String.valueOf(i));
//                    emptySer.setKey("EmptyFit" + String.valueOf(i));
                trace.addSeries(emptySer);
                emptySer = new XYSeries("EmptyResid" + String.valueOf(i));
//                    emptySer.setKey("EmptyResid" + String.valueOf(i));
                resid.addSeries(emptySer);
            }
        }

      
        if (linlog) {
            return CommonResDispTools.createLinLogTimeTraceResidChart(trace, resid, null, true, portion);
        } else {
            return CommonResDispTools.makeLinTimeTraceResidChart(trace, resid, new NumberAxis("Time"), null, true);
        }

    }
    
    private void calculateToValues() {
        double[] maxToCurves;
        double[] maxFromCurves = new double[resultDatasets.get(0).getX2().length];
        for (int i = 0; i < resultDatasets.get(0).getX2().length; i++){
            maxFromCurves[i] = abs(resultDatasets.get(0).getFittedTraces().get(0,i));
            for (int j = 0; j < resultDatasets.get(0).getX().length; j++){
                if (abs(resultDatasets.get(0).getFittedTraces().get(j,i)) > maxFromCurves[i]){
                    maxFromCurves[i] = abs(resultDatasets.get(0).getFittedTraces().get(j,i));
                }        
            }       
        }
        for (int k = 1; k < resultDatasets.size(); k++) {
            maxToCurves = new double[resultDatasets.get(k).getX2().length];
            for (int i = 0; i < resultDatasets.get(k).getX2().length; i++) {
                maxToCurves[i] = abs(resultDatasets.get(k).getFittedTraces().get(0, i));
                for (int j = 0; j < resultDatasets.get(k).getX().length; j++) {
                    if (abs(resultDatasets.get(k).getFittedTraces().get(j, i)) > maxToCurves[i]) {
                        maxToCurves[i] = abs(resultDatasets.get(k).getFittedTraces().get(j, i));
                    }
                }
                maxToCurves[i] = maxToCurves[i]/maxFromCurves[i];
            }
            toValues.add(maxToCurves);
        }
    }
    
    
}
