
package com.mycompany.metodo_burbuja;
import javax.swing.DefaultListModel;

public class Metodo_Burbuja extends javax.swing.JFrame {
DefaultListModel objLista1= new DefaultListModel();
DefaultListModel objLista2= new DefaultListModel();

    /** al crear el objeto se va inicialisar con default
     * Creates new form Metodo_Burbuja
     */
    public Metodo_Burbuja() {
        initComponents();
        this.rbnAsc.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLista1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstLista2 = new javax.swing.JList<>();
        rbnAsc = new javax.swing.JRadioButton();
        rbnDesc = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstLista1);

        jScrollPane2.setViewportView(lstLista2);

        buttonGroup1.add(rbnAsc);
        rbnAsc.setText("Ascendente");
        rbnAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnAscActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnDesc);
        rbnDesc.setText("Descendente");
        rbnDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbnDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbnAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(rbnAsc)
                        .addGap(18, 18, 18)
                        .addComponent(rbnDesc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void rbnDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnDescActionPerformed
        // TODO add your handling code here: valor de ascendente, para limpiar y salga ordenado
        this.objLista2.clear();
         //obtenemos tamaño de nyestra lista
        int Cant=this.objLista1.getSize();
        //vector donde se va almacenar los datos
        int Vector[]=new int [Cant];
        //recorer
        for(int i=0;i<Vector.length;i++){
            //asignar los elementos a mi vector
            Vector[i]=Integer.parseInt(this.objLista1.getElementAt(i).toString());
        } //crear una variable auxiliar
        int aux;
        for(int i=0;i<Vector.length;i++){
            //se necesita ver las columnas se tiene que declarar j
            for(int j=i+1;j<Vector.length;j++){
                //verificar si el vector en posicion i es mayor que la posicion j
                if(Vector[i]<Vector[j]){
                    aux=Vector[i];
                    Vector[i]=Vector[j];
                    Vector[j]=aux;
                }
            }
        }
        //toca recorrer en un for ara poder asignarle ya los datos ordenados en los objetos de lista
        for(int i=0;i<Vector.length;i++){
            this.objLista2.addElement(Vector[i]);
        }
        //salir para mostrar los datos de la lista
        this.lstLista2.setModel(objLista2);
    }//GEN-LAST:event_rbnDescActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int Numero=Integer.parseInt(this.txtNumero.getText());
        this.objLista1.addElement(Numero);
        this.lstLista1.setModel(objLista1);
        //para limpiar la caja de texto lo que se agrega a la lista
        this.txtNumero.setText("");
        this.txtNumero.requestFocus();
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void rbnAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnAscActionPerformed
        // TODO add your handling code here: para borar
        this.objLista2.clear();
         //obtenemos tamaño de nyestra lista
        int Cant=this.objLista1.getSize();
        //vector donde se va almacenar los datos
        int Vector[]=new int [Cant];
        //recorer
        for(int i=0;i<Vector.length;i++){
            //asignar los elementos a mi vector
            Vector[i]=Integer.parseInt(this.objLista1.getElementAt(i).toString());
        } //crear una variable auxiliar
        int aux;
        for(int i=0;i<Vector.length;i++){
            //se necesita ver las columnas se tiene que declarar j
            for(int j=i+1;j<Vector.length;j++){
                //verificar si el vector en posicion i es mayor que la posicion j
                if(Vector[i]>Vector[j]){
                    aux=Vector[i];
                    Vector[i]=Vector[j];
                    Vector[j]=aux;
                }
            }
        }
        //toca recorrer en un for ara poder asignarle ya los datos ordenados en los objetos de lista
        for(int i=0;i<Vector.length;i++){
            this.objLista2.addElement(Vector[i]);
        }
        //salir para mostrar los datos de la lista
        this.lstLista2.setModel(objLista2);
    }//GEN-LAST:event_rbnAscActionPerformed

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
            java.util.logging.Logger.getLogger(Metodo_Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Metodo_Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Metodo_Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Metodo_Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Metodo_Burbuja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstLista1;
    private javax.swing.JList<String> lstLista2;
    private javax.swing.JRadioButton rbnAsc;
    private javax.swing.JRadioButton rbnDesc;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
