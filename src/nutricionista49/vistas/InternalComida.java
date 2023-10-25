
package nutricionista49.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricionista49.AccesoDatos.ComidaData;
import nutricionista49.entidades.Comida;

/**
 *
 * @author TenseiZX
 */
public class InternalComida extends javax.swing.JInternalFrame {

    private ComidaData cd;
    private Comida com=null;
    
    public InternalComida(ComidaData cd) {
        initComponents();
        armarCabecera();
        
        this.cd=cd;
        ComidaData com1=new ComidaData();
        
        
        this.setLocation(95, 50);  //>>>>>> PRIMER VALOR X , SEGUNDO Y
        this.setSize(1150, 600); 
        
        tablaComida.setShowGrid(true);
        jPanel2.setBackground(new Color(255,255,255,150));
        jPanel3.setBackground(new Color(255,255,255,150));
        jPanel4.setBackground(new Color(255,255,255,150));
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/apartadocomida.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel() {

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);

            }

        };
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComida = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jtide = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDetalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtCantcalorias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

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
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/editar-codigo3535.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jbEliminar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/borrar3535.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/cerrar-sesion3535.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        tablaComida.setBackground(new java.awt.Color(255, 255, 255));
        tablaComida.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tablaComida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaComida);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jbBuscar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/buscando3535.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtide.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel5.setText("ID:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("Apartado Comida");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jbBuscar)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jtide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jtNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Detalle:");

        jtDetalle.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Calorias x100gr:");

        jtCantcalorias.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCantcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCantcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nutricionista49/ImagenesParaVistas/salud3535.png"))); // NOI18N
        jLabel8.setText("Clinica Cornyshot");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Listado de comidas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimpiar)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(37, 37, 37)
                                .addComponent(jbModificar))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jbEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                        .addGap(74, 74, 74))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jbLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        
        
        
        ComidaData comdata=new ComidaData();
        try{ 
           

            if (!jtNombre.getText().equals("") && !jtDetalle.getText().equals("") && !jtCantcalorias.getText().equals("")) {
            
            ComidaData comidadata = new ComidaData();
            
            String nombre, detalle;
            int cantcalorias;
            nombre = jtNombre.getText();
            detalle = jtDetalle.getText();
            cantcalorias = Integer.parseInt(jtCantcalorias.getText());
            
            
            Comida comida = new Comida(nombre, detalle, cantcalorias, true);
            comidadata.guardarComida(comida);
            
            }else{
            JOptionPane.showMessageDialog(this,"No debe haber campos vacios");
            
            }
        
            
            
           } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Error: Se excedio el limite de caracteres/Digitos permitidos o se ingreso un caracter invalido.");
           }
        
        
        
        
        
        metodoLimpiar();
        armarCabecera();
        
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbSalir.setEnabled(true);

//ComidaData comdata=new ComidaData();       //>>>>> SIN ESTA PARTE NO ANDABA, NO ENTENDI PORQUE EN ESTE CASO NO ANDABA EN UN PRINCIPIO

        try {
            
            Integer ide= Integer.parseInt(jtide.getText());
            Comida com = cd.buscarComida(ide);
            

            if (com != null) {

                
                jtide.setText(String.valueOf(com.getIdComida()));
                jtNombre.setText(com.getNombre());
                jtDetalle.setText(com.getDetalle());
                jtCantcalorias.setText(com.getCantCalorias()+"");
                
                
                

            }else{
            metodoLimpiar();
            
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: No puede haber campos Vacios/Solo se permiten NUMEROS!");
            metodoLimpiar();
        }
        
        catch(NullPointerException exx){
            JOptionPane.showMessageDialog(this, "ERROR EN EL CATCH DEL BOTON BUSCAR");
//            System.out.println(com);>>este era para probar porque el comida era null
        }


        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jbGuardar.setEnabled(true);
        jbSalir.setEnabled(true);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        
        metodoLimpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
//        ComidaData comdata=new ComidaData();
        
        try {
            int cambiarAInactivo = Integer.parseInt(jtide.getText());
            if (cd.buscarComida(cambiarAInactivo) != null) {
                int msj = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar esta Comida?");

                if (msj == 0) {
                    cd.eliminarComida(cd.buscarComida(cambiarAInactivo).getIdComida());
                    armarCabecera();
//                    metodoLimpiar();
                    
                    
                }

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios");
        }
        
        catch(NullPointerException exx){
        JOptionPane.showMessageDialog(this, "error en el boton eliminar");
            
        }
        
        metodoLimpiar();
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        try{
        
         if (!jtNombre.getText().equals("") && !jtDetalle.getText().equals("") && !jtCantcalorias.getText().equals("")){
         
             
            
        cd.ModificarComida(new Comida(Integer.parseInt(jtide.getText()), jtNombre.getText(), jtDetalle.getText(), Integer.parseInt(jtCantcalorias.getText()), true));
        armarCabecera();
         
         }else {
         JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
         }
         
        }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error: Solo puede ingresar Numeros en Calorias");
        }catch (NullPointerException ex){
        JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios.");
        }
        
        
        metodoLimpiar();
        
    }//GEN-LAST:event_jbModificarActionPerformed

    
    private void metodoLimpiar(){
    jtNombre.setText("");
    jtDetalle.setText("");
    jtCantcalorias.setText("");
    jtide.setText("");
    
    }

    
    private void armarCabecera(){  
    
        DefaultTableModel modelo=new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false; // 
            }
        
        };
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Detalle");
        modelo.addColumn("Calorias x100grs");
        
        
        tablaComida.setModel(modelo);
        
        ComidaData cd1=new ComidaData();
        
        List<Comida> comidas= cd1.ListarComida();
        
        for (Comida comida : comidas) {
                modelo.addRow(new Object[]{comida.getIdComida(),comida.getNombre(),comida.getDetalle(),comida.getCantCalorias()});
                
            }
        
        tablaComida.setModel(modelo);
        
        
    
    
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtCantcalorias;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtide;
    private javax.swing.JTable tablaComida;
    // End of variables declaration//GEN-END:variables
}
