
package restaurant;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
public class RestaurantGUI extends javax.swing.JFrame {

File fl = new File("src/file.txt");

    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pw;
    
    public RestaurantGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonReset = new javax.swing.JButton();
        jButtonTotal = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonReceipt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tax5 = new javax.swing.JLabel();
        tax6 = new javax.swing.JLabel();
        tax7 = new javax.swing.JLabel();
        tax8 = new javax.swing.JLabel();
        tax12 = new javax.swing.JLabel();
        tax11 = new javax.swing.JLabel();
        jTextFieldFishCutlet = new javax.swing.JTextField();
        jTextFieldChickenBurger = new javax.swing.JTextField();
        jTextFieldChickenSausage = new javax.swing.JTextField();
        jTextFieldComboMeal = new javax.swing.JTextField();
        jTextFieldCheeseBurger = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldVanillaCone = new javax.swing.JTextField();
        jTextFieldMilkShake = new javax.swing.JTextField();
        jTextFieldClassicVanilla = new javax.swing.JTextField();
        tax1 = new javax.swing.JLabel();
        tax2 = new javax.swing.JLabel();
        tax3 = new javax.swing.JLabel();
        tax4 = new javax.swing.JLabel();
        tax9 = new javax.swing.JLabel();
        tax10 = new javax.swing.JLabel();
        jTextFieldVanillaMilkShake = new javax.swing.JTextField();
        jTextFieldChocolateMilkShake = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReceiptPrint = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldTax = new javax.swing.JTextField();
        subtotal = new javax.swing.JLabel();
        totalBill = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tax13 = new javax.swing.JLabel();
        tax14 = new javax.swing.JLabel();
        tax15 = new javax.swing.JLabel();
        jTextFieldCostOfDrinks = new javax.swing.JTextField();
        jTextFieldTotalCostMD = new javax.swing.JTextField();
        jTextFieldCostOfMeal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jButtonReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonTotal.setText("Total");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonReceipt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonReceipt.setText("Receipt");
        jButtonReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jButtonReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonTotal)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonReceipt))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 900, 70));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 66)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Management System");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\wasif\\OneDrive\\Desktop\\logo-web-color.4ae46528.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1380, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        tax5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tax5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax5.setText("Meals");

        tax6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax6.setText("Chicken Burger");

        tax7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax7.setText("Fish Cutlet");

        tax8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax8.setText("Chicken Sausage");

        tax12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax12.setText("Combo Meal");

        tax11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax11.setText("Cheese Burger");

        jTextFieldFishCutlet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldFishCutlet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFishCutlet.setText("0");
        jTextFieldFishCutlet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFishCutletActionPerformed(evt);
            }
        });

        jTextFieldChickenBurger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldChickenBurger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChickenBurger.setText("0");
        jTextFieldChickenBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChickenBurgerActionPerformed(evt);
            }
        });

        jTextFieldChickenSausage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldChickenSausage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChickenSausage.setText("0");
        jTextFieldChickenSausage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChickenSausageActionPerformed(evt);
            }
        });

        jTextFieldComboMeal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldComboMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldComboMeal.setText("0");
        jTextFieldComboMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComboMealActionPerformed(evt);
            }
        });

        jTextFieldCheeseBurger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldCheeseBurger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCheeseBurger.setText("0");
        jTextFieldCheeseBurger.setToolTipText("");
        jTextFieldCheeseBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCheeseBurgerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tax7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(tax5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jTextFieldFishCutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tax11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tax12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tax8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tax6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldChickenSausage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldComboMeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCheeseBurger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldChickenBurger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tax5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tax7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFishCutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldChickenSausage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComboMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tax6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tax8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tax12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCheeseBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 430, 290));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jTextFieldVanillaCone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldVanillaCone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVanillaCone.setText("0");
        jTextFieldVanillaCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVanillaConeActionPerformed(evt);
            }
        });

        jTextFieldMilkShake.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMilkShake.setText("0");
        jTextFieldMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMilkShakeActionPerformed(evt);
            }
        });

        jTextFieldClassicVanilla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldClassicVanilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClassicVanilla.setText("0");

        tax1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax1.setText("Vanilla Milk Shake");

        tax2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax2.setText("Vanilla Cone");

        tax3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax3.setText("Classic Vanilla");

        tax4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tax4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax4.setText("Drinks");

        tax9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax9.setText("MilkShake");

        tax10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax10.setText("Chocolate Milk Shake");

        jTextFieldVanillaMilkShake.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldVanillaMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVanillaMilkShake.setText("0");
        jTextFieldVanillaMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVanillaMilkShakeActionPerformed(evt);
            }
        });

        jTextFieldChocolateMilkShake.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldChocolateMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChocolateMilkShake.setText("0");
        jTextFieldChocolateMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChocolateMilkShakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(tax4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tax9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVanillaCone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tax10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldChocolateMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tax1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tax3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldVanillaMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldClassicVanilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(tax4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldVanillaCone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClassicVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVanillaMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldChocolateMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 460, 290));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jTextAreaReceiptPrint.setColumns(20);
        jTextAreaReceiptPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaReceiptPrint.setRows(5);
        jScrollPane1.setViewportView(jTextAreaReceiptPrint);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 230, 470, 610));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jTextFieldSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jTextFieldTax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        subtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtotal.setText("Subtotal:");

        totalBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalBill.setText("Total:");

        tax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax.setText("Tax:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSubTotal)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 460, 230));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        tax13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax13.setText("Cost of Drinks");

        tax14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax14.setText("Cost of Meal");

        tax15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tax15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tax15.setText("Total Cost Made");

        jTextFieldCostOfDrinks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jTextFieldTotalCostMD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldTotalCostMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalCostMDActionPerformed(evt);
            }
        });

        jTextFieldCostOfMeal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldCostOfMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostOfMealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tax14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tax13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tax15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCostOfMeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jTextFieldCostOfDrinks, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTotalCostMD, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCostOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCostOfDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotalCostMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 430, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        Class2 iExit=new Class2();       
        iExit.iExitSystem();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiptActionPerformed
   if(fl.exists()){
            fl.delete();

        }
        try {
        // TODO add your handling code here:
        
        fl.createNewFile();
    } catch (IOException ex) {
        Logger.getLogger(RestaurantGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        int ref=6969+(int)(Math.random()*4561);
        
        Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat rTime=new SimpleDateFormat("HH:mm:ss");
        rTime.format(timer.getTime());
        
        SimpleDateFormat rDate=new SimpleDateFormat("dd-MM-yyyy");
        rDate.format(timer.getTime());
    try {
        fw= new FileWriter("src/file.txt",true);    
        bw= new BufferedWriter(fw);
        pw= new PrintWriter(bw);
    } catch (IOException ex) {
        Logger.getLogger(RestaurantGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        jTextAreaReceiptPrint.append("""
                                     \n\n\tRestaurant management system:
                                     Reference:"""+ref+
                "\n---------------------------------"+
                "\nMeals:\t"+jTextFieldCostOfMeal.getText()+"\n"+
                "Drinks:\t"+jTextFieldCostOfDrinks.getText()+"\n"+
                "Cost:\t"+jTextFieldTotalCostMD.getText()+"\n"+
                "----------------------------------"+"\n"+
                "Tax:\t"+jTextFieldTax.getText()+"\n"+
                "SubTotal:\t"+jTextFieldSubTotal.getText()+"\n"+
                "Total:\t"+jTextFieldTotal.getText()+"\n"+
                "----------------------------------"+
                "\nDate:"+rDate.format(timer.getTime())+
                "\nTime:"+rTime.format(timer.getTime())+
                "\n\n\t Thank you for coming here" );
       
        
        pw.println("        Restaurant management system:");//\\n\\n\\
        pw.println("            Reference:"+ref);                           
        pw.println("        ---------------------------------");       
        pw.println("        Meals:\t"+jTextFieldCostOfMeal.getText());
        pw.println("        Drinks:\t"+jTextFieldCostOfDrinks.getText());
        pw.println("        Cost:\t"+jTextFieldTotalCostMD.getText());
        pw.println("        ----------------------------------");
        pw.println("        Tax:\t"+jTextFieldTax.getText());
        
        pw.println("        SubTotal:\t"+jTextFieldSubTotal.getText());
        pw.println("        Total:\t"+jTextFieldTotal.getText());
        pw.println("        ----------------------------------");
        pw.println("        Date:"+rDate.format(timer.getTime()));
        pw.println("        Time:"+rTime.format(timer.getTime()));
        pw.println("        Thank you for coming here" );
        pw.close();
        
               
        
    }//GEN-LAST:event_jButtonReceiptActionPerformed

    private void jTextFieldMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMilkShakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMilkShakeActionPerformed

    private void jTextFieldComboMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComboMealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComboMealActionPerformed

    private void jTextFieldChickenBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChickenBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChickenBurgerActionPerformed

    private void jTextFieldCheeseBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCheeseBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCheeseBurgerActionPerformed

    private void jTextFieldChocolateMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChocolateMilkShakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChocolateMilkShakeActionPerformed

    private void jTextFieldVanillaMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVanillaMilkShakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVanillaMilkShakeActionPerformed

    private void jTextFieldFishCutletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFishCutletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFishCutletActionPerformed

    private void jTextFieldChickenSausageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChickenSausageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChickenSausageActionPerformed

    private void jTextFieldTotalCostMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalCostMDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalCostMDActionPerformed

    private void jTextFieldCostOfMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostOfMealActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldCostOfMealActionPerformed

    private void jTextFieldVanillaConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVanillaConeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVanillaConeActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        JTextField cleartext=null;
        
         for(Component c:jPanel4.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                cleartext=(JTextField)c;
                cleartext.setText("0");
            }
        }
        
        
        for(Component c:jPanel3.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                cleartext=(JTextField)c;
                cleartext.setText("0");
            }
        }
        
        
         for(Component c:jPanel6.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                cleartext=(JTextField)c;
                cleartext.setText("0");
            }
        }
        
        
        for(Component c:jPanel7.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                cleartext=(JTextField)c;
                cleartext.setText("0");
            }
        }
        
        jTextAreaReceiptPrint.setText(null);
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        // TODO add your handling code here:
        Class2 itemCost=new Class2();
        
        double iTax,iSubTotal,iTotal;
               
        itemCost.FishCutlet=itemCost.pFishCutlet*Double.parseDouble(jTextFieldFishCutlet.getText());   
        itemCost.ChickenBurger=itemCost.pChickenBurger*Double.parseDouble(jTextFieldChickenBurger.getText());
        itemCost.ChickenSausage=itemCost.pChickenSausage*Double.parseDouble(jTextFieldChickenSausage.getText());
        itemCost.ComboMeal=itemCost.pComboMeal*Double.parseDouble(jTextFieldComboMeal.getText());
        itemCost.CheeseBurger=itemCost.pCheeseBurger*Double.parseDouble(jTextFieldCheeseBurger.getText());
        
        
        
        itemCost.MilkShake=itemCost.pMilkShake*Double.parseDouble(jTextFieldMilkShake.getText());
        itemCost.VanillaC=itemCost.pVanillaC*Double.parseDouble(jTextFieldVanillaCone.getText());
        itemCost.ClassicVanilla=itemCost.pClassicVanilla*Double.parseDouble(jTextFieldClassicVanilla.getText());
        itemCost.VMilkShake=itemCost.pVMilkShake*Double.parseDouble(jTextFieldVanillaMilkShake.getText());
        itemCost.CMilkShake=itemCost.pCMilkShake*Double.parseDouble(jTextFieldChocolateMilkShake.getText());
        
       
        iSubTotal=itemCost.GetAmount();
        iTax=itemCost.cFindTax(iSubTotal);
        iTotal=iSubTotal+iTax;
        
        String SubTotal=String.format("%.2fBDT",iSubTotal);
        jTextFieldSubTotal.setText(SubTotal);
        
        String Tax=String.format("%.2fBDT",iTax);
        jTextFieldTax.setText(Tax);
        
        String Total=String.format("%.2fBDT",iTotal);
        jTextFieldTotal.setText(Total);
        
        String Meal=String.format("%.2fBDT",itemCost.Meals);
        jTextFieldCostOfMeal.setText(Meal);
        
        
        String Drink=String.format("%.2fBDT",itemCost.Drinks);
        jTextFieldCostOfDrinks.setText(Drink);
        
        String TotalCost=String.format("%.2fBDT",itemCost.TotalofMealsDrinks);
        jTextFieldTotalCostMD.setText(TotalCost);
       
        
       
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaxActionPerformed


    public static void main(String args[]) throws IOException {
       
         
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RestaurantGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReceipt;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaReceiptPrint;
    private javax.swing.JTextField jTextFieldCheeseBurger;
    private javax.swing.JTextField jTextFieldChickenBurger;
    private javax.swing.JTextField jTextFieldChickenSausage;
    private javax.swing.JTextField jTextFieldChocolateMilkShake;
    private javax.swing.JTextField jTextFieldClassicVanilla;
    private javax.swing.JTextField jTextFieldComboMeal;
    private javax.swing.JTextField jTextFieldCostOfDrinks;
    private javax.swing.JTextField jTextFieldCostOfMeal;
    private javax.swing.JTextField jTextFieldFishCutlet;
    private javax.swing.JTextField jTextFieldMilkShake;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldTotalCostMD;
    private javax.swing.JTextField jTextFieldVanillaCone;
    private javax.swing.JTextField jTextFieldVanillaMilkShake;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel tax1;
    private javax.swing.JLabel tax10;
    private javax.swing.JLabel tax11;
    private javax.swing.JLabel tax12;
    private javax.swing.JLabel tax13;
    private javax.swing.JLabel tax14;
    private javax.swing.JLabel tax15;
    private javax.swing.JLabel tax2;
    private javax.swing.JLabel tax3;
    private javax.swing.JLabel tax4;
    private javax.swing.JLabel tax5;
    private javax.swing.JLabel tax6;
    private javax.swing.JLabel tax7;
    private javax.swing.JLabel tax8;
    private javax.swing.JLabel tax9;
    private javax.swing.JLabel totalBill;
    // End of variables declaration//GEN-END:variables
}
