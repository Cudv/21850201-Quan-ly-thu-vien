//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.addbook.view;

import com.sun.glass.events.KeyEvent;
import book.controller.AuthorController;
import book.controller.BookController;
import book.controller.PublisherController;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Author;
import model.Book;
import model.CoppyOfBook;
import model.Publisher;
import common.view.MainFormOfLibrarian;

/**
 *
 * @author tungts
 */
public class AddNewBookForm extends javax.swing.JPanel {

    MainFormOfLibrarian mainFormOfLibrarian;

    /**
     * Creates new form panelThemSachMoi
     */
    public AddNewBookForm(MainFormOfLibrarian mainFormOfLibrarian) {
        initComponents();
        this.mainFormOfLibrarian = mainFormOfLibrarian;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNameBook = new javax.swing.JTextField();
        tfIdBook = new javax.swing.JTextField();
        tfNamePublisher = new javax.swing.JTextField();
        tfNameAuthor = new javax.swing.JTextField();
        tfISBN = new javax.swing.JTextField();
        tfNumberOfCoppy = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        cbTypeOfCoppy = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAddCoppyOfNewBook = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sách"));

        jLabel1.setText("Mã Sách");

        jLabel2.setText("Tiêu Đề");

        jLabel3.setText("Nhà Phát Hành");

        jLabel4.setText("Tác Giả");

        jLabel5.setText("ISBN");

        jLabel6.setText("Số Lượng Bản Sao");

        jLabel7.setText("Loại Bản Sao");

        jLabel8.setText("Giá");

        tfIdBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIdBookKeyPressed(evt);
            }
        });

        tfNamePublisher.setEditable(false);

        tfNameAuthor.setEditable(false);

        tfISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfISBNKeyTyped(evt);
            }
        });

        tfNumberOfCoppy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNumberOfCoppyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNumberOfCoppyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumberOfCoppyKeyTyped(evt);
            }
        });

        tfPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPriceKeyTyped(evt);
            }
        });

        cbTypeOfCoppy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cho Mượn", "Tham Khảo" }));

        jLabel9.setText("VNĐ");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNameBook)
                            .addComponent(tfIdBook)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNamePublisher, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(tfNameAuthor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfISBN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfNumberOfCoppy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cbTypeOfCoppy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(tfIdBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNamePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNameAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfNumberOfCoppy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbTypeOfCoppy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbTypeOfCoppy, jButton1, jButton2, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, tfISBN, tfIdBook, tfNameAuthor, tfNameBook, tfNamePublisher, tfNumberOfCoppy, tfPrice});

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thông Tin Bản Sao");

        tableAddCoppyOfNewBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Số hiệu bản sao", "Giá", "Tham khảo", "Cho mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAddCoppyOfNewBook);

        btnAdd.setText("Lưu");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnCancel});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            addBook();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AuthorForm authorForm = new AuthorForm(this);
        authorForm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PublisherForm(this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNumberOfCoppyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumberOfCoppyKeyTyped
        if (evt.getKeyChar() > KeyEvent.VK_9 || evt.getKeyChar() < KeyEvent.VK_0) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfNumberOfCoppyKeyTyped

    private void tfPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPriceKeyTyped
        if (evt.getKeyChar() > KeyEvent.VK_9 || evt.getKeyChar() < KeyEvent.VK_0) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfPriceKeyTyped

    private void tfNumberOfCoppyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumberOfCoppyKeyReleased
        displayCoppyToAdd();
    }//GEN-LAST:event_tfNumberOfCoppyKeyReleased

    private void tfNumberOfCoppyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumberOfCoppyKeyPressed
        if (tfIdBook.getText().isEmpty() || tfNameBook.getText().isEmpty() || tfNameAuthor.getText().isEmpty() || tfNamePublisher.getText().isEmpty() || tfPrice.getText().isEmpty() || tfISBN.getText().isEmpty()) {
            notify("Hãy điền đầy đủ thông tin trước đã");
            tfNumberOfCoppy.setText("");
            return;
        }
    }//GEN-LAST:event_tfNumberOfCoppyKeyPressed

    private void tfISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfISBNKeyTyped
        if (evt.getKeyChar() > KeyEvent.VK_9 || evt.getKeyChar() < KeyEvent.VK_0) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfISBNKeyTyped

    private void tfIdBookKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdBookKeyPressed

    }//GEN-LAST:event_tfIdBookKeyPressed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        mainFormOfLibrarian.setContentsPanel(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Hàm này thực hiện chức năng hiển thì thông tin và danh sách bản sao sách thêm vào
     */
    private void displayCoppyToAdd() {
        int numberOfCoppy = tfNumberOfCoppy.getText().trim().isEmpty() ? 0 : Integer.parseInt(tfNumberOfCoppy.getText().trim());
        DefaultTableModel model = (DefaultTableModel) tableAddCoppyOfNewBook.getModel();
        model.setRowCount(0);
        if (numberOfCoppy == 0) {
            return;
        }
        Book book = new Book();
        book.setIdBook(tfIdBook.getText().trim());
        boolean isReference = (cbTypeOfCoppy.getSelectedIndex() == 0) ? false : true;
        for (int i = 0; i < numberOfCoppy; i++) {
            model.addRow(new Object[]{
                BookHelper.getNewIdCoppyOfBook(book, i + 1),
                BookHelper.getNewNumberCoppyOfBook(book, i + 1),
                tfPrice.getText().trim(),
                isReference,
                !isReference
            });
        }
    }

    /**
     * Hàm này thực hiện chức năng thêm danh sách tác giả cho sách muốn thêm
     */
    public void setListAuthor(ArrayList<Author> arr) {
        String nameAuthor = "";
        if (arr.isEmpty()) {
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            nameAuthor = (nameAuthor == "") ? arr.get(i).getNameAuthor() : nameAuthor + ", " + arr.get(i).getNameAuthor();
        }
        tfNameAuthor.setText(nameAuthor);
        this.arrListAuthor = arr;
    }

    /**
     * Hàm này thực hiện chức năng thêm nhà phát hành cho sách muốn thêm
     */
    public void publisher(Publisher publisher) {
        if (publisher.getNamePublisher().isEmpty()) {
            return;
        }
        String namePublish = publisher.getNamePublisher();
        tfNamePublisher.setText(namePublish);
        this.publisher = publisher;
    }

    ArrayList<Author> arrListAuthor;
    Publisher publisher;
    /**
     * Hàm này thực hiện chức năng yêu cầu thêm sách vào CSDL
     * @throws  ClassNotFoundException 
     * @throws  SQLException 
     */
    private void addBook() throws ClassNotFoundException, SQLException {
        if (tfIdBook.getText().isEmpty() || tfNameBook.getText().isEmpty() || tfNameAuthor.getText().isEmpty()
                || tfNamePublisher.getText().isEmpty() || tfPrice.getText().isEmpty() || tfISBN.getText().isEmpty()
                || tableAddCoppyOfNewBook.getRowCount() == 0) {
            notify("Hãy điền đầy đủ thông tin trước đã");
            return;
        }

        String idBook = tfIdBook.getText().toString().trim();
        String a = BookController.getInstance().getBookByIdBook(idBook).getTitleBook(); 
        if (a != null) {
            System.out.println(a);
            tfNumberOfCoppy.setText("");
            DefaultTableModel model = (DefaultTableModel) tableAddCoppyOfNewBook.getModel();
            model.setRowCount(0);
            notify("Mã sách đã bị trùng");
            return;
        }

        //add Publisher if publisher == null;
        if (publisher.getIdPublisher() == -1) {
            publisher.setIdPublisher(PublisherController.getInstance().getMaxIdPublisher() + 1);
            PublisherController.getInstance().addPublisher(publisher);
        }

        //add Author if author == null
        for (int i = 0; i < arrListAuthor.size(); i++) {
            Author author = arrListAuthor.get(i);
            if (author.getIdAuthor() == -1) {
                author.setIdAuthor(AuthorController.getInstance().getMaxIdAuthor() + 1);
                AuthorController.getInstance().addAuthor(author);
            }
        }

        String titleBook = tfNameBook.getText().toString().trim();
        String isbn = tfISBN.getText().toString().trim();
        Book book = new Book();
        book.setIdBook(idBook);
        book.setIsbn(isbn);
        book.setTitleBook(titleBook);
        book.setPublisher(publisher);
        
        //get Coppy Of Book
        ArrayList<CoppyOfBook> coppyOfBooks = new ArrayList<>();
        for (int i = 0; i < tableAddCoppyOfNewBook.getRowCount(); i++) {
            String idCoppyOfBook = (String) tableAddCoppyOfNewBook.getValueAt(i, 0);
            int numberOfCoopy = (int)tableAddCoppyOfNewBook.getValueAt(i, 1);
            int price = Integer.parseInt(tableAddCoppyOfNewBook.getValueAt(i, 2).toString());
            CoppyOfBook.TypeOfCoppy typeOfCoppy = ((boolean)tableAddCoppyOfNewBook.getValueAt(i, 3)) ? CoppyOfBook.TypeOfCoppy.REFERENCE : CoppyOfBook.TypeOfCoppy.BORROWABLE;
            coppyOfBooks.add(new CoppyOfBook(idCoppyOfBook, numberOfCoopy, price, typeOfCoppy, CoppyOfBook.StatusOfCoppy.AVAILABLE));
        }
        book.setListCoppyOfBook(coppyOfBooks);
        book.setListAuthor(arrListAuthor);
        BookController.getInstance().addBook(book);
        for (int i = 0;i< coppyOfBooks.size();i++){
            BookController.getInstance().addCoppyOfBookByIdBook(idBook, coppyOfBooks.get(i));
        }
        notify("Đã thêm");
        mainFormOfLibrarian.setContentsPanel(0);
    }

    /**
     * Hàm này thực hiện chức năng hiển thị lên một thông báo
     * @param content nội dung thông báo
     */
    private void notify(String content) {
        JOptionPane.showMessageDialog(null, content);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cbTypeOfCoppy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAddCoppyOfNewBook;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfIdBook;
    private javax.swing.JTextField tfNameAuthor;
    private javax.swing.JTextField tfNameBook;
    private javax.swing.JTextField tfNamePublisher;
    private javax.swing.JTextField tfNumberOfCoppy;
    private javax.swing.JTextField tfPrice;
    // End of variables declaration//GEN-END:variables
}
