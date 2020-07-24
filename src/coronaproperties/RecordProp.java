/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaproperties;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin K
 */
public class RecordProp extends javax.swing.JFrame {
    /**
     * Creates new form RecordProp
     */
    public RecordProp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblpropertyPrimaryKey = new javax.swing.JLabel();
        lblpropertyType = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lbladdressNum = new javax.swing.JLabel();
        lbladdressStreet = new javax.swing.JLabel();
        lbladdressCity = new javax.swing.JLabel();
        lbladdressCode = new javax.swing.JLabel();
        lblvalue = new javax.swing.JLabel();
        lblconstructionStatus = new javax.swing.JLabel();
        lbluseOfProperty = new javax.swing.JLabel();
        txtaddressStreet = new javax.swing.JTextField();
        txtpropertyPrimaryKey = new javax.swing.JTextField();
        txtaddressCity = new javax.swing.JTextField();
        txtaddressNum = new javax.swing.JTextField();
        txtaddressCode = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        lblpropertyPrimaryKey1 = new javax.swing.JLabel();
        lblpropertyType1 = new javax.swing.JLabel();
        lbladdressNum1 = new javax.swing.JLabel();
        lbladdressStreet1 = new javax.swing.JLabel();
        lbladdressCity1 = new javax.swing.JLabel();
        lbladdressCode1 = new javax.swing.JLabel();
        lblvalue1 = new javax.swing.JLabel();
        lblconstructionStatus1 = new javax.swing.JLabel();
        lbluseOfProperty1 = new javax.swing.JLabel();
        txtlandArea = new javax.swing.JTextField();
        txtfloorArea = new javax.swing.JTextField();
        txtvalue = new javax.swing.JTextField();
        lbluseOfProperty2 = new javax.swing.JLabel();
        txtrates = new javax.swing.JTextField();
        lblpropertyPrimaryKey2 = new javax.swing.JLabel();
        lblconstructionStatus2 = new javax.swing.JLabel();
        lbluseOfProperty3 = new javax.swing.JLabel();
        lbluseOfProperty4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreadescription = new javax.swing.JTextArea();
        jSpinnergarage = new javax.swing.JSpinner();
        jSpinnerroom = new javax.swing.JSpinner();
        jSpinnerbath = new javax.swing.JSpinner();
        jComboBoxconstructionStatus = new javax.swing.JComboBox<>();
        jComboBoxuseOfProperty = new javax.swing.JComboBox<>();
        jComboBoxpropertyType = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        lblHeading.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblHeading.setText("Corona Properties");

        lblTitle.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblTitle.setText("Add New Property");

        lblpropertyPrimaryKey.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblpropertyPrimaryKey.setText("Property Primary Key");

        lblpropertyType.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblpropertyType.setText("Property Type");

        lbladdress.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbladdress.setText("Address");

        lbladdressNum.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressNum.setText("Number");

        lbladdressStreet.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressStreet.setText("Street");

        lbladdressCity.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressCity.setText("City");

        lbladdressCode.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressCode.setText("Code");

        lblvalue.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblvalue.setText("Contact");

        lblconstructionStatus.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblconstructionStatus.setText("Telephone");

        lbluseOfProperty.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbluseOfProperty.setText("Email");

        txtaddressStreet.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtpropertyPrimaryKey.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtaddressCity.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtaddressNum.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtaddressCode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txttelephone.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtemail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblpropertyPrimaryKey1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblpropertyPrimaryKey1.setText("Quantities");

        lblpropertyType1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblpropertyType1.setText("Room");

        lbladdressNum1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressNum1.setText("Garage");

        lbladdressStreet1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressStreet1.setText("Bath");

        lbladdressCity1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbladdressCity1.setText("Size");

        lbladdressCode1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbladdressCode1.setText("Floor area");

        lblvalue1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblvalue1.setText("Land area");

        lblconstructionStatus1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblconstructionStatus1.setText("Costs");

        lbluseOfProperty1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbluseOfProperty1.setText("Value");

        txtlandArea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtfloorArea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtvalue.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbluseOfProperty2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbluseOfProperty2.setText("Rates");

        txtrates.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblpropertyPrimaryKey2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblpropertyPrimaryKey2.setText("Info");

        lblconstructionStatus2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblconstructionStatus2.setText("Construction Status");

        lbluseOfProperty3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbluseOfProperty3.setText("Use of Property");

        lbluseOfProperty4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbluseOfProperty4.setText("Description");

        jTextAreadescription.setColumns(20);
        jTextAreadescription.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreadescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreadescription);

        jSpinnergarage.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jSpinnerroom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jSpinnerbath.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jComboBoxconstructionStatus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxconstructionStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed", "Not Complete" }));

        jComboBoxuseOfProperty.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxuseOfProperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Idle", "Dr Shaun's Home" }));

        jComboBoxpropertyType.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxpropertyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Flat", "Business" }));

        btnOK.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(387, 387, 387))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(758, 758, 758))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblpropertyType)
                                        .addComponent(lblpropertyPrimaryKey))
                                    .addGap(46, 46, 46)
                                    .addComponent(txtpropertyPrimaryKey, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblpropertyPrimaryKey2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblconstructionStatus2)
                                        .addComponent(lbluseOfProperty3)
                                        .addComponent(lblvalue)
                                        .addComponent(lbluseOfProperty)
                                        .addComponent(lblconstructionStatus)
                                        .addComponent(lbladdressNum)
                                        .addComponent(lbladdressStreet)
                                        .addComponent(lbladdressCity)
                                        .addComponent(lbladdressCode))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtaddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtaddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtaddressNum, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtaddressCode, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(65, 65, 65)
                                                    .addComponent(jComboBoxpropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jComboBoxconstructionStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxuseOfProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addComponent(lbladdress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbladdressStreet1)
                            .addComponent(lbladdressNum1)
                            .addComponent(lbladdressCity1)
                            .addComponent(lblconstructionStatus1)
                            .addComponent(lbluseOfProperty1)
                            .addComponent(lblpropertyType1)
                            .addComponent(lblpropertyPrimaryKey1)
                            .addComponent(lblvalue1)
                            .addComponent(lbladdressCode1)
                            .addComponent(lbluseOfProperty2)
                            .addComponent(lbluseOfProperty4)
                            .addComponent(btnOK))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtlandArea)
                                .addComponent(txtfloorArea)
                                .addComponent(txtvalue)
                                .addComponent(txtrates)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jSpinnerroom)
                                .addComponent(jSpinnergarage)
                                .addComponent(jSpinnerbath, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancel))
                        .addGap(112, 112, 112))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblpropertyPrimaryKey2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblpropertyPrimaryKey)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblpropertyType)
                                            .addComponent(jComboBoxpropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtpropertyPrimaryKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblconstructionStatus2)
                                    .addComponent(jComboBoxconstructionStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbluseOfProperty3)
                                    .addComponent(jComboBoxuseOfProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbladdress)
                                .addGap(26, 26, 26)
                                .addComponent(lbladdressNum))
                            .addComponent(txtaddressNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaddressCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbladdressStreet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbladdressCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbladdressCode)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblvalue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblconstructionStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbluseOfProperty))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblpropertyPrimaryKey1)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblpropertyType1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbladdressNum1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbladdressStreet1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnergarage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerbath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbladdressCity1)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfloorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbladdressCode1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlandArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvalue1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblconstructionStatus1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluseOfProperty1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluseOfProperty2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbluseOfProperty4)
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addGap(25, 25, 25))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to cancel?", "Are you sure", JOptionPane.YES_NO_OPTION);
        /*
         * 0 = yes
         * 1 = no
         */
        if (option == 0) {
            this.dispose();

            //Back to main menu
            MainMenu menu = new MainMenu();

            menu.setTitle("Corona Main Menu");
            menu.setOpacity((float) 0.9);
            menu.setBackground(new Color(0, 0, 0, 0));
            menu.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);

            System.gc();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        //Capture input into variables
        String propertyPrimaryKey = txtpropertyPrimaryKey.getText();
        String propertyType = String.valueOf(jComboBoxpropertyType.getSelectedItem());
        String addressNum = txtaddressNum.getText();
        String addressStreet = txtaddressStreet.getText();
        String addressCity = txtaddressCity.getText();
        String addressCode = txtaddressCode.getText();
        double value = Double.parseDouble(txtvalue.getText());
        String constructionStatus = String.valueOf(jComboBoxconstructionStatus.getSelectedItem());
        String useOfProperty = String.valueOf(jComboBoxuseOfProperty.getSelectedItem());
        int room = (int) jSpinnerroom.getValue();
        int garage = (int) jSpinnergarage.getValue();
        int bath = (int) jSpinnerbath.getValue();
        double floorArea = Double.parseDouble(txtfloorArea.getText());
        double landArea = Double.parseDouble(txtlandArea.getText());
        double rates = Double.parseDouble(txtrates.getText());
        String description = jTextAreadescription.getText();
        String telephone = txttelephone.getText();
        String email = txtemail.getText();

        //Send captured inpute to CreateProp class for processing
        CreateProp aCreateProp = new CreateProp(propertyPrimaryKey, propertyType, addressNum, addressStreet, addressCity, addressCode, value, constructionStatus, useOfProperty, room, garage, bath, floorArea, landArea, rates, description, telephone, email);

        this.dispose();

        //Back to main menu
        MainMenu menu = new MainMenu();

        menu.setTitle("Corona Main Menu");
        menu.setOpacity((float) 0.9);
        menu.setBackground(new Color(0, 0, 0, 0));
        menu.setIconImage(Toolkit.getDefaultToolkit().
                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        System.gc();
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecordProp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordProp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordProp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordProp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordProp().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> jComboBoxconstructionStatus;
    private javax.swing.JComboBox<String> jComboBoxpropertyType;
    private javax.swing.JComboBox<String> jComboBoxuseOfProperty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerbath;
    private javax.swing.JSpinner jSpinnergarage;
    private javax.swing.JSpinner jSpinnerroom;
    private javax.swing.JTextArea jTextAreadescription;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbladdressCity;
    private javax.swing.JLabel lbladdressCity1;
    private javax.swing.JLabel lbladdressCode;
    private javax.swing.JLabel lbladdressCode1;
    private javax.swing.JLabel lbladdressNum;
    private javax.swing.JLabel lbladdressNum1;
    private javax.swing.JLabel lbladdressStreet;
    private javax.swing.JLabel lbladdressStreet1;
    private javax.swing.JLabel lblconstructionStatus;
    private javax.swing.JLabel lblconstructionStatus1;
    private javax.swing.JLabel lblconstructionStatus2;
    private javax.swing.JLabel lblpropertyPrimaryKey;
    private javax.swing.JLabel lblpropertyPrimaryKey1;
    private javax.swing.JLabel lblpropertyPrimaryKey2;
    private javax.swing.JLabel lblpropertyType;
    private javax.swing.JLabel lblpropertyType1;
    private javax.swing.JLabel lbluseOfProperty;
    private javax.swing.JLabel lbluseOfProperty1;
    private javax.swing.JLabel lbluseOfProperty2;
    private javax.swing.JLabel lbluseOfProperty3;
    private javax.swing.JLabel lbluseOfProperty4;
    private javax.swing.JLabel lblvalue;
    private javax.swing.JLabel lblvalue1;
    private javax.swing.JTextField txtaddressCity;
    private javax.swing.JTextField txtaddressCode;
    private javax.swing.JTextField txtaddressNum;
    private javax.swing.JTextField txtaddressStreet;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfloorArea;
    private javax.swing.JTextField txtlandArea;
    private javax.swing.JTextField txtpropertyPrimaryKey;
    private javax.swing.JTextField txtrates;
    private javax.swing.JTextField txttelephone;
    private javax.swing.JTextField txtvalue;
    // End of variables declaration//GEN-END:variables
}
