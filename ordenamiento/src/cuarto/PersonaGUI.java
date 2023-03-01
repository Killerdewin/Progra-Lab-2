
package cuarto;


import cuarto.Metodos_ordenamiento;
import cuarto.Metodos_usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PersonaGUI extends javax.swing.JFrame {
    Metodos_ordenamiento ordenar = new Metodos_ordenamiento();
    int contadorPersonas=0;
    Metodos_usuario arrPersona[]=new Metodos_usuario[1];
    DefaultTableModel tabla;
    
    //Guarda memoria en arrPersona
    public void asignarMemoria(){
        Metodos_usuario[] auxiliar = Arrays.copyOf(arrPersona, arrPersona.length+1);
        arrPersona = new Metodos_usuario[contadorPersonas];
        arrPersona=Arrays.copyOf(auxiliar,auxiliar.length);
    }
    
    //Llena la tabla creando una matriz con el tamaño
    //de la cantidad de personas y le manda ese modelo a la tabla "lista"
    public void llenarTabla(){
        String matriz[][]=new String[arrPersona.length-1][5];
        for (int i = 0; i<contadorPersonas; i++) {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=String.valueOf(arrPersona[i].getMarca());
            matriz[i][2]=String.valueOf(arrPersona[i].getKm());
            matriz[i][3]=String.valueOf(arrPersona[i].getMod());
            matriz[i][4]=String.valueOf(arrPersona[i].getCol());
        }
        //Actualiza la lista con el nuevo orden
        Lista.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String [] {
            "#","MARCA", "KILOMETRAJE", "MODELO", "COLOR"
        }
        ));
    }

    public PersonaGUI() {
        initComponents();
        tabla= new DefaultTableModel();
        tabla.addColumn("Marca");
        tabla.addColumn("kilometraje");
        tabla.addColumn("Modelo");
        tabla.addColumn("Color");
        this.Lista.setModel(tabla);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        kilometraje = new javax.swing.JTextField();
        Modelo = new javax.swing.JTextField();
        Adicionar = new javax.swing.JButton();
        Organizar = new javax.swing.JButton();
        Metodo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Lista);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Marca del auto:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Kilometraje del auto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Modelo:");

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        kilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometrajeActionPerformed(evt);
            }
        });

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });

        Adicionar.setText("Adicionar Usuario");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Organizar.setText("Ordenar");
        Organizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizarActionPerformed(evt);
            }
        });

        Metodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kilometraje Burbuja", "kilometraje Mergesort", "modelo Burbuja", "modelo Mergesort" }));
        Metodo.setToolTipText("");
        Metodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Ordenamiento por kilometraje y modelo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Método de ordenamiento:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Color:");

        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Organizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Marca)
                    .addComponent(kilometraje)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Adicionar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(kilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Adicionar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Organizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

//Crea un objeto persona y lo guarda en el arreglo de personas
    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        contadorPersonas++;
        asignarMemoria();
        Metodos_usuario persona=new Metodos_usuario();
        persona.setMarca(Marca.getText());
        persona.setMod(Integer.parseInt(Modelo.getText()));
        persona.setKm(Integer.parseInt(kilometraje.getText()));
        persona.setCol(Color.getText());
        arrPersona[contadorPersonas-1]=persona;
        Marca.setText("");
        Modelo.setText("");
        kilometraje.setText("");
        Color.setText("");
        llenarTabla(); //Actualiza la tabla con la nueva persona
    }//GEN-LAST:event_AdicionarActionPerformed

    private void OrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizarActionPerformed

        if(Metodo.getSelectedItem().toString()=="kilometraje Burbuja"){
            ordenar.KmBurbuja(arrPersona);
            llenarTabla();

        }
        if(Metodo.getSelectedItem().toString()=="kilometraje Mergesort"){
            ordenar.KmMerge(arrPersona,0,arrPersona.length-2);
            llenarTabla();
        }
        if(Metodo.getSelectedItem().toString()=="Modelo Burbuja"){
            ordenar.modeloBurbuja(arrPersona);
            llenarTabla();
        }
        if(Metodo.getSelectedItem().toString()=="Modelo Mergesort"){
            ordenar.modeloMerge(arrPersona,0,arrPersona.length-2);
            llenarTabla();
        }
    }//GEN-LAST:event_OrganizarActionPerformed

    private void kilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilometrajeActionPerformed

    private void MetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoActionPerformed

    }//GEN-LAST:event_MetodoActionPerformed

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_ColorActionPerformed

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeloActionPerformed

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
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JTextField Color;
    private javax.swing.JTable Lista;
    private javax.swing.JTextField Marca;
    public static javax.swing.JComboBox Metodo;
    private javax.swing.JTextField Modelo;
    private javax.swing.JButton Organizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kilometraje;
    // End of variables declaration//GEN-END:variables
}
