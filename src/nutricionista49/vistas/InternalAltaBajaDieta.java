/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package nutricionista49.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricionista49.AccesoDatos.ComidaData;
import nutricionista49.AccesoDatos.DietaComidaData;
import nutricionista49.AccesoDatos.DietaData;
import nutricionista49.entidades.Comida;
import nutricionista49.entidades.Dieta;
import nutricionista49.entidades.DietaComida;

/**
 *
 * @author TenseiZX
 */
public class InternalAltaBajaDieta extends javax.swing.JInternalFrame {

   private Dieta diet;
   private Comida com;
   private DietaComidaData dcd;
   
   DefaultTableModel modelo=new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false; // 
            }
        
        };
    
    public InternalAltaBajaDieta() {
        initComponents();
//        listarPermitidas();
        armarCabecera();
        cargarComboDietas();
        cargarComboComidas();
        
        
        this.setLocation(95, 50);
        this.setSize(1150, 600); 
        
        tabladietacomida.setShowGrid(true);
        
        
        tabladietacomida.getColumnModel().getColumn(0).setMinWidth(0);
        tabladietacomida.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tabladietacomida.getColumnModel().getColumn(1).setMinWidth(0);
        tabladietacomida.getColumnModel().getColumn(1).setMaxWidth(0);
        
        jPanel2.setBackground(new Color(255,255,255,150));
        jPanel3.setBackground(new Color(255,255,255,150));
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/dietacomida2.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);

            }

        };
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladietacomida = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jcbDietas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbcomida = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jborrar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);

        tabladietacomida.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tabladietacomida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabladietacomida);

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione una dieta");

        jcbDietas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jcbDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDietasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Seleccione una comida");

        jbcomida.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbcomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcomidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbcomida, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbcomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jbSalir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/cerrar-sesion3535.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jborrar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/borrar3535.png"))); // NOI18N
        jborrar.setText("Eliminar ingrediente");
        jborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jborrarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/limpiar3535.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/disco-flexible3535.png"))); // NOI18N
        jbGuardar.setText("Agregar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbuscar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/buscando3535.png"))); // NOI18N
        jbuscar.setText("Buscar");
        jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/salud3535.png"))); // NOI18N
        jLabel8.setText("Clinica Cornyshot");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("Comidas permitidas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbuscar)
                            .addComponent(jbGuardar))
                        .addGap(48, 48, 48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jLabel8)
                        .addGap(112, 112, 112)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jborrar)
                                    .addComponent(jbLimpiar)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)))
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        DietaComidaData dcd = new DietaComidaData();

        try{
        
                DietaComidaData dietacomidadata = new DietaComidaData();
                

                diet = (Dieta) jcbDietas.getSelectedItem();
                com = (Comida) jbcomida.getSelectedItem();

                DietaComida dc=new DietaComida(com, diet, true);
                
                boolean ingredienteExiste=dcd.buscarComida(com.getIdComida(), diet.getIdDieta());
                
                if(!ingredienteExiste){
                dcd.guardarDietaComida(dc);
                }else{
                JOptionPane.showMessageDialog(this, "este ingrediente ya existe!");
                }
                
                
                 
                 
                 

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: debe seleccionar una comida y/o una dieta");
        }

        modelo.getDataVector().removeAllElements();
        tabladietacomida.updateUI();
        listarPermitidas();


//        DietaComidaData dcd = new DietaComidaData();
//
//       
//        
//                DietaComidaData dietacomidadata = new DietaComidaData();
//                
//
//                diet = (Dieta) jcbDietas.getSelectedItem();
//                com = (Comida) jbcomida.getSelectedItem();
//                String var=tabladietacomida.getValueAt(5, 3).toString();
//              System.out.println("mono1");
//              System.out.println(var);
//                
//                if (com.getNombre().equals(var)){
//                    System.out.println("mono2");
//                JOptionPane.showMessageDialog(this, "ya existe");
//                }else{
//                DietaComida dc=new DietaComida(com, diet, true); 
//                dcd.guardarDietaComida(dc);
//                }




                
                 
                 

        

        modelo.getDataVector().removeAllElements();
        tabladietacomida.updateUI();
        listarPermitidas();
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDietasActionPerformed

         
        
        
    }//GEN-LAST:event_jcbDietasActionPerformed

    private void jbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuscarActionPerformed
        modelo.getDataVector().removeAllElements();
        tabladietacomida.updateUI();
        tabladietacomida.setShowGrid(true);
        listarPermitidas();
        
        
        
        
    }//GEN-LAST:event_jbuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        modelo.getDataVector().removeAllElements();
        tabladietacomida.updateUI();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jborrarActionPerformed
       
        try {

//            diet = (Dieta) jcbDietas.getSelectedItem();
            

            DietaComidaData dcd2 = new DietaComidaData();

            int fila=tabladietacomida.getSelectedRow();

            if (fila>=0){

                dcd2.borrarIngrediente(Integer.parseInt(tabladietacomida.getValueAt(fila, 0).toString()), Integer.parseInt(tabladietacomida.getValueAt(fila, 1).toString()));
                
              

            }else{
                JOptionPane.showMessageDialog(null,"Error: Seleccione una comida de la lista que quiera borrar.");

            }

        }catch (ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null,"Error: debe seleecionar una comida antes de eliminar.");
        }

        modelo.getDataVector().removeAllElements();
        tabladietacomida.updateUI();

        listarPermitidas();
        
        
    }//GEN-LAST:event_jborrarActionPerformed

    private void jbcomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcomidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcomidaActionPerformed

    
    
    private void armarCabecera(){  
    
//        DefaultTableModel modelo=new DefaultTableModel(){
//            @Override
//            public boolean isCellEditable(int i, int i1) {
//                return false; // 
//            }
//        
//        };
      
        
        modelo.addColumn("ID COMIDA");
        modelo.addColumn("ID DIETA");
        modelo.addColumn("Nombre");
        modelo.addColumn("Comida");
        modelo.addColumn("Detalle");
        modelo.addColumn("Calorias x100grs");
   
        tabladietacomida.setModel(modelo);

        
        
        
//        DietaComidaData dcd1 = new DietaComidaData();
//
//        List<DietaComida> dietas = dcd1.listarPermitidas();
//
//        for (DietaComida dieta : dietas) {
//            modelo.addRow(new Object[]{dieta.getDieta().getNombre(), dieta.getComida().getNombre(), dieta.getComida().getDetalle(), dieta.getComida().getCantCalorias()});
//
//        }
//
//        tabladietacomida.setModel(modelo);
        
    }
    
    private void listarPermitidas(){
        
        DietaComidaData dcd1 = new DietaComidaData();
        
        diet = (Dieta) jcbDietas.getSelectedItem();
        List<DietaComida> dietas = new ArrayList<>();
        dietas = dcd1.listarPermitidas(diet.getIdDieta());
        for (DietaComida dieta : dietas) {
            modelo.addRow(new Object[]{dieta.getComida().getIdComida(),dieta.getDieta().getIdDieta(),dieta.getDieta().getNombre(), dieta.getComida().getNombre(), dieta.getComida().getDetalle(), dieta.getComida().getCantCalorias()});
        }
        
        tabladietacomida.setModel(modelo);

}
    
    
    private void cargarComboDietas(){
    
        DietaData dd = new DietaData();
        List<Dieta> dietas = dd.ListarDieta();

        for (Dieta dieta : dietas) {
            jcbDietas.addItem(dieta);
        }
    
    }
    
    private void cargarComboComidas(){
    
        ComidaData cd=new ComidaData();
        List<Comida> comidas=cd.ListarComida();
        
        for (Comida comida : comidas){
        
            jbcomida.addItem(comida);
        }
    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Comida> jbcomida;
    private javax.swing.JButton jborrar;
    private javax.swing.JButton jbuscar;
    private javax.swing.JComboBox<Dieta> jcbDietas;
    private javax.swing.JTable tabladietacomida;
    // End of variables declaration//GEN-END:variables
}
