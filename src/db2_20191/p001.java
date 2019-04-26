/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2_20191;

import entities.Department;
import entities.Employee;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OFhec
 */
public class p001 extends javax.swing.JFrame {

    private static DefaultTableModel modelo;
    EmployeeModel em = new EmployeeModel();
    DepartmentModel dm = new DepartmentModel();

    final String deptno = "DEPTNO";
    final String deptname = "DEPTNAME";
    final String mgrno = "MGRNO";
    final String admrdept = "ADMRDEPT";
    final String location = "LOCATION";

    final String empno = "EMPNO";
    final String firstnme = "FIRSTNME";
    final String midinit = "MIDINIT";
    final String lastname = "LASTNAME";
    final String phoneno = "PHONENO";
    final String workdept = "WORKDEPT";
    final String hiredate = "HIREDATE";
    final String job = "JOB";
    final String edlevel = "EDLEVEL";
    final String sex = "SEX";
    final String birthdate = "BIRTHDATE";
    final String salary = "SALARY";
    final String bonus = "BONUS";
    final String comm = "COMM";

    public p001() {
        initComponents();
        cb1.addItem("query01");
        cb1.addItem("query02");
        cb1.addItem("query03");
        cb1.addItem("query04");
        cb1.addItem("query05");
        cb1.addItem("query06");
        cb1.addItem("query07");
        cb1.addItem("query08");
        cb1.addItem("query09");
        cb1.addItem("query10");
        cb1.addItem("query11");
        cb1.addItem("query12");
        cb1.addItem("query13");
        cb1.addItem("query14");
        cb1.addItem("query15");
        cb1.addItem("query16");
        cb1.addItem("query17");
        query01();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        cb1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setText("Ejecutar Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        t1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(t1);

        cb1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel1.setText("Página 001");

        jButton2.setText("Siguiente página");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (cb1.getSelectedIndex() + 1) {
            case 1:
                query01();
                break;
            case 2:
                query02();
                break;
            case 3:
                query03();
                break;
            case 4:
                query04();
                break;
            case 5:
                query05();
                break;
            case 6:
                query06();
                break;
            case 7:
                query07();
                break;
            case 8:
                query08();
                break;
            case 9:
                query09();
                break;
            case 10:
                query10();
                break;
            case 11:
                query11();
                break;
            case 12:
                query12();
                break;
            case 13:
                query13();
                break;
            case 14:
                query14();
                break;
            case 15:
                query15();
                break;
            case 16:
                query16();
                break;
            case 17:
                query17();
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         p002 pg2 = new p002();
    pg2.setLocationRelativeTo(null);
    this.setVisible(false);
    pg2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void query01() {
        List<Department> l1 = dm.query01();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(deptname);
        modelo.addColumn(mgrno);
        modelo.addColumn(admrdept);
        modelo.addColumn(location);
        Object[] object = new Object[5];
        for (Department d : l1) {
            object[0] = d.getDeptno();
            object[1] = d.getDeptname();
            object[2] = d.getMgrno();
            object[3] = d.getAdmrdept();
            object[4] = d.getLocation();
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query02() {
        List<Department> l1 = dm.query02();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(deptname);
        modelo.addColumn(mgrno);
        modelo.addColumn(admrdept);
        modelo.addColumn(location);
        Object[] object = new Object[5];
        for (Department d : l1) {
            object[0] = d.getDeptno();
            object[1] = d.getDeptname();
            object[2] = d.getMgrno();
            object[3] = d.getAdmrdept();
            object[4] = d.getLocation();
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query03() {
        List<Object[]> l1 = dm.query03();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(deptname);
        modelo.addColumn(admrdept);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query04() {
        List<Object[]> l1 = dm.query04();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(deptname);
        modelo.addColumn(admrdept);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query05() {
        List<Object[]> l1 = dm.query05();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(deptname);
        modelo.addColumn(admrdept);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query06() {
        List<Object[]> l1 = em.query06();

        modelo = new DefaultTableModel();
        modelo.addColumn(workdept);
        modelo.addColumn(job);
        Object[] object = new Object[2];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query07() {
        List<Object[]> l1 = em.query07();

        modelo = new DefaultTableModel();
        modelo.addColumn(workdept);
        modelo.addColumn(job);
        Object[] object = new Object[2];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }

    public void query08() {
        List<Object[]> l1 = dm.query08();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(admrdept);
        Object[] object = new Object[2];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    
    public void query09(){
    List<Object[]> l1 = em.query09();

        modelo = new DefaultTableModel();
        modelo.addColumn(lastname);
        modelo.addColumn(edlevel);
        Object[] object = new Object[2];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query10(){
    List<Object[]> l1 = em.query10();

        modelo = new DefaultTableModel();
        modelo.addColumn(empno);
        modelo.addColumn(job);
        modelo.addColumn(edlevel);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query11(){
        List<Object[]> l1 = em.query11();
        
        modelo = new DefaultTableModel();
        modelo.addColumn(empno);
        modelo.addColumn(job);
        modelo.addColumn(edlevel);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query12(){
    List<Object[]> l1 = em.query12();
        
        modelo = new DefaultTableModel();
        modelo.addColumn(empno);
        modelo.addColumn(job);
        modelo.addColumn(edlevel);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query13(){
    List<Object[]> l1 = em.query13();
        
        modelo = new DefaultTableModel();
        modelo.addColumn(empno);
        modelo.addColumn(job);
        modelo.addColumn(edlevel);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query14(){
    List<Object[]> l1 = em.query14();
        
        modelo = new DefaultTableModel();
        modelo.addColumn(lastname);
        modelo.addColumn(edlevel);
        Object[] object = new Object[2];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query15(){
    List<Object[]> l1 = em.query15();
        
        modelo = new DefaultTableModel();
        modelo.addColumn(lastname);
        modelo.addColumn(edlevel);
        Object[] object = new Object[2];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query16(){
     List<Object[]> l1 = dm.query16();

        modelo = new DefaultTableModel();
        modelo.addColumn(deptno);
        modelo.addColumn(deptname);
        modelo.addColumn(mgrno);
        Object[] object = new Object[3];
        for (Object[] d : l1) {
            object[0] = d[0];
            object[1] = d[1];
            object[2] = d[2];
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    public void query17(){
    List<Object> l1 = em.query17();
        
        modelo = new DefaultTableModel();
        modelo.addColumn(lastname);
        Object[] object = new Object[1];
        for (Object d : l1) {
            object[0] = d;
            modelo.addRow(object);
        }
        t1.setModel(modelo);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(p001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p001().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
