/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccineapp;

/**
 *
 * @author seanf
 */
public class CovidVaccineGUI extends javax.swing.JFrame {

    /**
     * Creates new form CovidVaccineGUI
     */
    private PQInterface queue;
    public CovidVaccineGUI() {
        queue = new PatientQueue();
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

        titleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        conditionLbl = new javax.swing.JLabel();
        conditionTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        guiTA = new javax.swing.JTextArea();
        addBTN = new javax.swing.JButton();
        listBTN = new javax.swing.JButton();
        registeredBTN = new javax.swing.JButton();
        nextBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        allocateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setForeground(new java.awt.Color(0, 71, 214));
        titleLbl.setText("National Covid‐19 Vaccination Programme");

        nameLbl.setText("Please enter your name:");

        ageLbl.setText("Please enter your age:");

        conditionLbl.setText("Do you have a pre-existing medical condition? (enter Y/N):");

        guiTA.setColumns(20);
        guiTA.setRows(5);
        jScrollPane1.setViewportView(guiTA);

        addBTN.setText("Add Patient");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        listBTN.setText("List Details");
        listBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBTNActionPerformed(evt);
            }
        });

        registeredBTN.setText("Display Registered Vaccine Candidates");
        registeredBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredBTNActionPerformed(evt);
            }
        });

        nextBTN.setText("Next Candidate");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Close Application");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        allocateBtn.setText("Assign Priorities");
        allocateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ageTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLbl)
                                .addGap(18, 18, 18)
                                .addComponent(nameTF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(titleLbl)))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conditionLbl)
                        .addGap(18, 18, 18)
                        .addComponent(conditionTF)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registeredBTN)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(allocateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextBTN)
                                .addGap(18, 18, 18)
                                .addComponent(exitBTN)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conditionLbl)
                    .addComponent(conditionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(nextBTN)
                    .addComponent(exitBTN)
                    .addComponent(allocateBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBTN)
                    .addComponent(registeredBTN))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        String name, condition;
        int age, priority;
        
        Patient p = new Patient();
        name = nameTF.getText();
        condition = conditionTF.getText();
        age = Integer.parseInt(ageTF.getText());
        
        p.setName(name);
        p.setCondition(condition.toUpperCase());
        p.setAge(age);
        
        if(age >= 90){
            priority = 10;
            queue.enqueue(priority,p);
        }
        
        else if(age >= 80){
            priority = 9;
            queue.enqueue(priority,p);
        }
        
        else if(age >= 70){
            priority = 8;
            queue.enqueue(priority,p);
        }
        
        else if(age > 64 && age < 70){
            priority = 8;
            queue.enqueue(priority,p);
        }
            
        else if(age > 54 && age < 65){
            if(condition.equalsIgnoreCase("Y")){
                priority = 6;
                queue.enqueue(priority,p);
            }
            
            else if(condition.equalsIgnoreCase("N")){
                priority = 5;
                queue.enqueue(priority,p);
            }
            
        }
        
        else if(age > 44 && age < 55){
            if(condition.equalsIgnoreCase("Y")){
                priority = 6;
                queue.enqueue(priority,p);
            }
            
            else if(condition.equalsIgnoreCase("N")){
                priority = 4;
                queue.enqueue(priority,p);
            }
        }
        
        else if(age > 29 && age < 45){
            if(condition.equalsIgnoreCase("Y")){
                priority = 6;
                queue.enqueue(priority,p);
            }
            
            else if(condition.equalsIgnoreCase("N")){
                priority = 3;
                queue.enqueue(priority,p);
            }
        }
        
        else if(age > 17 && age < 30){
            if(condition.equalsIgnoreCase("Y")){
                priority = 6;
                queue.enqueue(priority,p);
            }
            
            else if(condition.equalsIgnoreCase("N")){
                priority = 2;
                queue.enqueue(priority,p);
            }
        }
        
        else if(age < 18){
            priority = 1;
            queue.enqueue(priority,p);
        }
        
        guiTA.append("Patient: " + name + " is now registered for the vaccine.\n");
        nameTF.setText("");
        ageTF.setText("");
        conditionTF.setText("");
    }//GEN-LAST:event_addBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        // TODO add your handling code here:
        if(!queue.isEmpty()){
            PQElement elem = (PQElement)queue.dequeue();
            Patient p = (Patient)elem.getElement();
            
            guiTA.append("\nThe next candidates to be seen: \n");
            guiTA.append(p.getName() + " Priority: " + elem.getKey() + "\n");
        }
        else{
            guiTA.append("There is no one next in the queue!\n");
        }
    }//GEN-LAST:event_nextBTNActionPerformed

    private void listBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBTNActionPerformed
        // TODO add your handling code here:
        if(!queue.isEmpty()){
            guiTA.append("\nPatient's in queue: \n");
            guiTA.append(queue.printList() + "\r\n");
        }
        else{
            guiTA.append("\nThere are no patients in the queue. \n");
        }
    }//GEN-LAST:event_listBTNActionPerformed

    private void registeredBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredBTNActionPerformed
        // TODO add your handling code here:
        if(!queue.isEmpty()){
            guiTA.append("\nThe number of registered patients: " + queue.size() + "\n");
        }
        else{
            guiTA.append("\nThere are no patients registered. \n");
        }
    }//GEN-LAST:event_registeredBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void allocateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allocateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CovidVaccineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidVaccineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidVaccineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidVaccineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidVaccineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton allocateBtn;
    private javax.swing.JLabel conditionLbl;
    private javax.swing.JTextField conditionTF;
    private javax.swing.JButton exitBTN;
    private javax.swing.JTextArea guiTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listBTN;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBTN;
    private javax.swing.JButton registeredBTN;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
