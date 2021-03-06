/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.awt.Color;
import java.text.DecimalFormat;
import java.awt.event.*;

/**
 *
 * @author Alex
 */
public class TemperatureConverterGui extends javax.swing.JFrame {

    private TempConverterService newConverterTempService;
    private TempEnumFactory outputEnumFactory;

    public TemperatureConverterGui() {
        initComponents();
        newConverterTempService = new TempConverterService();
        outputEnumFactory = new TempEnumFactory();
        newConverterTempService.addSubscriberToJComboBoxPublisher(tempFromComboBoxCB);
        newConverterTempService.addSubscriberToJComboBoxPublisher(tempToComboBoxCB);
        newConverterTempService.addTempMeasurement(new TempMeasurementCelsius());
        newConverterTempService.addTempMeasurement(new TempMeasurementFahrenheit());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        userInputPnl = new javax.swing.JPanel();
        tempInputLbl = new javax.swing.JLabel("Enter Temp ");
        tempInputTxt = new javax.swing.JTextField();
        convertTempBtn = new javax.swing.JButton("Convert To Temp Measurement Specified");
        userFeedbackLbl = new javax.swing.JLabel();
        tempFromComboBoxCB = new CustomJComboBoxSubscriber();
        tempToComboBoxCB = new CustomJComboBoxSubscriber();
        tempFromComboBoxLbl = new javax.swing.JLabel("Temp To Convert From");
        tempToComboBoxLbl = new javax.swing.JLabel("Temp To Convert To");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tempInputLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tempInputTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        convertTempBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userFeedbackLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tempFromComboBoxCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tempToComboBoxCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        
        convertTempBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                convertTempBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInputPnlLayout = new javax.swing.GroupLayout(userInputPnl);
        userInputPnl.setLayout(userInputPnlLayout);
        userInputPnlLayout.setHorizontalGroup(
                userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userInputPnlLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(userInputPnlLayout.createSequentialGroup()
                                        .addComponent(tempInputLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tempInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(userInputPnlLayout.createSequentialGroup()
                                        .addGroup(userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tempFromComboBoxLbl)
                                                .addComponent(tempFromComboBoxCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tempToComboBoxCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tempToComboBoxLbl)))
                                .addComponent(convertTempBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userFeedbackLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))
        );
        userInputPnlLayout.setVerticalGroup(
                userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userInputPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tempInputLbl)
                                .addComponent(tempInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(convertTempBtn)
                        .addGap(37, 37, 37)
                        .addGroup(userInputPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(userInputPnlLayout.createSequentialGroup()
                                        .addComponent(tempFromComboBoxLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tempFromComboBoxCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(userInputPnlLayout.createSequentialGroup()
                                        .addComponent(tempToComboBoxLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tempToComboBoxCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userFeedbackLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
        );

        getContentPane().add(userInputPnl, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void convertTempBtnActionPerformed(ActionEvent evt) {

        try {
            String userFromTempChoice = tempFromComboBoxCB.getSelectedItem().toString();
            String userToTempChoice = tempToComboBoxCB.getSelectedItem().toString();
            TempEnum fromTempEnum = outputEnumFactory.returnTempEnumViaStringParam(userFromTempChoice);
            TempEnum toTempEnum = outputEnumFactory.returnTempEnumViaStringParam(userToTempChoice);
            newConverterTempService.setFromTempType(fromTempEnum);
            newConverterTempService.setToTempType(toTempEnum);
            newConverterTempService.convertTempAndReturnConvertedTemp(tempInputTxt.getText());
            userFeedbackLbl.setForeground(Color.BLACK);
            userFeedbackLbl.setText(formatTempOutput(newConverterTempService.getConvertedTemp()) + newConverterTempService.getToTempDescription());
        } catch (RuntimeException re) {
            userFeedbackLbl.setForeground(Color.red);
            userFeedbackLbl.setText(re.getMessage());
        }
    }

    private String formatTempOutput(double tempToFormat) {
        DecimalFormat tempFormatter = new DecimalFormat(GlobalVarsAndFinals.TEMP_OUTPUT_FORMAT);
        return tempFormatter.format(tempToFormat);
    }
                 
    private javax.swing.JButton convertTempBtn;
    private CustomJComboBoxSubscriber tempFromComboBoxCB;
    private javax.swing.JLabel tempFromComboBoxLbl;
    private javax.swing.JLabel tempInputLbl;
    private javax.swing.JTextField tempInputTxt;
    private CustomJComboBoxSubscriber tempToComboBoxCB;
    private javax.swing.JLabel tempToComboBoxLbl;
    private javax.swing.JLabel userFeedbackLbl;
    private javax.swing.JPanel userInputPnl;       
}
