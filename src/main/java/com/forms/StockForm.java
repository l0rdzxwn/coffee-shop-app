/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.forms;

import com.formdev.flatlaf.FlatLightLaf;
import com.models.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import com.services.stockservices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lordz
 */
public class StockForm extends javax.swing.JFrame {

    CardLayout layout;

    /**
     * Creates new form StockForm
     */
    public StockForm() {
        initComponents();
        layout = (CardLayout) mainPanel.getLayout();
        fetchProducts(stockTable);
        fetchProductName(itemListCB);
        
    }

    stockservices service = new stockservices();
    private void fetchProducts(JTable table){
        List<Product> productList = service.fetchProducts();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        for(Product product: productList){
            List<Object> object = new ArrayList<>();
            object.add(product.getID());
            object.add(product.getName());
            object.add(product.getPrice());
            object.add(product.getCategory());
            object.add(product.getStock());
            object.add((product.getStock() < 10) ? "WARNING!!! Low" : (product.getStock() > 100) ? "High" : "Normal");
            tableModel.addRow(object.toArray());
        }
        
    }
    
   
    
    private void fetchProductName(JComboBox cb){
        List<Product> productList = service.fetchProducts();
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb.getModel();
        cbModel.removeAllElements();
        for(Product prod: productList){
            cbModel.addElement(prod.getName());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        manageStock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        managePanel = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        addBtN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addItem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        managePanel1 = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        priceTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        categoryCB = new javax.swing.JComboBox<>();
        quantity = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        categ = new javax.swing.JLabel();
        item = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        updatePanel = new javax.swing.JPanel();
        managePanel2 = new javax.swing.JPanel();
        cancelBtn1 = new javax.swing.JButton();
        updBtn = new javax.swing.JButton();
        priceUpdTF = new javax.swing.JTextField();
        quantityUpdTF = new javax.swing.JTextField();
        categoryUpdCB = new javax.swing.JComboBox<>();
        quantity1 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        categ1 = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        itemListCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setMaximumSize(new java.awt.Dimension(1270, 800));
        mainPanel.setMinimumSize(new java.awt.Dimension(1270, 800));
        mainPanel.setLayout(new java.awt.CardLayout());

        manageStock.setBackground(new java.awt.Color(64, 32, 0));
        manageStock.setName(""); // NOI18N
        java.awt.GridBagLayout manageStockLayout = new java.awt.GridBagLayout();
        manageStockLayout.columnWidths = new int[] {0, 18, 0, 18, 0, 18, 0};
        manageStockLayout.rowHeights = new int[] {0, 5, 0, 5, 0};
        manageStock.setLayout(manageStockLayout);

        stockTable.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Category", "Stock", "Stock Status"
            }
        ));
        jScrollPane1.setViewportView(stockTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.weightx = 0.3;
        manageStock.add(jScrollPane1, gridBagConstraints);

        managePanel.setBackground(new java.awt.Color(64, 32, 0));
        managePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(64, 32, 0));
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        managePanel.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 220, 50));

        editBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        editBtn.setForeground(new java.awt.Color(64, 32, 0));
        editBtn.setText("EDIT");
        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        managePanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 230, 50));

        refreshBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(64, 32, 0));
        refreshBtn.setText("REFRESH");
        refreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        managePanel.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 230, 50));

        addBtN.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        addBtN.setForeground(new java.awt.Color(64, 32, 0));
        addBtN.setText("+ ADD ITEM");
        addBtN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addBtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtNActionPerformed(evt);
            }
        });
        managePanel.add(addBtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 340, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 19, 0, 19);
        manageStock.add(managePanel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVENTORY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        manageStock.add(jLabel1, gridBagConstraints);

        mainPanel.add(manageStock, "manage");

        addItem.setBackground(new java.awt.Color(64, 32, 0));
        addItem.setName(""); // NOI18N
        addItem.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 64)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD/UPDATE STOCK");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 30;
        addItem.add(jLabel2, gridBagConstraints);

        formPanel.setBackground(new java.awt.Color(64, 32, 0));

        addPanel.setBackground(new java.awt.Color(220, 206, 166));
        addPanel.setLayout(new java.awt.GridBagLayout());

        managePanel1.setBackground(new java.awt.Color(220, 206, 166));
        managePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(64, 32, 0));
        cancelBtn.setText("CANCEL");
        cancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        managePanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 220, 50));

        saveBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(64, 32, 0));
        saveBtn.setText("SAVE ITEM");
        saveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        managePanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 0);
        addPanel.add(managePanel1, gridBagConstraints);

        priceTF.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        priceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        priceTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceTFKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        addPanel.add(priceTF, gridBagConstraints);

        quantityTF.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        quantityTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        quantityTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTFKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        addPanel.add(quantityTF, gridBagConstraints);

        categoryCB.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        categoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Non-Coffee", "Snacks", "Meals" }));
        categoryCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        addPanel.add(categoryCB, gridBagConstraints);

        quantity.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        quantity.setText("ITEM QUANTITY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        addPanel.add(quantity, gridBagConstraints);

        price.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        price.setText("PRICE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        addPanel.add(price, gridBagConstraints);

        categ.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        categ.setText("CATEGORY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        addPanel.add(categ, gridBagConstraints);

        item.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        item.setText("ITEM NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        addPanel.add(item, gridBagConstraints);

        nameTF.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        nameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        addPanel.add(nameTF, gridBagConstraints);

        updatePanel.setBackground(new java.awt.Color(220, 206, 166));
        updatePanel.setLayout(new java.awt.GridBagLayout());

        managePanel2.setBackground(new java.awt.Color(220, 206, 166));
        managePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelBtn1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        cancelBtn1.setForeground(new java.awt.Color(64, 32, 0));
        cancelBtn1.setText("CANCEL");
        cancelBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn1ActionPerformed(evt);
            }
        });
        managePanel2.add(cancelBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 220, 50));

        updBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        updBtn.setForeground(new java.awt.Color(64, 32, 0));
        updBtn.setText("UPDATE ITEM");
        updBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });
        managePanel2.add(updBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 0);
        updatePanel.add(managePanel2, gridBagConstraints);

        priceUpdTF.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        priceUpdTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        priceUpdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceUpdTFKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        updatePanel.add(priceUpdTF, gridBagConstraints);

        quantityUpdTF.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        quantityUpdTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        quantityUpdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityUpdTFKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        updatePanel.add(quantityUpdTF, gridBagConstraints);

        categoryUpdCB.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        categoryUpdCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Non-Coffee", "Snacks", "Meals" }));
        categoryUpdCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        updatePanel.add(categoryUpdCB, gridBagConstraints);

        quantity1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        quantity1.setText("ITEM QUANTITY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(quantity1, gridBagConstraints);

        price1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        price1.setText("PRICE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(price1, gridBagConstraints);

        categ1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        categ1.setText("CATEGORY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(categ1, gridBagConstraints);

        item1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        item1.setText("ITEM LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(item1, gridBagConstraints);

        itemListCB.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        itemListCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemListCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        itemListCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 30;
        updatePanel.add(itemListCB, gridBagConstraints);

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        addItem.add(formPanel, gridBagConstraints);

        mainPanel.add(addItem, "additem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtNActionPerformed
        layout.show(mainPanel,"additem");
     
    }//GEN-LAST:event_addBtNActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
       fetchProducts(stockTable);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String id = (String) stockTable.getValueAt(stockTable.getSelectedRow(),0);
        
        service.deleteRecord(id);
        fetchProducts(stockTable);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        layout.show(mainPanel,"manage");
        fetchProducts(stockTable);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        if(nameTF.getText().trim().isEmpty() || priceTF.getText().trim().isEmpty() || quantityTF.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"It cannot have a null value.");
            return;
        }
        
        double price = Double.parseDouble(priceTF.getText());
        String cat = (String) categoryCB.getSelectedItem();
        int stock = Integer.parseInt(quantityTF.getText().trim());
        
        service.insertProduct(nameTF.getText().trim(),price, cat, stock);
        JOptionPane.showMessageDialog(null,"Product added successfully!");
        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void priceTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTFKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_priceTFKeyTyped

    private void quantityTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTFKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_quantityTFKeyTyped

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        layout.show(mainPanel,"additem");
    }//GEN-LAST:event_editBtnActionPerformed

    private void cancelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn1ActionPerformed
        layout.show(mainPanel, "manage");
    }//GEN-LAST:event_cancelBtn1ActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
       if(priceUpdTF.getText().trim().isEmpty() || quantityUpdTF.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"It cannot have a null value.");
            return;
        }
        
        double price = Double.parseDouble(priceUpdTF.getText());
        String cat = (String) categoryUpdCB.getSelectedItem();
        String name = (String) itemListCB.getSelectedItem();
        int stock = Integer.parseInt(quantityUpdTF.getText().trim());
       
        service.updateProduct(name, price, cat, stock);
        JOptionPane.showMessageDialog(null,"Product updated successfully!");
    }//GEN-LAST:event_updBtnActionPerformed

    private void priceUpdTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceUpdTFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_priceUpdTFKeyTyped

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void quantityUpdTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityUpdTFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityUpdTFKeyTyped

    private void itemListCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListCBActionPerformed
        String name = (String) itemListCB.getSelectedItem();
        
        List<Product> pList = service.fetchProducts();
        for(Product p : pList){
            if(p.getName().equals(name)){
                categoryUpdCB.setSelectedItem(p.getCategory());
                priceUpdTF.setText(Double.toString(p.getPrice()));
                quantityUpdTF.setText(Integer.toString(p.getStock()));
            }
        }
    }//GEN-LAST:event_itemListCBActionPerformed

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
            java.util.logging.Logger.getLogger(StockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new StockForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtN;
    private javax.swing.JPanel addItem;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelBtn1;
    private javax.swing.JLabel categ;
    private javax.swing.JLabel categ1;
    private javax.swing.JComboBox<String> categoryCB;
    private javax.swing.JComboBox<String> categoryUpdCB;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel item;
    private javax.swing.JLabel item1;
    private javax.swing.JComboBox<String> itemListCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel managePanel;
    private javax.swing.JPanel managePanel1;
    private javax.swing.JPanel managePanel2;
    private javax.swing.JPanel manageStock;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel price;
    private javax.swing.JLabel price1;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField priceUpdTF;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel quantity1;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JTextField quantityUpdTF;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable stockTable;
    private javax.swing.JButton updBtn;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
