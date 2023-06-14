/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//
package book.bookdetail.view;


import book.controller.BookDetailController;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Thanh Tung
 */
public class BookDetailForm extends javax.swing.JFrame {

    public static ArrayList<Object[]> dataTable = new ArrayList<>();
    /**
     * Creates new form BookDetail
     */
    public static bookdetailPanel bdp = new bookdetailPanel();
    public static CopyDetail cd = new CopyDetail();

    public BookDetailForm(String idBook) {
        try {
            initComponents();
            dataTable=new BookDetailController().HandleBookCopy(idBook);
            updateDataBookDetail();
            bdp.setInfo(dataTable);
            this.setLayout(new GridLayout(1, 2));
            bdp.setSize(400, 500);
            cd.setSize(320, 500);
            this.add(bdp);
            this.add(cd);
        } catch (SQLException ex) {
            Logger.getLogger(BookDetailForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDetailForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * cập nhât các bản sao sách vào màn hình
     */
        public void updateDataBookDetail() {
            cd.model.setRowCount(0);
        for (int i = 0; i < dataTable.size(); i++) {
            Object[] newRow = {
                dataTable.get(i)[5],
                dataTable.get(i)[6],
                dataTable.get(i)[7]};
            System.out.println(dataTable.get(i)[5]);
            System.out.println(dataTable.get(i)[6]);
            System.out.println(dataTable.get(i)[7]);
            cd.model.addRow(newRow);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chi tiết sách");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
